package com.example.bbitcampus;






import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
Button btn;
//private long ms=0;
//private long splashTime=3000;
//private boolean splashActive = true;
//private boolean paused=false;
//ImageButton btnimage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		  btn=(Button)findViewById(R.id.Signin);
		
	        btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					
					Intent ib=new Intent(getApplicationContext(),Login.class);
					startActivity(ib);
				}
				
			});
	      
//	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//			 Thread mythread = new Thread() {
//	    	public void run() {
//	    		try {
//	    			while (splashActive && ms < splashTime) {
//	    				if(!paused)
//	    					ms=ms+100;
//	    				sleep(100);
//	    			}
//	    		} catch(Exception e) {}
//	    		finally {
//	    			Intent intent = new Intent(MainActivity.this, MainActivity.class);
//	        		startActivity(intent);
//	        		MainActivity.this.finish();
//	    		}
//	        	}
//	    };
//	    mythread.start(); 
//		}
//		public void onBackPressed() {
//			return;
//		};
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
	    // TODO Auto-generated method stub
	    	switch (item.getItemId())
	    	{
	    	
	    	
	    	case R.id.Registration:
	    	{
	    		Intent ib=new Intent(getApplicationContext(),Register.class);
				startActivity(ib);
				return true;
	    		
				
	    	}
	    	case R.id.loginapp:
	    	{
	    		Intent ib=new Intent(getApplicationContext(),Login.class);
				startActivity(ib);
	    	return true;
	    	}
	    	
	    	case R.id.AboutUs:
	    	{
	    		Intent ib=new Intent(getApplicationContext(),Aboutus.class);
				startActivity(ib);
				return true;
	    		
	    	}
	    	case R.id.Contactus:
	    	{
	    		Intent ib=new Intent(getApplicationContext(),Contactus.class);
				startActivity(ib);
				return true;
	    		
	    	}
	    	
	    	default:
	    return super.onOptionsItemSelected(item);
	    } }   
	
}
