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
import com.example.climate.ModelDC;
import com.example.climate.R;

import java.util.ArrayList;
import java.util.List;

public class DcAdapter extends RecyclerView.Adapter<DcAdapter.ViewHolder> {
  private List<ModelDC> data=new ArrayList<>();
  Context context;
  public DcAdapter(List<ModelDC> data, Context context){
      this.context=context;
      this.data=data;
  }
    @NonNull
    @Override
    public DcAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View groceryProductView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_for_help, viewGroup, false);
        ViewHolder gvh = new ViewHolder(groceryProductView);
        return gvh;
    }

    @Override
    public void onBindViewHolder(@NonNull DcAdapter.ViewHolder viewHolder, int i) {
        ModelDC model=data.get(i);
        viewHolder.name.setText(model.getName());
        viewHolder.phone.setText(model.getPhone());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
      TextView name;
      TextView phone;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name_dc);
            phone=itemView.findViewById(R.id.phone_dc);
        }
    }
}
