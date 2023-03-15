package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isLandScape =true;
    public void change(View view)
        ImageView iv=findViewById(R.id.imageView2);
    if(isLandScape){
        iv.setImageResource(R.drawable.mountains_55067__340);
        isLandScape=false;
    }
    else
    {
        iv.setImageResource(R.drawable.flowers_2162682_1920);
        isLandScape=false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}