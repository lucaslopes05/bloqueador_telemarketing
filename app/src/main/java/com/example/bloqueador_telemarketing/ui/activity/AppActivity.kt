package com.example.bloqueador_telemarketing.ui.activity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.bloqueador_telemarketing.R
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings

class AppActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
    }
}




