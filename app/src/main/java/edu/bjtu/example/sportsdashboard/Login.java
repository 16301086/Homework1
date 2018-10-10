package edu.bjtu.example.sportsdashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void onClick1(View view)
    {
        Intent intent = new Intent(this,edu.bjtu.example.sportsdashboard.register.class);
        startActivity(intent);
    }
    public void onClicklogin(View view)
    {
        Intent intent = new Intent(this,edu.bjtu.example.sportsdashboard.MainActivity.class);
        startActivity(intent);
    }
}
