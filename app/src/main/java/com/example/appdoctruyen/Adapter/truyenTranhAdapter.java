package com.example.appdoctruyen.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.appdoctruyen.R;
import com.example.appdoctruyen.object.truyentranh;

import java.util.ArrayList;
import java.util.List;

public class truyenTranhAdapter extends ArrayAdapter<truyentranh> {

    private Context ct;
    private ArrayList<truyentranh> arrayList;

    public void sorTruyen(String s){
        s = s.toUpperCase();
        int k=0;
        for (int i = 0; i< arrayList.size();i++){
            truyentranh t = arrayList.get(i);
            String ten = t.getTentruyen().toUpperCase();
            if(ten.indexOf(s) >= 0){
                arrayList.set(i,arrayList.get(k));
                arrayList.set(k,t);
                k++;
            }
        }
        notifyDataSetChanged();
    }
    public truyenTranhAdapter(@NonNull Context context, int resource, @NonNull List<truyentranh> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arrayList = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_truyen, parent, false);
        }

        if (arrayList.size() > 0) {
            truyentranh truyen = arrayList.get(position);

            TextView tentruyentranh = convertView.findViewById(R.id.txtTentruyen);
            TextView tenchap = convertView.findViewById(R.id.txtTenchap);
            ImageView imganhtruyen = convertView.findViewById(R.id.imgAnhTruyen);

            tentruyentranh.setText(truyen.getTentruyen());
            tenchap.setText(truyen.getTenchap());
            Glide.with(ct).load(truyen.getLinkanh()).into(imganhtruyen);
        }

        return convertView;
    }
}
