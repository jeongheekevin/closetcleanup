package com.kevin.project.closetcleanup.domain.top

import lombok.Getter
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@Getter
class TShirts {

    @Id
    @GeneratedValue
    val id: String? = null

    @Column
    val productName: String? = "파란무늬옷"

    //#RRGGBB
    @Column
    val colorHexCode: String? = "000000"

    //cm
    @Column
    val totalHeight: Long? = 10


}