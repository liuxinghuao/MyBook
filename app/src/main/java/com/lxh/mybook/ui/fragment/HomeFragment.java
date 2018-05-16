package com.lxh.mybook.ui.fragment;

import com.lxh.mybook.BR;
import com.lxh.mybook.R;
import com.lxh.mybook.base.MyBaseFragment;
import com.lxh.mybook.databinding.FragmentHomeBinding;
import com.lxh.mybook.ui.vm.FragmentHomeViewModel;

import me.goldze.mvvmhabit.base.BaseViewModel;

public class HomeFragment extends MyBaseFragment<FragmentHomeBinding,FragmentHomeViewModel> {
    @Override
    public int initContentView() {
        return R.layout.fragment_home;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public FragmentHomeViewModel initViewModel() {
        return new FragmentHomeViewModel();
    }
}
