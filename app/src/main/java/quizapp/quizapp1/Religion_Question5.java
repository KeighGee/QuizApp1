package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Religion_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion__question5);

    }

    public void onClickbis(View view) {

        Intent i = new Intent(Religion_Question5.this, Score_Activicty.class);
        startActivity(i);
    }

    public void onClickmon(View view) {

        Intent i = new Intent(Religion_Question5.this,Score_Activicty.class);
        startActivity(i);
    }


    public void onClickpop(View view) {

        Intent i = new Intent(Religion_Question5.this, Score_Activicty.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);
    }

}


