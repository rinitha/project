package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AboutTheDirector extends Activity implements OnClickListener {

	Button bBack;
	TextView tv1, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.director);
		initialize();
		
		tv1.setText("Our Director, Srinivasan Sundarrajan, is easily one of the most approachable personalities anyone could meet. He is highly active on facebook and you can address your issues to him via the same. Over the past years he has made the campus very comfortable to live in. A lot of problems have been resolved thanks to his relentless work. If u can believe it, your super seniors had close to 14 hours power cut a day. IN TRICHY! DW, we have no such issues now :)");
		tv2.setText("The admin block consists of the clocktower, and connected to it are the chemistry dept., physics dept., and the Air Conditioned barn hall. The clock tower chimes louudly every hour. The admin buildings consist of A2, A11, A12, A13 halls. Once u get inducted ( yeah, inductions here refers to the selection process) into your various clubs, you'll be called to these rooms for their meetings. The barn hall is where most of the events are held. It's pretty big and pretty cool (y) Go there and sleep during your orientation programme. If you want to. Don't blame the app if u get caught. Your physics and chem labs will be held in the respective departments. Be nice to the MTechs. They may save ur life later.");
	}

	private void initialize() {
		// TODO Auto-generated method stub
		bBack = (Button) findViewById(R.id.bBack);
		tv1 = (TextView) findViewById(R.id.tvDetails1);
		tv2 =(TextView)findViewById(R.id.tvDetails2);
		bBack.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i = new Intent ("com.delta.finalproject.MENUONE");
		startActivity(i);
	}

}
