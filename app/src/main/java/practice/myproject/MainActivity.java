package practice.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1; //버튼 하나로만 인식을 해줌
    Button b2;
    Button b3;
    Button b4;
    TextView label;
    TextView label2;
    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    RadioButton r1;
    RadioButton r2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button); //id의 이름이 button인 button만 인식을 하게됨.
        b1.setOnClickListener(new View.OnClickListener() {  //Listerner를 객체화해서 구현 선언함.
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕하세요", Toast.LENGTH_SHORT).show();
                //Toast는 메시지 창을 띄우는 명령어이며, 길게 줄거면 Length_long, 짧게 줄거면 Length_short를 지정해준다.
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "최진원입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b3 = (Button)findViewById(R.id.button3);
        label = (TextView)findViewById(R.id.label);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        c2 = (CheckBox)findViewById(R.id.checkBox2);
        c3 = (CheckBox)findViewById(R.id.checkBox3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String result = " ";
                if(c1.isChecked() == true) result += c1.getText().toString() + " , ";
                if(c2.isChecked() == true) result += c2.getText().toString() + " , ";
                if(c3.isChecked() == true) result += c3.getText().toString();
                label.setText("선택과목은 : " + result + "입니다.");
            }
        });

        b4 = (Button)findViewById(R.id.button4);
        label2 = (TextView)findViewById(R.id.label2);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        rg = (RadioGroup)findViewById(R.id.radioGroup);

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String result2 = " ";
                if(r1.isChecked() == true) {
                    result2 += r1.getText().toString();
                    Toast.makeText(getApplicationContext(), "멋진 남자를 선택하셨군요", Toast.LENGTH_LONG).show();
                }
                else {
                    result2 += r2.getText().toString();
                    Toast.makeText(getApplicationContext(), "예쁜 여자를 선택하셨군요", Toast.LENGTH_LONG).show();
                }
                label2.setText("성별은 " + result2 + "입니다.");


            }
        });
    }
}
