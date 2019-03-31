package com.example.netfixe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void buttonCancel(View view) {
        this.finish();
    }

    public void buttonSave(View view) {

        EditText username = (EditText)findViewById(R.id.editTextUsername);
        EditText password = (EditText)findViewById(R.id.editTextPassword);

        if (username.getText().toString().length()==0||password.getText().toString().length()==0){

            Toast.makeText(this, getString(R.string.emptyFields), Toast.LENGTH_SHORT).show();

        } else {

            String toastUsername = getString(R.string.welcome) + username.getText().toString();
            String toastPassword = getString(R.string.password) + password.getText().toString();

            Toast.makeText(this, toastUsername + toastPassword, Toast.LENGTH_LONG).show();
        }

    }
}
