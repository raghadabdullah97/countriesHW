package com.example.countrieshw.overview
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countrieshw.netWork.MarsApi

class viewModel : ViewModel() {

    private val _status =  MutableLiveData<String>()

    val status: LiveData<String> = _status
    init {
        getCountriesImag()
    }

    private fun getCountriesImag() {
        viewModelScope.launch {
            try {
                val listResult = MarsApi.retrofitService.getPhotos()
                _status.value = "Success: ${listResult.data.size} photos retrieved"
            } catch (e: Exception) {
                _status.value = "Failure: ${e.message}"
            }
        }
    }
}












}