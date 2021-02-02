package com.mobisy.claimyourbills.data

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("Result")
    var result:Boolean,
    @SerializedName("Reason")
    var reason :String,
    @SerializedName("Claims")
    var claims:List<ClaimsItem>

)