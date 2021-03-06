package kr.co.tjoeun.a20200319_02_fragment02.adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import kr.co.tjoeun.a20200319_02_fragment02.fragments.ChickenStoreFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter {


    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new ChickenStoreFragment();
        }
        else{
            return new ChickenStoreFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
