package com.example.activity2part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi Variabel Untuk Button
    Button btnlogin;

    //Deklarasi Variabel Untuk EditText
    EditText edemail, edpassword;

    //Deklarasi Variabel Untuk Menyimpan Email dan Password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username="naufal gita mahardika";
        String password="nopal123";

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnlogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((edemail.getText().toString().trim().isEmpty() || (edpassword.getText().toString().trim().isEmpty()) )) {
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah",Toast.LENGTH_SHORT).show();

                }else {
                    if ((edemail.getText().toString().trim().equals(username)) && (edpassword.getText().toString().trim().equals(password))) {
                        Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    }
                }
                {if ((edpassword.getText().toString().trim().equals(password))) {
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_SHORT).show();
                }
                }
                    {
                        if((edemail.getText().toString().trim().equals(username))) {
                            Toast.makeText(getApplicationContext(), "Password Salah",Toast.LENGTH_SHORT).show();
                        }else{
                            }
                        }
                    }




        }
        );
    }
}