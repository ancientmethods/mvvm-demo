package com.mvvm.demo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Samer on 17/03/2017.
 */

public class User extends BaseObservable {
    private  String firstName;



    private  String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);

    }

}
