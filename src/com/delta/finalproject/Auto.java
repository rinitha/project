package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Auto extends Activity implements OnClickListener {

	TextView tv;
	Button b1, b2, b3, b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.auto);
		initialise();

		tv.setText("While on campus, cycles are the most commonly used mode of transport essentially because its cheap. Nonetheless there do come situations wherein you just need to use an auto. Like when you're running late to a class and your attendance is already in the danger zone. So all you need to do is call the auto guy and he'll come to wherever you are to pick u up. They almost always charge 30 bucks. Whatever be the distance travelled. So obviously it isn't the most resonable price but we have to oblige. There are times when the auto dude takes 50 bucks if u make him transport the cycle and you to the SC. That's a rip off but whattodo. Word of advice: Prefer Rajini anna, he's nicer than all others. And oh yes, address everyone as anna and akka. Even if you're older than them :P Below are some contacts for an auto: \n");

	}

	private void initialise() {
		// TODO Auto-generated method stub
		tv = (TextView) findViewById(R.id.tv);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.b1:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:123456789"));
			startActivity(callIntent);
			break;

		}
	}

}
