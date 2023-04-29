# Android Assignment 3 (Assignment 7 on moodle)

## Assignment Description
Find an android app you enjoy using or use often. Come up with an idea for a new feature to add, implement the UI for the given feature. 

## Goals
- Create a feature in which the app would benefit from
- Match the UI landing page to the UI of the original app
- Make the custom UI for the new feature you would like to implement

## Structure

- App
     - src (contains app files for the app)
       - main (the main files that run the app)
         - java/com/kzirk/a3 (the container that holds runnable code)
           - composables (these are custom made UI pieces that can be combined and used on a page)
             - navigation (contains both the top navigation bar and bottom navigation bar for the main page)
           - screens (this screen renders a page of the app which contains the components made above)
           - ui/theme (Used to set a 'theme' for the whole app, this includes colours, shapes, fonts, themes for the whole app)
           - MainActivity.kt (this is where the app starts from)
       - AndroidManifest.xml (contains app permissions)
       - res (contains all 'drawables' or front-end images, fonts, colors, icons)

## Video Walkthrough & Demonstration of the app
[Youtube Link for a video walkthrough of the app](https://www.youtube.com/watch?v=xV_7VYfww0Q)

## How to run the program
1. Have a working pc with internet connection
2. Install Android Studio
3. Clone repository from github
4. Open the cloned repository and build it in Android Studio
5. Select Pixel 3a as a virtual testing device (you may have to create a virtual instance of this phone)
5. Run the program on the Pixel 3a device

## How to test the program
1. Once opened and running in Android Studio, observe that the layout matches reddit's UI layout for their android app. I do a side-by-side comparison to the app in the youtube video that I linked above, but you may also choose to download the app yourself to check it out
2. Click on the icon that looks like the image below to view the desired feature
<img width="58" alt="image" src="https://user-images.githubusercontent.com/83609351/235291379-d356eeb9-ad88-4c0e-8f00-4e1801802865.png">
