package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IB3 extends Activity {
	TextView tv;
	Button bBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ib3);
		
		bBack= (Button) findViewById(R.id.bBack);
		tv = (TextView) findViewById(R.id.tv);
		
		tv.setText("LECTURE HALL COMPLEX\n This building is where you have to cycle to/ walk to everyday. This is where the classes for all BTech students are held. Except for the archis. Their classes happen in their department. And also the chemical dept has their classes in the CEESAT building from their second year on. This big green complex is where you have to be for all your theory classes. A room will be alloted to each department. Your tests and exams will also be held here. \n\n"
				+ "OCTAGON\n This building is opposite to the LHC and is where you have to go to get your webmail username and password, your wifi password etc. There is also a print out room and a \"sun\" lab adjacent to that, to which you can go to and get the required print outs\n\n"
				+ "GURUNATH\n This is a departmental store which has almost everything one would need for their stay in college. Well, almost. And beware shoplifters, they apparently have a camera installed in there. ");
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
