package com.example.kittn.P2Projekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static double richtigeAntworten=0;
    public static double falscheAntworten=0;

    public static double medienTechnikCountBild=1;
    public static double medienTechnikCountText=1;
    public static double mediaSystemsCountBild=1;
    public static double mediaSystemsCountText=1;
    public static String aktuellePDF="";
    public static int aktuellesVideo;
    //namen ändern für p2


    public static int [] msBilder={R.drawable.ms1,R.drawable.ms2,R.drawable.ms3,R.drawable.ms4,R.drawable.ms5};
    public static int [] mtBilder={R.drawable.mt1,R.drawable.mt2,R.drawable.mt3,R.drawable.mt4,R.drawable.mt5};
    public static String [] fragen={"\tSie befinden sich in einem Raum, alle Türen sind mit elektronischen Schlössern gesichert, der einzige Weg sie zu öffnen ist ein Java Programm zum öffnen der Türen zu schreiben, was ca. 30 Minuten dauert oder die Alternative ist, 48 Stunden zu warten, bis die Türen sich automatisch öffnen.",
            "\tSie veranstallten eine Feier Zuhause, ein Feuwerwerk wurde nicht genehmigt, die einzige Möglichkeit , dass die Feier nicht floppt, ist es eine Lichtshow selber zu planen und die Beleuchtung selber anzubringen.",
    	"Jemand aus ihrem Freundeskreis wünscht sich von Ihnen einen selbstgedrehten Film oder ein selbst programmiertes Videospiel.",
"\tSie benötigen ganz dringend Geld um etwas zu Essen zu kaufen, aber Sie haben nichts was jemand kaufen würde, ausser einer  Videokamera und einer Spielkonsole. "};
    public static String [] msAntworten={"Ich Programmiere\n","Ich lasse die Party floppen\n",
        "Ich programmiere ein Spiel\n",
        "Ich verkaufe meine Videokamera\n"};
    public static String [] mtAntworten={"Ich warte 48 Stunden\n","Ich plane die Lichtshow\n",
        "Ich drehe einen Film\n",
        "Ich verkaufe meine Spielkonsole\n"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Button buttonVideos=(Button) findViewById(R.id.buttonVideos);
        buttonVideos.setOnClickListener((View.OnClickListener) this);
        Button buttonFragen=(Button) findViewById(R.id.buttonFragen);
        buttonFragen.setOnClickListener((View.OnClickListener) this);
        Button buttonSkripte=(Button) findViewById(R.id.buttonSkripte);
        buttonSkripte.setOnClickListener((View.OnClickListener) this);
        Button buttonYouTubeVideos=(Button) findViewById(R.id.buttonYouTubeVideos);
        buttonYouTubeVideos.setOnClickListener((View.OnClickListener) this);





    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.buttonVideos):
                //Toast.makeText(getApplicationContext(),"Button Start gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_spielregeln);
                //startActivity(new Intent(this, SpielregelnActivity.class));

                Intent intent1 = new Intent(MainActivity.this, VideosActivity.class);
                startActivity(intent1);

            break;

            case (R.id.buttonFragen):

                //Toast.makeText(getApplicationContext(),"Button Start2 gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);
                //Intent intent2 = new Intent(MainActivity.this, Frage1Activity.class);
                //startActivity(intent2);
                Intent intent2 = new Intent(MainActivity.this, TestfragenActivity.class);
                startActivity(intent2);



            break;

            case (R.id.buttonSkripte):

                //Toast.makeText(getApplicationContext(),"Button Medientechnik gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);

                Intent intent3 = new Intent(MainActivity.this, SkripteActivity.class);
                //Intent intent3 = new Intent(MainActivity.this, PdfAnsichtActivity.class);
                startActivity(intent3);


            break;

            case (R.id.buttonYouTubeVideos):

                //Toast.makeText(getApplicationContext(),"Button Medientechnik gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);
                Intent intent4 = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent4);


                break;
        }

    }
}
