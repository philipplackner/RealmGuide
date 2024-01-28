package com.plcoding.realmguide

import android.app.Application
import com.plcoding.realmguide.models.Address
import com.plcoding.realmguide.models.Course
import com.plcoding.realmguide.models.Student
import com.plcoding.realmguide.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application() {

    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )
    }
}