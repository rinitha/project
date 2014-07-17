package com.delta.finalproject;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class WelcomePage extends ActionBarActivity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Thread timer = new Thread() {
        	public void run(){
        		try
        		{
        			sleep(5000);
        		}
        		catch (InterruptedException e){
        			e.printStackTrace();
        		}
        		finally{
        			Intent i = new Intent("com.delta.finalproject.PASSWORD");
        			
        			startActivity(i);
        		}
        	}
        	};
        	timer.start();
        
	}
}
