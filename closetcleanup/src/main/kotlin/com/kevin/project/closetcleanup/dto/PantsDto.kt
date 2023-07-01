package com.kevin.project.closetcleanup.dto

import com.kevin.project.closetcleanup.domain.bottom.Pants
import com.kevin.project.closetcleanup.domain.top.TShirts

data class PantsDto(

    val id: String? = null,

    val productName: String? = "파란무늬옷",
    //#RRGGBB
    val colorHexCode: String? = "000000",

    val totalHeight: Long?

){
    fun from(pants: Pants): PantsDto{
        return PantsDto(pants.id, pants.productName, pants.colorHexCode, pants.totalHeight)
    }

}
