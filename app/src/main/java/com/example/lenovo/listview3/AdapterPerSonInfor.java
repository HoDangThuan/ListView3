package com.example.lenovo.listview3;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lenovo on 07-Mar-18.
 */

public class AdapterPerSonInfor extends BaseAdapter{
    private Context context;
    private int layout;
    private List<PerSonInformation> listPerSon;


    public AdapterPerSonInfor(Context context, int layout, List<PerSonInformation> listPerSon) {
        this.context = context;
        this.layout = layout;
        this.listPerSon = listPerSon;
    }

    @Override
    public int getCount() {
        return listPerSon.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,null);

        // ánh xạ convertView
        ImageView imgPerSon= (ImageView) convertView.findViewById(R.id.imagePerSon);
        ImageView imgStar= (ImageView) convertView.findViewById(R.id.imageViewStar);
        ImageView imgNext= (ImageView) convertView.findViewById(R.id.imageNext);
        TextView txtName= (TextView) convertView.findViewById(R.id.txtViewName);
        TextView txtTime= (TextView) convertView.findViewById(R.id.txtViewTime);
        TextView txtDistance= (TextView) convertView.findViewById(R.id.txtViewDistance);
        TextView txtScore= (TextView) convertView.findViewById(R.id.txtViewScore);

        // gán giá trị
        PerSonInformation perSon=listPerSon.get(position);

        imgPerSon.setImageResource(perSon.getPerSon());
        imgStar.setImageResource(perSon.getStar());
        imgNext.setImageResource(perSon.getNext());
        txtName.setText(perSon.getName());

        txtDistance.setText(Float.toString(perSon.getDistance())+" Miles Away");

        txtScore.setText(Float.toString(perSon.getScore()));

        if(perSon.getTime()>0) {
            ImageView imgDotOff= (ImageView) convertView.findViewById(R.id.imageViewDotOff);
            imgDotOff.setImageResource(perSon.getDotOff());
            txtTime.setTextColor(Color.argb(200, 111,111,111));
            txtTime.setText(Float.toString(perSon.getTime()) + " hours ago");
        }
        else {
            ImageView imgDot= (ImageView) convertView.findViewById(R.id.imageViewDot);
            imgDot.setImageResource(perSon.getDot());
            txtTime.setText("Online");
        }
        return convertView;
    }
}
