package com.e.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button1 ,button2,button3,button4,button5,button6 ,
            button7,button8,button9,button0,buttonadd ,buttonsub
            ,buttonmul,buttondivide,buttonequal,buttondelete;
    Float valueOne,valueTwo;
    boolean addtion ,subtraction , division , multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edittext);
        button0 =findViewById(R.id.bt0);
        button1 =findViewById(R.id.bt1);
        button2 =findViewById(R.id.bt2);
        button0 =findViewById(R.id.bt0);
        button3 =findViewById(R.id.bt3);
        button4 =findViewById(R.id.bt4);
        button5 =findViewById(R.id.bt5);
        button6 =findViewById(R.id.bt6);
        button7 =findViewById(R.id.bt7);
        button8 =findViewById(R.id.bt8);
        button9 =findViewById(R.id.bt9);
        buttonadd =findViewById(R.id.btadd);
        buttonsub =findViewById(R.id.btsub);
        buttonmul =findViewById(R.id.btmul);
        buttondivide =findViewById(R.id.btdivid);
        buttonequal=findViewById(R.id.bteq);
        buttondelete=findViewById(R.id.btdelete);
        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
       buttonequal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               try {
                   valueTwo =Float.parseFloat(editText.getText()+"");
               }catch (NumberFormatException e){
                   Toast.makeText(MainActivity.this,"Please Enter numbers",Toast.LENGTH_SHORT).show();
               }

               if(addtion){
                   editText.setText(valueOne+valueTwo+"");
                   addtion=false;
               }
               if(subtraction){
                   editText.setText(valueOne-valueTwo+"");
                   subtraction=false;
               }
               if(multiplication){
                   editText.setText(valueOne*valueTwo+"");
                   multiplication=false;
               }
               if(division){
                   editText.setText(valueOne/valueTwo+"");
                   division=false;
               }
           }
       });

    }

    @SuppressLint("SetTextI18n")
    public void dosome(View view) {
        switch (view.getId()){
            case R.id.bt0:
                editText.setText(editText.getText()+"0");
                break;
            case R.id.bt1:
                editText.setText(editText.getText()+"1");
                break;
            case R.id.bt2:
                editText.setText(editText.getText()+"2");
                break;
            case R.id.bt3:
                editText.setText(editText.getText()+"3");
                break;
            case R.id.bt4:
                editText.setText(editText.getText()+"4");
                break;
            case R.id.bt5:
                editText.setText(editText.getText()+"5");
                break;
            case R.id.bt6:
                editText.setText(editText.getText()+"6");
                break;
            case R.id.bt7:
                editText.setText(editText.getText()+"7");
                break;
            case R.id.bt8:
                editText.setText(editText.getText()+"8");
                break;
            case R.id.bt9:
                editText.setText(editText.getText()+"9");
                break;
        }
    }

    public void opera(View view) {
        try {
            switch (view.getId()) {
                case R.id.btadd:
                    if (editText == null) {
                        editText.setText("");
                    } else {
                        valueOne = Float.parseFloat(editText.getText() + "");
                        addtion = true;
                        editText.setText(null);
                    }
                    break;
                case R.id.btsub:
                    if (editText == null) {
                        editText.setText("");
                    } else {
                        valueOne = Float.parseFloat(editText.getText() + "");
                        subtraction = true;
                        editText.setText(null);
                    }
                    break;
                case R.id.btmul:
                    if (editText == null) {
                        editText.setText("");
                    } else {
                        valueOne = Float.parseFloat(editText.getText() + "");
                        multiplication = true;
                        editText.setText(null);
                    }
                    break;
                case R.id.btdivid:
                    if (editText == null) {
                        editText.setText("");
                    } else {
                        valueOne = Float.parseFloat(editText.getText() + "");
                        division = true;
                        editText.setText(null);
                    }
                    break;
            }
        }catch (NumberFormatException e){
            Toast.makeText(MainActivity.this,"please enter number",Toast.LENGTH_SHORT).show();
        }
    }
}