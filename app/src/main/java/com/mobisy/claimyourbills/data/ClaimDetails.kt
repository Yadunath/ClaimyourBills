package com.mobisy.claimyourbills.data

import com.google.gson.annotations.SerializedName

data class ClaimDetails(
    @SerializedName("claimfield_id")
    var claimfield_id :String,
    @SerializedName("id")
    var id :String,
    @SerializedName("claimtype_id")
    var claimtype_id :String,
    @SerializedName("Claimfield")
    var claimField:ClaimField

)