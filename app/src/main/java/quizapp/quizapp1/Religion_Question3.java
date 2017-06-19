package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Religion_Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion__question3);


    }

    public void onClickalf(View view) {

        Intent i = new Intent(Religion_Question3.this, Religion_Question4.class);
        startActivity(i);
    }

    public void onClickarm(View view) {

        Intent i = new Intent(Religion_Question3.this, Religion_Question4.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);
    }


    public void onClickrnf(View view) {

        Intent i = new Intent(Religion_Question3.this, Religion_Question4.class);
        startActivity(i);
    }

}


