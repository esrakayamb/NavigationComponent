package com.example.navigationcomponentexample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentexample.R
import com.example.navigationcomponentexample.databinding.FragmentFirstBinding
import com.example.navigationcomponentexample.utils.viewBinding

class FirstFragment : Fragment() {

    private val binding by viewBinding(FragmentFirstBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_first, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener { openSecondPage() }
    }

    private fun openSecondPage()= with(binding) {
        val name = inputText.text.toString()
        val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(name)
        findNavController().navigate(action)
    }
}