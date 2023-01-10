package com.project.viewmodelexperiment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController

class Fragment2 : Fragment() {
    lateinit var viewModel: Frag2ViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        viewModel = ViewModelProvider(this)[Frag2ViewModel::class.java]
        view.findViewById<TextView>(R.id.tv).text = viewModel.text
        view.findViewById<TextView>(R.id.tv).setOnClickListener{
            view.findNavController().navigate(R.id.action_fragment2_to_fragment1)
        }
        return view
    }
}