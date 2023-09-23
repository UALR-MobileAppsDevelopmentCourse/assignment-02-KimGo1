package com.ualr.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ualr.first_app.databinding.ActivityMainBinding;


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


// Check if the EditText is empty
        if (!TextUtils.isEmpty(mBinding.msgET.getText().toString())) {
            mBinding.msgTV.setText(inputMsg);
        }
    }

    public void cleanTextField(View view) {
        mBinding.msgET.setText(""); // Clear the text field

    }
}