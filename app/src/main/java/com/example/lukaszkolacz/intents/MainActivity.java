package com.example.lukaszkolacz.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button) findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                INTENT JAWNY:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                    // Przekazanie wiadomości do SecondActivity lub gdzie indziej:
////                intent.putExtra("test", "Pochodzę z innego activity");
////                  -------------------------------------------------------------
////                Wysylanie calej paczki danych
//                Bundle bundle = new Bundle();
//                bundle.putString("someString", "Tutaj nic nie ma");
//                intent.putExtra("bundle", bundle);
////                -----------------------------
//                startActivity(intent);
//
////                INTENT NIEJAWNY:
////                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.pl/"));
////                startActivity(intent);

//                URUCHOMIENIE ACTIVITY Z OCZEKIWANIEM NA REZULTAT:
                startActivityForResult(intent, 1);
//                -------------------------------------------------
            }
        });
    }
//                URUCHOMIENIE ACTIVITY Z OCZEKIWANIEM NA REZULTAT:
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK){
            Toast.makeText(this, data.getStringExtra("someData"), Toast.LENGTH_LONG).show();
        }
    }
//               --------------------------------------------------
}
