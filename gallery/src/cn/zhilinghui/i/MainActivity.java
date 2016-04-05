package cn.zhilinghui.i;



import cn.zhilinghui.i.view.CustomGallery;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Gallery.LayoutParams;

public class MainActivity extends Activity {

	private int[] imageResIDs;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CustomGallery mGallery = (CustomGallery) findViewById(R.id.customgallery);
		
		imageResIDs = new int[] {
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8,
				R.drawable.pic_1,
				R.drawable.pic_2,
				R.drawable.pic_3,
				R.drawable.pic_4,
				R.drawable.pic_5,
				R.drawable.pic_6,
				R.drawable.pic_7,
				R.drawable.pic_8
		};
		
		mGallery.setAdapter(new MyAdapter());
	}

	
	class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return imageResIDs.length;
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView iv = null;
			if(convertView == null) {
				iv = new ImageView(MainActivity.this);
			} else {
				iv = (ImageView) convertView;
			}
			
			Bitmap bitmap = ImageUtils.getImageBitmap(
					MainActivity.this.getResources(), imageResIDs[position]);

			BitmapDrawable bd = new BitmapDrawable(bitmap);
			bd.setAntiAlias(true);		// �����
			
			iv.setImageDrawable(bd);
			LayoutParams params = new LayoutParams(160, 240);
			iv.setLayoutParams(params);
			return iv;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		
	}
}