package com.shaban.profilescreenjetpackcompose.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.shaban.profilescreenjetpackcompose.ui.theme.PrimaryTextColor
import com.shaban.profilescreenjetpackcompose.ui.theme.Rubik
import com.shaban.profilescreenjetpackcompose.ui.theme.SecondaryTextColor

@Composable
fun Header(
    title: String,
    subtitle: String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            color = PrimaryTextColor,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp
        )
        Text(
            text = subtitle,
            color = SecondaryTextColor,
            fontFamily = Rubik,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        )
    }
}

@Preview(widthDp = 360)
@Composable
fun PreviewHeader() {
    Header(title = "Account", subtitle = "Edit or manage your account")
}