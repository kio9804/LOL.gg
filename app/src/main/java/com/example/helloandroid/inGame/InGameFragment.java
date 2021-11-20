package com.example.helloandroid.inGame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.helloandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InGameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InGameFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InGameFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InGameFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InGameFragment newInstance(String param1, String param2) {
        InGameFragment fragment = new InGameFragment();
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
        View inflateView = inflater.inflate(R.layout.fragment_in_game, container, false);
        RecyclerView inGameRecyclerView = inflateView.findViewById(R.id.in_game_recycler_view);
        inGameRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        InGameRecyclerAdapter inGameRecyclerAdapter = new InGameRecyclerAdapter();

        List<InGameDataObject> inGameDataObjects = new ArrayList<>();
        for(int i=0;i<5;i++){
            inGameDataObjects.add(new InGameDataObject(){{
                setBlueOrRed(true);
                setChampionImageUrl("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/champion/Shyvana.png");
                setNickname("닉네임칸");
                setRune1ImageUrl("https://ddragon.leagueoflegends.com/cdn/img/perk-images/Styles/Precision/PressTheAttack/PressTheAttack.png");
                setRune2ImageUrl("https://ddragon.leagueoflegends.com/cdn/img/perk-images/Styles/7200_Domination.png");
                setSpell1ImageUrl("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/spell/SummonerBoost.png");
                setSpell2ImageUrl("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/spell/SummonerBoost.png");

                setTearText("D3");
                setWinRate("55%");
                setTearImageUrl("https://opgg-com-image.akamaized.net/attach/images/20190916020813.596917.jpg");

            }});
        }

        for(int i=0;i<5;i++){
            inGameDataObjects.add(new InGameDataObject(){{
                setBlueOrRed(false);
                setChampionImageUrl("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/champion/Shyvana.png");
                setNickname("닉네임칸");
                setRune1ImageUrl("https://ddragon.leagueoflegends.com/cdn/img/perk-images/Styles/Precision/PressTheAttack/PressTheAttack.png");
                setRune2ImageUrl("https://ddragon.leagueoflegends.com/cdn/img/perk-images/Styles/7200_Domination.png");
                setSpell1ImageUrl("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/spell/SummonerBoost.png");
                setSpell2ImageUrl("https://ddragon.leagueoflegends.com/cdn/10.6.1/img/spell/SummonerBoost.png");

                setTearText("D3");
                setWinRate("55%");
                setTearImageUrl("https://opgg-com-image.akamaized.net/attach/images/20190916020813.596917.jpg");

            }});
        }

        inGameRecyclerView.setAdapter(inGameRecyclerAdapter);
        inGameRecyclerAdapter.setInGameDataObjectList(inGameDataObjects);
        inGameRecyclerView.addItemDecoration(dividerItemDecoration);
        return inflateView;
    }

}