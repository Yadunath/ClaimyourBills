package com.mobisy.claimyourbills.data

import com.google.gson.annotations.SerializedName

data class ClaimField(
    @SerializedName("id")
    var id :String,
    @SerializedName("name")
    var name :String,
    @SerializedName("label")
    var label :String,
    @SerializedName("type")
    var type :String,
    @SerializedName("required")
    var required :String,
    @SerializedName("isdependant")
    var isdependant :String,
    @SerializedName("created")
    var created :String,
    @SerializedName("modified")
    var modified :String,
    @SerializedName("Claimfieldoption")
    var claimFiledOptionList: List<ClaimFieldOption>
)