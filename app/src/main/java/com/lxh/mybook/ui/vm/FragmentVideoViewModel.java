package com.lxh.mybook.ui.vm;

import android.databinding.ObservableField;

import me.goldze.mvvmhabit.base.BaseViewModel;

public class FragmentVideoViewModel extends BaseViewModel {
    //绑定标题
    public ObservableField<String> title = new ObservableField<>("视频");
}
