package com.example.countrieshw.netWork

import android.provider.ContactsContract
import com.squareup.moshi.Json


data class CountryRespose(val error: Boolean, var msg : String , var data : List <Photo>)

data class Photo (@Json (name = "name") val name : String ,@Json(name ="flag") val flagUrl :String)