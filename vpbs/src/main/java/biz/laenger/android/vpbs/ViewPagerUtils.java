package biz.laenger.android.vpbs;

import android.view.View;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerUtils {

    public static View getCurrentView(ViewPager viewPager) {
        final int currentItem = viewPager.getCurrentItem();
        for (int i = 0; i < viewPager.getChildCount(); i++) {
            final View child = viewPager.getChildAt(i);
            final ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) child.getLayoutParams();
            /*if (!layoutParams.isDecor && currentItem == layoutParams.position) {
                return child;
            }*/
            if (i==1){
                return child;
            }
        }
        return null;
    }

    public static View getCurrentView(ViewPager2 viewPager) {
        final int currentItem = viewPager.getCurrentItem();
        for (int i = 0; i < viewPager.getChildCount(); i++) {
            /*final View child = viewPager.getChildAt(i);
            final ViewPager2.LayoutParams layoutParams = child.getLayoutParams();*/
            View child=viewPager.getChildAt(currentItem);
            /*if (!layoutParams.isDecor && currentItem == layoutParams.position) {
                return child;
            }*/
            if (child!=null){
                return child;
            }
        }
        return null;
    }

}
