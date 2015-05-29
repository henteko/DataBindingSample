package com.henteko07.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.henteko07.databindingsample.BR;

/**
 * Created by henteko on 5/29/15.
 */
public class User extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
}

