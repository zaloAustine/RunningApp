package com.zalo.runningapp.di

import android.content.Context
import androidx.room.Room
import com.zalo.runningapp.db.RunDao
import com.zalo.runningapp.db.RunningDatabase
import com.zalo.runningapp.other.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
Created by zaloaustine in 1/9/23.
 */
@Module
@InstallIn(SingletonComponent::class)
object RunModule {

    @Provides
    @Singleton
    fun provideRunDatabase(@ApplicationContext context: Context): RunningDatabase {
        return Room.databaseBuilder(context, RunningDatabase::class.java, RUNNING_DATABASE_NAME)
            .build()
    }

    @Provides
    @Singleton
    fun provideRunDao(runningDatabase: RunningDatabase): RunDao {
        return runningDatabase.getRunDao()
    }
}