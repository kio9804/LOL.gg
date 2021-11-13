package com.example.helloandroid;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.POST;
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
}
