package com.example.helloandroid.search;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.helloandroid.R;

import org.w3c.dom.Text;

import java.util.List;

public class SearchRecyclerAdapter extends RecyclerView.Adapter<SearchRecyclerAdapter.SearchRecyclerViewHolder>{
    private List<SearchItemObject> itemObjectList;

    public void setItemObjectList(List<SearchItemObject> itemObjectList) {
        this.itemObjectList = itemObjectList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SearchRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.search_item_view, parent, false);
        return new SearchRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchRecyclerViewHolder holder, int position) {
        SearchItemObject searchItemObject = itemObjectList.get(position);
        holder.kdaTextView.setText(searchItemObject.getKda());
        holder.winTextView.setText(searchItemObject.getWin());
        holder.gameTimeTextView.setText(searchItemObject.getGameTime());
        Glide.with(holder.championImageView.getContext()).load(searchItemObject.getChampion())
                .into(holder.championImageView);
        Glide.with(holder.itemImageView.getContext()).load(searchItemObject.getItem()[0])
                .into(holder.itemImageView);
        Glide.with(holder.item2ImageView.getContext()).load(searchItemObject.getItem()[1])
                .into(holder.item2ImageView);
        Glide.with(holder.item3ImageView.getContext()).load(searchItemObject.getItem()[2])
                .into(holder.item3ImageView);
        Glide.with(holder.item4ImageView.getContext()).load(searchItemObject.getItem()[3])
                .into(holder.item4ImageView);
        Glide.with(holder.item5ImageView.getContext()).load(searchItemObject.getItem()[4])
                .into(holder.item5ImageView);
        Glide.with(holder.item6ImageView.getContext()).load(searchItemObject.getItem()[5])
                .into(holder.item6ImageView);

        // 스펠 이미지 불러오는 코드
        Glide.with(holder.spellImageView.getContext()).load(searchItemObject.getSpell()[0])
                .into(holder.spellImageView);
        Glide.with(holder.spell2ImageView.getContext()).load(searchItemObject.getSpell()[1])
                .into(holder.spell2ImageView);
        // 룬 이미지 불러오는 코드
        Glide.with(holder.runesImageView.getContext()).load(searchItemObject.getRunes()[0])
                .into(holder.runesImageView);
        Glide.with(holder.runes2ImageView.getContext()).load(searchItemObject.getRunes()[1])
                .into(holder.runes2ImageView);

        // 장신구
        Glide.with(holder.totemImageView.getContext()).load(searchItemObject.getTotem())
                .into(holder.totemImageView);
    }

    @Override
    public int getItemCount() {
        return itemObjectList.size();
    }

    static class SearchRecyclerViewHolder extends RecyclerView.ViewHolder{
        private TextView winTextView;
        private TextView gameTimeTextView;
        private TextView kdaTextView;
        private ImageView championImageView;
        private ImageView spellImageView;
        private ImageView spell2ImageView;
        private ImageView runesImageView;
        private ImageView runes2ImageView;
        private ImageView itemImageView;
        private ImageView item2ImageView;
        private ImageView item3ImageView;
        private ImageView item4ImageView;
        private ImageView item5ImageView;
        private ImageView item6ImageView;
        private ImageView totemImageView;
        public SearchRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            championImageView = itemView.findViewById(R.id.championImageView);
            winTextView = itemView.findViewById(R.id.win_textView);
            gameTimeTextView = itemView.findViewById(R.id.gametime_textView);
            kdaTextView = itemView.findViewById(R.id.kda_textView);
            spellImageView = itemView.findViewById(R.id.spell_imageView);
            spell2ImageView = itemView.findViewById(R.id.spell2_imageView);
            runesImageView = itemView.findViewById(R.id.runes_imageView);
            runes2ImageView = itemView.findViewById(R.id.runes2_imageView);
            itemImageView = itemView.findViewById(R.id.item_imageView);
            item2ImageView = itemView.findViewById(R.id.item2_imageView);
            item3ImageView = itemView.findViewById(R.id.item3_imageView);
            item4ImageView = itemView.findViewById(R.id.item4_imageView);
            item5ImageView = itemView.findViewById(R.id.item5_imageView);
            item6ImageView = itemView.findViewById(R.id.item6_imageView);
            totemImageView = itemView.findViewById(R.id.totem_imageView);
        }
    }
}
