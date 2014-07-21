package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IB1 extends Activity {
	
	Button bBack;
	TextView tvLibrary, tvSAC, tvSports;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ib1);
		
		bBack= (Button) findViewById(R.id.bBack);
		tvLibrary = (TextView) findViewById(R.id.tvLibrary);
		tvSAC = (TextView) findViewById(R.id.tvSAC);
		tvSports = (TextView) findViewById(R.id.tvSports);
		
		tvLibrary.setText("A very impressive building. Floors of books. Just one downside- it has got no fiction cooks :/ A lot of people go there for combined study and to borrow subject related books. But First u have to register for it. Just go to the library with your ID card." );
		
		tvSAC.setText("A building looking over the NSO ground. Here DT and Thespi practices take place. TableTennis practice also takes place here");
		
		tvSports.setText("Consists of a gym, 3 indoor badminton courts, and a carroms table on the first floor. Also, close to the building are 2 basketball courts. 2 tennis courts, 2 skating floors and 2 handball court. They're building something next to these courts. Not exactly sure what :P");
		
		bBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent("com.delta.finalproject.MENUONE");
				startActivity(i);
			}
		});
	}
	

}
