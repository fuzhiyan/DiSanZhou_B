package text.bawei.com.disanzhou_b.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import text.bawei.com.disanzhou_b.R;
import text.bawei.com.disanzhou_b.adapter.Lianxi_Adapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class LianXiFragment extends Fragment {


    private ListView lianxi_list;

    public LianXiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lian_xi, container, false);

        initView(view);
        return view;
    }

    private void initView(View view) {
        lianxi_list = (ListView) view.findViewById(R.id.lianxi_list);

        Lianxi_Adapter adapter = new Lianxi_Adapter(getActivity());
        lianxi_list.setAdapter(adapter);
    }
}
