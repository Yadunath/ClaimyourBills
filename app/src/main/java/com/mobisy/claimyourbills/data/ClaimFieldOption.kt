package com.mobisy.claimyourbills.data

import com.google.gson.annotations.SerializedName

data class ClaimFieldOption(
    @SerializedName("name")
    var name :String,
    @SerializedName("label")
    var label :String,
    @SerializedName("belongsto")
    var belongsto :String,
    @SerializedName("hasmany")
    var hasmany :String,
    @SerializedName("claimfield_id")
    var claimfield_id :String,
    @SerializedName("id")
    var id :String
)