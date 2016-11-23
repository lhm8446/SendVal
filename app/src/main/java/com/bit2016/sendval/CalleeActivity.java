package com.bit2016.sendval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalleeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callee);
        Intent intent = getIntent();

        int dataNumber = intent.getIntExtra("data-number",0);
        String dataString = intent.getStringExtra("data-string");

        TextView textView = (TextView)findViewById(R.id.textView2);

        String result = "data number :" +  dataNumber + "data string :" + dataString ;
        textView.setText(result);
    }
}
