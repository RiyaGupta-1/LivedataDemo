package com.example.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val factsLiveData= MutableLiveData<String>("Facts here!")

    fun updateLiveData(){
        factsLiveData.value= "New fact added!"
    }
}