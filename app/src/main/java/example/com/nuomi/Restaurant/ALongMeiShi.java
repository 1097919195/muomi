package example.com.nuomi.Restaurant;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import example.com.nuomi.CarActivity;
import example.com.nuomi.R;

public class ALongMeiShi extends AppCompatActivity {

    private ListView food_lv;
    List<Map<String, Object>> list;
    Button accounts;
    TextView number;
    int count=0,count1=0,count2=0;
    Intent i;
    String aaa="宫爆鸡丁盖浇饭";
    String aaaa="珍珠奶茶";
    int bbb=1;
    int bbbb=1;
    int ccc=10;
    int cccc=7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_along_mei_shi);

        number= (TextView) findViewById(R.id.number);

        food_lv= (ListView) findViewById(R.id.food_lv);

        SimpleAdapter adapter2=new SimpleAdapter(getApplication(), getData(),
                R.layout.listview_along_mei_shi, new String[]{"img","name","state","price"},
                new int[]{R.id.img,R.id.name,R.id.state,R.id.price});

        food_lv.setAdapter(adapter2);
        i=new Intent(ALongMeiShi.this,CarActivity.class);

        //列表点击效果
        food_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                final Animation animation= AnimationUtils.loadAnimation(getApplication(), R.anim.rotate);

                switch (position){
                    case 0:
                        final Button addDish0=(Button)view.findViewById(R.id.addDish);
                        addDish0.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                addDish0.startAnimation(animation);
                                Toast.makeText(ALongMeiShi.this, "您添加了一份珍珠奶茶", Toast.LENGTH_LONG).show();
                                i.putExtra("aaaa",aaaa);
                                i.putExtra("bbbb",bbbb);
                                i.putExtra("cccc",cccc);
                                bbbb++;
                                cccc=cccc+7;
                                count1++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        View layout0 = View.inflate(ALongMeiShi.this, R.layout.waterstate_dialog,null);
                        AlertDialog.Builder builder0 = new AlertDialog.Builder(ALongMeiShi.this);
                        builder0.setView(layout0);
                        final AlertDialog dialog0=builder0.create();
                        dialog0.show();
                        Button order0= (Button) layout0.findViewById(R.id.order);
                        order0.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(ALongMeiShi.this, "您添加了一份珍珠奶茶", Toast.LENGTH_LONG).show();
                                i.putExtra("aaaa",aaaa);
                                i.putExtra("bbbb",bbbb);
                                i.putExtra("cccc",cccc);
                                bbbb++;
                                cccc=cccc+7;
                                count2++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });

                        break;
                    case 1:
                        final Button addDish1=(Button)view.findViewById(R.id.addDish);
                        addDish1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                addDish1.startAnimation(animation);
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count1++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        View layout1 = View.inflate(ALongMeiShi.this, R.layout.foodstate_dialog,null);
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(ALongMeiShi.this);
                        builder1.setView(layout1);
                        final AlertDialog dialog1=builder1.create();
                        dialog1.show();
                        Button order1= (Button) layout1.findViewById(R.id.order);
                        order1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count2++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        break;
                    case 2:
                        final Button addDish2=(Button)view.findViewById(R.id.addDish);
                        addDish2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                addDish2.startAnimation(animation);
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count1++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        View layout2 = View.inflate(ALongMeiShi.this, R.layout.foodstate_dialog,null);
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(ALongMeiShi.this);
                        builder2.setView(layout2);
                        final AlertDialog dialog2=builder2.create();
                        dialog2.show();
                        Button order2= (Button) layout2.findViewById(R.id.order);
                        order2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count2++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        break;
                    case 3:
                        final Button addDish3=(Button)view.findViewById(R.id.addDish);
                        addDish3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                addDish3.startAnimation(animation);
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count1++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        View layout3 = View.inflate(ALongMeiShi.this, R.layout.foodstate_dialog,null);
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(ALongMeiShi.this);
                        builder3.setView(layout3);
                        final AlertDialog dialog3=builder3.create();
                        dialog3.show();
                        Button order3= (Button) layout3.findViewById(R.id.order);
                        order3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count2++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        break;
                    case 4:
                        final Button addDish4=(Button)view.findViewById(R.id.addDish);
                        addDish4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                addDish4.startAnimation(animation);
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count1++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        View layout4 = View.inflate(ALongMeiShi.this, R.layout.foodstate_dialog,null);
                        AlertDialog.Builder builder4 = new AlertDialog.Builder(ALongMeiShi.this);
                        builder4.setView(layout4);
                        final AlertDialog dialog4=builder4.create();
                        dialog4.show();
                        Button order4= (Button) layout4.findViewById(R.id.order);
                        order4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(ALongMeiShi.this, "您添加了一份宫爆鸡丁盖浇饭", Toast.LENGTH_LONG).show();
                                i.putExtra("aaa",aaa);
                                i.putExtra("bbb",bbb);
                                i.putExtra("ccc",ccc);
                                bbb++;
                                ccc=ccc+10;
                                count2++;
                                number.setText(String.valueOf(count=count1+count2));
                            }
                        });
                        break;

                }

            }
        });
        //结账
        accounts= (Button) findViewById(R.id.accounts);
        accounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count==0){
                    Toast.makeText(ALongMeiShi.this, "您还未添加任何的商品", Toast.LENGTH_LONG).show();
                }else{

                    startActivity(i);
                }

            }
        });

    }

    private List<Map<String, Object>> getData() {
        list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map;

        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.water);
        map.put("name", "珍珠奶茶");
        map.put("state", "月销666份");
        map.put("price", "￥7");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.rice);
        map.put("name", "宫爆鸡丁盖浇饭");
        map.put("state", "月销666份");
        map.put("price", "￥10");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.rice);
        map.put("name", "宫爆鸡丁盖浇饭");
        map.put("state", "月销666份");
        map.put("price", "￥10");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.rice);
        map.put("name", "宫爆鸡丁盖浇饭");
        map.put("state", "月销666份");
        map.put("price", "￥10");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("img", R.mipmap.rice);
        map.put("name", "宫爆鸡丁盖浇饭");
        map.put("state", "月销666份");
        map.put("price", "￥10");
        list.add(map);

        return list;
    }
}
