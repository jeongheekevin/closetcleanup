package com.kevin.project.closetcleanup.domain.bottom

import lombok.Getter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@Getter
class Pants {

    @Id
    @GeneratedValue
    val id: String? = null

    @Column
    val productName: String? = "통풍흰바지"

    //#RRGGBB
    @Column
    val colorHexCode: String? = "FFFFFF"

    //cm
    @Column
    val totalHeight: Long? = 10
}