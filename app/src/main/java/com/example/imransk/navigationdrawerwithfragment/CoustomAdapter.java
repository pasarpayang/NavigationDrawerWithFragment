package com.example.imransk.navigationdrawerwithfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by imran sk on 10/17/2017.
 */

class CoustomAdapter extends BaseAdapter {
    String[] heading;
    String[] discription;
    int[] images;
    Context context;
    private static LayoutInflater inflater = null;

    public CoustomAdapter(Context importFragment, String[] heading, String[] discription, int[] images) {
        this.heading = heading;
        this.discription = discription;
        this.images = images;
        this.context = importFragment;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
public class MyHolder{
        ImageView imageView;
    TextView tv1,tv2;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyHolder myHolderObj = new MyHolder();
        view=inflater.inflate(R.layout.importlist,null);

        myHolderObj.imageView = view.findViewById(R.id.customimage);
        myHolderObj.imageView.setImageResource(images[i]);

        myHolderObj.tv1 = view.findViewById(R.id.ctv1);
        myHolderObj.tv1.setText(heading[i]);

        myHolderObj.tv2 = view.findViewById(R.id.ctv2);
        myHolderObj.tv2.setText(discription[i]);

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        return view;

    }
}
