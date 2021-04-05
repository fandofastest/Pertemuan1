package com.example.pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declarasi variable

    Button button1,button2;
    EditText editText1,editText2;
    int data1,data2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        editText1=findViewById(R.id.input1);
        editText2=findViewById(R.id.input2);
        textView=findViewById(R.id.textView);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data1=Integer.parseInt(editText1.getText().toString());
                data2=Integer.parseInt(editText2.getText().toString());

                int total= data1+data2;

                textView.setText(String.valueOf(total));


                Toast.makeText(MainActivity.this,"data "+data1,Toast.LENGTH_LONG).show();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });



    }
}