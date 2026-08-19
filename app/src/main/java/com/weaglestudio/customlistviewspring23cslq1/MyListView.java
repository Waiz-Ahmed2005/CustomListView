package com.weaglestudio.customlistviewspring23cslq1;
import android.widget.*;
import java.util.*;
import android.content.*;
import android.view.*;

public class MyListView extends ArrayAdapter<String>{

    List<String> names;
    List<Integer> imgs;


    public MyListView(Context context,List<String> names,List<Integer> imgs){
        super(context,R.layout.list_item,names);
        this.names=names;
        this.imgs=imgs;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        ViewHolder viewHolder;
        if(convertView==null){
            convertView=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

            viewHolder=new ViewHolder();
            viewHolder.txt=convertView.findViewById(R.id.txt);
            viewHolder.img=convertView.findViewById(R.id.img);

            convertView.setTag(viewHolder);


        }
        else{
            viewHolder=(ViewHolder) convertView.getTag();

        }
        viewHolder.txt.setText(names.get(position));
        viewHolder.img.setImageResource(imgs.get(position));
        return convertView;
    }
    public class ViewHolder{
        TextView txt;
        ImageView img;
    }



}


