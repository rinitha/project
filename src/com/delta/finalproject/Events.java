package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Events extends Activity implements OnClickListener {
	Button bBack;
	Button sportsfete, aaveg, horizons, festember, pragyan, nittfest, internit,
			vibes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events);
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		bBack = (Button) findViewById(R.id.bBack);
		sportsfete = (Button) findViewById(R.id.bSportsfete);
		aaveg = (Button) findViewById(R.id.bAaveg);
		horizons = (Button) findViewById(R.id.bHorizons);
		festember = (Button) findViewById(R.id.bFestember);
		pragyan = (Button) findViewById(R.id.bPragyan);
		internit = (Button) findViewById(R.id.bInternit);
		vibes = (Button) findViewById(R.id.bVibes);
		nittfest = (Button) findViewById(R.id.bNittfest);

		bBack.setOnClickListener(this);
		sportsfete.setOnClickListener(this);
		aaveg.setOnClickListener(this);
		horizons.setOnClickListener(this);
		festember.setOnClickListener(this);
		pragyan.setOnClickListener(this);
		internit.setOnClickListener(this);
		vibes.setOnClickListener(this);
		nittfest.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bAaveg:
			Intent a = new Intent("com.delta.finalproject.AAVEG");
			startActivity(a);
			break;
		case R.id.bFestember:
			Intent b = new Intent("com.delta.finalproject.FESTEMBER");
			startActivity(b);
			break;
		case R.id.bInternit:
			Intent c = new Intent("com.delta.finalproject.INTERNIT");
			startActivity(c);
			break;
		case R.id.bNittfest:
			Intent d = new Intent("com.delta.finalproject.NITTFEST");
			startActivity(d);
			break;
		case R.id.bPragyan:
			Intent e = new Intent("com.delta.finalproject.PRAGYAN");
			startActivity(e);
			break;
		case R.id.bSportsfete:
			Intent f = new Intent("com.delta.finalproject.SPORTSFETE");
			startActivity(f);
			break;
		case R.id.bVibes:
			Intent g = new Intent("com.delta.finalproject.VIBES");
			startActivity(g);
			break;
		case R.id.bHorizons:
			Intent h = new Intent("com.delta.finalproject.HORIZONS");
			startActivity(h);
			break;
		case R.id.bBack:
			Intent i = new Intent("com.delta.finalproject.MENUONE");
			startActivity(i);
			break;
		}
	}
}
