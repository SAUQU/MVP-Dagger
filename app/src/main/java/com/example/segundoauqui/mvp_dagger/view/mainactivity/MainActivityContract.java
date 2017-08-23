package com.example.segundoauqui.mvp_dagger.view.mainactivity;

import android.content.Context;

import com.example.segundoauqui.mvp_dagger.BasePresenter;
import com.example.segundoauqui.mvp_dagger.BaseView;

/**
 * Created by segundoauqui on 8/22/17.
 */

public interface MainActivityContract {

    interface View extends BaseView {

        void isPersonSaved(boolean isSaved);

        void sendPerson(String person);

    }

    interface Presenter extends BasePresenter<View> {

        void savePerson(String person);

        String getPerson();

        void setContext(Context context);
    }
}