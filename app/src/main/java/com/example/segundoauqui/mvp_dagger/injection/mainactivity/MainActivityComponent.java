package com.example.segundoauqui.mvp_dagger.injection.mainactivity;

import com.example.segundoauqui.mvp_dagger.view.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by segundoauqui on 8/22/17.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
