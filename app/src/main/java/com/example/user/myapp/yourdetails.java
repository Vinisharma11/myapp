package com.example.user.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class yourdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourdetails);
        EditText editTextA=findViewById(R.id.editText6);
        EditText editTextB=findViewById(R.id.editText7);
        TextView textViewC=findViewById(R.id.textView2);
        Button bt2 = findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t= Toast.makeText(yourdetails.this,"LOGGING IN",Toast.LENGTH_LONG);
                t.show();
                Intent intentObj = new Intent(Intent.ACTION_VIEW);
                intentObj.setData(Uri.parse("http://www.acadview.com"));
                startActivity(intentObj);
            }
        });
        }
}
