package com.example.anagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editText) EditText wordEditText;
    @BindView(R.id.button) Button reverseButton;
    @BindView(R.id.tv_result) TextView resultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        reverseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reverseNow();
            }
        });

    }

    public void reverseNow(){
        String str = wordEditText.getText().toString();

        String results = Anagram.reverseWord(str);

        resultsTextView.setText(results);
    }
}
