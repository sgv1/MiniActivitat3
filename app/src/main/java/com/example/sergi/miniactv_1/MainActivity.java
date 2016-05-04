package com.example.sergi.miniactv_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.Boto1);

        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(v.getContext(),SecondActivity.class);
                EditText et1 = (EditText) findViewById(R.id.edmsg1);
                EditText et2 = (EditText) findViewById(R.id.edmsg2);
                intent.putExtra("txt",et1.getText().toString());
                intent.putExtra("num",Integer.parseInt(et2.getText().toString()));
                startActivity(intent);
            }
        });

    }
}
