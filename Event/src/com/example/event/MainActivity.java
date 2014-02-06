package com.example.event;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends Activity 
implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button)findViewById(R.id.button);
		
		//リスナーを登録

		button.setOnClickListener(this);


		
	}

	@Override
	public void onClick(View v) {
		Toast.makeText(this,"ボタン押された",Toast.LENGTH_SHORT).show();
		switch(v.getId()){
	    case R.id.button:
	      Log.d("My Test", "Clicked!");
	      
		}
		
	}

}
