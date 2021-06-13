package com.example.bloqueador_telemarketing.viewmodel

import androidx.lifecycle.*
import com.example.bloqueador_telemarketing.domain.BlackList
import com.example.bloqueador_telemarketing.repository.BlackListRepository
import kotlinx.coroutines.launch

class BlackListViewModel(private val repository: BlackListRepository) : ViewModel() {

    val blackList : LiveData<List<BlackList>> = repository.allWords.asLiveData()
    fun insert(blackList: BlackList) = viewModelScope.launch {
        repository.insert(blackList)
    }
}

class BlackListViewModelFactory(private  val repository: BlackListRepository) : ViewModelProvider.Factory {
    override fun < T: ViewModel> create(modelClass: Class<T>) : T {
        if (modelClass.isAssignableFrom(BlackListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return BlackListViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}