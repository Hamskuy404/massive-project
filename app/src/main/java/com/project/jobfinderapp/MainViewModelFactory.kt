package com.project.jobfinderapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.jobfinderapp.data.MainRepository
import java.lang.IllegalArgumentException

class MainViewModelFactory (private val repository: MainRepository): ViewModelProvider.Factory{
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class!")
    }

}