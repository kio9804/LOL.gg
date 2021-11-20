//작성자: 김선호
//작성일자 : 21-11-20
//클래스 목적 : 실시간 플레이중인 게임에서 밴된 챔피언 파싱을 위한 데이터셋
package com.example.helloandroid.Parser;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannedChampion {

    @SerializedName("championId")
    @Expose
    private Integer championId;
    @SerializedName("teamId")
    @Expose
    private Integer teamId;
    @SerializedName("pickTurn")
    @Expose
    private Integer pickTurn;

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(Integer pickTurn) {
        this.pickTurn = pickTurn;
    }

}
