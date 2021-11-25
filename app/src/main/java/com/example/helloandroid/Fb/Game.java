package com.example.helloandroid.Fb;
//게임 계정 정보
public class Game {

    private String name;
    private String puuId;
    private String tier;
    private String rank;
    private String leaguePoints;
    private String wins;
    private String losses;

    public Game(){ }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getpuuId() {
        return puuId;
    }

    public void setpuuId(String puuId) {
        this.puuId = puuId;
    }

    public String gettier() {
        return tier;
    }

    public void settier(String tier) {
        this.tier = tier;
    }

    public String getrank() {
        return rank;
    }

    public void setrank(String rank) {
        this.rank = rank;
    }

    public String getleaguePoints() {
        return leaguePoints;
    }

    public void setleaguePoints(String leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public String getwins() {
        return wins;
    }

    public void setwins(String wins) {
        this.wins = wins;
    }

    public String getlosses() {
        return losses;
    }

    public void setlosses(String losses) {
        this.losses = losses;
    }
}
