package com.alkathirikhalid.mytabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Project MyTabs
 * Date: 8/22/2018 Time: 1:24 AM
 * A placeholder fragment containing a simple view.
 *
 * @author alkathirikhalid
 */

public class DealsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public DealsFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static DealsFragment newInstance(int sectionNumber) {
        DealsFragment fragment = new DealsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_deals, container, false);
        recyclerView = view.findViewById(R.id.rv_fragment_deals);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        // Dummy Data
        ArrayList<String> myData;
        myData = new ArrayList<>();

        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1:
                myData.add("1");
                myData.add("2");
                myData.add("3");
                myData.add("4");
                break;
            case 2:
                myData.add("One");
                myData.add("Two");
                myData.add("Three");
                myData.add("Four");
                break;
        }

        adapter = new DealsRecycleViewAdaptor(myData);
        recyclerView.setAdapter(adapter);
        return view;
    }
}