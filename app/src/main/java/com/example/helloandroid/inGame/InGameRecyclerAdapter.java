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

/**
 * 인게임 화면의 Recycler를 구성하는 Adapter
 *
 * @author 고동현
 * @since 2021-11-20
 */
public class InGameRecyclerAdapter extends RecyclerView.Adapter<InGameRecyclerAdapter.InGameRecyclerViewHolder> {

    /**
     * 인게임 화면을 표시하는데 필요한 데이터 리스트
     */
    private List<InGameDataObject> inGameDataObjectList;

    /**
     * 인게임 화면을 표시하는데 필요한 데이터 리스트를 set한다.
     * notifyDataSetChanged()를 호출하여 RecyclerView를 다시 구성한다.
     *
     * @param inGameDataObjectList inGameDataObjectList
     */
    public void setInGameDataObjectList(List<InGameDataObject> inGameDataObjectList) {
        this.inGameDataObjectList = inGameDataObjectList;
        notifyDataSetChanged();
    }

    /**
     * ViewHolder 구성시 호출
     *
     * @param parent   parentView
     * @param viewType
     * @return ViewHolder
     */
    @NonNull
    @Override
    public InGameRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.in_game_item_view, parent, false);
        return new InGameRecyclerViewHolder(view);
    }

    /**
     * ViewHolder Bind시 호출
     *
     * @param holder   ViewHolder
     * @param position RecyclerView의 position
     */
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
            color = "#b2ebf4";
        } else {
            color = "#ff9595";
        }
        holder.inGameLinearLayout.setBackgroundColor(Color.parseColor(color));
    }

    /**
     * DataObject 전체 크기를 return 함
     *
     * @return DataObject 전체 크기
     */
    @Override
    public int getItemCount() {
        return inGameDataObjectList.size();
    }

    /**
     * ImageView에 이미지를 로드한다.
     *
     * @param imageView 넣을 imageView 공간
     * @param url       넣을 image url
     */
    private static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }

    /**
     * 인게임 화면 ViewHolder
     */
    static class InGameRecyclerViewHolder extends RecyclerView.ViewHolder {
        /**
         * 인게임 전체를 가리키는 LinearLayout
         * 색상(Blue, Red)을 표기하기 위해 가져온다.
         */
        private LinearLayout inGameLinearLayout;
        /**
         * 챔피언 ImageView
         */
        private ImageView championImageView;
        /**
         * 스펠 ImageView
         */
        private ImageView spell1ImageView;
        /**
         * 스펠 ImageView
         */
        private ImageView spell2ImageView;
        /**
         * 룬 ImageView
         */
        private ImageView rune1ImageView;
        /**
         * 룬 ImageView
         */
        private ImageView rune2ImageView;
        /**
         * 닉네임 TextView
         */
        private TextView nicknameTextView;
        /**
         * 승률 TextView
         */
        private TextView winRateTextView;
        /**
         * 티어 ImageView
         */
        private ImageView tearImageView;
        /**
         * 티어 TextView
         */
        private TextView tearTextView;

        /**
         * 생성자로서 View를 바인딩한다.
         *
         * @param itemView inflatedLayout
         */
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
