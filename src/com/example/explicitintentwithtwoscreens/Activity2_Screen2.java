package com.example.explicitintentwithtwoscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2_Screen2 extends Activity

{
	// Define and declare a button here 
	Button b2;
@Override
protected void onCreate(Bundle savedInstanceState)
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.screen2);
	//Refer the button from xml with the id of button b1 which is "button1"
	b2=(Button)findViewById(R.id.button1);
	// Set the listener for button , we are using on click listener for button
	b2.setOnClickListener(new OnClickListener()
	{
		
		@Override
		public void onClick(View v) 
		{
			// TODO Auto-generated method stub
			/**
			Syntax:
				   Intent userdefinedvariable = new Intent(CurrentActivity.this,DesiredActivity.class);
				   startActivity(userdefinedvariable);
			**/
			Intent i=new Intent(Activity2_Screen2.this,Activity1_Screen1.class);
			startActivity(i);
			
		}
	});
}
}
