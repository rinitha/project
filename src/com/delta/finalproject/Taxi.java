package com.delta.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Taxi extends Activity {

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.taxi);
		
		tv = (TextView) findViewById(R.id.tv);
		
		tv.setText("Taxi isn't a preferred mode of transport for those who want to go to the city just to chill or run some errands. It is used either when a large group of people go somewhere for a treat, when there's a lot of baggaage filled with laundry when you're going home after a long time or when people need to go to the airport. Below are some contacts for a Taxi:/n ");
		
	}
	

}
