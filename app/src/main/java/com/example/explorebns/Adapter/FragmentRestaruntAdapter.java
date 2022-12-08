package com.example.explorebns;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class FragmentRestaruntAdapter extends FragmentStatePagerAdapter {
    private List<Fragment>fragments;

    public FragmentRestaruntAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

 public  void addFragment(Fragment fragment){
       fragments.add(fragment);
 }
    @NonNull
    @Override
    public Fragment getItem(int position) {
       return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }
}
