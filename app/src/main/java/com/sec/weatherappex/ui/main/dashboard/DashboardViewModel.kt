package com.sec.weatherappex.ui.main.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.weatherappex.R
import com.sec.weatherappex.ui.main.dashboard.items.HourlyUiItem

class DashboardViewModel:ViewModel() {
    private var _hourlyData=MutableLiveData<ArrayList<HourlyUiItem>>()
    val hourlyData:LiveData<ArrayList<HourlyUiItem>> = _hourlyData

    fun generateHourlyData(){
        val items= arrayListOf<HourlyUiItem>(
            HourlyUiItem(
                img = R.drawable.cloudy,
                hourTxt = "9 am",
                tempTxt ="28°"
            ),
            HourlyUiItem(
                img = R.drawable.sunny,
                hourTxt = "10 am",
                tempTxt ="28°"
            ),
            HourlyUiItem(
                img = R.drawable.cloudy,
                hourTxt = "11 am",
                tempTxt ="29°"
            ),
            HourlyUiItem(
                img = R.drawable.windy,
                hourTxt = "12 pm",
                tempTxt ="30°"
            ),
            HourlyUiItem(
                img = R.drawable.rainy,
                hourTxt = "1 pm",
                tempTxt ="28°"
            ),

        )
        _hourlyData.value=items
    }

}