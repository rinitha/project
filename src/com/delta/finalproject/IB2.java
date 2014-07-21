package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IB2 extends Activity{
	
	Button bBack;
	TextView tv1, tv2, tv3, tv4, tv5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ib2);
		initialise();
		
		tv1.setText("SBI office and ATM is one of the first places you need to go when u enter college. Set up an account for your ever-depleting reserve of cash. Just a heads up, you will have no idea where ur cash just goes off");
		
		tv2.setText("This is probably one of the hang outs of college after team practice and even otherwise. Fruit Juice, cheap and best. The Anna and Akka there really nice. If u dont have cash, u can still drink juice and pay them later");
		
		tv3.setText("In first year most of the exam syllabus will come out of this shop. This lady is your savior, especially if you arent a keen listener in class. Take the notes. Learn them up.   ");
		
		tv4.setText("This bakery has a lot of stuff to eat. You get your standard haldirams packets, biscuits, Cup noodles, britannia cakes etc. Different soft drinks, flavoured milk, puffs, and most importantly, birthday cakes. Obviously the better option is to buy from the city but for emergency purposes, birthday cakes (not too good) are avaliable here.");
		
		tv5.setText("Apart from the others, you have a tailor shop. This is where all u guys have to buy your lab uniform from. \nThe cycle repair shop will be a place you will be frequently visiting.\n Right next to it is the cobbler who is open very irregularly but this is where u have to buy your lab shoes.\n A laundry shop for those of you lazy people is also avaliable in the SC.\n A barber is there for guys. Not a very good one apparently, but again, for emergency purposes you can make do. For girls there is a parlour on 13th street.\n There's a small departmental store called chintamani and also a stationary shop.\n An recharge shop is also avaliable next to the stationary store which also sells other basic mobile products and dongles.\n Go to Photo Mohan to get passport size photos He'll get them to you in a day or so.");
		bBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent("com.delta.finalproject.MENUONE");
				startActivity(i);
			}
		});
	}

	private void initialise() {
		// TODO Auto-generated method stub
		bBack= (Button) findViewById(R.id.bBack);
		tv1 = (TextView) findViewById(R.id.tv1);
		tv2 = (TextView) findViewById(R.id.tv2);
		tv3 = (TextView) findViewById(R.id.tv3);
		tv4 = (TextView) findViewById(R.id.tv4);
		tv5 = (TextView) findViewById(R.id.tv5);
		
	}

	
}
