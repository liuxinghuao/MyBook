package com.lxh.mybook.ui.activity;


import com.lxh.mybook.BR;
import com.lxh.mybook.R;
import com.lxh.mybook.base.MyBaseActivity;
import com.lxh.mybook.databinding.ActivityHomeBinding;
import com.lxh.mybook.ui.vm.HomeViewModel;


public class HomeActivity extends MyBaseActivity<ActivityHomeBinding,HomeViewModel> {


    @Override
    public int initContentView() {
        return R.layout.activity_home;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public HomeViewModel initViewModel() {
        return new HomeViewModel(this,binding.vpHorizontalNtb,binding.ntbHorizontal,getSupportFragmentManager());
    }
}
