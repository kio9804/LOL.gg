package com.example.helloandroid.inGame;

import androidx.annotation.NonNull;

/**
 * 인게임 한 Row에 표시하는데 필요한 데이터
 */
public class InGameDataObject {
    private boolean blueOrRed;// blue : true, red : false
    private String championImageUrl;
    private String spell1ImageUrl;
    private String spell2ImageUrl;
    private String rune1ImageUrl;
    private String rune2ImageUrl;
    private String nickname;
    private String winRate;
    private String tearImageUrl;
    private String tearText;

    public void setBlueOrRed(boolean blueOrRed) {
        this.blueOrRed = blueOrRed;
    }

    public boolean isBlueOrRed() {
        return blueOrRed;
    }

    public String getChampionImageUrl() {
        return championImageUrl;
    }

    public void setChampionImageUrl(String championImageUrl) {
        this.championImageUrl = championImageUrl;
    }

    public String getSpell1ImageUrl() {
        return spell1ImageUrl;
    }

    public void setSpell1ImageUrl(String spell1ImageUrl) {
        this.spell1ImageUrl = spell1ImageUrl;
    }

    public String getSpell2ImageUrl() {
        return spell2ImageUrl;
    }

    public void setSpell2ImageUrl(String spell2ImageUrl) {
        this.spell2ImageUrl = spell2ImageUrl;
    }

    public String getRune1ImageUrl() {
        return rune1ImageUrl;
    }

    public void setRune1ImageUrl(String rune1ImageUrl) {
        this.rune1ImageUrl = rune1ImageUrl;
    }

    public String getRune2ImageUrl() {
        return rune2ImageUrl;
    }

    public void setRune2ImageUrl(String rune2ImageUrl) {
        this.rune2ImageUrl = rune2ImageUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getWinRate() {
        return winRate;
    }

    public void setWinRate(String winRate) {
        this.winRate = winRate;
    }

    public String getTearImageUrl() {
        return tearImageUrl;
    }

    public void setTearImageUrl(String tearImageUrl) {
        this.tearImageUrl = tearImageUrl;
    }

    public String getTearText() {
        return tearText;
    }

    public void setTearText(String tearText) {
        this.tearText = tearText;
    }

}
