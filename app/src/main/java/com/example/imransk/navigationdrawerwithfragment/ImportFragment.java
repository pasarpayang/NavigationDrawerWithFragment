package com.example.imransk.navigationdrawerwithfragment;

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

public class ImportFragment extends Fragment {
    ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_import,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView=view.findViewById(R.id.listitemofimport);
        String[] heading={"Hello","Ami","Tumi","She"};
        String[] discription={"hello discription","ami discription","Tumi discription","She discription"};
        int[] images = {};
        CoustomAdapter coustomAdapter = new CoustomAdapter(ImportFragment.this,heading,discription,images);
        listView.setAdapter(coustomAdapter);

    }
}
