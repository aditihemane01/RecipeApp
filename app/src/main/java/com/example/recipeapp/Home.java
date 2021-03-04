package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class Home extends AppCompatActivity {
    Button btnLogout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    Button btnuploadrecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button= findViewById(R.id.MainActivitybutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homepage = new Intent(Home.this, MainActivity.class);
                startActivity(homepage);
            }
        });
        btnLogout = findViewById(R.id.gotologin);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToLogin = new Intent(Home.this, Login.class);
                startActivity(intToLogin);
            }
        });
        btnuploadrecipe = findViewById(R.id.uploadrecipe);

        btnuploadrecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inToupload = new Intent(Home.this, ImageUpload.class);
                startActivity(inToupload);
            }
        });
    }
}