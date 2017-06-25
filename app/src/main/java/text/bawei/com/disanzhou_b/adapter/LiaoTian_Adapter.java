package text.bawei.com.disanzhou_b.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import text.bawei.com.disanzhou_b.R;
import text.bawei.com.disanzhou_b.bean.LiaoTianBean;

/**
 * Created by 王占军
 * on 2017/6/24.
 * 类的用途:
 */

public class LiaoTian_Adapter extends BaseAdapter {

    private Context context;
    ArrayList<LiaoTianBean> list;

    public LiaoTian_Adapter(Context context, ArrayList<LiaoTianBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.liaotian_item, null);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.liaotian_name.setText(list.get(position).getName());
        vh.liaotian_neirong.setText(list.get(position).getNeirong());

        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView liaotian_im;
        public TextView liaotian_name;
        public TextView liaotian_neirong;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.liaotian_im = (ImageView) rootView.findViewById(R.id.liaotian_im);
            this.liaotian_name = (TextView) rootView.findViewById(R.id.liaotian_name);
            this.liaotian_neirong = (TextView) rootView.findViewById(R.id.liaotian_neirong);
        }

    }
}
