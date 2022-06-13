package com.exponents.mylocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button getCurrentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hook();
        useEffect();
    }

    private void hook(){
        getCurrentLocation = findViewById(R.id.get_current_location);
    }

    private void useEffect(){
        getCurrentLocation.setOnClickListener(this);
    }

    public void onClick(View view){
        if(view.getId() == R.id.get_current_location){
            startActivity(new Intent(this, CurrentLocation.class));
        }
    }
}