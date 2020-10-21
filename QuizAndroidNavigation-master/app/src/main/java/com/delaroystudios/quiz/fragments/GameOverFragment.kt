package com.delaroystudios.quiz.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.delaroystudios.quiz.R
import com.delaroystudios.quiz.databinding.FragmentGameOverBinding
import com.delaroystudios.quiz.databinding.FragmentTitleBinding
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI



class GameOverFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameOverBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_over, container, false)
        binding.tryAgainButton.setOnClickListener {
            view -> findNavController().navigate(R.id.action_gameOverFragment2_to_gameFragment)
        }
        return binding.root
    }
}

//           view.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGameOverFragment())
//override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    //                      savedInstanceState: Bundle?): View? {
 //   val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
 //   binding.playButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))
//
//    setHasOptionsMenu(true)
 //   return binding.root