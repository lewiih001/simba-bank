package com.project.simbabank.Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.project.simbabank.Activity.ForgotPasswordActivity;
import com.project.simbabank.MainActivity;
import com.project.simbabank.R;

public class SignInActivity extends AppCompatActivity {
    TextView forgotpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        forgotpass = findViewById(R.id.textView20);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, ForgotPasswordActivity.class));
            }
        });
    }

    public void login(View view) {
        startActivity(new Intent(SignInActivity.this, MainActivity.class));
        finish();
    }

    public void sign_Up(View view) {
        startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
        finish();
    }
}