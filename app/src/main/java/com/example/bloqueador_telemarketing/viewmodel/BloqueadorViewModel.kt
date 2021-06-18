package com.example.bloqueador_telemarketing.viewmodel


import androidx.lifecycle.*
import com.example.bloqueador_telemarketing.repository.BlackListNum
import com.example.bloqueador_telemarketing.repository.BlackListRepository
import kotlinx.coroutines.launch


class BloqueadorViewModel (
    private val repository: BlackListRepository) : ViewModel() {

    val blackList: LiveData<List<BlackListNum>> = repository.blackList.asLiveData()
    fun insert(blackListNum: BlackListNum) = viewModelScope.launch {
        repository.insert(blackListNum)
    }
}

class BlackListViewModelFactory(private val repository: BlackListRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BlackListViewModelFactory::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return BlackListViewModelFactory(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}