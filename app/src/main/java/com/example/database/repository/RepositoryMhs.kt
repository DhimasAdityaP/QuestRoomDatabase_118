package com.example.database.repository

import com.example.database.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>
    //getMhs
    fun getMhs(nim: String): Flow<Mahasiswa>
    //deleteMhs
    suspend fun deleteMhs(mahasiswa: Mahasiswa)
    //updateMhs
    suspend fun updateMhs(mahasiswa: Mahasiswa)
}