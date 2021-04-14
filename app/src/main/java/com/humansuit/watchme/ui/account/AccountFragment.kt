package com.humansuit.watchme.ui.account

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.humansuit.watchme.R
import com.humansuit.watchme.databinding.FragmentAccountBinding

class AccountFragment : Fragment(R.layout.fragment_account) {

    private val viewBinding: FragmentAccountBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}