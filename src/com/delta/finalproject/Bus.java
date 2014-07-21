package com.delta.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Bus extends Activity {

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bus);
		
		tv = (TextView) findViewById(R.id.tv);
		
		tv.setText("Buses are avaliable both on campus and off. On campus, on normal days, the buses ply quite irregularly. During exams however, the buses are avaliable promptly. Before major holidays, the students commitee sometimes organizes a bus taking students to the railway station/ CBS too. \n To get to Trichy, when need be, #128 can take you to CBS, Trichy which is 22km away from campus and a 45 minute drive. Infact almost any bus which stops across the flyover in front of the campus can take you to Chatram, which in Trichy. BHEL township is a 5 minute bus ride from here. Any bus going in that direction will take you there. And wherever you are in Trichy, just catch a bus to CBS and change buses there to get one to NITT. Both buses are easily avaliable and ply very frequently. ");
	}
	

}
