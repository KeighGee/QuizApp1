package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Religion_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion__question4);

    }

    public void onClickran(View view) {

        Intent i = new Intent(Religion_Question4.this, Religion_Question5.class);
        startActivity(i);
    }

    public void onClickrhb(View view) {

        Intent i = new Intent(Religion_Question4.this, Religion_Question5.class);
        startActivity(i);
    }


    public void onClickrjd(View view) {

        Intent i = new Intent(Religion_Question4.this, Religion_Question5.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;
        startActivity(i);
    }

}

