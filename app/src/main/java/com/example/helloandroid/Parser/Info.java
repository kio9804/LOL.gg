//작성자: 김선호
//작성일자 : 21-11-20
//클래스 목적 : 매치 정보 파싱을 위한 데이터셋
package com.example.helloandroid.Parser;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Info {

    @SerializedName("gameCreation")
    @Expose
    private Long gameCreation;
    @SerializedName("gameDuration")
    @Expose
    private Integer gameDuration;
    @SerializedName("gameEndTimestamp")
    @Expose
    private Long gameEndTimestamp;
    @SerializedName("gameId")
    @Expose
    private Long gameId;
    @SerializedName("gameMode")
    @Expose
    private String gameMode;
    @SerializedName("gameName")
    @Expose
    private String gameName;
    @SerializedName("gameStartTimestamp")
    @Expose
    private Long gameStartTimestamp;
    @SerializedName("gameType")
    @Expose
    private String gameType;
    @SerializedName("gameVersion")
    @Expose
    private String gameVersion;
    @SerializedName("mapId")
    @Expose
    private Integer mapId;
    @SerializedName("platformId")
    @Expose
    private String platformId;
    @SerializedName("queueId")
    @Expose
    private Integer queueId;
    @SerializedName("tournamentCode")
    @Expose
    private String tournamentCode;

    @SerializedName("participants")
    @Expose
    private List<Participant> participants;

    public Long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(Long gameCreation) {
        this.gameCreation = gameCreation;
    }

    public Integer getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(Integer gameDuration) {
        this.gameDuration = gameDuration;
    }

    public Long getGameEndTimestamp() {
        return gameEndTimestamp;
    }

    public void setGameEndTimestamp(Long gameEndTimestamp) {
        this.gameEndTimestamp = gameEndTimestamp;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Long getGameStartTimestamp() {
        return gameStartTimestamp;
    }

    public void setGameStartTimestamp(Long gameStartTimestamp) {
        this.gameStartTimestamp = gameStartTimestamp;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }


    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }


    public String getTournamentCode() {
        return tournamentCode;
    }

    public void setTournamentCode(String tournamentCode) {
        this.tournamentCode = tournamentCode;
    }

    public List<Participant> getParticipant() {
        return participants;
    }

    public void setParticipant(List<Participant> participants) {
        this.participants = participants;
    }
}
