package com.kevin.project.closetcleanup.dto

import com.kevin.project.closetcleanup.domain.top.TShirts

data class TopDto(

    val id: String? = null,

    val productName: String? = "파란무늬옷",
    //#RRGGBB
    val colorHexCode: String? = "000000",

    val totalHeight: Long?

){
    fun from(tShirts: TShirts): TopDto{
        return TopDto(tShirts.id, tShirts.productName, tShirts.colorHexCode, tShirts.totalHeight)
    }

}
