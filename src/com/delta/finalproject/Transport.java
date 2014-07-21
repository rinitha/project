package com.delta.finalproject;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Transport extends TabActivity{
	Button bBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transport);

		         
		        TabHost tabHost = getTabHost();
		         
		        // Tab for Photos
		        TabSpec photospec = tabHost.newTabSpec("Auto");
		        // setting Title and Icon for the Tab
		        photospec.setIndicator("Auto", getResources().getDrawable(R.drawable.autobig));
		        Intent photosIntent = new Intent(this, Auto.class);
		        photospec.setContent(photosIntent);
		         
		        // Tab for Songs
		        TabSpec songspec = tabHost.newTabSpec("Taxi");        
		        songspec.setIndicator("Taxi", getResources().getDrawable(R.drawable.taxibig));
		        Intent songsIntent = new Intent(this, Taxi.class);
		        songspec.setContent(songsIntent);
		         
		        // Tab for Videos
		        TabSpec videospec = tabHost.newTabSpec("Bus");
		        videospec.setIndicator("Bus", getResources().getDrawable(R.drawable.busbig));
		        Intent videosIntent = new Intent(this, Bus.class);
		        videospec.setContent(videosIntent);
		         
		        // Adding all TabSpec to TabHost
		        tabHost.addTab(photospec); // Adding photos tab
		        tabHost.addTab(songspec); // Adding songs tab
		        tabHost.addTab(videospec); // Adding videos tab
		    }
}

	
