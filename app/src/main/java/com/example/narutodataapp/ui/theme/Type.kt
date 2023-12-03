package com.example.narutodataapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.narutodataapp.R

// Set of Material typography styles to start with
val nova_bold = FontFamily(Font(R.font.nova_square_regular, FontWeight.Bold))
val quicksand = FontFamily(Font(R.font.quicksand_medium))

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
        color = md_theme_dark_background
    ),
    bodySmall = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        color = md_theme_light_onSurfaceVariant
    ),
    titleLarge = TextStyle(
        fontFamily = nova_bold,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)