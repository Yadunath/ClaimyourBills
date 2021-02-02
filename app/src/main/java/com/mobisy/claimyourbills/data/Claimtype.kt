package com.mobisy.claimyourbills.data

import com.google.gson.annotations.SerializedName

data class Claimtype(
    @SerializedName("name")
    var name:String ?=null,
    @SerializedName("id")
    var id :String ?=null
)