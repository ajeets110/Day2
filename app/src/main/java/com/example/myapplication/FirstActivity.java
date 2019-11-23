package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtName;
    private Button btnGoNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        edtName = findViewById(R.id.etName);
        btnGoNext = findViewById(R.id.btnNext);

        btnGoNext.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(edtName.getText().toString().trim().length() != 0){

            Intent mIntent = new Intent(FirstActivity.this, SecondActivity.class);
            mIntent.putExtra("name", edtName.getText().toString());
            startActivity(mIntent);
        }else{
            // edtName.setError("Please Enter Name");
            showAlert();
            }
    }

    private void showAlert(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setIcon(R.drawable.ic_action_name);
        alertDialogBuilder.setTitle("Login Error");
        alertDialogBuilder.setMessage("Please Enter Your Name");
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialogBuilder.setNegativeButtonIcon(getResources().getDrawable(R.drawable.ic_action_name));

        AlertDialog mAlertDialog = alertDialogBuilder.create();
        mAlertDialog.show();
    }
}
