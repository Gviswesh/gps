package com.example.gps;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED )
            // This is added default to check permission
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},100);


        Button b1=findViewById(R.id.button1);
        /*
         * Not all the time this method will work. Since this method relies on last known location.
         * If you do not see it working, open Google Maps and re-update the location.
         * And then Launch this app.
         */
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE); // get Location Service
        // Create Location Criteria for Provider like best accuracy, so on...
        Criteria criteria = new Criteria();
        //This below line is not required. It is present to showcase Examples
        criteria.setAccuracy(Criteria.NO_REQUIREMENT);
        //choose best provider according to the criteria
        String provider = lm.getBestProvider(criteria, true);
        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText("provider: "+provider);
        b1.setOnClickListener(v->{
            try {
                //get location from the provider
                Location location = lm.getLastKnownLocation(provider);
                if(location != null) {
                    double longitude = location.getLongitude();
                    double latitude = location.getLatitude();
                    // Other interesting values: Altitude, Speed etc.. check out the documentation for more info.
                    TextView et = findViewById(R.id.tv1);
                    et.setText("Latitude: " + latitude + "\nLongitude:" + longitude);

                }
                else{
                    Log.e("Error","Location is null");
                }
            }catch(Exception e){
                Log.e("Error",e.getMessage());
            }
        });
        findViewById(R.id.button2).setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        });

    }

}
