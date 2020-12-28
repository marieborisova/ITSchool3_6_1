package com.example.fragments3_6_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class CheckBoxFragment extends Fragment {

    @Override
    // Переопределяем метод onCreateView
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.checkbox_fragment, container, false);
        return view;
    }
}