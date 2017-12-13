package com.example.usuario.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecundaryActivity extends AppCompatActivity {

    EditText edtName;
    Button btnCancel;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundary);

        this.edtName = (EditText)findViewById(R.id.edtName);
        this.btnOk = (Button)findViewById(R.id.btnOk);
        this.btnCancel = (Button)findViewById(R.id.btnCancel);

        this.btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1.comprovaciones

                //2. se añade el mesage al intent
                Bundle b = new Bundle();
                b.putString("message",edtName.getText().toString());

                Intent intent = new Intent(SecundaryActivity.this,MainActivity.class);
                intent.putExtras(b);
                //3.indicar que el resultado se ha enviado
                 setResult(RESULT_OK,intent);
            }
        });

        this.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
            }
        });

    }
}
