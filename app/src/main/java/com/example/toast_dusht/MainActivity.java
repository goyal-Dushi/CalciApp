package com.example.toast_dusht;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.toast_dusht.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

//    private Button commonButton;
    EditText input1 , input2;
    TextView output;
    int n1,n2,result=0,result2=0;
    RelativeLayout changeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        input1 = (EditText) findViewById(R.id.num1);
        input2 = (EditText) findViewById(R.id.num2);
        output = (TextView) findViewById(R.id.textView);
        changeLayout = (RelativeLayout)findViewById(R.id.layout);
//        commonButton = (Button) findViewById(R.id.add);
//        commonButton = (Button) findViewById(R.id.mul);
//        commonButton = (Button) findViewById(R.id.sub);

//        You were getting a NumberFormatException because you were trying to parse an empty String at the start of onCreate. In order to fix this move your parseInt into the click listener of button.

        Button buttonAdd = (Button)findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                result = n1 + n2;
                Toast.makeText(MainActivity.this,"Performing addition",Toast.LENGTH_SHORT).show();
                changeLayout.setBackgroundColor(Color.parseColor("#8cb11e"));
                output.setText(String.valueOf(result));
            }
        });
        Button buttonSub = (Button)findViewById(R.id.sub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Performing Subtraction", Toast.LENGTH_SHORT).show();
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                result = n1 - n2;
                changeLayout.setBackgroundColor(Color.parseColor("#fd2b28"));
                output.setText(String.valueOf(result));
            }
        });

        Button buttonMul = (Button)findViewById(R.id.mul);
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                Toast.makeText(MainActivity.this,"Performing Multiplication",Toast.LENGTH_SHORT).show();
                result = n1*n2;
                changeLayout.setBackgroundColor(Color.parseColor("#2ab0b9"));
                output.setText(String.valueOf(result));
            }
        });

        Button buttonDiv = (Button)findViewById(R.id.div);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt(input2.getText().toString());
                Toast.makeText(MainActivity.this,"Performing Division",Toast.LENGTH_SHORT).show();
                result = n1/n2;
                changeLayout.setBackgroundColor(Color.parseColor("#fec0bf"));
                output.setText(String.valueOf(result));
            }
        });

        Button buttonSquare = (Button)findViewById(R.id.sqre);
        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(input1.getText().toString());
                n2 = Integer.parseInt("0");
                Toast.makeText(MainActivity.this,"Finding Square",Toast.LENGTH_SHORT).show();
//                if(n1>0 && n2 > 0){
                    result = n1*n1;
                    result2 = n2*n2;
                    changeLayout.setBackgroundColor(Color.parseColor("#e6f5f4"));
                    output.setText(String.valueOf(result+" "+result2));
//                }
//                else if(n1 > 0 && n2 == 0) {
//                    result = n1 * n1;
//                    changeLayout.setBackgroundColor(Color.parseColor("#e6f5f4"));
//                    output.setText(String.valueOf(result));
//                }
            }
        });

        Button clearButton = (Button)findViewById(R.id.clear);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Clearing Screen",Toast.LENGTH_SHORT).show();
                changeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                input1.getText().clear();
                input2.getText().clear();
                output.setText("");
            }
        });
//         Method 2 : Using the Switch Case
//        commonButton.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
////        n1 = Integer.parseInt(input1.getText().toString());
////        n2 = Integer.parseInt(input2.getText().toString());
//        switch (v.getId()){
//            case R.id.mul:
//                n1 = Integer.parseInt(input1.getText().toString());
//                n2 = Integer.parseInt(input2.getText().toString());
//                Toast.makeText(MainActivity.this,"Performing Multiplication",Toast.LENGTH_SHORT).show();
//                result = n1*n2;
//                output.setText(""+result);
//                break;
//            case R.id.sub:
//                n1 = Integer.parseInt(input1.getText().toString());
//                n2 = Integer.parseInt(input2.getText().toString());
//                Toast.makeText(MainActivity.this,"Performing Subtraction",Toast.LENGTH_SHORT).show();
//                result = n1 - n2;
//                output.setText(String.valueOf(result));
//                break;
//            case R.id.add:
//                n1 = Integer.parseInt(input1.getText().toString());
//                n2 = Integer.parseInt(input2.getText().toString());
//                result = n1 + n2;
//                Toast.makeText(MainActivity.this,"Performing addition",Toast.LENGTH_SHORT).show();
//                output.setText(String.valueOf(result));
//                break;
//        }
//    }
}

