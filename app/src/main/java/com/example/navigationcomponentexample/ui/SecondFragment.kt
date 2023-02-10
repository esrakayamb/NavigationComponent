package com.example.navigationcomponentexample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentexample.R
import com.example.navigationcomponentexample.databinding.FragmentSecondBinding
import com.example.navigationcomponentexample.utils.viewBinding

class SecondFragment : Fragment() {

    private val binding by viewBinding(FragmentSecondBinding::bind)

    private val args: SecondFragmentArgs by navArgs()

    private val name: String by lazy { args.name }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_second, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        textview.text = name
    }
}