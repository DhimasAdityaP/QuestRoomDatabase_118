package com.example.database.dependeciesinjection

import android.content.Context
import com.example.database.data.database.KrsDatabase
import com.example.database.repository.LocalRepositoryMhs
import com.example.database.repository.RepositoryMhs

interface InterfaceContainerApp{
    val repositoryMhs:RepositoryMhs
}
class ContainerApp(private val context: Context):InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}