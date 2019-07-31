package com.example.dilani.itentproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView display;
    String input1, input2, displayAns;
    private int n1,n2,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.textbox1);
        num2 = findViewById(R.id.textbox2);
        display = findViewById(R.id.textView5);


        Intent intent = getIntent();
        input1 = intent.getStringExtra(FirstActivity.NUMBER_1);
        input2 = intent.getStringExtra(FirstActivity.NUMBER_2);



        num1.setText(input1);
        num2.setText(input2);

        n1 = Integer.parseInt(input1);
        n2 = Integer.parseInt(input2);


    }

    public void addNumbers(View view)
    {
        ans = n1+n2;
        displayAns = Integer.toString(ans);
        display.setText(displayAns);
}
    public void subNumbers(View view)
    {
        ans = n1 - n2;
        displayAns = Integer.toString(ans);
        display.setText(displayAns);
    }
}
