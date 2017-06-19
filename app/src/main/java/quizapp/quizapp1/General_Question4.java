package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class General_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__question4);


    }

    public void onClicktru (View view){

        Intent i = new Intent(General_Question4.this,General_Question5.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);
    }

    public void onClickfal (View view){

        Intent i = new Intent(General_Question4.this,General_Question5.class);
        startActivity(i);
    }

}
