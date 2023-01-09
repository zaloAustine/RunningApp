package com.zalo.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.zalo.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
Created by zaloaustine in 1/9/23.
 */
@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

    
}
