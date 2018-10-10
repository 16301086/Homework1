package edu.bjtu.example.sportsdashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
    public void onClickBack(View view)
    {
        Intent intent = new Intent(this,edu.bjtu.example.sportsdashboard.Login.class);
        startActivity(intent);
    }

}