package com.example.booklistactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button hellobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        hellobtn.findViewById(R.id.button2).setOnClickListener(check());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private View.OnClickListener check() {
        System.out.println("Hello");
        return check();
    }
}

