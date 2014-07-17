package com.delta.finalproject;

import android.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Password extends Activity {

	EditText etPass;
	String pass;
	Button Proceed;
	TextView msg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.password);
		
		etPass = (EditText) findViewById(R.id.etPass);
		Proceed = (Button) findViewById(R.id.bProceed);
		msg = (TextView) findViewById(R.id.tvMsg);
		
		Proceed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				pass = etPass.getText().toString();
				if(pass.contentEquals("hello"))
				{
					Intent dialogIntent = new Intent(getBaseContext(), MenuOne.class);
					dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					getApplication().startActivity(dialogIntent);
					//Intent in = new Intent("com.delta.finalproject.MENUONE");
					//startActivity(in);
				}
				else
				{
					msg.setText("Sorry, Incorrect password! Try again!");
				}
					
			}
		});
		
 	}

}
