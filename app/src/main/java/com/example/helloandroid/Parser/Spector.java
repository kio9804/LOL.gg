//작성자: 김선호
//작성일자 : 21-11-20
//클래스 목적 : 플레이중인 경기 관전 정보 파싱을 위한 데이터셋

package com.example.helloandroid.Parser;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spector {

    @SerializedName("gameId")
    @Expose
    private String gameId;

    @SerializedName("gameMode")
    @Expose
    private String gameMode;

    @SerializedName("gameType")
    @Expose
    private String gameType;

    @SerializedName("gameStartTime")
    @Expose
    private String gameStartTime;

    @SerializedName("gameLength")
    @Expose
    private String gameLength;

    @SerializedName("participants")
    @Expose
    private List<SpectorParticipant> participants;

    public List<SpectorParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<SpectorParticipant> participants) {
        this.participants = participants;
    }


    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}
