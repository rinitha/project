package com.delta.finalproject;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuOne extends ListActivity{

	String classes[] = {"AboutTheDirector", "ImportantBuildings", "EatingOnCampus", "Events", "ClubsAndTeams", "Transport","RandomTips"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MenuOne.this, android.R.layout.simple_list_item_1, classes));
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String openOpt = classes[position];
		Class ourClass;
		try {
			ourClass = Class.forName("com.delta.finalproject."+ openOpt);
			Intent i = new Intent(MenuOne.this, ourClass );
			startActivity(i);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
