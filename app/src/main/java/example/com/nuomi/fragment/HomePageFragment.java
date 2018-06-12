package example.com.nuomi.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import example.com.nuomi.R;
import example.com.nuomi.Restaurant.ALongMeiShi;
import example.com.nuomi.adapter.MyPagerAdapter;

public class HomePageFragment extends Fragment {

    private ListView home_lv;
    @Nullable//参数可为null
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //实例化一个视图
        final View v=inflater.inflate(R.layout.homepage_fragment, null);
        final ViewPager vp=(ViewPager) v.findViewById(R.id.vp);
        final RadioGroup rg=(RadioGroup) v.findViewById(R.id.rg);

        home_lv= (ListView) v.findViewById(R.id.home_lv);
        //xinwen
        SimpleAdapter adapter1=new SimpleAdapter(getActivity(), getData(),
                R.layout.listview_homepage, new String[]{"img","title","state","renshu"},
                new int[]{R.id.img,R.id.title,R.id.state,R.id.renshu});
        home_lv.setAdapter(adapter1);


        MyPagerAdapter adapter=new MyPagerAdapter();
        //vp设置适配器 点击页面跟着走
        vp.setAdapter(adapter);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {

                int i=0;
                switch (arg1) {
                    case R.id.rb1:
                        i=0;
                        break;
                    case R.id.rb2:
                        i=1;
                        break;
                    case R.id.rb3:
                        i=2;
                        break;
                    case R.id.rb4:
                        i=3;
                        break;
                }
                vp.setCurrentItem(i);

            }
        });

        home_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i = new Intent(getActivity(),ALongMeiShi.class);

                        startActivity(i);
                        break;
                }
            }
        });

        //滑动页面点跟着走
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                RadioButton rb=(RadioButton) rg.getChildAt(arg0);
                rb.setChecked(true);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }

        });
        //把实例化出来的View返回
        return v;


    }

    private List<Map<String, Object>> getData(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map;

        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.one);
        map.put("title", "阿龙美食坊");
        map.put("state", "正在营业");
        map.put("renshu", "正在排队：10份");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.five);
        map.put("title", "嵊州小吃");
        map.put("state", "正在休息");
        map.put("renshu", "正在排队：0份");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.two);
        map.put("title", "黄焖鸡米饭");
        map.put("state", "正在营业");
        map.put("renshu", "正在排队：6份");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.seven);
        map.put("title", "沙县小吃");
        map.put("state", "正在营业");
        map.put("renshu", "正在排队：5份");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.nine);
        map.put("title", "排骨饭");
        map.put("state", "正在营业");
        map.put("renshu", "正在排队：2份");
        list.add(map);
        return list;
    }
}
