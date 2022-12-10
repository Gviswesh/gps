# GPS using Java

The purpose of this project is to create a fuunctional and easily programmable Global Positioning System using Java for smartphones running Android 9 or above. 
## Motivation behind this Project
The ubiquity of GPS peaked my inquisitiveness as to how to adapt it more efficiently through creating a GPS app for mobile systems. In doing so I have learned the daily challenges of GPS as it interfaces with individuals and most importantly I learned how to request user's location access in Android devices. The reason behing choosing Java is simple, I am more comfortable with Java, am still very new to Kotlin and Python app creation. Java while having it's own unique challenges, is accessible when learning the creation of new applications.
## Features
This app utilizes the GPS to display the Latitude and Longitude of your location. It displays Altitude in a second page which I will be explaining subsequently. This is a basic app which requests the permission from the user and then displays the location
## How to Use
### Launching on Real Device
Before launching this app turn on your device's location and open Google Maps. In Google Maps, tap the GPS button in the right bottom corner enabling GPS to find your current location. There is the option of pointing your desired location as well. Please note that a stable Internet connection is a requisite for optimum functionality. Finally, open the app and give the requesting permission.

After permission is granted, go to mutlitasker and first remove the app from the recently viewed apps and then re-launch the app. This is necessary due to a bug preventing the app from displaying the GPS coordinates immediately after granting the permission. The app will be able to display the coordinates after it is re-launched. 
### Launching through Virtual Device
If you are trying to run the app through emulator then kindly use Android 9 or above. After creating the virtual device, cold boot it. After it boots, open **Extended Controls** then open the **Location** tab. Make sure the **Enable GPS Signal** toggle is on by default. Now point your desired location and click **Set Location** button. This is the location the app will display as your current location. After this, follow the instructions  for opening the app given in [How to Use](https://github.com/Gviswesh/gps/edit/main/README.md#launching-on-real-device).

<br> **NOTE: The app won't be collecting any of your device's location history nor will it track your current location.**

