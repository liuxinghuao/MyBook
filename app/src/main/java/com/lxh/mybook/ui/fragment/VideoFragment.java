package com.lxh.mybook.ui.fragment;

import com.lxh.mybook.BR;
import com.lxh.mybook.R;
import com.lxh.mybook.base.MyBaseFragment;
import com.lxh.mybook.databinding.FragmentComicBinding;
import com.lxh.mybook.databinding.FragmentVideoBinding;
import com.lxh.mybook.ui.vm.FragmentComicViewModel;
import com.lxh.mybook.ui.vm.FragmentVideoViewModel;

public class VideoFragment extends MyBaseFragment<FragmentVideoBinding,FragmentVideoViewModel> {
    @Override
    public int initContentView() {
        return R.layout.fragment_video;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public FragmentVideoViewModel initViewModel() {
        return new FragmentVideoViewModel();
    }
}
