package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText,editText2;


Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edit);
        editText2=findViewById(R.id.edit2);
        btn=findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
String E_mail=editText.getText().toString();
String password=editText2.getText().toString();


String Button= btn.getText().toString();
btn.setText(Button);
   if(E_mail.isEmpty()){
       Toast.makeText(MainActivity.this, "please enter your E_mail", Toast.LENGTH_SHORT).show();
}
 else if( password.isEmpty()) {
       Toast.makeText(MainActivity.this, "please enter your password", Toast.LENGTH_SHORT).show();
                }
else {
       Toast.makeText(MainActivity.this, "Login Successfull!", Toast.LENGTH_SHORT).show();
       Intent intent = new Intent(MainActivity.this, MainActivity2.class);
       startActivity(intent);

   }
            }
        });








    }
    }