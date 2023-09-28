package com.example.mobilna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	ArrayList<String> quotes = new ArrayList<String>();
	int currentQuote = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		quotes.add("Dzień dobry");
		quotes.add("Good morning");
		quotes.add("Buenos dias");

		SeekBar seekBar = findViewById(R.id.seekBar);
		seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				TextView quote = findViewById(R.id.quote);
				quote.setTextSize(seekBar.getProgress());
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {

			}
		});

		Button nextButton = findViewById(R.id.nextButton);
		nextButton.setOnClickListener(v -> {
			TextView quote = findViewById(R.id.quote);
			quote.setText(quotes.get(currentQuote++ % quotes.size()));
		});
	}
}