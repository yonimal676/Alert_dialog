package com.example.alert_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button openDialog;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openDialog = findViewById(R.id.BTN);
        openDialog.setOnClickListener(this);

    }


    public void onClick(View v)
    {
        if (v == openDialog)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("this is an alert dialog")
                    .setMessage("THIS IS THE MESSAGE")
                    .setCancelable(true)
                    .setPositiveButton("yes", new HandleAlertDialogListener())
                    .setNegativeButton("no", new HandleAlertDialogListener());

            AlertDialog alertDialog = builder.create();

            alertDialog.show();

        }
    }



    public class HandleAlertDialogListener implements DialogInterface.OnClickListener
    {

        public void onClick(DialogInterface dialog, int which)
        {
            if (which == -1)
                Toast.makeText(MainActivity.this,"you selected 'yes'", Toast.LENGTH_SHORT).show();

            else if (which == -2)
                Toast.makeText(MainActivity.this,"you selected 'no'", Toast.LENGTH_SHORT).show();

        }
    }













}