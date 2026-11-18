package com.example.islem_bouaziz_tp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtnom;
    private EditText edtprenom;
    private EditText edtmail;
    private Button envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnom = (EditText) findViewById(R.id.nom);
        edtprenom = (EditText) findViewById(R.id.prenom);
        edtmail = (EditText) findViewById(R.id.mail);
        envoyer = (Button) findViewById(R.id.btnsend);

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getnom = edtnom.getText().toString();
                String getprenom = edtprenom.getText().toString();
                String getmail = edtmail.getText().toString();

                Intent myintent = new Intent(MainActivity.this, WelcomeActivity.class);
                myintent.putExtra("name", getnom);
                myintent.putExtra("lastname", getprenom);
                myintent.putExtra("mymail", getmail);

                // Also support key with space as shown in some PDF snippets
                myintent.putExtra("name ", getnom);
                myintent.putExtra("lastname ", getprenom);
                myintent.putExtra("mymail ", getmail);

                startActivity(myintent);
            }
        });
    }
}
