package com.example.finalinternshippro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText memail,mpsw;
    TextView newhere;
    Button login;
    ProgressBar progressBar1;
    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        memail=findViewById( R.id.email );
        mpsw=findViewById( R.id.password );
        progressBar1=findViewById(R.id.progressBar );
        newhere=findViewById( R.id.newhere );
        fAuth=FirebaseAuth.getInstance();
        login=findViewById( R.id.login );

        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = memail.getText().toString().trim();
                String password = mpsw.getText().toString().trim();

                if (TextUtils.isEmpty( email )) {
                    memail.setError( "email is required." );
                    return;
                }
                if (TextUtils.isEmpty( password )) {
                    mpsw.setError( "password is required" );
                    return;
                }
                if (password.length() < 6) {
                    mpsw.setError( "password must be >=6 characters" );
                    return;
                }
              //  progressBar1.setVisibility( View.VISIBLE );
                fAuth.signInWithEmailAndPassword( email,password ).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Login.this,"LoggedIn Successfully",Toast.LENGTH_SHORT).show();
                            startActivity( new Intent( getApplicationContext(),MainActivity.class ) );
                        }else {
                            Toast.makeText( Login.this,"Error!"+task.getException().getMessage() ,Toast.LENGTH_SHORT).show();

                        }
                    }
                } );
            }
        } );
        newhere.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(),Register.class ) );

            }
        } );
    }
}
