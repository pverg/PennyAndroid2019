package br.com.fiap.penny;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Adapter extends BaseAdapter {

    private Context ctx;
    private int[] list;

    public Adapter(Context ctx, int[] list) {
        this.ctx = ctx;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.length;
    }

    @Override
    public Object getItem(int position) {
        return list[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imgView = new ImageView(ctx);
        imgView.setImageResource(list[position]);
        imgView.setAdjustViewBounds(true);

        return imgView;
    }
}
