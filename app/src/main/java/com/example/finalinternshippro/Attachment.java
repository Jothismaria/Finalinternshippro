package com.example.finalinternshippro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class Attachment extends AppCompatActivity {
    ImageView attachment,attachment2,attachment3,attachment4,attachment5,attachment6,attachment7,attachment8;
    ImageButton imageButton, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.attach );
        attachment = findViewById(R.id.btAttachment);
        attachment2 = findViewById( R.id.attachment2 );
        attachment3 = findViewById( R.id.attachment3 );
        attachment4 = findViewById( R.id.attachment4 );
        attachment5 = findViewById( R.id.attachment5 );


        final RatingBar RatingBar = (RatingBar) findViewById(R.id.ratingBar1);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2 =(ImageButton) findViewById( R.id.imageButton2 );
        ImageButton imageButton3 = (ImageButton) findViewById( R.id.imageButton3 );
        ImageButton imageButton4 = (ImageButton) findViewById( R.id.imageButton4 );
        ImageButton imageButton5 = (ImageButton) findViewById( R.id.imageButton5 );


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String totalStars = "Total Stars:: " + RatingBar.getNumStars();
                String rating = "Rating :: " + RatingBar.getRating();
                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String totalStars = "Total Stars:: " + RatingBar.getNumStars();
                String rating = "Rating :: " + RatingBar.getRating();
                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String totalStars = "Total Stars:: " + RatingBar.getNumStars();
                String rating = "Rating :: " + RatingBar.getRating();
                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
                String totalStars = "Total Stars:: " + RatingBar.getNumStars();
                String rating = "Rating :: " + RatingBar.getRating();
                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
            }
        });

        //attachment button listener
        attachment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(),Comment.class ) );

            }
        });
        attachment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(),Comment.class ) );

            }
        });
        attachment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(),Comment.class ) );

            }
        });

        attachment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(),Comment.class ) );

            }
        });

    }
}
