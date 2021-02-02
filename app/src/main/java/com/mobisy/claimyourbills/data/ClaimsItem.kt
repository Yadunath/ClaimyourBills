package com.mobisy.claimyourbills.data

import com.google.gson.annotations.SerializedName

data class ClaimsItem(
    @SerializedName("Claimtype")
    val claimtype: Claimtype,
    @SerializedName("Claimtypedetail")
    val  claimDetails: List<ClaimDetails>
)