package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    public EditText mEdittext1;
    public EditText mEdittext2;
    public Button mbutton;
    public TextView mTextViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdittext1= findViewById(R.id.t1);
        mEdittext1= findViewById(R.id.t2);
        mbutton = findViewById(R.id.b1);
        mTextViewResult = findViewById(R.id.t3);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1 = Double.parseDouble(mEdittext1.getText().toString());
                Double num2 = Double.parseDouble(mEdittext1.getText().toString());

                Double sum = num1 + num2;
                mTextViewResult.setText(Double.toString(sum));
                Toast.makeText(getApplicationContext(),"Sum = " +sum, Toast.LENGTH_LONG).show();
            }
        });


    }
}