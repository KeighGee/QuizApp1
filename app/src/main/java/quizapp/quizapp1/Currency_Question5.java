package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static quizapp.quizapp1.R.id.mal;

public class Currency_Question5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency__question5);

    }

    public void onClickmal (View view){

        Intent i = new Intent(Currency_Question5.this,Score_Activicty.class);
        startActivity(i);
    }

    public void onClicknor (View view){

        Intent i = new Intent(Currency_Question5.this,Score_Activicty.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);
    }


    public void onClickusa (View view){

        Intent i = new Intent(Currency_Question5.this,Score_Activicty.class);
        startActivity(i);
    }

}
