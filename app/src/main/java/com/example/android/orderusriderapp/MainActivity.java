package com.example.android.orderusriderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Orders orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        orders = new Orders();
        ListView orderListView = (ListView) findViewById(R.id.order_list_view);
        MyAdapter myAdapter = new MyAdapter();
        orderListView.setAdapter(myAdapter);
    }


    public class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return orders.orders.size();
        }

        @Override
        public Object getItem(int position) {
            return orders.orders.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_item, parent, false);
            }

            ((TextView) convertView.findViewById(R.id.order_arrival_time_text_view))
                    .setText(((Orders.Order) getItem(position)).time);
            ((TextView) convertView.findViewById(R.id.store_name))
                    .setText(((Orders.Order) getItem(position)).store);
            ((TextView) convertView.findViewById(R.id.payment_method))
                    .setText(((Orders.Order) getItem(position)).payment);
            return convertView;
        }
    }
}

