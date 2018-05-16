package com.lxh.mybook.ui.fragment;

import com.lxh.mybook.BR;
import com.lxh.mybook.R;
import com.lxh.mybook.base.MyBaseFragment;
import com.lxh.mybook.databinding.FragmentComicBinding;
import com.lxh.mybook.databinding.FragmentHomeBinding;
import com.lxh.mybook.ui.vm.FragmentComicViewModel;
import com.lxh.mybook.ui.vm.FragmentHomeViewModel;

public class ComicFragment extends MyBaseFragment<FragmentComicBinding,FragmentComicViewModel> {
    @Override
    public int initContentView() {
        return R.layout.fragment_comic;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public FragmentComicViewModel initViewModel() {
        return new FragmentComicViewModel();
    }
}
