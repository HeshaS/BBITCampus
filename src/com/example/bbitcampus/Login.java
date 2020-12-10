package com.example.bbitcampus;



import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends Activity {
Button btnsignin;
EditText un,p,cp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);
		 btnsignin=(Button)findViewById(R.id.sign_in_button);
	        un=(EditText)findViewById(R.id.username);
	        p=(EditText)findViewById(R.id.password);
	        
	       
	       
	        btnsignin.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String name=un.getText().toString();
					String paswd=p.getText().toString();
					if(name.equals("heshasheth")&& paswd.equals("hesha123"))
					{ 
						Toast.makeText(getApplicationContext(),"Redirecting...... Hello " + name+ "! ", Toast.LENGTH_LONG).show();
				
					Intent ib=new Intent(getApplicationContext(),Student.class);
					startActivity(ib);}
					else
						Toast.makeText(getApplicationContext(), "Wrong Username OR Password",Toast.LENGTH_LONG ).show();
						
				
				}
			});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}

	
	
}
