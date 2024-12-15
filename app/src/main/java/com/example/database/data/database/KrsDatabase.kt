package com.example.database.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.database.data.entity.Mahasiswa
import com.pam.questroomdatabase_139.data.dao.MahasiswaDao

@Database(entities = [Mahasiswa::class], version= 1, exportSchema = false)
abstract class KrsDatabase:RoomDatabase() {
    //mendefiniskan
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile //memastikan bahwa nilai variabel instance selalu sama di semua throw
        private var Instance:KrsDatabase? = null
        fun getDatabase(context: Context): KrsDatabase{
            return(Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java, //class database
                    "KrsDatabase"//nama database
                )
                    .build().also {
                        Instance = it
                    }
            })
        }
    }
}