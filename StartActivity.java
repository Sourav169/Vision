package com.example.admin.vision;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout linearLayout;
    private SliderAdapter sliderAdapter;
    private Button mnextbutton;
    private Button mbackButton;
    private int currentpage;

    private TextView[] mdots;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        linearLayout=(LinearLayout)findViewById(R.id.dotslayout);

        mnextbutton=(Button)findViewById(R.id.btNext);
        mbackButton=(Button)findViewById(R.id.btBack);


        sliderAdapter=new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
         adddotsIndicator(0);
         viewPager.addOnPageChangeListener(viewListner);

         mnextbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 viewPager.setCurrentItem(currentpage + 1);
             }
         });
         mbackButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 viewPager.setCurrentItem(currentpage - 1);
             }
         });




    }

    public void adddotsIndicator(int position){

        mdots=new TextView[2];
        linearLayout.removeAllViews();

        for (int i=0;i<mdots.length;i++){

            mdots[i]=new TextView(this);
            mdots[i].setText(Html.fromHtml("&#8226"));
            mdots[i].setTextSize(30);
            mdots[i].setTextColor(getResources().getColor(R.color.colorwhite));
            linearLayout.addView(mdots[i]);

        }
        if(mdots.length>0){
            mdots[position].setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        }

    }
    ViewPager.OnPageChangeListener viewListner=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int r) {

        }

        @Override
        public void onPageSelected(int i) {
            adddotsIndicator(i);
            currentpage=i;
            if(i==0){
                mnextbutton.setEnabled(true);
                mbackButton.setEnabled(false);
                mbackButton.setVisibility(View.INVISIBLE);
                mnextbutton.setText("Next");
                mbackButton.setText("");


            }else if(i==mdots.length-1){
                mbackButton.setEnabled(true);
                mnextbutton.setEnabled(true);
                mbackButton.setVisibility(View.VISIBLE);
                mnextbutton.setText("Get Started");
                mbackButton.setText("Back");
                mnextbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(StartActivity.this,RegistrationActivity.class);
                        startActivity(intent);
                    }
                });

            }else {
                mbackButton.setEnabled(true);
                mnextbutton.setEnabled(true);
                mbackButton.setVisibility(View.VISIBLE);
                mnextbutton.setText("Next");
                mbackButton.setText("Back");
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

}
