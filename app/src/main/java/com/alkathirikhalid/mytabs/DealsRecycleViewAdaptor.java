package com.alkathirikhalid.mytabs;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Project MyTabs
 * Date: 8/22/2018 Time: 2:09 AM
 *
 * @author alkathirikhalid
 */

public class DealsRecycleViewAdaptor extends RecyclerView.Adapter<DealsRecycleViewAdaptor.DealsRecycleViewHolder> {

    private ArrayList<String> mDataset;
    private int selectedItem = -1;

    public DealsRecycleViewAdaptor(ArrayList<String> myDataset) {
        this.mDataset = myDataset;
    }

    @Override
    public DealsRecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_deals, parent, false);
        return new DealsRecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DealsRecycleViewHolder holder, int position) {
        holder.tvDeals.setText(mDataset.get(position));
        if (position == selectedItem) {
            holder.itemView.setBackgroundColor(Color.GREEN);
        } else {
            holder.itemView.setBackgroundColor(Color.TRANSPARENT);
        }

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    class DealsRecycleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvDeals;

        public DealsRecycleViewHolder(View itemView) {
            super(itemView);
            tvDeals = itemView.findViewById(R.id.deals);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            selectedItem = getAdapterPosition();
            notifyDataSetChanged();
        }
    }
}
