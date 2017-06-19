package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Currency_Question1 extends AppCompatActivity {

    Button rsi, gmn, egp, bck, nxt;
    TextView currency, question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency__question1);
    }

    public void onClickrsi (View view){

     Intent i = new Intent(Currency_Question1.this,Currency_Question2.class);
     startActivity(i);

    MainActivity.score = MainActivity.score +1;
    startActivity(i);
    }


    public void onClickgmn (View view){

        Intent i = new Intent(Currency_Question1.this,Currency_Question2.class);
        startActivity(i);
    }


    public void onClickegp (View view){

      Intent i = new Intent(Currency_Question1.this,Currency_Question2.class);
        startActivity(i);
    }

}



