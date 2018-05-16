package com.lxh.mybook.ui.fragment;

import com.lxh.mybook.BR;
import com.lxh.mybook.R;
import com.lxh.mybook.base.MyBaseFragment;
import com.lxh.mybook.databinding.FragmentUserBinding;
import com.lxh.mybook.databinding.FragmentVideoBinding;
import com.lxh.mybook.ui.vm.FragmentUserViewModel;
import com.lxh.mybook.ui.vm.FragmentVideoViewModel;

public class UserFragment extends MyBaseFragment<FragmentUserBinding,FragmentUserViewModel> {
    @Override
    public int initContentView() {
        return R.layout.fragment_user;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public FragmentUserViewModel initViewModel() {
        return new FragmentUserViewModel();
    }
}
