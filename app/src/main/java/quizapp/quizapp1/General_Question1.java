package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class General_Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__question1);

    }

    public void onClicktru (View view){

        Intent i = new Intent(General_Question1.this,General_Question2.class);
        startActivity(i);
    }

    public void onClickfal (View view){

        Intent i = new Intent(General_Question1.this,General_Question2.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);
    }

}
