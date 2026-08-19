# MAD Practical 2 - Activity Lifecycle

## Project Overview
This project is a simple Android application developed as part of the Mobile Application Development (MAD) course. The primary goal of this practical is to understand and demonstrate the **Android Activity Lifecycle**.

## Student Details
- **Name:** Dipendra Pandit
- **Enrollment Number:** 24012011206

## Features
- Implementation of all major Activity lifecycle methods:
  - `onCreate()`
  - `onStart()`
  - `onResume()`
  - `onPause()`
  - `onStop()`
  - `onRestart()`
  - `onDestroy()`
- Tracking lifecycle transitions using:
  - **Logcat:** `Log.i` messages are used to log state changes.
  - **Toasts:** Short pop-up messages displayed during transitions.
  - **Snackbars:** Used in `onCreate` and `onResume` for feedback.

## UI Design
- A simple layout with a yellow background.
- A custom title bar using a `TextView` with a purple background.
- A central "Hello world!" message.

## Technologies Used
- **Language:** Kotlin
- **IDE:** Android Studio
- **Components:** ConstraintLayout, TextView, Toast, Snackbar, Logcat

## How to Run
1. Clone the repository or download the source code.
2. Open the project in Android Studio.
3. Build the project and run it on an Android Emulator or a physical device.
4. Observe the Toasts/Snackbars and check the Logcat (filtered by tag `MainActivity`) to see the lifecycle events triggered by actions like rotating the screen, pressing home, or closing the app.
