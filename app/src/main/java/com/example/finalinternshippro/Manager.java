package com.example.finalinternshippro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Manager extends AppCompatActivity {

    public final static String MESSAGE_KEY = "com.example.finalinternshippro.message_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        Intent intent = getIntent();
        String message = intent.getStringExtra( MESSAGE_KEY );
        TextView textView = new TextView( this );
        textView.setTextSize(45);
        textView.setText( message );
        setContentView( textView );

        //Intent i =getIntent();
        //String message1 = intent.getStringExtra( MESSAGE_KEY );
        //textView = new TextView( this );
       // textView.setTextSize(45);
        //textView.setText( message1 );
        //setContentView( textView );


        //setContentView( R.layout.activity_manager );


    }


}
