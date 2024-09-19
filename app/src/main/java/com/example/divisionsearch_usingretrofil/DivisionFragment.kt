package com.example.divisionsearch_usingretrofil

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.divisionsearch_usingretrofil.databinding.FragmentDivisionListBinding
import com.example.divisionsearch_usingretrofil.placeholder.PlaceholderContent
import com.example.myapplication.DivisionAdapter

class DivisionFragment : Fragment() {
    private lateinit var binding: FragmentDivisionListBinding
    private lateinit var divisionAdapter: DivisionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDivisionListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.divisionRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)


    }
}