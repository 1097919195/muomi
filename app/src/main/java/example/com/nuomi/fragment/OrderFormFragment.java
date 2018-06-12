package example.com.nuomi.fragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import example.com.nuomi.R;
import example.com.nuomi.Restaurant.ALongMeiShi;

public class OrderFormFragment extends Fragment {

    private Button gogo;
    View v1,v2;
    Integer yes;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v1=inflater.inflate(R.layout.orderform_fragment, null);



        Bundle bundle = getArguments();
        yes=bundle.getInt("yes",0);
        if(yes==1){

            v2=inflater.inflate(R.layout.orderform_have_fragment, null);
            return v2;
        }if (yes==2){
            gogo= (Button) v1.findViewById(R.id.gogo);
            gogo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(getActivity(),ALongMeiShi.class);
                    startActivity(i);
                }
            });

        }
        return v1;
    }
}
