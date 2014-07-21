package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IB4 extends Activity {

	Button bBack;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ib4);
		bBack = (Button) findViewById(R.id.bBack);
		tv = (TextView) findViewById(R.id.tv);
		
		tv.setText("HOSPITAL\n Our college has an Hospital on campus along with an Apollo Pharmacy. The hospital, strictly speaking, is not the best of the lot. If the situation is one that requires special care it's better if the patient is transferred to the BHEL hospital. We have a 24 hours ambulance service so that isn't a problem. In not-so-dangerous situations however this hospital is something we can make do with. There is no consultation fee. The prescriptions that the doctor gives us provides us with free medicines. We have already made an advanced payment for the same and hence. If however, you buy medicines without a prescription, that cash comes out of your wallet\n\n "
				+ "NITT BookHouse\n This is very close to the hospital. It provides us with subject related books for the most part.\n\n"
				+ "GUESTHOUSE\n The new guesthouse is close to the other exit of the campus; near the staff quaters. It has very good rooms, which are air conditioned and charges a resonable tariff. You can also opt to eat food in the restaurant within the complex. To book a room in the Guesthouse you need to go to there, collect a form, fill it up and get it signed by your HOD and the guesthouse in-charge. Kind of a long process, yes.\n");
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
