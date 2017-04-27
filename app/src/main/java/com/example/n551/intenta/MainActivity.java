package com.example.n551.intenta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button=(Button)findViewById(R.id.Button01);
        button.setOnClickListener(new Button.OnClickListener(){
                                      public void onClick(View b){
                                          //Intent <Intent_name>=new Intent (<Action>,<Data>);
                                          Intent I=new Intent(Intent.ACTION_DIAL,Uri.parse("tel://114"));
                                          startActivity(I);
                                      }
                                  }
        );
    }
}
