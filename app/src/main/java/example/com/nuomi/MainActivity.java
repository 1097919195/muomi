package example.com.nuomi;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import example.com.nuomi.fragment.HomePageFragment;
import example.com.nuomi.fragment.OrderFormFragment;
import example.com.nuomi.fragment.PersonalFragment;
import example.com.nuomi.fragment.ReyiFragment;
import example.com.nuomi.fragment.SettingFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;
    HomePageFragment homePagefragment;
    ReyiFragment reyifragment;
    OrderFormFragment orderformfragment;
    PersonalFragment personalfragment;
    SettingFragment settingfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg_activity=(RadioGroup) findViewById(R.id.rg_activity);
        RadioButton rb_2= (RadioButton) findViewById(R.id.rb_2);
        RadioButton rb_3= (RadioButton) findViewById(R.id.rb_3);
        //获取一个管理者
        manager = getSupportFragmentManager();
        homePagefragment =new HomePageFragment();
        //开启一个事物
        FragmentTransaction transaction = manager.beginTransaction();
        //添加到容器里面
        Intent intent=this.getIntent();
        Integer have=intent.getIntExtra("have",0);
        if (have==1){
            orderformfragment =new OrderFormFragment();
            transaction.add(R.id.rl_container, orderformfragment);
            rb_2.setChecked(true);
            transaction.hide(homePagefragment);

            Integer yes=1;
            Bundle bundle = new Bundle();
            bundle.putInt("yes",yes);
            orderformfragment.setArguments(bundle);
        }else{

            rb_3.setChecked(true);
        }
        transaction.add(R.id.rl_container, homePagefragment);
        //提交修改
        transaction.commit();

        rg_activity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                FragmentTransaction transaction2 = manager.beginTransaction();

                if(reyifragment!=null){
                    transaction2.hide(reyifragment);
                }
                if(homePagefragment!=null){
                    transaction2.hide(homePagefragment);
                }
                if(orderformfragment!=null){
                    transaction2.hide(orderformfragment);
                }
                if(personalfragment!=null){
                    transaction2.hide(personalfragment);
                }
                if(settingfragment!=null){
                    transaction2.hide(settingfragment);
                }
                switch (checkedId){
                    case R.id.rb_1:
                        if(reyifragment==null){
                            reyifragment=new ReyiFragment();
                            transaction2.add(R.id.rl_container,reyifragment);
                        }else{
                            transaction2.show(reyifragment);
                        }
                        break;
                    case R.id.rb_2:
                        if(orderformfragment==null){
                            orderformfragment=new OrderFormFragment();

                            Integer yes=2;
                            Bundle bundle = new Bundle();
                            bundle.putInt("yes",yes);
                            orderformfragment.setArguments(bundle);
                            transaction2.add(R.id.rl_container,orderformfragment);
                        }else{
                            transaction2.show(orderformfragment);
                        }
                        break;
                    case R.id.rb_3:
                        if(homePagefragment==null){
                            homePagefragment=new HomePageFragment();
                            transaction2.add(R.id.rl_container,homePagefragment);
                        }else{
                            transaction2.show(homePagefragment);
                        }
                        break;
                    case R.id.rb_4:
                        if(personalfragment==null){
                            personalfragment=new PersonalFragment();
                            transaction2.add(R.id.rl_container,personalfragment);
                        }else{
                            transaction2.show(personalfragment);
                        }
                        break;
                    case R.id.rb_5:
                        if(settingfragment==null){
                            settingfragment=new SettingFragment();
                            transaction2.add(R.id.rl_container,settingfragment);
                        }else{
                            transaction2.show(settingfragment);
                        }
                        break;
                }
                transaction2.commit();
            }
        });
    }
}
