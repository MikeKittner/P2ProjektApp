package com.example.kittn.P2Projekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class VideosActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);


        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton1);
        button1.setOnClickListener((View.OnClickListener) this);

        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        button2.setOnClickListener((View.OnClickListener) this);

        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton3);
        button3.setOnClickListener((View.OnClickListener) this);


        }

        @Override
        public void onClick (View view){
            //TextView ergebnis=(TextView) findViewById(R.id.ergebnis);
            //ergebnis.setText("hallo");
            //setContentView(R.layout.activity_pdf_ansicht);

            switch (view.getId()) {
                case (R.id.imageButton1):
                    //Toast.makeText(getApplicationContext(), "Ich liebe es", Toast.LENGTH_SHORT).show();
                    //setContentView(R.layout.activity_spielregeln);
                    //startActivity(new Intent(this, SpielregelnActivity.class));

                    MainActivity.aktuellesVideo=R.raw.components;



                    Intent intent1 = new Intent(VideosActivity.this, VideoPlayerActivity.class);
                    startActivity(intent1);

                    //MainActivity.getMedia



                    //Toast.makeText(getApplicationContext(), "Media Systems: "+MainActivity.mediaSystemsCount+" Medien Technik: "+MainActivity.medienTechnikCount, Toast.LENGTH_SHORT).show();
                    //Toast.makeText(getApplicationContext(), "Media Systems: "+ergebnisMediaSystems+" Medien Technik: "+ergebnisMedienTechnik, Toast.LENGTH_SHORT).show();

                    break;
                case (R.id.imageButton2):


                    //setContentView(R.layout.activity_frage1);

                    //Intent intent2 = new Intent(Frage1Activity.this, WebViewActivity.class);
                    //startActivity(intent2);

                    MainActivity.aktuellesVideo=R.raw.jlist;
                    Intent intent2 = new Intent(VideosActivity.this, VideoPlayerActivity.class);
                    startActivity(intent2);


                    //Toast.makeText(getApplicationContext(), "Media Systems: "+MainActivity.mediaSystemsCount+" Medien Technik: "+MainActivity.medienTechnikCount, Toast.LENGTH_SHORT).show();

                    break;

                case (R.id.imageButton3):


                    //setContentView(R.layout.activity_frage1);

                    //Intent intent2 = new Intent(Frage1Activity.this, WebViewActivity.class);
                    //startActivity(intent2);

                    MainActivity.aktuellesVideo=R.raw.threads_synchronzied;
                    Intent intent3 = new Intent(VideosActivity.this, VideoPlayerActivity.class);
                    startActivity(intent3);


                    //Toast.makeText(getApplicationContext(), "Media Systems: "+MainActivity.mediaSystemsCount+" Medien Technik: "+MainActivity.medienTechnikCount, Toast.LENGTH_SHORT).show();

                    break;
            }
            //setContentView(R.layout.activity_spielregeln);
        }

}
