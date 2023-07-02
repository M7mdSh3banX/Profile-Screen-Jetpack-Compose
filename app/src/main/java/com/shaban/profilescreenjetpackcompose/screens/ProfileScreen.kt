package com.shaban.profilescreenjetpackcompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shaban.profilescreenjetpackcompose.R
import com.shaban.profilescreenjetpackcompose.composable.DefaultButton
import com.shaban.profilescreenjetpackcompose.composable.Header
import com.shaban.profilescreenjetpackcompose.composable.InformationCard
import com.shaban.profilescreenjetpackcompose.composable.ProfileAvatar
import com.shaban.profilescreenjetpackcompose.composable.SpaceHorizontal16
import com.shaban.profilescreenjetpackcompose.composable.SpaceVertical24
import com.shaban.profilescreenjetpackcompose.composable.SpaceVertical32
import com.shaban.profilescreenjetpackcompose.composable.TextButton

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(
            title = stringResource(R.string.account),
            subtitle = stringResource(R.string.account_subtitle)
        )
        SpaceVertical32()

        ProfileAvatar(painter = painterResource(id = R.drawable.doggy), size = 128)
        SpaceVertical24()

        TextButton(text = stringResource(R.string.change_profile_picture)) {}
        SpaceVertical32()

        Row(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.weight(1F)) {
                InformationCard(
                    title = stringResource(R.string.first_name),
                    information = "Mohamed"
                )
            }
            SpaceHorizontal16()
            Box(modifier = Modifier.weight(1F)) {
                InformationCard(
                    title = stringResource(R.string.second_name),
                    information = "Shaban"
                )
            }
        }
        InformationCard(title = stringResource(R.string.location), information = "Fayoum City")
        InformationCard(title = stringResource(R.string.email), information = "ms2951@google.com")
        InformationCard(title = stringResource(R.string.phone), information = "+20 1028946618")

        Spacer(modifier = Modifier.weight(1F))
        DefaultButton(buttonText = stringResource(R.string.save), onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}