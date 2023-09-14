package com.example.mobilna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button confirmBtn = findViewById(R.id.confirmBtn);
		confirmBtn.setOnClickListener(v -> {
			TextView message = findViewById(R.id.message);

			EditText email = findViewById(R.id.inputEmail);
			EditText password = findViewById(R.id.inputPassword);
			EditText repeatPassword = findViewById(R.id.inputRepeatPassword);

			if (!email.getText().toString().contains("@")) {
				message.setText("Email jest nieprawidłowy");
				return;
			}

			if (!password.getText().toString().equals(repeatPassword.getText().toString())) {
				message.setText("Hasła się różnią");
				return;
			}
			message.setText("Witaj " + email.getText().toString());
			return;
		});
	}
}