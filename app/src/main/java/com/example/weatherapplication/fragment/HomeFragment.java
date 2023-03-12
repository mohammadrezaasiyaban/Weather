package com.example.weatherapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weatherapplication.R;
import com.example.weatherapplication.base.BaseFragment;
import com.example.weatherapplication.databinding.FragmentHomeBinding;

public class HomeFragment extends BaseFragment {
    private FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}