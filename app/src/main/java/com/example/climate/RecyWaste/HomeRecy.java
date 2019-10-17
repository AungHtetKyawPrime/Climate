package com.example.climate.RecyWaste;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.climate.Adapter.HomeRecyAdapter;
import com.example.climate.Adapter.HomeRecyAdapterOne;
import com.example.climate.Model;
import com.example.climate.R;

import java.util.ArrayList;
import java.util.List;

public class HomeRecy extends Fragment {
    List<Model> data_rcy=new ArrayList<>();
    RecyclerView recy_recyclerView;
    HomeRecyAdapterOne adapter_rcy;
    public HomeRecy(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_recy_frag, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recy_recyclerView = view.findViewById(R.id.recycler_for_homer2cy);
        // add a divider after each item for more clarity
        recy_recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.HORIZONTAL));
        adapter_rcy = new HomeRecyAdapterOne(data_rcy,getContext());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recy_recyclerView.setLayoutManager(horizontalLayoutManager);
        recy_recyclerView.setAdapter(adapter_rcy);
        populategroceryList();
    }

    private void populategroceryList() {
        Model pap=new Model("Plastic Bags",R.drawable.plastic_bag);
        Model cardb=new Model("Takeaway Coffee Cups",R.drawable.take_away_coffee);
        Model glass=new Model("Cooked Oils",R.drawable.oil_waste);
        Model bottle=new Model("Garden Wastes",R.drawable.garden_waste);
        Model cans=new Model("Electrical Things",R.drawable.electric_waste);
        data_rcy.add(pap);
        data_rcy.add(cardb);
        data_rcy.add(glass);
        data_rcy.add(bottle);
        data_rcy.add(cans);
        adapter_rcy.notifyDataSetChanged();
    }
}
