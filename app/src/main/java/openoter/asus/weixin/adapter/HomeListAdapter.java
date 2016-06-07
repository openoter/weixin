package openoter.asus.weixin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import openoter.asus.weixin.R;
import openoter.asus.weixin.model.ItemHomeBean;

/**
 * Created by asus on 2016/6/7.
 */
public class HomeListAdapter extends BaseAdapter {
    private List<ItemHomeBean> list;
    private LayoutInflater inflater;

    private ImageView iv_avatar;
    private TextView tv_name;
    private TextView tv_time;
    private TextView tv_content;

    public HomeListAdapter(Context context, List<ItemHomeBean> list) {
        this.list = list;
        inflater = LayoutInflater.from(context);
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
        View view = inflater.inflate(R.layout.item_home_list, null);
        findViews(view);
        setDataByList(position);
        return view;
    }

    private void setDataByList(int position) {
        ItemHomeBean bean = list.get(position);
        iv_avatar.setImageResource(bean.ImageResId);
        tv_time.setText(bean.time);
        tv_name.setText(bean.GroupName);
        tv_content.setText(bean.msgContent);
    }

    private void findViews(View view) {
        iv_avatar = (ImageView) view.findViewById(R.id.iv_avatar);
        tv_time = (TextView) view.findViewById(R.id.tv_time);
        tv_name = (TextView) view.findViewById(R.id.tv_name);
        tv_content = (TextView) view.findViewById(R.id.tv_content);
    }
}
