package com.plcoding.realmguide.models

import io.realm.kotlin.types.EmbeddedRealmObject

// Teacher 1-to-1 Address
// Teacher 1-to-many Course
// Students many-to-many Course

class Address: EmbeddedRealmObject {
    var fullName: String = ""
    var street: String = ""
    var houseNumber: Int = 0
    var zip: Int = 0
    var city: String = ""
    var teacher: Teacher? = null
}