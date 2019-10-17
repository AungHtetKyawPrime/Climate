package com.example.climate.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.climate.Model;
import com.example.climate.R;

import java.util.ArrayList;
import java.util.List;

public class HomeRecyAdapter extends RecyclerView.Adapter<HomeRecyAdapter.ViewHolder> {
  private List<Model> data=new ArrayList<>();
  Context context;
  public HomeRecyAdapter(List<Model> data, Context context){
      this.context=context;
      this.data=data;
  }
    @NonNull
    @Override
    public HomeRecyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View groceryProductView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items_home_r2ecy, viewGroup, false);
        ViewHolder gvh = new ViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyAdapter.ViewHolder viewHolder, int i) {
        Model model=data.get(i);
        viewHolder.imageView.setImageResource(model.getImage());
        viewHolder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
      ImageView imageView;
      TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_home_r2ecy);
            textView=itemView.findViewById(R.id.txt_for_home_r2ecy);
        }
    }
}
