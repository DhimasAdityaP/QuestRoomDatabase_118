package com.example.database

import android.app.Application
import com.example.database.dependeciesinjection.ContainerApp
import com.example.database.dependeciesinjection.InterfaceContainerApp

class KrsApp : Application(){
    //fungsinya untuk menyimpan instance containerapp
    lateinit var containerApp: ContainerApp
    override fun onCreate() {
        //membuat instance containerapp
        super.onCreate()
        containerApp = ContainerApp(this)
        //instance adalah object yang dibuat dari class
    }
}