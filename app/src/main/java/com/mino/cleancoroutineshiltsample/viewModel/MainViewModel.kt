package com.mino.cleancoroutineshiltsample.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mino.cleancoroutineshiltsample.util.dtoToVo
import com.mino.cleancoroutineshiltsample.vo.ImageVo
import com.mino.domain.usecase.GetImageUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(private val getImageUseCase: GetImageUseCase) : ViewModel() {

    private val _imageVoList = MutableLiveData<List<ImageVo>>()
    val imageVoList: LiveData<List<ImageVo>> get() = _imageVoList

    val searchText = MutableLiveData<String>()

    fun getImage(
        query: String,
        display: Int = 20,
        start: Int = 1,
        sort: String = "sim",
        filter: String = "all"
    ) {
        viewModelScope.launch {
            _imageVoList.value = getImageUseCase.execute(query, display, start, sort, filter).map {
                Log.e("asdsadasd", it.dtoToVo().toString())
                it.dtoToVo()
            }
        }
    }
}