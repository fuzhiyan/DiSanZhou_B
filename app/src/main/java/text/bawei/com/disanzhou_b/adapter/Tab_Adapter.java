package text.bawei.com.disanzhou_b.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import text.bawei.com.disanzhou_b.fragments.LianXiFragment;
import text.bawei.com.disanzhou_b.fragments.LiaoTianFragment;

/**
 * Created by 王占军
 * on 2017/6/24.
 * 类的用途:
 */

public class Tab_Adapter extends FragmentPagerAdapter {

    String[] arr = {"聊天", "联系人"};

    public Tab_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LiaoTianFragment();
        }
        if (position == 1) {
            return new LianXiFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return arr[position];
    }
}
