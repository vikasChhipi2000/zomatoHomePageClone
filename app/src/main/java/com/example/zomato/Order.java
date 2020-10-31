package com.example.zomato;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Order#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Order extends Fragment {


    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    private static ArrayList<Restaurants> zomatoList ;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Order() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Order.
     */
    // TODO: Rename and change types and number of parameters
    public static Order newInstance(String param1, String param2) {
        Order fragment = new Order();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
                zomatoList = new ArrayList<>();

        Restaurants restaurant = new Restaurants("Burger King",40,30,new String[]{"Fast Food","Burger"},150,false,3.5,"Open");
        zomatoList.add(restaurant);
        restaurant = new Restaurants("Dominos",10,30,new String[]{"Pizza","Fast Food"},300,false,4.5,"Open");
        zomatoList.add(restaurant);
        zomatoList.add(restaurant);
        zomatoList.add(restaurant);
        restaurant = new Restaurants("Pind Balluchi",30,30,new String[]{"North Indian"},150,false,4,"Open");
        zomatoList.add(restaurant);
        zomatoList.add(restaurant);
        zomatoList.add(restaurant);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order, container, false);


        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recycler_shops);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new RecylerViewAdt(zomatoList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}