package com.example.dsa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView list = (ListView) findViewById(R.id.lvWeather);

		Weather weather_data[] = new Weather[] {
				new Weather(R.drawable.cloud, "cloud"),
				new Weather(R.drawable.rain, "rain"),
				new Weather(R.drawable.snow, "snow"),
				new Weather(R.drawable.sun, "sun"),
				new Weather(R.drawable.thunder, "thunder") };

		WeatherAdapter adapter = new WeatherAdapter(MainActivity.this,
				R.layout.listview_item, weather_data);
		list.setAdapter(adapter);

	}

}
