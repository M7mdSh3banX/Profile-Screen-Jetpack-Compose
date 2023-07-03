package com.shaban.profilescreenjetpackcompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.shaban.profilescreenjetpackcompose.R
import com.shaban.profilescreenjetpackcompose.composable.DefaultButton
import com.shaban.profilescreenjetpackcompose.composable.Header
import com.shaban.profilescreenjetpackcompose.composable.InformationCard
import com.shaban.profilescreenjetpackcompose.composable.ProfileAvatar
import com.shaban.profilescreenjetpackcompose.composable.SpaceHorizontal16
import com.shaban.profilescreenjetpackcompose.composable.SpaceVertical24
import com.shaban.profilescreenjetpackcompose.composable.SpaceVertical32
import com.shaban.profilescreenjetpackcompose.composable.TextButton
import com.shaban.profilescreenjetpackcompose.viewmodel.ProfileViewModel
import com.shaban.profilescreenjetpackcompose.viewmodel.state.ProfileUiState

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    ProfileContent(
        state = state,
        onChangeFirstName = viewModel::onChangeFirstName,
        onChangeLastName = viewModel::onChangeLastName,
        onChangeLocation = viewModel::onChangeLocation,
        onChangeEmail = viewModel::onChangeEmail,
        onChangePhone = viewModel::onChangePhone,
        onSaveUserInfo = viewModel::onSaveUserInfo
    )
}

@Composable
private fun ProfileContent(
    state: ProfileUiState,
    onChangeFirstName: (String) -> Unit,
    onChangeLastName: (String) -> Unit,
    onChangeLocation: (String) -> Unit,
    onChangeEmail: (String) -> Unit,
    onChangePhone: (String) -> Unit,
    onSaveUserInfo: () -> Unit,
) {
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

        ProfileAvatar(
            painter = rememberAsyncImagePainter(model = state.profilePictureLink),
            size = 128
        )
        SpaceVertical24()

        TextButton(text = stringResource(R.string.change_profile_picture)) {}
        SpaceVertical32()

        Row(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.weight(1F)) {
                InformationCard(
                    title = stringResource(R.string.first_name),
                    information = state.firstName,
                    onTextChange = onChangeFirstName
                )
            }
            SpaceHorizontal16()
            Box(modifier = Modifier.weight(1F)) {
                InformationCard(
                    title = stringResource(R.string.second_name),
                    information = state.lastName,
                    onTextChange = onChangeLastName
                )
            }
        }
        InformationCard(
            title = stringResource(R.string.location),
            information = state.location,
            onTextChange = onChangeLocation
        )
        InformationCard(
            title = stringResource(R.string.email),
            information = state.email,
            onTextChange = onChangeEmail
        )
        InformationCard(
            title = stringResource(R.string.phone),
            information = state.phone,
            onTextChange = onChangePhone
        )

        Spacer(modifier = Modifier.weight(1F))
        DefaultButton(buttonText = stringResource(R.string.save), onClick = onSaveUserInfo)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}