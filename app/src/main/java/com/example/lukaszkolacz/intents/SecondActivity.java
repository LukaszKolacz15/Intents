package com.example.lukaszkolacz.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity {

    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//      Wyświetlenie Toasta z MainActivity:
//        String mess = getIntent().getStringExtra("test");
//        Toast.makeText(this, mess, Toast.LENGTH_LONG).show();

//      Pobieranie paczki z MainActivity:
//        Bundle bundle = getIntent().getBundleExtra("Bundle");


        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SecondActivity.this, MainActivity.class); - Do deklaracji jawnej
                Intent intent = new Intent();
                intent.putExtra("someData", "Jakaś data z rezultatu");
                setResult(RESULT_OK, intent);
                finish();
//                startActivity(intent); Do deklaracji jawnej/niejawnej

            }
        });

    }
}
