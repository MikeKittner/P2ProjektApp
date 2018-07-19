package com.example.kittn.P2Projekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestfragenActivity extends AppCompatActivity implements View.OnClickListener {
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testfragen);

        TextView frage = (TextView) findViewById(R.id.frage);
        frage.setText(MainActivity.fragen[i]);

        Button buttonAntwort1 = (Button) findViewById(R.id.buttonAntwort1);
        buttonAntwort1.setOnClickListener((View.OnClickListener) this);
        Button buttonAntwort2 = (Button) findViewById(R.id.buttonAntwort2);
        buttonAntwort2.setOnClickListener((View.OnClickListener) this);
        buttonAntwort1.setText(MainActivity.msAntworten[i]);
        buttonAntwort2.setText(MainActivity.mtAntworten[i]);
        MainActivity.richtigeAntworten=0;
        MainActivity.falscheAntworten=0;
    }

    //@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.buttonAntwort1):
                //Toast.makeText(getApplicationContext(), "Button links", Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_spielregeln);
                //startActivity(new Intent(this, SpielregelnActivity.class));

                //Intent intent1 = new Intent(MainActivity.this, SpielregelnActivity.class);
                //startActivity(intent1);
                if (i + 1 < MainActivity.fragen.length  && i!=1) {
                    MainActivity.richtigeAntworten += 1;
                    i += 1;
                    TextView fragea = (TextView) findViewById(R.id.frage);


                    Button buttonAntwort1a = (Button) findViewById(R.id.buttonAntwort1);

                    Button buttonAntwort2a = (Button) findViewById(R.id.buttonAntwort2);
                    fragea.setText(MainActivity.fragen[i]);
                    buttonAntwort1a.setText(MainActivity.msAntworten[i]);
                    buttonAntwort2a.setText(MainActivity.mtAntworten[i]);

                    //Intent intent1 = new Intent(TestfragenActivity.this, FragenBilderActivity.class);
                    //startActivity(intent1);
                    break;
                }
                else if(i + 1 < MainActivity.fragen.length) {
                    MainActivity.richtigeAntworten += 1;
                    i += 1;
                    TextView fragea = (TextView) findViewById(R.id.frage);


                    Button buttonAntwort1a = (Button) findViewById(R.id.buttonAntwort1);

                    Button buttonAntwort2a = (Button) findViewById(R.id.buttonAntwort2);
                    fragea.setText(MainActivity.fragen[i]);
                    buttonAntwort1a.setText(MainActivity.msAntworten[i]);
                    buttonAntwort2a.setText(MainActivity.mtAntworten[i]);
                    break;

                }
                else{
                    MainActivity.richtigeAntworten+=1;
                    Intent intent1 = new Intent(TestfragenActivity.this, FragenBilderActivity.class);
                    startActivity(intent1);
                    break;
                }

            case (R.id.buttonAntwort2):
                if (i + 1 < MainActivity.fragen.length && i!=0) {
                    //Toast.makeText(getApplicationContext(), "Button Start2 gedrueckt", Toast.LENGTH_SHORT).show();
                    //setContentView(R.layout.activity_frage1);
                    //Intent intent2 = new Intent(MainActivity.this, Frage1Activity.class);
                    //startActivity(intent2);
                    //Intent intent2 = new Intent(MainActivity.this, PdfAnsichtActivity.class);
                    //startActivity(intent2);

                    MainActivity.falscheAntworten += 1;
                    i += 1;

                    TextView frageb = (TextView) findViewById(R.id.frage);


                    Button buttonAntwort1b = (Button) findViewById(R.id.buttonAntwort1);

                    Button buttonAntwort2b = (Button) findViewById(R.id.buttonAntwort2);
                    frageb.setText(MainActivity.fragen[i]);
                    buttonAntwort1b.setText(MainActivity.msAntworten[i]);
                    buttonAntwort2b.setText(MainActivity.mtAntworten[i]);



                    break;
                }
                else if(i + 1 < MainActivity.fragen.length) {
                    MainActivity.falscheAntworten += 1;
                    i += 1;

                    TextView frageb = (TextView) findViewById(R.id.frage);


                    Button buttonAntwort1b = (Button) findViewById(R.id.buttonAntwort1);

                    Button buttonAntwort2b = (Button) findViewById(R.id.buttonAntwort2);
                    frageb.setText(MainActivity.fragen[i]);
                    buttonAntwort1b.setText(MainActivity.msAntworten[i]);
                    buttonAntwort2b.setText(MainActivity.mtAntworten[i]);
                    break;

                }
                else{
                    MainActivity.falscheAntworten+=1;
                    Intent intent1 = new Intent(TestfragenActivity.this, FragenBilderActivity.class);
                    startActivity(intent1);
                    break;
                }
        }
    }
}
