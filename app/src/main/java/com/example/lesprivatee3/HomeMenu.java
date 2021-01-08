package com.example.lesprivatee3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeMenu extends AppCompatActivity{

    private Button profile;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        profile = (Button) findViewById(R.id.Detail);


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();                       //perbaikan
                startActivity(new Intent(HomeMenu.this, LoginActivity.class));
            }
        });

//        startActivity(new Intent(HomeMenu.this, LoginActivity.class));
    }
}
