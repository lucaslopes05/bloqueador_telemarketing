package com.example.bloqueador_telemarketing.repository.db

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.bloqueador_telemarketing.ui.adapter.DataViewParams.PhoneNumberViewParams

@Entity(indices = [Index(value = ["number"], unique = true)])
data class NumEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var number: String? = null,
)

fun PhoneNumberViewParams.toNumEntity(): NumEntity{
    return with(this){
        NumEntity(
            id = this.id,
            number = this.number
        )
    }
}
