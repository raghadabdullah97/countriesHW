package com.example.countrieshw.netWork

import android.provider.ContactsContract
import com.squareup.moshi.Json

data class PhotoRes (val error : Boolean , val msg : String , val data : List<Photo>)
data class photo (@Json(name = "name") val name : String ,
                  @Json(name = "flag") val flagUrl : String)