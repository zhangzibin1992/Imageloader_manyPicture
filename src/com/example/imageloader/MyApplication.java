package com.example.imageloader;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import android.app.Application;

public class MyApplication extends Application{
	public static ImageLoader imageLoader = ImageLoader.getInstance();
	
	@Override
	public void onCreate() {
		super.onCreate();
		 //����Ĭ�ϵ�ImageLoader���ò���
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
        .threadPriority(Thread.NORM_PRIORITY - 2)//�߳����ȼ�
        .denyCacheImageMultipleSizesInMemory()
        .discCacheFileNameGenerator(new Md5FileNameGenerator())
        .tasksProcessingOrder(QueueProcessingType.LIFO)
        .build();
		ImageLoader.getInstance().init(config);//ȫ�����ó�ʼ��
		
		
	}

}
