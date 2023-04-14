package com.example.collegeapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "Computer Science Engineering", "To provide excellent technical education in computer science and engineering and produce competent engineers and professionals with high ethical values prepared for life long learning."));
        list.add(new BranchModel(R.drawable.ic_mech, "Electronics Engineering", "To provide excellent technical education in electronics and communication and produce competent engineers and professionals with high ethical values prepared for life long learning."));
        list.add(new BranchModel(R.drawable.ic_comp, "Information Technology", "To provide excellent technical education in information technology and produce competent engineers and professionals with high ethical values prepared for life long learning."));
        adapter = new BranchAdapter(getContext(), list);
        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);
        imageView.setImageResource(R.drawable.iiitu_building);
//        Glide.with(getContext())
//                .load("https://firebasestorage.googleapis.com/v0/b/oneclickadminapp.appspot.com/o/Notice%2F%5BB%401f780djpg?alt=media&token=b602a0df-2ec0-4cef-b78d-2718bacfa88d")
//                .into(imageView);
        return view;
    }
}