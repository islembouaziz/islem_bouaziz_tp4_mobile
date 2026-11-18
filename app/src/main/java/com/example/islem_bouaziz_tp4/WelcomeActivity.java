package com.example.islem_bouaziz_tp4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private TextView Welcom;
    private String welcomenom;
    private String welcomeprenom;
    private String welcomemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom_activity);

        Welcom = (TextView) findViewById(R.id.Welcom);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            welcomenom = extras.getString("name");
            if (welcomenom == null) {
                welcomenom = extras.getString("name ");
            }

            welcomeprenom = extras.getString("lastname");
            if (welcomeprenom == null) {
                welcomeprenom = extras.getString("lastname ");
            }

            welcomemail = extras.getString("mymail");
            if (welcomemail == null) {
                welcomemail = extras.getString("mymail ");
            }
        }

        if (welcomenom == null) welcomenom = "";
        if (welcomeprenom == null) welcomeprenom = "";
        if (welcomemail == null) welcomemail = "";

        Welcom.setText("Bienvenue " + welcomenom + " " + welcomeprenom + ",\n" +
                "C'est la deuxième activité.\n" +
                "Vous serez bientôt contacté sur :\n" + welcomemail);
    }
}
