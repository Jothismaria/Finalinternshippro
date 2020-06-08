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

public class Register extends AppCompatActivity {
    EditText musername,memail,mpsw,mConfirm_password;
    TextView logintext;
   Button btn_reg;
    ProgressBar progressBar;
    FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );
        memail=findViewById( R.id.email );
        musername=findViewById( R.id.username );
        mpsw=findViewById( R.id.password );
        mConfirm_password=findViewById( R.id.Confirm_password );
        logintext=findViewById( R.id.logintext );
        btn_reg=findViewById( R.id.btn_reg );

        fAuth=FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progressBar );

       // if(fAuth.getCurrentUser()!= null){
        //    startActivity( new Intent( getApplicationContext(),MainActivity.class ) );
        //    finish();
        //}

        btn_reg.setOnClickListener( new View.OnClickListener() {
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

            //    progressBar.setVisibility( View.VISIBLE );
                fAuth.createUserWithEmailAndPassword( email, password ).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Register.this,"User Created",Toast.LENGTH_SHORT).show();
                            startActivity( new Intent( getApplicationContext(),MainActivity.class ) );
                        }
                        else{
                            Toast.makeText( Register.this,"Error!"+task.getException().getMessage() ,Toast.LENGTH_SHORT).show();
                        }
                    }
                } );

            }
        } );
        logintext.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( getApplicationContext(),Login.class ) );

            }
        } );

    }
}
