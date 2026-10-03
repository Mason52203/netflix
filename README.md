# Netflix

Android video browsing project with a Kotlin Ktor backend.

## Structure
- `android/`: Android application and Gradle wrapper.
- `backend/`: Ktor server and in-memory catalog.

## Local setup
1. Open `android/` in Android Studio and configure your local Android SDK.
2. In `backend/`, run `./gradlew run` (`.\gradlew.bat run` on Windows).
3. The Android emulator reaches the host machine at `10.0.2.2`; catalog media URLs use port 8080.

## Demo videos
The eight demo MP4 files are included in `backend/src/main/resources/media/` (about 17.75 MiB total). The Ktor backend serves them at `/media/`; no separate download is required. Run the backend before testing playback in the Android emulator.

Included files: `big-buck-bunny.mp4`, `sintel.mp4`, `tears-of-steel.mp4`, `elephants-dream.mp4`, `for-bigger-blazes.mp4`, `for-bigger-escapes.mp4`, `for-bigger-fun.mp4`, `for-bigger-joyrides.mp4`.

Local SDK settings, IDE files, build outputs, and archives are excluded from Git.
