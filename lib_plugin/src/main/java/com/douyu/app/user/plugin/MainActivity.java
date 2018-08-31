package com.douyu.app.user.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.zhy.view.RoundImageView;

public class MainActivity extends Activity
{
	private RoundImageView mQiQiu;
	private RoundImageView mMeiNv ; 

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ac_img);
		
		mQiQiu = (RoundImageView) findViewById(R.id.id_qiqiu);
		mMeiNv = (RoundImageView) findViewById(R.id.id_meinv);

		mQiQiu.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				mQiQiu.setScaleType(ImageView.ScaleType.FIT_XY);

//				mQiQiu.setType(RoundImageView.TYPE_ROUND);
			}
		});

		mMeiNv.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				mMeiNv.setBorderRadius(90);
			}
		});
	}

}
