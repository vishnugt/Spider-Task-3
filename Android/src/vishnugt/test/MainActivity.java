package vishnugt.test;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends Activity implements LocationListener {


	public void go1(View v)
	{
		EditText et1 = (EditText) findViewById(R.id.editText1);
		EditText et2 = (EditText) findViewById(R.id.editText2);
		if(et1.getText().toString()=="" & et2.getText().toString()=="")
			Toast.makeText(getApplicationContext(), "If the values are null it will load your last viewed location", 
				   Toast.LENGTH_SHORT).show(); 
		String uri = "geo:"+ et1.getText().toString() + "," + et2.getText().toString();
		startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri)));
	
	}
	public void go2(View v)
	{

		
		EditText et = (EditText) findViewById(R.id.editText3);

		if(et.getText().toString()=="")
		Toast.makeText(getApplicationContext(), "If the values are null it will load your last viewed location", 
				   Toast.LENGTH_SHORT).show(); 
		final Intent myIntent = new Intent(
			    android.content.Intent.ACTION_VIEW,
			    Uri.parse( "geo:0,0?q=" +  et.getText().toString())
			);
		startActivity(myIntent);
		}
	

	public RadioButton radio1, radio2, radio3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		radio1 = (RadioButton)findViewById(R.id.radioButton1);
		radio2 = (RadioButton)findViewById(R.id.radioButton2);
		radio3 = (RadioButton)findViewById(R.id.radioButton3);
		
		
		LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	
	public void first(View v)
	{

		if(radio2.isChecked()) radio2.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
	}

	public void second(View v)
	{

		
		if(radio1.isChecked()) radio1.setChecked(false);
		if(radio2.isChecked()) radio2.setChecked(false);
	}
	
	public void third(View v)
	{

		if(radio1.isChecked()) radio1.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
	}
	
	public void back (View v)
	{
		//Here I am restarting the application
		Intent i = getBaseContext().getPackageManager()
	             .getLaunchIntentForPackage( getBaseContext().getPackageName() );
	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	startActivity(i);
	}

	Double lat1,lan1;
	@Override
	public void onLocationChanged(Location location) 
		{
		 lat1 = location.getLatitude();
		 lan1 = location.getLongitude();
		
		}
	public void mainfunc(View v)
	{

		RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
		RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
		RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
		
		if(radio1.isChecked())
		{
			setContentView(R.layout.latlong);
			
		}
		if(radio2.isChecked())
		{
			setContentView(R.layout.location);
		}
		if(radio3.isChecked())
		{
			

			String uri = "geo:"+ lat1 + "," + lan1;
			startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri)));

			
		}
		
	}
	@Override
	public void onProviderDisabled(String arg0) {
		
	}
	@Override
	public void onProviderEnabled(String arg0) {
		
	}
	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		
	}

}
