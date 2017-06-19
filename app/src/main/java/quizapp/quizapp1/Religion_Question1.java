package quizapp.quizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

        public class Religion_Question1 extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_religion__question1);

            }

            public void onClickegl (View view){

                Intent i = new Intent(Religion_Question1.this,Religion_Question2.class);
                startActivity(i);
            }

            public void onClickrvn (View view){

                Intent i = new Intent(Religion_Question1.this,Religion_Question2.class);
                startActivity(i);

                MainActivity.score = MainActivity.score +1;
                startActivity(i);
            }


            public void onClickvtr (View view){

                Intent i = new Intent(Religion_Question1.this,Religion_Question2.class);
                startActivity(i);
            }

}
