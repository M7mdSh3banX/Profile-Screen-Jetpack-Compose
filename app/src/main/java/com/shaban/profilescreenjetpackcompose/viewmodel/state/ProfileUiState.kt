package com.shaban.profilescreenjetpackcompose.viewmodel.state

data class ProfileUiState(
    val firstName: String = "",
    val lastName: String = "",
    val location: String = "",
    val email: String = "",
    val phone: String = "",
    val profilePictureLink: String = ""
)
