package com.aylingunes.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Toast message",Toast.LENGTH_LONG).show();
    }


    public void save(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("u sure ?");
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // tıklarsa evete ne olacak
Toast.makeText(MainActivity.this,"saved",Toast.LENGTH_LONG).show();



            }
        });
alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast.makeText(MainActivity.this,"not saved",Toast.LENGTH_LONG).show();
    }
});
alert.show();

    }
}