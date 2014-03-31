package com.example.dsa;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherAdapter extends ArrayAdapter<Weather> {

	private Context context;
	private int LayoutResourceId;
	private Weather data[] = null;

	public WeatherAdapter(Context context, int LayoutResourceId, Weather[] data) {
		super(context, LayoutResourceId, data);
		this.context = context;
		this.LayoutResourceId = LayoutResourceId;
		this.data = data;
	}

	@Override
	public View getView(int position, View row, ViewGroup parent) {

		WeatherHolder holder = null;

		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(LayoutResourceId, parent, false);

			holder = new WeatherHolder();
			holder.imgView = (ImageView) row.findViewById(R.id.ivIcon);
			holder.txtView = (TextView) row.findViewById(R.id.tvText);

			row.setTag(holder);
		} else {
			holder = (WeatherHolder) row.getTag();
		}

		Weather weather = data[position];
		holder.txtView.setText(weather.title);
		holder.imgView.setImageResource(weather.imgIcon);

		return row;
	}

	class WeatherHolder {
		ImageView imgView;
		TextView txtView;
	}

}
