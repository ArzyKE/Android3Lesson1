package com.example.android3lesson1.ui.activity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android3lesson1.models.NameModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {

    public MutableLiveData<List<NameModel>> mutableLiveData = new MutableLiveData();
    public ArrayList<NameModel> list = new ArrayList<>();

    public ArrayList<NameModel> getList() {
        list.add(new NameModel("Alexander"));
        list.add(new NameModel("Fatima"));
        list.add(new NameModel("Aslan"));
        list.add(new NameModel("Amman"));
        mutableLiveData.setValue(list);
        return list;
    }
}