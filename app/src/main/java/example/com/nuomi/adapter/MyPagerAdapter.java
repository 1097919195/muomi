package example.com.nuomi.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import example.com.nuomi.R;

public class MyPagerAdapter extends PagerAdapter {

    int res[]={R.mipmap.nuomi,R.mipmap.aa,R.mipmap.bb,R.mipmap.cc,};
    @Override
    public int getCount() {
        return res.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView v=new ImageView(container.getContext());
        v.setImageResource(res[position]);
        //把当前视图添加到容器里
        container.addView(v);
        //返回
        return v;
    }
}
