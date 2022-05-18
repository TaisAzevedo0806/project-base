package com.example.projectbase.presentation.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projectbase.databinding.FragmentFeatureBinding

class FeatureFragment : Fragment() {

    private var _binding: FragmentFeatureBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeatureBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        // Following the documentation, the _binding variable must be cleared when the view is destroyed
        _binding = null
        super.onDestroyView()
    }
}