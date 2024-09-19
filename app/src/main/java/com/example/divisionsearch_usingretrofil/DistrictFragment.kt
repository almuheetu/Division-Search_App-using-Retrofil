package com.example.divisionsearch_usingretrofil

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.divisionsearch_usingretrofil.databinding.AdapterDistrictBinding
import com.example.divisionsearch_usingretrofil.databinding.AdapterDivisionBinding
import com.example.divisionsearch_usingretrofil.databinding.FragmentDistrictListBinding
import com.example.divisionsearch_usingretrofil.placeholder.PlaceholderContent


class DistrictFragment : Fragment() {
    private lateinit var binding: FragmentDistrictListBinding
    private lateinit var districtAdapter: DistrictAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDistrictListBinding.inflate(inflater, container, false)
        return binding.root
    }



}