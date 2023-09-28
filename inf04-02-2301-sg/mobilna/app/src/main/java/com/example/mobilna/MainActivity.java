package com.example.mobilna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	ArrayList<String> list = new ArrayList<>();
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		list.add("Element 1");
		list.add("Element 2");
		list.add("Element 3");

		adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
		ListView elementsList = findViewById(R.id.elementsList);
		elementsList.setAdapter(adapter);

		Button addElementButton = findViewById(R.id.addElementButton);
		addElementButton.setOnClickListener(v -> {
			EditText elementName = findViewById(R.id.elementName);
			list.add(elementName.getText().toString());
			adapter.notifyDataSetChanged();
		});
	}
}