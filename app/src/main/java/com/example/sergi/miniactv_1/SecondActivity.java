package com.example.sergi.miniactv_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{

    private String msg;
    private Integer num;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        msg = getIntent().getExtras().getString("txt");
        num = getIntent().getExtras().getInt("num");
        TextView et3 = (TextView) findViewById(R.id.txtexit);
        String out = "";
        for(int i = 0; i < num; i++) {
            if (i == num - 1){
                out = out + msg;
            }
            else{
                out = out + msg + " ";
            }
        }
        et3.setText(out);
        Button btn2 = (Button) findViewById(R.id.Boto2);
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
