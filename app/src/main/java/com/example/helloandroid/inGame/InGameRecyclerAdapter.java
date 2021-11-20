package com.example.helloandroid.inGame;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.helloandroid.R;

import java.util.List;

public class InGameRecyclerAdapter extends RecyclerView.Adapter<InGameRecyclerAdapter.InGameRecyclerViewHolder> {

    private List<InGameDataObject> inGameDataObjectList;

    public void setInGameDataObjectList(List<InGameDataObject> inGameDataObjectList) {
        this.inGameDataObjectList = inGameDataObjectList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public InGameRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.in_game_item_view, parent, false);
        return new InGameRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InGameRecyclerViewHolder holder, int position) {
        InGameDataObject inGameDataObject = inGameDataObjectList.get(position);
        loadImage(holder.championImageView, inGameDataObject.getChampionImageUrl());
        loadImage(holder.spell1ImageView, inGameDataObject.getSpell1ImageUrl());
        loadImage(holder.spell2ImageView, inGameDataObject.getSpell2ImageUrl());
        loadImage(holder.rune1ImageView, inGameDataObject.getRune1ImageUrl());
        loadImage(holder.rune2ImageView, inGameDataObject.getRune2ImageUrl());
        holder.nicknameTextView.setText(inGameDataObject.getNickname());
        holder.winRateTextView.setText(inGameDataObject.getWinRate());
        loadImage(holder.tearImageView, inGameDataObject.getTearImageUrl());
        holder.tearTextView.setText(inGameDataObject.getTearText());
        String color = "";
        if (inGameDataObject.isBlueOrRed()) {
            color = "#8888ff";
        } else {
            color = "#ff8888";
        }
        holder.inGameLinearLayout.setBackgroundColor(Color.parseColor(color));
    }

    @Override
    public int getItemCount() {
        return inGameDataObjectList.size();
    }

    private static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }

    static class InGameRecyclerViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout inGameLinearLayout;
        private ImageView championImageView;
        private ImageView spell1ImageView;
        private ImageView spell2ImageView;
        private ImageView rune1ImageView;
        private ImageView rune2ImageView;
        private TextView nicknameTextView;
        private TextView winRateTextView;
        private ImageView tearImageView;
        private TextView tearTextView;

        public InGameRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            inGameLinearLayout = itemView.findViewById(R.id.in_game_item_linear_layout);
            championImageView = itemView.findViewById(R.id.in_game_champion_image);
            spell1ImageView = itemView.findViewById(R.id.in_game_spell1);
            spell2ImageView = itemView.findViewById(R.id.in_game_spell2);
            rune1ImageView = itemView.findViewById(R.id.in_game_rune1);
            rune2ImageView = itemView.findViewById(R.id.in_game_rune2);
            nicknameTextView = itemView.findViewById(R.id.in_game_nickname);
            winRateTextView = itemView.findViewById(R.id.in_game_win_rate);
            tearImageView = itemView.findViewById(R.id.in_game_tear_image);
            tearTextView = itemView.findViewById(R.id.in_game_tear_text);
        }


    }
}
