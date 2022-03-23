package au.edu.jcu.cp3406.quicksum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(v -> buttonClicked(btn1));
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(v -> buttonClicked(btn2));
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(v -> buttonClicked(btn3));
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(v -> buttonClicked(btn4));
        Button btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(v -> buttonClicked(btn5));
        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(v -> buttonClicked(btn6));
        Button btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(v -> buttonClicked(btn7));
        Button btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(v -> buttonClicked(btn8));
        Button btn9 = findViewById(R.id.button9);
        btn9.setOnClickListener(v -> buttonClicked(btn9));
        Button clearBtn = findViewById(R.id.clearbtn);
        clearBtn.setOnClickListener(v -> clearSum(clearBtn));
    }

    int sum;

    public void buttonClicked(View view) {
        Button button = (Button) view;

        int number = Integer.parseInt(button.getText().toString());
        sum += number;

        TextView textView = findViewById(R.id.sum);
        String result = "" + sum;
        textView.setText(result);
    }

    public void clearSum(View view){
        sum = 0;
        TextView textView = findViewById(R.id.sum);
        String result = "0";
        textView.setText(result);
    }

}