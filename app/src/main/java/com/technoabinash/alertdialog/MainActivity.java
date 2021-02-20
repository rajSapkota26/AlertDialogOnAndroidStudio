package com.technoabinash.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExit = findViewById(R.id.Exit);
        //first set onclick method on button
        btnExit.setOnClickListener(view -> {
            //when click on button show dialog
            alertDialog();

        });
    }

    @Override
    public void onBackPressed() {
        alertDialog();
    }
    public void alertDialog(){
        new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.drawable.alert_icon).setTitle("Exit")
                .setMessage("are you sure!")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //write code here if user click on yes button on alert dialog
                        finish();
                    }
                }).setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //write code here if use click on no button on alert dialog

            }
        }).setNeutralButton("help", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //write code here if user clicked on help button
                Toast.makeText(MainActivity.this, "Clicked yes to exit app", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }
}