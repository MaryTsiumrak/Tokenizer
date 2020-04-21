package com.tsiumrak.maryna.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView output;
    EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        text = (EditText)findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        output = (TextView) findViewById(R.id.output);


    }
    public void clickButton(View view){

        Tokenizer token = new Tokenizer();

        output.setText( getString(R.string.resultLine) + token.countWords(text.getText().toString()));
    }


}
