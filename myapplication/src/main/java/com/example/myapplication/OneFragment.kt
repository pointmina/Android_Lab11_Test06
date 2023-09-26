package com.example.myapplication

import androidx.fragment.app.FragmentContainer
import com.example.myapplication.databinding.FragmentOneBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class OneFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater,container: ViewGroup?,
        savedInstanceState:Bundle?
    ): View?{
        val binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root

    }

}