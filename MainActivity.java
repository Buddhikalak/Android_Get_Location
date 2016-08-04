package com.example.maptest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
/*
Create by Buddhika Lakshan
GEEk

*/
//import com.google.android.gms.maps.OnMapReadyCallback;


public class MainActivity extends FragmentActivity {
	
	GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GPSTracker mGPS = new GPSTracker(this);
		if (mGPS.canGetLocation) {
			mGPS.getLocation();
			Toast.makeText(getApplicationContext(),
			GPS.getLatitude()+"-&-"+mGPS.getLongitude(), 1).show();

			
		//	googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map123)).getMap();
			//final LatLng TutorialsPoint = new LatLng(mGPS.getLatitude() , mGPS.getLongitude());
			//Marker TP = googleMap.addMarker(new MarkerOptions().position(TutorialsPoint).title("DRZ")); 
			//googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
			//googleMap.getUiSettings().setZoomGesturesEnabled(true);
			
		} else {
					Toast.makeText(getApplicationContext(),
					"Error", 1).show();
			Log.i("ERROR", "Unable");
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
