package com.example.retrofitexample.Model;

import com.example.retrofitexample.Presenter.HeroListPresenter;
import com.example.retrofitexample.View.HeroListView;

public class ListImplementation implements HeroListPresenter {

    private HeroListView _heroListView;

    public ListImplementation(HeroListView heroListView){
        this._heroListView = heroListView;
    }

    @Override
    public void GetList(String[] name) {

    }
}
