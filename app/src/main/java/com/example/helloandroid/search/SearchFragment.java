package com.example.helloandroid.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.helloandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflateView = inflater.inflate(R.layout.fragment_search, container, false);
        ImageView userIconView = inflateView.findViewById(R.id.usericon_imageView);
        ImageView rankIconView = inflateView.findViewById(R.id.rankicon_imageView);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        Glide.with(getContext()).load("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/profileicon/4529.png")
                .into(userIconView);

        Glide.with(getContext()).load("https://opgg-com-image.akamaized.net/attach/images/20190916020813.596917.jpg")
                .into(rankIconView);
        RecyclerView searchRecyclerView = inflateView.findViewById(R.id.searchRecyclerView);
        SearchRecyclerAdapter recyclerAdapter = new SearchRecyclerAdapter();
        searchRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<SearchItemObject> searchItemObjectList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            searchItemObjectList.add(new SearchItemObject() {{
                setWin("승");
                setKda("15/5/15");
                setGameTime("30:00");
                setChampion("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/champion/Shyvana.png");
                setItem(new String[]{"https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png"
                });
                setSpell(new String[]{"https://ddragon.leagueoflegends.com/cdn/10.6.1/img/spell/SummonerBoost.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/spell/SummonerBoost.png"});

                setRunes(new String[]{
                        "https://ddragon.leagueoflegends.com/cdn/img/perk-images/Styles/Precision/PressTheAttack/PressTheAttack.png",
                        "https://ddragon.leagueoflegends.com/cdn/img/perk-images/Styles/7200_Domination.png"});

                setTotem("https://raw.communitydragon.org/latest/plugins/rcp-be-lol-game-data/global/default/content/src/leagueclient/wardskinimages/wardhero_0.png");

            }});
            searchItemObjectList.add(new SearchItemObject() {{
                setWin("패");
                setKda("5/5/5");
                setGameTime("30:00");
                setChampion("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/champion/Shyvana.png");
                setItem(new String[]{"https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png",
                        "https://ddragon.leagueoflegends.com/cdn/10.6.1/img/item/3108.png"
                });
            }});
        }


        searchRecyclerView.setAdapter(recyclerAdapter);
        searchRecyclerView.addItemDecoration(dividerItemDecoration);
        recyclerAdapter.setItemObjectList(searchItemObjectList);

        Button predictionButton = inflateView.findViewById(R.id.prediction_button);// 승리 예측 버튼
        predictionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(inflateView).navigate(R.id.action_searchFragment_to_predictionFragment);
            }
        });

        Button inGameButton = inflateView.findViewById(R.id.ingame_button); // 인게임 버튼
        inGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(inflateView).navigate(R.id.action_searchFragment_to_inGameFragment);
            }
        });
        return inflateView;
    }
}