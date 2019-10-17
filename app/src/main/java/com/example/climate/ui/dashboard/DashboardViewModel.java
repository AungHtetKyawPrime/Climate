package com.example.climate.ui.dashboard;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.climate.Model;
import com.example.climate.R;

import java.util.ArrayList;
import java.util.List;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<List<Model>> data;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        data  = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
        List<Model> dataOne=new ArrayList<>();
        dataOne.add(new Model("Dirty",R.drawable.dirty_city));
        dataOne.add(new Model("Dirty",R.drawable.dirty_city));
        dataOne.add(new Model("Dirty",R.drawable.dirty_city));
        dataOne.add(new Model("Dirty",R.drawable.dirty_city));
        dataOne.add(new Model("Dirty",R.drawable.dirty_city));
        dataOne.add(new Model("Dirty",R.drawable.dirty_city));
        dataOne.add(new Model("Dirty",R.drawable.dirty_city));
        data.setValue(dataOne);

    }
    public  LiveData<List<Model>> getData(){return data; }
    public LiveData<String> getText() {
        return mText;
    }
}