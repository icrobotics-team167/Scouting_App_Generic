package com.example.learning;



import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.scoutingjava.R;


public class MainActivity extends AppCompatActivity {


    //Buttions
    Button LeftButton;
    Button MiddleButton;
    Button RightButton;


    //Screens is the enum not name of var
    static Screens CurrentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home);
    }


    void SetScreen(int id){
        switch (id){
            case 0:
                setContentView(R.layout.home);

            case 1:
                setContentView(R.layout.matchscouting);
        }
    }


    //Sets The Buttions
    void SetButtions(){
        switch (CurrentScreen){
            case Home:
                LeftButton = findViewById(R.id.SaveLogin);
                LeftButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText NameFeild = findViewById(R.id.NmaeFeild);
                        EditText TabletIdFeild = findViewById(R.id.TabletFeild);

                    }
                });

            case MatchScouting:

        }

    }

}