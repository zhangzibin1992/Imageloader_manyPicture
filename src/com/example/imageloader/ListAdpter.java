package com.example.imageloader;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdpter extends BaseAdapter{
	private Context context;
	private String url[];
	private DisplayImageOptions options;
	
	protected LayoutInflater layoutInflater;
	private ImageView imageView;
	private TextView textView;
	
	

	public ListAdpter(Context context, String[] url) {
		super();
		this.context = context;
		this.url = url;
		options = new DisplayImageOptions.Builder()
		.showStubImage(R.drawable.ic_stub)
		.showImageForEmptyUri(R.drawable.ic_empty)
		.showImageOnFail(R.drawable.ic_error)
		.cacheInMemory()
		.cacheOnDisc()
		.displayer(new RoundedBitmapDisplayer(5))
		.build();
		layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return url.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return url[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
			convertView = layoutInflater.inflate(R.layout.item_list_image, null);
		}
		imageView = (ImageView) convertView.findViewById(R.id.image);
		textView = (TextView) convertView.findViewById(R.id.text);
		
		textView.setText("µÚ "+(position+1)+"Í¼Æ¬");
		ImageLoader.getInstance().displayImage(url[position], imageView,options);
		//ImageLoader.getInstance().displayImage(url[position], imageView);
	
		
		return convertView;
	}
	
}
