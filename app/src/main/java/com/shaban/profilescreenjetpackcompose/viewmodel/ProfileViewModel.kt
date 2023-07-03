package com.shaban.profilescreenjetpackcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.shaban.profilescreenjetpackcompose.viewmodel.state.ProfileUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class ProfileViewModel : ViewModel() {
    private val _state = MutableStateFlow(ProfileUiState())
    val state = _state.asStateFlow()

    fun onChangeFirstName(newValue: String) = _state.update { it.copy(firstName = newValue) }

    fun onChangeLastName(newValue: String) = _state.update { it.copy(lastName = newValue) }

    fun onChangeLocation(newValue: String) = _state.update { it.copy(location = newValue) }

    fun onChangeEmail(newValue: String) = _state.update { it.copy(email = newValue) }

    fun onChangePhone(newValue: String) = _state.update { it.copy(phone = newValue) }

    fun onSaveUserInfo() {
        TODO()
    }
}