package com.example.imransk.navigationdrawerwithfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by imran sk on 10/17/2017.
 */

public class SlideShowFragment extends Fragment {
    ListView listView;
    Context myContext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slideshow,null);
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        myContext = getActivity().getApplication();
        listView = view.findViewById(R.id.listitemofimport);
        String[] heading = {"Hello", "Ami", "Tumi"};
        String[] discription = {"hello discription", "ami discription", "Tumi discription"};
        int[] images = {R.drawable.imran,R.drawable.imran,R.drawable.imran};
        CoustomAdapter coustomAdapter = new CoustomAdapter(myContext.getApplicationContext(), heading, discription, images);
        listView.setAdapter(coustomAdapter);
    }
}
