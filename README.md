# GPS using Java

I was aiming to provide a good and easily programmable Global Positioning System using Java. This project was built for smartphones running Android 9 or above. 
## Motivation behind this Project
I was wondering how to use the GPS of the system efficiently and basically the inquistiveness behind the working of GPS in mobile sysytems drove me towards trying out creation of a GPS app. This app has taught me a lot about how GPS is used and most importantly I learnt how to request the user access in Android devices. The reason behing choosing Java is simple, I am more comfortable with Java and I am still very new to Kotlin and Python app creation. Java has it's own unique challenges but still it is the most fun language to use for learnning and creation of anything. 
## Features
This app utilises the GPS to didsplay the Latitude and Longitude of your location. It displays Altitude in a second page which I will be explaining in a minute. This is a simple app so it requests the permission from the user and then displays the location
## How to Use
Before launching this app I would recommend you to turn on your device's location and open Google Maps. In Google Maps, tap the GPS button in the right bottom corner. This enables the GPS to track your current location. If you want you can point to your desired location as well. Please note that a stable Internet connection is recommended. After that open the app and give the requesting permission.

<br> **NOTE: The app won't be collecting any of your device's location history nor will it track your current location.**

<br>After the permission is granted, go to mutlitasker and remove the app and then re-launch the app. This is due to a bug that the app was not able to display the GPS coordinates immediately after granting the permission. The app will be able to display the coordinates after it is re-launched. 

If you are trying to run the app through emulator then kindly use Android 9 or above. After creating the virtual device, cold boot it. After it boots, open **Extended Controls** and open the **Location** tab. Make sure that you turn on the **Enable GPS Signal** toggle. It is on by default. Now point your desired location and click **Set Location** button. This is the location the app will display as your current location. After this, follow the instructions given in [How to Use](https://github.com/Gviswesh/gps/new/main?readme=1#how-to-use).
