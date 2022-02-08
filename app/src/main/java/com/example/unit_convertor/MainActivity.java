package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.edittext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for using this app!!", Toast.LENGTH_SHORT).show();
                String str = editText.getText().toString();
                int kg = Integer.parseInt(str);
                double p = 2.205* kg;
                textView.setText("The corrsponding pound value is "+ p );
            }
        });
//        alternate for onclicklistner
//        public void calculate(View view)
//        {
//            String str = editText.getText().toString();
//            int kg = Integer.parseInt(str);
//            double p = 2.205* kg;
//            textView.setText("The corrsponding pound value is "+ p );
//        }

    }
}
new line added
