package com.cryptocurrency.crytp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cryptocurrency.crytp.R


val workSansFontsBlack = FontFamily(
    Font(R.font.worksans_black, FontWeight.Normal),

    )
val workSansFontsRegular = FontFamily(
    Font(R.font.worksans_regular, FontWeight.Normal),


    )
val workSansFontsThin = FontFamily(
    Font(R.font.worksans_thin, FontWeight.Normal),


    )
val workSansFontsLight = FontFamily(
    Font(R.font.worksans_light, FontWeight.Normal),

    )
val workSansFontsMedium = FontFamily(
    Font(R.font.worksans_medium, FontWeight.Normal),
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

