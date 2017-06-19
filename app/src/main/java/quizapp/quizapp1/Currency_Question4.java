package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Currency_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency__question4);

    }

public void onClickrsi (View view){

        Intent i = new Intent(Currency_Question4.this,Currency_Question5.class);
        startActivity(i);
        }

public void onClickusa (View view){

        Intent i = new Intent(Currency_Question4.this,Currency_Question5.class);
        startActivity(i);
        }


public void onClickmal (View view){

        Intent i = new Intent(Currency_Question4.this,Currency_Question5.class);
        startActivity(i);

    MainActivity.score = MainActivity.score +1;
    startActivity(i);
}

        }
