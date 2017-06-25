package text.bawei.com.disanzhou_b.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import text.bawei.com.disanzhou_b.R;

/**
 * Created by 王占军
 * on 2017/6/24.
 * 类的用途:
 */

public class Lianxi_Adapter extends BaseAdapter {
    private Context context;
    private String[] str = {"好友", "同学", "家人", "同事"};

    public Lianxi_Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return str.length;
    }

    @Override
    public Object getItem(int position) {
        return str[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolder vh = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.lianxi_item, null);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.lianxi.setText(str[position]);

        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public TextView lianxi;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.lianxi = (TextView) rootView.findViewById(R.id.lianxi);
        }

    }


}

