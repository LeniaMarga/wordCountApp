package com.example.user.mywordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCount_Activity extends AppCompatActivity {

    EditText editText;
    TextView answerText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().toString(), "onCreate called"); //debug
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count_);

        editText = findViewById(R.id.edit_text);
        answerText = findViewById(R.id.answer_text);
        countButton = findViewById(R.id.count_button);
    }

    public void onCountButtonCLicked(View Button) {
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        String words = editText.getText().toString();
        Log.d(getClass().toString(), "The words are '"+ words + "'" );
        Text text = new Text();
        String answer = text.count().toString();
        answerText.setText(answer);
    }
}
