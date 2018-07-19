package com.example.kittn.P2Projekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;






public class SkripteActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skripte);

        Button buttonSkript1=(Button) findViewById(R.id.buttonSkript1);
        buttonSkript1.setOnClickListener((View.OnClickListener) this);
        Button buttonSkript2 =(Button) findViewById(R.id.buttonSkript2);
        buttonSkript2.setOnClickListener((View.OnClickListener) this);
        Button buttonSkript3=(Button) findViewById(R.id.buttonSkript3);
        buttonSkript3.setOnClickListener((View.OnClickListener) this);
        Button buttonSkript4=(Button) findViewById(R.id.buttonSkript4);
        buttonSkript4.setOnClickListener((View.OnClickListener) this);





    }

   @Overide
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.buttonSkript1):
                //Toast.makeText(getApplicationContext(),"Button Start gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_spielregeln);
                //startActivity(new Intent(this, SpielregelnActivity.class));

                MainActivity.aktuellePDF="Collections.pdf";


                Intent intent1 = new Intent(SkripteActivity.this, PdfAnsichtActivity.class);
                startActivity(intent1);

                break;

            case (R.id.buttonSkript2):

                //Toast.makeText(getApplicationContext(),"Button Start2 gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);
                //Intent intent2 = new Intent(MainActivity.this, Frage1Activity.class);
                //startActivity(intent2);

                MainActivity.aktuellePDF="GUI.pdf";


                Intent intent2 = new Intent(SkripteActivity.this, PdfAnsichtActivity.class);
                startActivity(intent2);



                break;

            case (R.id.buttonSkript3):

                //Toast.makeText(getApplicationContext(),"Button Medientechnik gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);

                MainActivity.aktuellePDF="Interfaces.pdf";


                Intent intent3 = new Intent(SkripteActivity.this, PdfAnsichtActivity.class);
                //Intent intent3 = new Intent(MainActivity.this, PdfAnsichtActivity.class);
                startActivity(intent3);


                break;

            case (R.id.buttonSkript4):

                //Toast.makeText(getApplicationContext(),"Button Medientechnik gedrueckt",Toast.LENGTH_SHORT).show();
                //setContentView(R.layout.activity_frage1);

                MainActivity.aktuellePDF="Listener.pdf";

                Intent intent4 = new Intent(SkripteActivity.this, PdfAnsichtActivity.class);
                startActivity(intent4);


                break;
        }

    }
}
