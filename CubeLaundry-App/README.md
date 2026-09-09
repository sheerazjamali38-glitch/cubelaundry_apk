# Cube Laundry Android App

## Requirements
- Android Studio (latest)
- JDK 17+
- Android SDK 34

## Setup
1. Open Android Studio → Open → select the `CubeLaundry-App` folder.
2. Wait for Gradle sync to finish. Android Studio will auto-generate the missing
   `gradle-wrapper.jar` file the first time you sync (or run `gradle wrapper` from
   a terminal if you have Gradle installed).
3. Google Fonts note: `Type.kt` uses the downloadable Google Fonts provider, which
   requires a `res/values/arrays.xml` with the `com_google_android_gms_fonts_certs`
   certificate array. If you don't want to set that up, simplest fix is to replace
   `SpaceGrotesk` / `Inter` with `FontFamily.Default` in `Type.kt`.
4. Placeholder launcher icons (simple navy/cyan squares) are included in each
   `mipmap-*` folder — swap them out for your real logo whenever you're ready.
5. Connect your Android device or use an emulator.
6. Click Run ▶️.

## Generate Signed APK
1. Build → Generate Signed Bundle / APK → APK.
2. Create a new keystore or use existing.
3. Select release build variant.
4. Click Finish → APK will be generated at `app/release/app-release.apk`.

## Publish to Google Play
1. Create Google Play Developer account ($25 one-time fee).
2. Go to Play Console → Create app.
3. Fill in app details, upload APK, add screenshots, and submit for review.
4. Approval takes 24–48 hours.

## Firebase Push Notifications (Optional)
1. Add your `google-services.json` to the `app/` folder.
2. Uncomment Firebase dependencies in build.gradle.
3. Implement FCM service.

## Known Gaps to Fill In
- `OrderScreen.kt`: item selection UI is a stub — wire up your item list/pricing.
- `HistoryScreen.kt`: uses mock data — connect to your real orders API.
- `data/api/ApiService.kt` and `data/models/Order.kt`: not yet implemented —
  add your Retrofit service + data classes here once you share your API shape.
- Submitting an order in `OrderScreen.kt` just navigates to a placeholder invoice
  ID — hook it up to your backend's order-creation endpoint.

## Contact
For support, email cubelaundry12@gmail.com
