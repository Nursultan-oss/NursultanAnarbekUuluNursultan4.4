package com.example.allprojects.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.allprojects.R
import com.example.allprojects.databinding.FragmentBoardBinding

class BoardFragment : Fragment() {
private lateinit var binding: FragmentBoardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =FragmentBoardBinding.inflate(layoutInflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = NewsAdapter(requireContext(), findNavController())
        binding.viewPager.adapter = adapter
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner) {
            activity?.onBackPressedDispatcher

        }
        binding.viewPager.adapter = adapter
        binding.tichki.setViewPager2(binding.viewPager)

        binding.skipped.setOnClickListener {
            findNavController().navigateUp()
        }
    }

            }

