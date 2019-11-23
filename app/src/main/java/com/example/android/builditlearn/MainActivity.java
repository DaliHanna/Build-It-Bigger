package com.example.android.builditlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.javaactivitylibrary.JokeActivity;
import com.example.android.javajokes.Joke;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, JokeActivity.class);
                Joke joke = new Joke();

                intent.putExtra("JOKE",joke.getJoke());

                startActivity(intent);

            }
        });

    }
}
