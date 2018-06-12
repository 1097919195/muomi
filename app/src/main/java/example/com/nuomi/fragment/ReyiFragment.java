package example.com.nuomi.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import example.com.nuomi.R;

public class ReyiFragment extends Fragment {

    private ListView reyi_lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.reyi_fragment, null);

        reyi_lv= (ListView) v.findViewById(R.id.reyi_lv);
        SimpleAdapter adapter1=new SimpleAdapter(getActivity(), getData(),
                R.layout.listview_reyi, new String[]{"personal","name","img","img2","title","liulan","time","zan","zan_num"},
                new int[]{R.id.personal,R.id.name,R.id.img,R.id.img2,R.id.title,R.id.liulan,R.id.time,R.id.zan,R.id.zan_num});
        reyi_lv.setAdapter(adapter1);

        ImageView addreyi= (ImageView) v.findViewById(R.id.addreyi);
        addreyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View layout = View.inflate(getActivity(), R.layout.addreyi_dialog,null);
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setView(layout);
                final AlertDialog dialog=builder.create();
                dialog.show();
            }
        });

        return v;
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map;

        map = new HashMap<String, Object>();
        map.put("personal", R.drawable.personaltwo);
        map.put("name", "Suger");
        map.put("img", R.drawable.book);
        map.put("title", "大学的意义？成长？努力？奋斗？考试？生活？青春？总之一点 累！");
        map.put("liulan", "浏览量：1200");
        map.put("time", "2017-05-20");
        map.put("zan",R.drawable.zanzan);
        map.put("zan_num","684");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("personal", R.drawable.personal);
        map.put("name", "Bitter");
        map.put("img", R.drawable.zhufangone);
        map.put("img2", R.drawable.zhufangtwo);
        map.put("title", "哇！学校附近精装修房低价出售有意者私聊");
        map.put("liulan", "浏览量：1102");
        map.put("time", "2017-05-16");
        map.put("zan",R.drawable.zanzan);
        map.put("zan_num","972");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("personal", R.drawable.personalone);
        map.put("name", "明天会更好");
        map.put("img", R.drawable.movie);
        map.put("title", "周末《怪物召唤》上映有人约吗？");
        map.put("liulan", "浏览量：1360");
        map.put("time", "2017-05-11");
        map.put("zan",R.drawable.zanzan);
        map.put("zan_num","896");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("personal", R.drawable.personal);
        map.put("name", "Bitter");
        map.put("img", R.drawable.fruitetwo);
        map.put("img2", R.drawable.fruitethree);
        map.put("title", "学院水果店刚出的新品，不愧是冰镇的哈！享受！连续三天八折哟！");
        map.put("liulan", "浏览量：586");
        map.put("time", "2017-05-10");
        map.put("zan",R.drawable.zanzan);
        map.put("zan_num","66");
        list.add(map);

        return list;
    }
}
