package com.entimer.coronatracker.view.main.summary

import com.entimer.coronatracker.data.dataclass.CovidData

interface SummaryCardContract {
    interface View {
        fun startUpdateView()
        fun updateView(data: CovidData)
    }

    interface Presenter {
        fun getGlobalData()
        fun getCountryData()
    }
}