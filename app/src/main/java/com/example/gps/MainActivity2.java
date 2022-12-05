package com.example.gps;



import android.Manifest;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},100);

        }
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Criteria c = new Criteria();
        String provider = lm.getBestProvider(c, true);

        // request location will work All time
        lm.requestLocationUpdates(provider, 0, 0,(l)->{
            // requestLocation Updates(provider, time ,Distance, function(Location l){})
            Log.i("Location",l.toString());
            double longitude = l.getLongitude();
            double latitude = l.getLatitude();
            double altitude = l.getAltitude();

            TextView et = findViewById(R.id.tv3);

            et.setText("Latitude: " + latitude + "\nLongitude:" + longitude+"\nAltitude: "+altitude);


        });
    }


}