package kr.hs.emirim.w2009.project14_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        Button btnMod = findViewById(R.id.btn5);
        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        textResult=findViewById(R.id.t1);

        btnPlus.setOnClickListener(btnListnner);
        btnMinus.setOnClickListener(btnListnner);
        btnMulti.setOnClickListener(btnListnner);
        btnDiv.setOnClickListener(btnListnner);
        btnMod.setOnClickListener(btnListnner);
    }

    View.OnClickListener btnListnner=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strEdit1=edit1.getText().toString();
            String strEdit2=edit2.getText().toString();
            Log.v("***strEdit1",strEdit1);
            if(strEdit1.equals("")||strEdit1==null||strEdit2.equals("")||strEdit2==null){
                Toast.makeText(getApplicationContext(),"값을 입력하지 않았습니다.",Toast.LENGTH_SHORT).show();
                return;
            }
            int num1=Integer.parseInt(strEdit1);
            int num2=Integer.parseInt(strEdit2);
            int result =0;
            switch(v.getId()){
                case R.id.btn1:
                    result=num1+num2;
                    break;
                case R.id.btn2:
                    result=num1-num2;
                    break;
                case R.id.btn3:
                    result=num1*num2;
                    break;
                case R.id.btn4:
                    result=num1/num2;
                    break;
                case R.id.btn5:
                    result = num1 %num2;
                    break;
            }
            textResult.setText(R.string.t1);
            textResult.append(result+"");
        }
    };
}