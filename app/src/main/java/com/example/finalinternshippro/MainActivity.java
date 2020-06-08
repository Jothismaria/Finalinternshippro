package com.example.finalinternshippro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.memail.EmailAppraisal;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        card1=findViewById( R.id.card1);
        card2=findViewById( R.id.card2 );
        card3=findViewById( R.id.card3 );
        card4=findViewById( R.id.card4 );
       // card5=findViewById( R.id.card5 );
       // card6=findViewById( R.id.card6 );

        card1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c1 = new Intent( MainActivity.this, EmailAppraisal.class );
                startActivity( c1 );
            }
        } );

        card2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c1 = new Intent( MainActivity.this,Attachment.class );
                startActivity( c1 );
            }
        } );

        card3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c1 = new Intent( MainActivity.this,Manager.class );
                startActivity( c1 );
            }
        } );

        card4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c1 = new Intent( MainActivity.this,Manager.class );
                startActivity( c1 );
            }
        } );

     //   card5.setOnClickListener( new View.OnClickListener() {
        //    @Override
          //  public void onClick(View v) {
            //    Intent c1 = new Intent( MainActivity.this,AppraisalActivity.class );
              //  startActivity( c1 );
      //      }
        //} );

   //     card6.setOnClickListener( new View.OnClickListener() {
     //       @Override
       //     public void onClick(View v) {
         //       Intent c1 = new Intent( MainActivity.this,AppraisalActivity.class );
           //     startActivity( c1 );
           // }
        //} );

    }
}
