package example.com.nuomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import example.com.nuomi.Restaurant.ALongMeiShi;
import example.com.nuomi.fragment.OrderFormFragment;

public class CarActivity extends AppCompatActivity {

    ListView needmenu_lv;
    TextView zprice;
    Button spend;
    Intent intent;

    String aaa="菜1";
    String aaaa="菜2";
    int bbb=0;
    int ccc;
    int bbbb=0;
    int cccc;
    int zj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        needmenu_lv= (ListView)findViewById(R.id.needmenu_lv);
        SimpleAdapter adapter=new SimpleAdapter(CarActivity.this, getData(),
                R.layout.listview_needmenu, new String[]{"name","shuliang","price"},
                new int[]{R.id.name,R.id.shuliang,R.id.price});
        needmenu_lv.setAdapter(adapter);

        spend= (Button) findViewById(R.id.spend);
        spend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CarActivity.this, "支付成功", Toast.LENGTH_LONG).show();
                Intent i=new Intent(CarActivity.this,MainActivity.class);
                Integer have=1;
                i.putExtra("have",have);
                startActivity(i);
            }
        });

        zprice= (TextView) findViewById(R.id.zprice);
        zprice.setText("总计￥"+zj);
    }

    private List<Map<String, Object>> getData(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map;

        intent=this.getIntent();
        aaa=intent.getStringExtra("aaa");
        aaaa=intent.getStringExtra("aaaa");
        bbb=intent.getIntExtra("bbb",0);
        bbbb=intent.getIntExtra("bbbb",0);
        ccc=intent.getIntExtra("ccc",0);
        cccc=intent.getIntExtra("cccc",0);

        zj=ccc+cccc;



        if (bbbb==0){
            map = new HashMap<String, Object>();
            map.put("name", aaa);
            map.put("shuliang", "*"+bbb);
            map.put("price", "￥"+ccc);
            list.add(map);
        } else if(bbb==0){
            map = new HashMap<String, Object>();
            map.put("name", aaaa);
            map.put("shuliang", "*"+bbbb);
            map.put("price", "￥"+cccc);
            list.add(map);
        }else{
            map = new HashMap<String, Object>();
            map.put("name", aaa);
            map.put("shuliang", "*"+bbb);
            map.put("price", "￥"+ccc);
            list.add(map);
            map = new HashMap<String, Object>();
            map.put("name", aaaa);
            map.put("shuliang", "*"+bbbb);
            map.put("price", "￥"+cccc);
            list.add(map);
        }

//        if (aaa.equals("宫爆鸡丁盖浇饭")&&aaaa.equals("珍珠奶茶")){
//            map = new HashMap<String, Object>();
//            map.put("name", aaa);
//            map.put("shuliang", "*"+bbb);
//            map.put("price", "￥"+ccc);
//            list.add(map);
//            map = new HashMap<String, Object>();
//            map.put("name", aaaa);
//            map.put("shuliang", "*"+bbbb);
//            map.put("price", "￥"+cccc);
//            list.add(map);
//        }

        return list;
    }
}
