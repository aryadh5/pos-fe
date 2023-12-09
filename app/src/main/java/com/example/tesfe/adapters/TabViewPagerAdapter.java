package com.example.tesfe.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tesfe.fragments.CategoryFragment;
import com.example.tesfe.fragments.ProductFragment;

public class TabViewPagerAdapter extends FragmentStateAdapter {

    public TabViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ProductFragment();
            case 1:
                return new CategoryFragment();
            default:
                return new ProductFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
