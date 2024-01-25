package com.example.kotlin_dz_5_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin_dz_5_month3.databinding.FragmentZeroBinding

class ZeroFragment : Fragment() {
    private var _binding: FragmentZeroBinding? = null
    private val binding get() = _binding!!
    private var counterValue = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentZeroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
    }

    private fun loadData() {
        binding.tvPlus.setOnClickListener { view ->
            incrementCounter()
        }
        binding.tvMinus.setOnClickListener { view ->
            decrementCounter()
        }
    }

    private fun incrementCounter() {
        counterValue++
        binding.tvZero.text = counterValue.toString()
        binding.tvMinus.visibility = if (counterValue < 10) View.INVISIBLE else View.VISIBLE

        if (counterValue == 0) {
        }
    }

    private fun decrementCounter() {
        counterValue--
        binding.tvZero.text = counterValue.toString()
        binding.tvPlus.visibility = if (counterValue > 0) View.INVISIBLE else View.VISIBLE

        if (counterValue == 0) {
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        fun newInstance(): ZeroFragment {
            return ZeroFragment()
        }
    }
}

