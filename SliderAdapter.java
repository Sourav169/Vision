package com.example.admin.vision;

import android.content.Context;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context=context;
    }

    public int[] slide_images = new int[]{
            R.drawable.icon1,
            R.drawable.icon2,

    };

    public String[] slide_head={
                "MAKE EXAM MORE EASY AND FUN",
                "PERSONALIZED LEARNING"


    };


    public String [] slide_desc={
            "INTERACTIVE STUDY MATERIALS WITH ANALYSIS",
            "UNIQUE LEARNING JOURNEYS FOR EVERY STUDENTS"


    };

    @Override
    public int getCount() {
        return slide_head.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(LinearLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
     layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
     View view=layoutInflater.inflate(R.layout.slidelayout,container,false);

        ImageView slideimageview=(ImageView)view.findViewById(R.id.slide_image);
        TextView slidehead=(TextView)view.findViewById(R.id.slide_head);
        TextView slidedesc=(TextView)view.findViewById(R.id.slide_desc);

        slideimageview.setImageResource(slide_images[position]);
        slidehead.setText(slide_head[position]);
        slidedesc.setText(slide_desc[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
