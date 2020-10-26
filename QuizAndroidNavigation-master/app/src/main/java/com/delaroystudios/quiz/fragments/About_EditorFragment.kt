package com.delaroystudios.quiz.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.delaroystudios.quiz.R
import com.delaroystudios.quiz.databinding.FragmentAboutEditorBinding

class About_EditorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutEditorBinding>(
            inflater, R.layout.fragment_about_editor, container, false)
        binding.salvar.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_editAboutFragment_to_aboutFragment))

        return binding.root
    }
}