package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Religion_Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion__question2);


    }

    public void onClickasf(View view) {

        Intent i = new Intent(Religion_Question2.this, Religion_Question3.class);
        startActivity(i);
    }

    public void onClickasm(View view) {

        Intent i = new Intent(Religion_Question2.this, Religion_Question3.class);
        startActivity(i);
    }


    public void onClickasw(View view) {

        Intent i = new Intent(Religion_Question2.this, Religion_Question3.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);
    }

}

