package com.example.collegeapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.collegeapp.R;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    String url1 = "https://iiitu.ac.in/wp-content/uploads/2022/02/WhatsApp-Image-2022-10-15-at-3.08.22-PM.jpeg";
    String url2 = "https://iiitu.ac.in/wp-content/uploads/2022/11/Unity-Day-scaled.jpg";
    String url3 = "https://iiitu.ac.in/wp-content/uploads/2023/01/Republic-Day-2023-Students-Group-scaled.jpg";
    String url4 = "https://iiitu.ac.in/wp-content/uploads/2023/01/Republic-Day-2023-Tricolor-Salute-scaled.jpg";
    String url5 = "https://iiitu.ac.in/wp-content/uploads/2022/02/WhatsApp-Image-2022-10-15-at-3.08.25-PM-2.jpeg";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // we are creating array list for storing our image urls.
        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();

        // initializing the slider view.
        SliderView sliderView = view.findViewById(R.id.slider);

        // adding the urls inside array list
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));
        sliderDataArrayList.add(new SliderData(url4));
        sliderDataArrayList.add(new SliderData(url5));

        // passing this array list inside our adapter class.
        SliderAdapter adapter = new SliderAdapter(view.getContext(), sliderDataArrayList);

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter);

        // below method is use to set
        // scroll time in seconds.
        sliderView.setScrollTimeInSec(3);

        // to set it scrollable automatically
        // we use below method.
        sliderView.setAutoCycle(true);

        // to start autocycle below method is used.
        sliderView.startAutoCycle();

        return view;
    }

}