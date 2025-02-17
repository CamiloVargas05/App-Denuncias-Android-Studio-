package com.example.bioterra.menus;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {

    int numoftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numoftabs = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new inicio();
            case 1:
                return new denuncia();
            case 2:
                return new tabs_global();
            case 3:
                return new moneda();
            case 4:
                return new administrador();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}