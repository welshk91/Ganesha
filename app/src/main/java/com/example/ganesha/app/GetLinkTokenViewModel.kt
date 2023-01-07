package com.example.ganesha.app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ganesha.data.DataRepository
import com.example.ganesha.data.models.LinkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class GetLinkTokenViewModel @Inject constructor(private val repository: DataRepository) :
    ViewModel() {

    val linkResponse: LiveData<LinkResponse>
        get() = _linkResponse
    private val _linkResponse = MutableLiveData<LinkResponse>()

    //Get the days data in detail
    fun fetchLinkToken() {
        viewModelScope.launch {
            val response = repository.getLinkToken()
            if (response.isSuccessful) {
                val details = response.body()
                details?.let {
                    _linkResponse.postValue(it)
                }
            } else {
                //Handle error UI stuff here
            }
        }
    }
}