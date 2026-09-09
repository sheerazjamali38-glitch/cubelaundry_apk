package com.cubelaundry.app.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.cubelaundry.app.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val SpaceGrotesk = FontFamily(
    Font(GoogleFont("SpaceGrotesk"), provider)
)

val Inter = FontFamily(
    Font(GoogleFont("Inter"), provider)
)

// NOTE: Using Google Fonts downloadable fonts requires res/values/arrays.xml
// with the Google Fonts certificates array (com_google_android_gms_fonts_certs).
// If you don't want to set that up, simplest fix is to replace SpaceGrotesk and
// Inter above with FontFamily.Default (system font) and remove the provider code.
