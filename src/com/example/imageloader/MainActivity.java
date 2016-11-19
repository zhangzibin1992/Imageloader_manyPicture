package com.example.imageloader;



import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;

public class MainActivity extends Activity {
	private ListView listView;
	private String[] url;
	private ListAdpter adapter;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		url = ImageUrl.Image;
		listView = (ListView) findViewById(R.id.list);
		adapter = new ListAdpter(this, url);
		listView.setAdapter(adapter);
	}


	
	
}
