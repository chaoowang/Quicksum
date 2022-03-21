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
    }

    int sum;

    public void buttonClicked(View view) {
        Button button = (Button) view;

        int number = Integer.parseInt(button.getText().toString());
        sum += number;

        TextView textView = (TextView) findViewById(R.id.sum);
        String result = "" + sum;
        textView.setText(result);
    }

    public void clearSum(View view){
        Button button = (Button) view;
        sum = 0;
        TextView textView = (TextView) findViewById(R.id.sum);
        String result = "0";
        textView.setText(result);
    }

}