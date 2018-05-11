package com.example.tiago.horizontalreciclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<ListItem> {

    private static final String TAG = "ListViewAdapter";

    private Context mContext;

    int mResource;

    public ListViewAdapter(Context context, int resource, ArrayList<ListItem> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Get the numbers info

        String number = getItem(position).getNumber();

        ListItem listItem = new ListItem(number);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView txName = (TextView) convertView.findViewById(R.id.textView);

        txName.setText(number);

        return convertView;
    }
}
