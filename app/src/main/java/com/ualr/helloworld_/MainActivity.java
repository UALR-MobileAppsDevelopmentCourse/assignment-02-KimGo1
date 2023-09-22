package com.ualr.helloworld_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.ualr.helloworld_.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//onCreate is invoked when the operating system launches an activity

       mBinding = ActivityMainBinding.inflate(getLayoutInflater());
       setContentView(mBinding.getRoot());
         // setContentView(R.layout.activity_main);//layout xml files are resources, therefore are added to the R class
        //setContentView(View) is method used to define the visible elements of a particular activity
        mBinding.msgET.setHint("This is the new hint");

    }

    public void onButtonClicked(View view) {
        Log.d("MainActivity", "Clicked!!");
        String inputMsg = mBinding.msgET.getText().toString();
        mBinding.msgTV.setText(inputMsg);
    }

}
