package com.example.calculator_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   Button buttonadd, buttonsub, buttonmul, buttondivide;
   EditText editText1 , editText2;
   TextView textView;
  int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonadd = findViewById(R.id.button1);
        buttonsub = findViewById(R.id.button2);
        buttonmul = findViewById(R.id.button3);
        buttondivide = findViewById(R.id.button4);

        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        textView = findViewById(R.id.textview);

       buttonadd.setOnClickListener(this);
       buttonsub.setOnClickListener(this);
       buttonmul.setOnClickListener(this);
       buttondivide.setOnClickListener(this);

    }

    public int getint(EditText editText) {

        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Please enter value", Toast.LENGTH_SHORT).show();
            return 0;
        } else {
            return Integer.parseInt(editText.getText().toString());
        }
    }

    @Override
    public void onClick(View view) {


     num1 = getint(editText1);
     num2 = getint(editText2);

     switch (view.getId()){
         case R.id.button1:
             textView.setText("Answer is " + (num1+num2));
             break;

         case R.id.button2:
             textView.setText("Answer is " + (num1-num2));
             break;

         case R.id.button3:
             textView.setText("Answer is " + (num1*num2));
             break;

         case R.id.button4:
             textView.setText("Answer is " + ((float)num1/(float) num2));
             break;

     }

    }
}