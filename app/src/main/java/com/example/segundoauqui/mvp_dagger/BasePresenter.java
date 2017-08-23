package com.example.segundoauqui.mvp_dagger;

/**
 * Created by segundoauqui on 8/22/17.
 */

public interface BasePresenter <V extends BaseView> {

    void attachView(V view);
    void removeView();

}

