package com.example.bbitcampus;



import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends Activity {
Spinner spn1;
EditText un,p,cp;
DAtabaseHelper db1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		Button btnregist;
		btnregist=(Button)findViewById(R.id.registerbtn);
		p=(EditText)findViewById(R.id.Password);
		cp=(EditText)findViewById(R.id.confirmpassword);
		un=(EditText)findViewById(R.id.Username);
		 db1=new DAtabaseHelper(this);
		btnregist.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub 
				String name=un.getText().toString();
				String paswd=p.getText().toString();
				String cpaswd=cp.getText().toString();
				if(un.getText().length()==0  )
					{
					Toast.makeText(getApplicationContext(), "Please check Username & Password", Toast.LENGTH_LONG).show();
				}
				
				else if(cpaswd.equals(paswd))
				{db1.insert(name,paswd,cpaswd);
					Toast.makeText(getApplicationContext(), "Hello  " +un.getText() +" !", Toast.LENGTH_LONG).show();
				Intent ob1=new Intent(getApplicationContext(),Student.class);
				startActivity(ob1);
				}
			}
		});
		
		
		

	        spn1=(Spinner)findViewById(R.id.spincourse);
			    
	        List<String> list=new ArrayList<String>();
	    	     
		       list.add("Civil Engineering");
		    	      
		      list.add("Electrical Engineering");
		    	      
		      list.add("Electrical and Communication Technology");
		      list.add("Computer Engineering");
		      list.add("Information Technology");
		      list.add("Mechanical Engineering");
		      ArrayAdapter<String> dataAdapter=new  ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
			   spn1.setAdapter(dataAdapter);
		      dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		      
	    	     		  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_register, menu);
		return true;
	}

}
