package com.wave.libs.mvvmlibs.databindings;

import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerBindingAdapter {

    @BindingAdapter(value = {"android:pageChangeAttrChanged"}, requireAll = false)
    public static void setPageChangeAttrChanged(ViewPager view, InverseBindingListener inverseBindingListener) {
        if (view == null || inverseBindingListener == null) {
            return;
        }

        view.clearOnPageChangeListeners();
        view.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                inverseBindingListener.onChange();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @BindingAdapter(value = "android:onPageChanged", requireAll = false)
    public static void setPageChanged(ViewPager viewPager, Integer position) {
        if (viewPager == null || position == null) return;
        viewPager.setCurrentItem(position, false);
    }

    @InverseBindingAdapter(attribute = "android:onPageChanged", event = "android:pageChangeAttrChanged")
    public static Integer getPageChanged(ViewPager viewPager) {
        return viewPager.getCurrentItem();
    }

    @BindingAdapter(value = {"android:viewPagerAdapter"})
    public static void setViewPagerAdapter(ViewPager viewPager, FragmentPagerAdapter adapter) {
        if (viewPager == null || adapter == null) {
            return;
        }
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);
    }

    @BindingAdapter(value = {"android:vPAdapter"})
    public static void setVpAdapter(ViewPager viewPager, FragmentPagerAdapter adapter) {
        if (viewPager == null || adapter == null) {
            return;
        }
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(adapter);
    }

    @BindingAdapter(value = {"android:vPCurrentItem"})
    public static void setCurrentItem(ViewPager viewPager, Integer position) {
        if (viewPager == null || position == null) {
            return;
        }
        viewPager.setCurrentItem(position, false);
    }


}
