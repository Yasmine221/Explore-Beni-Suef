package com.example.explorebns.Adapter;

import android.icu.text.CaseMap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentRestaruntAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String>titles=new ArrayList<>();
    public FragmentRestaruntAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

 public  void addFragment(Fragment fragment,String title){
       fragments.add(fragment);
     titles.add(title);
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
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position) ;

    }
}
