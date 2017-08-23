package com.example.segundoauqui.mvp_dagger.view.mainactivity;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by segundoauqui on 8/22/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {


    private static final String TAG = "MainActivityContractTag";
    MainActivityContract.View view;
    Context context;



    @Override
    public void attachView(MainActivityContract.View view) {
        this.view = view;

    }

    @Override
    public void removeView() {
        this.view = null;

    }

    @Override
    public void savePerson(String person) {
        //Log.d(TAG, "savePerson: " + person);
        SharedPreferences sharedPreference = context.getSharedPreferences("myPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreference.edit();
        editor.putString("person", person);
        boolean isSaved = editor.commit();
        view.isPersonSaved(isSaved);

    }

    @Override
    public String getPerson() {
        String person;
        SharedPreferences sharepreference = context.getSharedPreferences("myPref", Context.MODE_PRIVATE);
        person =sharepreference.getString("value", "default");
        return person;

    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
