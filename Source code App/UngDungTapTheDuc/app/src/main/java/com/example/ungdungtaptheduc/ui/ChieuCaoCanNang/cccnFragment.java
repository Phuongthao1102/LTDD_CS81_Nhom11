package com.example.ungdungtaptheduc.ui.ChieuCaoCanNang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.ungdungtaptheduc.R;

public class cccnFragment extends Fragment{
    private cccnViewModel cccnViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cccnViewModel =
                new ViewModelProvider(this).get(cccnViewModel.class);
        View root = inflater.inflate(R.layout.fragment_noti, container, false);
        String s = "This is Weight & Height fragment";
        cccnViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}
