package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EatingOnCampus extends Activity {

	Button bBack;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eating);
		bBack = (Button) findViewById(R.id.bBack);
		tv = (TextView) findViewById(R.id.tv);

		tv.setText("There are several places to eat on campus, although, be warned none of them are top restaurant quality.\n\n "
				+ "BUHARI located in the SC. It is a decent restaurant with both south indian and north indian food, the former's quality being the better of the two. After breakfast another small stall opens right outside which serves good burgers, wedges fries etc.\n \n"
				+ "VASANTHAM near the ICE department serves decent food but hygiene here is quite bad. So is the ambience really :P But usually used for a quick lunch between the forenoon and afternoon classes.\n\n"
				+ "IIM Chat. Clearly it's actually part of IIM. Yes, there's an IIM Trichy within NITT. You get good rolls and parathas here for about 30-40 bucks and soda for 10 bucks. Pretty good (y)\n\n"
				+ "AAVIN, COKESTAND AND BRU these 3 small stalls near the LHC. Here you get flavoured milk, donuts, chips biscuits, cake, puffs, soft drinks etc.\n\n"
				+ "LIPTON located near the sports center. Sells ice tea, grape juice etc. After an evening of team practice students go here to refresh themselves.\n\n"
				+ "STAFF-C The staff canteen located behind the admin block sells decent food for decent prices. You also have a small shed to sit and eat.\n\n"
				+ "SNACKY actual name being Classic Foods. Rates not really reasonable but there's a good place to sit and you get puffs, chats, other snacks and even ice cream , milkshakes and stuff if you're lucky :P \n\n"
				+ "DHABAAA Last and probably the best, the 3rd dhaba, and all the other food places right opposite campus. 3rd dhaba has the best soft drink mixer, Palani anna. Sells stuff like 77 with is a proper mix of Slice and Sprite. Find out about the other drinks on ur own!\n");
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
