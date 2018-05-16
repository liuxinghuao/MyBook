package com.lxh.mybook.ui.vm;

import android.app.Activity;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lxh.mybook.R;
import com.lxh.mybook.ui.adapter.FragAdapter;
import com.lxh.mybook.ui.fragment.BookFragment;
import com.lxh.mybook.ui.fragment.ComicFragment;
import com.lxh.mybook.ui.fragment.HomeFragment;
import com.lxh.mybook.ui.fragment.VideoFragment;

import java.util.ArrayList;
import java.util.List;

import devlight.io.library.ntb.NavigationTabBar;
import me.goldze.mvvmhabit.base.BaseViewModel;

public class HomeViewModel extends BaseViewModel {

    ViewPager viewPager;
    NavigationTabBar navigationTabBar;
    Activity mActivity;
    FragmentManager fm;
public HomeViewModel(Activity activity,ViewPager vp_horizontal_ntb,NavigationTabBar ntb_horizontal,FragmentManager fm){
    super(activity);
    this.mActivity=activity;
    this.navigationTabBar=ntb_horizontal;
    this.viewPager=vp_horizontal_ntb;
    this.fm=fm;
}
    final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
    @Override
    public void onCreate() {
        super.onCreate();
        //构造适配器
        List<Fragment> fragments=new ArrayList<Fragment>();
        fragments.add(new HomeFragment());
        fragments.add(new BookFragment());
        fragments.add(new ComicFragment());
        fragments.add(new VideoFragment());
        fragments.add(new HomeFragment());
        FragAdapter adapter = new FragAdapter(fm, fragments);
        //设定适配器
        viewPager.setAdapter(adapter);
        Tab();
        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager, 0);

        navigationTabBar.setBehaviorEnabled(true);

        navigationTabBar.setOnTabBarSelectedIndexListener(new NavigationTabBar.OnTabBarSelectedIndexListener() {
            @Override
            public void onStartTabSelected(final NavigationTabBar.Model model, final int index) {
            }

            @Override
            public void onEndTabSelected(final NavigationTabBar.Model model, final int index) {
                model.hideBadge();
            }
        });
        navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {

            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });


    }

    private void Tab(){
        final String[] colors = mActivity.getResources().getStringArray(R.array.default_preview);
        models.add(
                new NavigationTabBar.Model.Builder(
                        mActivity.getResources().getDrawable(R.mipmap.icon_hometrue),
                        mActivity.getResources().getColor(R.color.colorPrimary))
                        .title("首页")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        mActivity.getResources().getDrawable(R.mipmap.icon_yuedutrue),
                        mActivity.getResources().getColor(R.color.colorPrimary))
                        .title("小说")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        mActivity.getResources().getDrawable(R.mipmap.icon_dongmantrue),
                        mActivity.getResources().getColor(R.color.colorPrimary))
                        .title("动漫")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        mActivity.getResources().getDrawable(R.mipmap.icon_shipingtrue),
                        mActivity.getResources().getColor(R.color.colorPrimary))
                        .title("视频")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        mActivity.getResources().getDrawable(R.mipmap.icon_usertrue),
                        mActivity.getResources().getColor(R.color.colorPrimary))
                        .title("个人中心")
                        .build()
        );


    }
}
