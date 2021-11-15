package com.example.helloandroid;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.helloandroid.Parser.LeagueInfo;
import com.example.helloandroid.Parser.SummonerId;

import java.util.List;

public class RiotAPIClass extends Thread{
    List<LeagueInfo> leagueInfo;
    Call<SummonerId> tmp;
    String name;
    public void run() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://kr.api.riotgames.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        retrofitAPI.getSummerId(name, MainActivity.apiKey).enqueue(new Callback<SummonerId>() {
            @Override
            public void onResponse(Call<SummonerId> call, Response<SummonerId> response) {
                if (response.isSuccessful()) {
                   DataHandelObject.summonerIds = response.body();

                    retrofitAPI.getLeagueInfo(DataHandelObject.summonerIds.getId(),MainActivity.apiKey).enqueue(new Callback<List<LeagueInfo>>() {
                        @Override
                        public void onResponse(Call<List<LeagueInfo>> call, Response<List<LeagueInfo>> response) {
                            if (response.isSuccessful()) {
                                leagueInfo = response.body();
                                DataHandelObject.leagueInfos = leagueInfo;
                            }
                        }

                        @Override
                        public void onFailure(Call<List<LeagueInfo>> call, Throwable t) {

                            System.out.println(t.toString());
                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<SummonerId> call, Throwable t) {
            }
        });
    }

    public void setSummonerName(String name){
        this.name = name;
    }

}

