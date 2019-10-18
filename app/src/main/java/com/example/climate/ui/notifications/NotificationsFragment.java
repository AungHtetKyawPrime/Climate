package com.example.climate.ui.notifications;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.Toast;

import com.example.climate.Adapter.DcAdapter;
import com.example.climate.ModelDC;
import com.example.climate.R;
import com.example.climate.RecyWaste.HomeWaste;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {
    List<ModelDC> data_rcy=new ArrayList<>();
    RecyclerView recy_recyclerView;
    DcAdapter adapter_rcy;
    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_helpcenter, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recy_recyclerView = view.findViewById(R.id.recycler_dc);
        // add a divider after each item for more clarity
        adapter_rcy = new DcAdapter(data_rcy,getContext());
        recy_recyclerView.setHasFixedSize(true);
        recy_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recy_recyclerView.setAdapter(adapter_rcy);
        populategroceryList();
    }

    private void populategroceryList() {
        ModelDC mc=new ModelDC("သင်္ဃန်းကျွန်း","၀၉-၄၅၃၈၉၁၇၆၀");
        ModelDC mc1=new ModelDC("တောင်ဥက္ကလာပ","၀၉-၄၅၃၈၉၁၇၆၆");
        ModelDC mc2=new ModelDC("မြောက်ဥက္ကလာပ","၀၉-၄၅၃၈၉၁၇၇၂");
        ModelDC mc3=new ModelDC("ရွှေပေါက္ကံ","၀၉-၄၅၃၈၉၁၇၇၃");
        ModelDC mc4=new ModelDC("ဒဂုံမြောက်","၀၉-၄၅၃၈၉၁၇၇၆");
        ModelDC mc5=new ModelDC("ဒဂုံတောင်","၀၉-၄၅၃၈၉၁၇၈၀");
        ModelDC mc6=new ModelDC("ဒဂုံအရှေ့","၀၉-၄၅၃၈၉၁၇၈၃");
        ModelDC mc7=new ModelDC("ကျောက်တံတား","၀၉-၄၅၃၈၉၁၇၉၄");
        data_rcy.add(mc);
        data_rcy.add(mc1);
        data_rcy.add(mc2);
        data_rcy.add(mc3);
        data_rcy.add(mc4);
        data_rcy.add(mc5);
        data_rcy.add(mc6);
        data_rcy.add(mc7);

        adapter_rcy.notifyDataSetChanged();
    }


}