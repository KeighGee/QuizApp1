package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score_Activicty extends AppCompatActivity {

    private Button Main;
    TextView TotalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score__activicty);
    TotalScore = (TextView) findViewById (R.id.TotalScore);
    double log = ((MainActivity.score / 5.0)* 100);

        int rea = (int) ((MainActivity.score * 100.0f) / 5);

        TotalScore.setText("Total Score = " + rea + "%");
    }


    public void onClickbtn (View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        MainActivity.score = 0;
    }

}
