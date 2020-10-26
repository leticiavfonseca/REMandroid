package com.delaroystudios.quiz.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.delaroystudios.quiz.R
import com.delaroystudios.quiz.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(inflater, R.layout.fragment_about, container, false)
        binding.editar.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_aboutFragment_to_editAboutFragment))

        setHasOptionsMenu(true)
        return binding.root
    }
}