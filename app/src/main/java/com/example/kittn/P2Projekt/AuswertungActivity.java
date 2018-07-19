package com.example.kittn.P2Projekt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AuswertungActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auswertung);

        double ergebnisRichtigeAntworten = ((100/ (MainActivity.richtigeAntworten+MainActivity.falscheAntworten))*(MainActivity.richtigeAntworten));
        double ergebnisFalscheAntworten=((100/(MainActivity.richtigeAntworten+MainActivity.falscheAntworten))*(MainActivity.falscheAntworten));

        TextView richtigPunkte = (TextView) findViewById(R.id.RichtigPunkte);
        richtigPunkte.setText(""+((int) MainActivity.richtigeAntworten));

        TextView falschPunkte = (TextView) findViewById(R.id.FalschPunkte);
        falschPunkte.setText(""+((int) MainActivity.falscheAntworten));

        TextView richtigProzent = (TextView) findViewById(R.id.RichtigProzent);
        richtigProzent.setText(""+Math.round(ergebnisRichtigeAntworten));

        TextView falschProzent = (TextView) findViewById(R.id.FalschProzent);
        falschProzent.setText(""+Math.round(ergebnisFalscheAntworten));

        TextView testErgebis = (TextView) findViewById(R.id.testErgebnis);

        if (ergebnisRichtigeAntworten>=50) {
            testErgebis.setText("Der Test hat ergeben, dass Sie mehr als 50 Prozent der Fragen richtig beantwortet haben und somit bestanden hätten.");
        }
        else{
            testErgebis.setText("Der Test hat ergeben, dass Sie weniger als 50 Prozent der Fragen richtig beantwortet haben und somit nicht bestanden hätten.");
        }

    }
}
