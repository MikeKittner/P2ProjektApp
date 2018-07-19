package com.example.kittn.P2Projekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kittn on 04.10.2017.
 */

public class FragenBilderActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragen_bilder);
        Button fragen_bilder = (Button) findViewById(R.id.button_bilder);
        fragen_bilder.setOnClickListener((View.OnClickListener) this);
        Button fragen_text = (Button) findViewById(R.id.button_fragen);
        fragen_text.setOnClickListener((View.OnClickListener) this);
        Button auswertung=(Button) findViewById(R.id.button_auswertung);
        auswertung.setOnClickListener((View.OnClickListener)this);
        Button hauptmenu=(Button) findViewById(R.id.button_hauptmenu);
        hauptmenu.setOnClickListener((View.OnClickListener)this);
        //findViewById(R.id.button4).setOnClickListener(this);
        /*frage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button 4 gedrueckt", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_frage1);
            }

            //}
        });
        */

        //@Override
   /* public void onClick(View v) {
        switch (v.getId()){
            case (R.id.button4):{
                Toast.makeText(getApplicationContext(),"Button 4 gedrueckt",Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_frage1);
            }
        }
        //if (v == frage1) {
            //TextView ausgabe = (TextView) findViewById(R.id.textView);
            //ausgabe.setText("Hallo");
            //setContentView(R.layout.activity_frage1);
        //}
    }
    */

    }

    /*@Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Button 4 gedrueckt", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_frage1);
    }*/
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.button_bilder):
                //Toast.makeText(getApplicationContext(), "Button 4 gedrueckt", Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);
                //startActivity(new Intent(this, Frage1Activity.class));
                //Intent intent = new Intent(SpielregelnActivity.this,Frage1Activity.class);
                MainActivity.mediaSystemsCountBild=0;
                MainActivity.medienTechnikCountBild=0;

                Intent intent = new Intent(FragenBilderActivity.this,VideosActivity.class);
                startActivity(intent);
                break;

            case (R.id.button_fragen):

                //Toast.makeText(getApplicationContext(), "Button Start2 gedrueckt", Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);
                //Intent intent = new Intent(MainActivity.this,SpielregelnActivity.class);
                MainActivity.mediaSystemsCountText=0;
                MainActivity.medienTechnikCountText=0;
                Intent intent2 = new Intent(FragenBilderActivity.this,TestfragenActivity.class);
                startActivity(intent2);
                break;

            case (R.id.button_auswertung):

                //Toast.makeText(getApplicationContext(), "Button Start2 gedrueckt", Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);
                //Intent intent = new Intent(MainActivity.this,SpielregelnActivity.class);
                Intent intent3 = new Intent(FragenBilderActivity.this,AuswertungActivity.class);
                startActivity(intent3);
                break;

            case (R.id.button_hauptmenu):

                //Toast.makeText(getApplicationContext(), "Button Start2 gedrueckt", Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);
                //Intent intent = new Intent(MainActivity.this,SpielregelnActivity.class);
                Intent intent4 = new Intent(FragenBilderActivity.this,MainActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
