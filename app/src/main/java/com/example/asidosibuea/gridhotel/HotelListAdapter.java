package com.example.asidosibuea.gridhotel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by asidosibuea on 10/12/17.
 */

public class HotelListAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private ArrayList<Hotel> hotelsList;

    public HotelListAdapter(Context context, int layout, ArrayList<Hotel> hotelsList) {
        this.context = context;
        this.layout = layout;
        this.hotelsList = hotelsList;
    }

    @Override
    public int getCount() {
        return hotelsList.size();
    }

    @Override
    public Object getItem(int position) {
        return hotelsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txtName, txtAddress;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.txtName = (TextView) row.findViewById(R.id.txtName);
            holder.txtAddress = (TextView) row.findViewById(R.id.txtAddress);
            holder.imageView = (ImageView) row.findViewById(R.id.imgHotel);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        Hotel hotel = hotelsList.get(position);

        holder.txtName.setText(hotel.getName());
        holder.txtAddress.setText(hotel.getAddress());

        byte[] hotelImage = hotel.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(hotelImage, 0, hotelImage.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
