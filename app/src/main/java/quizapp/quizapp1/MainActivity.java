package quizapp.quizapp1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void crn(View view) {
        Intent intent = new Intent(this, Currency_Question1.class);

        startActivity(intent);
    }

    public void onClickcrn(View view) {

        Intent i = new Intent(this, Currency_Question1.class);
        startActivity(i);

    }
    public void rlg(View view) {
        Intent intent = new Intent(this, Religion_Question1.class);

        startActivity(intent);
    }
    public void onClickrlg(View view) {

        Intent i = new Intent(this, Religion_Question1

                .class);
        startActivity(i);
    }

    public void gen(View view) {
        Intent intent = new Intent(this, General_Question1.class);

        startActivity(intent);
    }
    public void onClickgen(View view) {

        Intent i = new Intent(this, General_Question1.class);
        startActivity(i);
    }


}



















































