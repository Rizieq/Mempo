package com.rizieq.mempo.activites

interface RegisterContract {

    interface View{
        fun showLoading()
        fun hideLoading()
        fun showError(msg: String)
        fun showRegisterSucess(msg: String)
    }

    interface Presenter{
        fun doRegister()
    }

}