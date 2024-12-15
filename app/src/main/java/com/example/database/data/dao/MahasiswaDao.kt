package com.example.database.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.database.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Query("select*from mahasiswa")
    fun getALLMahasiswa() :  Flow<List<Mahasiswa>>
    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )
}