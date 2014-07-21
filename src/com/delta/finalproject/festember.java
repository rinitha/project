package com.delta.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class festember extends Activity {

	TextView tv ,tv1;
	Button bBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.festember);
		bBack = (Button) findViewById(R.id.bBack);
		bBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent ("com.delta.finalproject.MENUONE");
				startActivity(i);
			}
		});
		
		tv1 = (TextView) findViewById(R.id.tv1);
		tv1.setText("festember");
		
		tv = (TextView) findViewById(R.id.tv2);
		tv.setClickable(true);
		tv.setMovementMethod(LinkMovementMethod.getInstance());
		String link = "<a href = 'http://google.com'> here </a> ";
		tv.setText(Html.fromHtml(link));
	}

	
}
