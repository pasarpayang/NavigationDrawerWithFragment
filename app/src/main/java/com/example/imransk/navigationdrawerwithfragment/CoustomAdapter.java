package com.example.imransk.navigationdrawerwithfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        context = importFragment;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
