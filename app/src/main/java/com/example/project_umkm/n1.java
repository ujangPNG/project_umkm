package com.example.project_umkm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class n1 extends AppCompatActivity {
    public EditText txtuser;
    public EditText txtpassword;
    public Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.n1_login);
        this.txtuser=findViewById(R.id.i_email);
        this.txtpassword=findViewById(R.id.i_pass);
        this.btnLogin=findViewById(R.id.b_login);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //buton nya
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //auth
                //1. ambil data
                String usn=txtuser.getText().toString();
                String pass=txtpassword.getText().toString();
                if (txtuser.getText().toString().equals("qamil💕alpa")&&txtpassword.getText().toString().equals("qamil💕alpa")){
                    //ganti halaman
                    Intent pindah=new Intent(getApplicationContext(),n3.class);
                    StartActivity(pindah);
                }
            }
        });
    }
}