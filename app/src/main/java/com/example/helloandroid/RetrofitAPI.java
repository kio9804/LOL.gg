package com.example.helloandroid;

import com.example.helloandroid.Parser.LeagueInfo;
import com.example.helloandroid.Parser.MatchInfo;
import com.example.helloandroid.Parser.SummonerId;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitAPI {
    @GET("/lol/summoner/v4/summoners/by-name/{summonerName}")
    Call<SummonerId> getSummerId(
                @Path("summonerName") String summonerName,
                @Query("api_key") String api_key
        );

    @GET("/lol/league/v4/entries/by-summoner/{encryptedSummonerId}")
    Call<List<LeagueInfo>> getLeagueInfo(
            @Path("encryptedSummonerId") String encryptedSummonerId,
            @Query("api_key") String api_key
    );

    @GET("/lol/match/v5/matches/by-puuid/{puuid}/ids")
    Call<List<String>> getList(
            @Path("puuid") String puuidStr,
            @Query("start") int startNum,
            @Query("count") int countNUm,
            @Query("api_key") String api_key
    );

    @GET("/lol/match/v5/matches/{matchId}")
    Call<MatchInfo> getMatchInfo(
            @Path("matchId") String matchId,
            @Query("api_key") String api_key
    );



}
