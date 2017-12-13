package com.example.usuario.tablalayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by usuario on 13/12/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{

    private int pageCount;

    public ViewPagerAdapter(FragmentManager fm,int pageCount) {
        super(fm);
        this.pageCount = pageCount;
    }


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.pageCount = 5;
    }

    @Override
    public Fragment getItem(int position) {
        CustomFragment customFragment = null;
        Bundle bundle = new Bundle();

        switch (position) {
            case 0:
                bundle.putString(CustomFragment.KEY_MESSAGE, "Fragment 1");
                customFragment = CustomFragment.newInstance(bundle);
                break;

            case 1:
                bundle.putString(CustomFragment.KEY_MESSAGE, "Fragment 2");
                customFragment = CustomFragment.newInstance(bundle);
                break;

            case 2:
                bundle.putString(CustomFragment.KEY_MESSAGE, "Fragment 3");
                customFragment = CustomFragment.newInstance(bundle);
                break;

            case 3:
                bundle.putString(CustomFragment.KEY_MESSAGE, "Fragment 4");
                customFragment = CustomFragment.newInstance(bundle);
                break;

            case 4:
                bundle.putString(CustomFragment.KEY_MESSAGE, "Fragment 5");
                customFragment = CustomFragment.newInstance(bundle);
                break;
        }

        return customFragment;
    }

    @Override
    public int getCount() {
        return pageCount;
    }
}
