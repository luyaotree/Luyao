package com.luyao.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.up.luyao.R;

import java.util.List;

/**
 * 描述：
 *
 * @author luyao
 * @date 2018/1/31 10:15
 */
public abstract class RvActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RvAdapter(getList()));
    }

    public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHoler>{

        private List<MenuModel> list;

        public RvAdapter(List<MenuModel> list) {
            this.list = list;
        }

        @Override
        public RvAdapter.ViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHoler(LayoutInflater.from(parent.getContext()).inflate(R.layout.lv_item, parent, false));
        }

        @Override
        public void onBindViewHolder(RvAdapter.ViewHoler holder, int position) {
            holder.textView.setText(list.get(position).name);
            holder.textView.setOnClickListener(list.get(position).listener);
        }

        @Override
        public int getItemCount() {
            return list != null ? list.size() : 0;
        }

        public class ViewHoler extends RecyclerView.ViewHolder{
            TextView textView;

            public ViewHoler(View itemView) {
                super(itemView);
                textView = (TextView) itemView.findViewById(R.id.tv);
            }
        }
    }


    public static class MenuModel{
        public String name;
        private View.OnClickListener listener;

        public MenuModel(String name, View.OnClickListener listener) {
            this.name = name;
            this.listener = listener;
        }
    }

    protected abstract List<MenuModel> getList();

}
