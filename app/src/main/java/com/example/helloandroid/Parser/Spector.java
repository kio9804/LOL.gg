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
    private Long gameId;
    @SerializedName("mapId")
    @Expose
    private Integer mapId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameQueueConfigId")
    @Expose
    private Integer gameQueueConfigId;

    @SerializedName("participants")
    @Expose
    private List<SpectorParticipant> participants = null;

    @SerializedName("observers")
    @Expose
    private String platformId;
    @SerializedName("bannedChampions")
    @Expose
    private List<BannedChampion> bannedChampions = null;
    @SerializedName("gameStartTime")
    @Expose
    private Long gameStartTime;
    @SerializedName("gameLength")
    @Expose
    private Integer gameLength;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Integer getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(Integer gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public List<SpectorParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<SpectorParticipant> participants) {
        this.participants = participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public Long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(Long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public Integer getGameLength() {
        return gameLength;
    }

    public void setGameLength(Integer gameLength) {
        this.gameLength = gameLength;
    }

}
