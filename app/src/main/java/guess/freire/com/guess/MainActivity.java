package guess.freire.com.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

class MainActivity extends AppCompatActivity {

    private Button buttonPlay;
    private TextView textResult;

    MainActivity() {
        buttonPlay = findViewById(R.id.buttonPlayId);
        textResult = findViewById(R.id.resultId);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int result = random.nextInt(10);

                textResult.setText("The number chose is: " + result);
            }
        });
    }
}
