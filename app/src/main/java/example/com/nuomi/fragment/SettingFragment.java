package example.com.nuomi.fragment;

import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import example.com.nuomi.R;
import example.com.nuomi.myview.SlideButton;

public class SettingFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.setting_fragment, null);

        TextView logout= (TextView) v.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
                builder.setIcon(R.drawable.personaltwo);
                builder.setTitle("注销");
                builder.setMessage("您是否退出");
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getActivity(), "你点击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getActivity(), "你点击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });

//        SlideButton slide= (SlideButton) v.findViewById(R.id.slide);
//        slide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                View layout = View.inflate(getContext(), R.layout.activity_car,null);
//                Button spend= (Button) layout.findViewById(R.id.spend);
//                spend.setText("开启");
//            }
//        });


        return v;

    }
}
