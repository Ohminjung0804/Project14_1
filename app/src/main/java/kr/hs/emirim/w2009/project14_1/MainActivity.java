package kr.hs.emirim.w2009.project14_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlus = findViewById(R.id.btn1);
        Button btnMinus = findViewById(R.id.btn2);
        Button btnMulti = findViewById(R.id.btn3);
        Button btnDiv = findViewById(R.id.btn4);
        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        textResult=findViewById(R.id.t1);

        btnPlus.setOnTouchListener(btnListnner);
        btnMinus.setOnTouchListener(btnListnner);
        btnMulti.setOnTouchListener(btnListnner);
        btnDiv.setOnTouchListener(btnListnner);
    }

    View.OnTouchListener btnListnner = new View.OnTouchListener(){
        @Override
        public boolean onTouch(View v, MotionEvent event){
            return false;
        }
    };
}