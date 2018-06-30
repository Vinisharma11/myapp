package com.example.user.myapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.editText2);
        EditText editText2 = findViewById(R.id.editText3);
        EditText editText3 = findViewById(R.id.editText4);
        EditText editText4 = findViewById(R.id.editText5);

        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast t = Toast.makeText(MainActivity.this, "registered sucessfully", Toast.LENGTH_LONG);
                t.show();

                Intent intent = new Intent(MainActivity.this, yourdetails.class);
                startActivity(intent);
            }
        });
    }
}
