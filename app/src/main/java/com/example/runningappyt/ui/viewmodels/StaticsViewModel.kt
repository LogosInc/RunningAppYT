package com.example.runningappyt.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningappyt.repositories.MainRepository

class StaticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel(){
}