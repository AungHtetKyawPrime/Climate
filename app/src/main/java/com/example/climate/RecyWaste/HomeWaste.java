package com.example.climate.RecyWaste;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.climate.Adapter.HomeRecyAdapter;
import com.example.climate.Model;
import com.example.climate.R;

import java.util.ArrayList;
import java.util.List;

public class HomeWaste extends Fragment {
    List<Model> data_rcy=new ArrayList<>();
    RecyclerView recy_recyclerView;
    HomeRecyAdapter adapter_rcy;
    public HomeWaste(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_waste_frag, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recy_recyclerView = view.findViewById(R.id.recycler_for_homer2cy);
        // add a divider after each item for more clarity
        recy_recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.HORIZONTAL));
        adapter_rcy = new HomeRecyAdapter(data_rcy,getContext());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recy_recyclerView.setLayoutManager(horizontalLayoutManager);
        recy_recyclerView.setAdapter(adapter_rcy);
        populategroceryList();
    }

    private void populategroceryList() {
        Model pap=new Model("Paper",R.drawable.paper_rec);
        Model cardb=new Model("Cardboard",R.drawable.cardboard_rect);
        Model glass=new Model("Glass",R.drawable.glass_recy);
        Model bottle=new Model("Plastic Bottle",R.drawable.plastic_recy);
        Model cans=new Model("Cans",R.drawable.cans_recyc);
        data_rcy.add(pap);
        data_rcy.add(cardb);
        data_rcy.add(glass);
        data_rcy.add(bottle);
        data_rcy.add(cans);
        adapter_rcy.notifyDataSetChanged();
    }


}
