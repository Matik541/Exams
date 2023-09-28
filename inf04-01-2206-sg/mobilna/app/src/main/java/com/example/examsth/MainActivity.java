package com.example.examsth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private int likes = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button likeButton = findViewById(R.id.likeButton);
		Button deleteButton = findViewById(R.id.deleteButton);

		likeButton.setOnClickListener(v -> {
			likes++;
			updateLikes();
		});
		deleteButton.setOnClickListener(v -> {
			likes--;
			updateLikes();
		});

	}

	@SuppressLint("SetTextI18n")
	private void updateLikes() {
		TextView likesView = findViewById(R.id.likes);
		likesView.setText(String.valueOf(likes) + " polubień");

	}
}