package com.example.ganesha.app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ganesha.data.DataRepository
import com.example.ganesha.data.models.LinkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import okhttp3.Request
import javax.inject.Inject


@HiltViewModel
class LinkTokenApiViewModel @Inject constructor(private val repository: DataRepository) :
    ViewModel() {

    val linkRequest: LiveData<Request>
        get() = _linkRequest
    private val _linkRequest = MutableLiveData<Request>()

    val linkResponse: LiveData<LinkResponse>
        get() = _linkResponse
    private val _linkResponse = MutableLiveData<LinkResponse>()

    val linkLoading: LiveData<Boolean>
        get() = _linkLoading
    private val _linkLoading = MutableLiveData<Boolean>()

    //Fetch a link token
    fun fetchLinkToken() {
        _linkLoading.postValue(true)
        viewModelScope.launch {
            val response = repository.createLinkToken()
            _linkRequest.postValue(response.raw().request())
            if (response.isSuccessful) {
                _linkLoading.postValue(false)
                val details = response.body()
                details?.let {
                    _linkResponse.postValue(it)
                }
            } else {
                //Handle error UI stuff here
                _linkLoading.postValue(false)
                _linkResponse.postValue(response.body())
            }
        }
    }
}