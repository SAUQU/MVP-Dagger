package com.example.segundoauqui.mvp_dagger.injection.mainactivity;

import com.example.segundoauqui.mvp_dagger.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by segundoauqui on 8/22/17.
 */
@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
