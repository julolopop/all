package com.example.usuario.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txvName;
    TextView txvLastName;
    Button btnName;
    Button btnLastName;

    public static final int NAME = 0;
    public static final int LASTNAME = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txvName = (TextView) findViewById(R.id.txvName);
        this.txvLastName = (TextView) findViewById(R.id.txvLastName);
        this.btnName = (Button) findViewById(R.id.btnName);
        this.btnLastName = (Button) findViewById(R.id.btnLastName);


        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecundaryActivity.class);
                startActivityForResult(intent, MainActivity.NAME);
            }
        });

        btnLastName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecundaryActivity.class);
                startActivityForResult(intent, MainActivity.LASTNAME);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



        switch (requestCode) {
            case NAME:
                if(requestCode == RESULT_OK){
                    String message = data.getExtras().getString("message");
                    txvName.setText(message);
                }
                break;
            case LASTNAME:
                if(requestCode == RESULT_OK){
                    String message = data.getExtras().getString("message");
                    txvLastName.setText(message);
                }

                break;
        }
    }

}
