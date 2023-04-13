package com.example.collegeapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collegeapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        sliderLayout = view.findViewById(R.id.slider);
//        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
//        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
//        sliderLayout.setScrollTimeInSec(1);
//
//        setSliderView();

        return view;
    }

//    private void setSliderView() {
//        for (int i = 0; i < 5; i++) {
//            DefaultSliderView sliderView = new DefaultSliderView(getContext());
//
//            switch (i) {
//                case 0:
//                    sliderView.setImageUrl("https://iiitu.ac.in/wp-content/uploads/2022/02/WhatsApp-Image-2022-10-15-at-3.08.22-PM.jpeg");
//                    break;
//                case 1:
//                    sliderView.setImageUrl("https://iiitu.ac.in/wp-content/uploads/2022/11/Unity-Day-scaled.jpg");
//                    break;
//                case 2:
//                    sliderView.setImageUrl("https://iiitu.ac.in/wp-content/uploads/2023/01/Republic-Day-2023-Students-Group-scaled.jpg");
//                    break;
//                case 3:
//                    sliderView.setImageUrl("https://iiitu.ac.in/wp-content/uploads/2023/01/Republic-Day-2023-Tricolor-Salute-scaled.jpg");
//                    break;
//                case 4:
//                    sliderView.setImageUrl("https://iiitu.ac.in/wp-content/uploads/2022/02/WhatsApp-Image-2022-10-15-at-3.08.25-PM-2.jpeg");
//                    break;
//            }
//            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
//
//            sliderLayout.addSliderView(sliderView);
//
//        }
//    }
}