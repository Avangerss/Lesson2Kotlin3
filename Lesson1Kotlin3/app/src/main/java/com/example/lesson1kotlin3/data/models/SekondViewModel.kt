package com.example.lesson1kotlin3.data.models

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson1kotlin3.ui.views.preferens.SharedPreferens

class SekondViewModel: ViewModel() {

    private var _userData = MutableLiveData<UserModel>()
    val userData: LiveData<UserModel> = _userData

    fun updateUserModel(userModel: UserModel) {
        _userData.value = userModel
    }

    fun huynia(context: Context) {
        val preferenceHelper = SharedPreferens(context)
        updateUserModel(
            UserModel(
                preferenceHelper.user_name!!,
                preferenceHelper.age!!,
                preferenceHelper.user_email!!,
                preferenceHelper.user_password!!
            )
        )
    }
}
