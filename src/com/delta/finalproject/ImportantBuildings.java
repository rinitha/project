package com.delta.finalproject;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ImportantBuildings extends ListActivity {

	String[] options = {
			"Library, Sports Center, SAC, Physical Department (PD)",
			"Shopping Center", "Gurunath, Octagon, LHC",
			"Hospital, NITT BookHouse, Guesthouse" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(ImportantBuildings.this,
				android.R.layout.simple_list_item_1, options));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);

		switch (position) {
		case 0:
			Intent a = new Intent("com.delta.finalproject.IB1");
			startActivity(a);
			break;
		case 1:
			Intent b = new Intent("com.delta.finalproject.IB2");
			startActivity(b);
			break;
		case 2:
			Intent c = new Intent("com.delta.finalproject.IB3");
			startActivity(c);
			break;
		case 3:
			Intent d = new Intent("com.delta.finalproject.IB4");
			startActivity(d);
			break;
		}
	}

}
