package com.example.admin.vision;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {


    private EditText name,email,password;
    private Button register;
    private TextView signin;
    private FirebaseAuth firebaseAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        firebaseAuth=FirebaseAuth.getInstance();
        setViewid();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()){
                    String user_email = email.getText().toString().trim();
                    String user_password = password.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){
                                Toast.makeText(RegistrationActivity.this,"registration Successfull",Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));


                            }else{
                                Toast.makeText(RegistrationActivity.this,"registration Failed",Toast.LENGTH_SHORT).show();

                            }
                        }
                    });

                }

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
            }
        });

    }

    private    void  setViewid(){

        name=(EditText)findViewById(R.id.etNameid);
        email=(EditText)findViewById(R.id.etMail);
        password=(EditText)findViewById(R.id.etPassword);
        register=(Button)findViewById(R.id.btReg);
        signin=(TextView)findViewById(R.id.tvSign);



    }

    private   Boolean validate(){
        Boolean result=false;

        String Name=name.getText().toString();
        String emailid=email.getText().toString();
        String passwordid=password.getText().toString();

        if(Name.isEmpty() || emailid.isEmpty()||passwordid.isEmpty()){

            Toast.makeText(this,"fill up all the details",Toast.LENGTH_SHORT).show();
        }else {
            result=true;

        }
        return result;
    }

}


