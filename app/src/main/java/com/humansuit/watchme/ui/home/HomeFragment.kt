package com.humansuit.watchme.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.humansuit.watchme.R
import com.humansuit.watchme.databinding.FragmentHomeBinding

//https://image.tmdb.org/t/p/w342/zda0VWRKHnUSX7B7NOPqVUlu9zK.jpg  --> poster image

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val viewBinding: FragmentHomeBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataSet = Array(100) { "n = $it" }

        with(viewBinding) {
            recyclerview.adapter = MovieAdapter()
            recyclerview.layoutManager = GridLayoutManager(this.root.context, 2)
        }

    }

}