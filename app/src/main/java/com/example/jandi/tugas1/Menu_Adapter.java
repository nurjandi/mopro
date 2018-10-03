package com.example.jandi.tugas1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dimas Maulana on 5/26/17.
 * Email : araymaulana66@gmail.com
 */

public class Menu_Adapter extends RecyclerView.Adapter<Menu_Adapter.MenuViewHolder> {


    private ArrayList<Model_Pesanan> dataList;

    public Menu_Adapter(ArrayList<Model_Pesanan> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.daftar_pesanan, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtTotal.setText(dataList.get(position).getTotal());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtTotal;

        public MenuViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.makanan1);
            txtTotal = (TextView) itemView.findViewById(R.id.jumlah);
        }
    }
}
