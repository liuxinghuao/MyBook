package com.lxh.mybook.ui.fragment;

import com.lxh.mybook.BR;
import com.lxh.mybook.R;
import com.lxh.mybook.base.MyBaseFragment;
import com.lxh.mybook.databinding.FragmentBookBinding;
import com.lxh.mybook.ui.vm.FragmentBookViewModel;

public class BookFragment extends MyBaseFragment<FragmentBookBinding,FragmentBookViewModel> {
    @Override
    public int initContentView() {
        return R.layout.fragment_book;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public FragmentBookViewModel initViewModel() {
        return new FragmentBookViewModel();
    }
}
