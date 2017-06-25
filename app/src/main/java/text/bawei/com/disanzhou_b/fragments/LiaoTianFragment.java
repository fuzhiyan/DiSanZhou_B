package text.bawei.com.disanzhou_b.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import text.bawei.com.disanzhou_b.R;
import text.bawei.com.disanzhou_b.adapter.LiaoTian_Adapter;
import text.bawei.com.disanzhou_b.bean.LiaoTianBean;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiaoTianFragment extends Fragment {


    private ListView liaotian_list;

    public LiaoTianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_liao_tian, container, false);
        initView(view);
        initData();

        return view;
    }

    private void initData() {
        ArrayList<LiaoTianBean> list = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            LiaoTianBean bean;
            if (x % 2 == 0) {
                bean = new LiaoTianBean(R.mipmap.ic_launcher, "张" + x, "这里是聊天的内容" + x);
            } else {
                bean = new LiaoTianBean(R.mipmap.ic_launcher, "李" + x, "这里是聊天的内容" + x);
            }
            list.add(bean);
        }
        LiaoTian_Adapter adapter = new LiaoTian_Adapter(getActivity(), list);
        liaotian_list.setAdapter(adapter);
    }

    private void initView(View view) {
        liaotian_list = (ListView) view.findViewById(R.id.liaotian_list);
    }
}
