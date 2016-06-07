package openoter.asus.weixin.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import openoter.asus.weixin.R;
import openoter.asus.weixin.adapter.HomeListAdapter;
import openoter.asus.weixin.model.ItemHomeBean;

/**
 * Created by asus on 2016/6/6.
 */
public class HomeFragment extends Fragment {
    private ListView list;
    List<ItemHomeBean> itemHomeBeanList = new ArrayList<ItemHomeBean>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        findViews(view);
        initData();
        list.setAdapter(new HomeListAdapter(getActivity(), itemHomeBeanList));
        return view;
    }

    private void findViews(View view) {
        list = (ListView) view.findViewById(R.id.home_list);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        for(int i=0; i < 20; i++){
            itemHomeBeanList.add(new ItemHomeBean(R.drawable.w16,
                    "订阅号"+i,
                    "6月"+(6+i)+"日",
                    "魅力重庆：未来20年，这群参加高考的孩子将面临怎样的职业世界？"+i));
        }
    }

}
