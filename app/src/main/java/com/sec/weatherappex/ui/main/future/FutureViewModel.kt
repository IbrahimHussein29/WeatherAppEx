package com.sec.weatherappex.ui.main.future

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.weatherappex.R
import com.sec.weatherappex.ui.main.future.items.FutureUiItem

class FutureViewModel : ViewModel() {

    private var _futureData = MutableLiveData<ArrayList<FutureUiItem>>()
    val futureData: LiveData<ArrayList<FutureUiItem>> = _futureData

    fun generateFutureData() {
        val items = arrayListOf<FutureUiItem>(
            FutureUiItem(
                picPath = R.drawable.storm, status ="Storm", day ="Sat", highTamp ="25", lowTamp ="10"
            ),
            FutureUiItem(
                picPath =R.drawable.cloudy, status ="Cloudy", day ="Sun", highTamp ="24",  lowTamp ="16"
            ),
            FutureUiItem(
                picPath =R.drawable.windy, status ="Windy", day ="Mon", highTamp ="29",  lowTamp ="15"
            ),
            FutureUiItem(
                picPath =R.drawable.cloudy, status ="Cloudy Sunny", day ="Tue", highTamp ="22",  lowTamp ="13"
            ),
            FutureUiItem(
                picPath =R.drawable.sunny, status ="Sunny", day ="Wed", highTamp ="28",  lowTamp ="11"
            ),
            FutureUiItem(
                picPath =R.drawable.rainy, status ="Rainy", day ="Thu", highTamp ="23",  lowTamp ="12"
            )

        )
        _futureData.value=items
    }
}