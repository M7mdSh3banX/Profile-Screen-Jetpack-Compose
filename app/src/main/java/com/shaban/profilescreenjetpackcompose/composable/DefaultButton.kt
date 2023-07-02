package com.shaban.profilescreenjetpackcompose.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shaban.profilescreenjetpackcompose.ui.theme.Green
import com.shaban.profilescreenjetpackcompose.ui.theme.Rubik

@Composable
fun DefaultButton(
    buttonText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = { onClick },
        modifier = modifier
            .fillMaxWidth()
            .height(54.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Green),
        elevation = ButtonDefaults.buttonElevation(0.dp)
    ) {
        Text(
            text = buttonText,
            color = Color.White,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )
    }
}