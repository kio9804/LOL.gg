package com.example.helloandroid.inGame;

import androidx.annotation.NonNull;

/**
 * 인게임 한 Row에 표시하는데 필요한 데이터
 *
 * @author 고동현
 * @since 2021-11-20
 */
public class InGameDataObject {
    /**
     * 블루팀 또는 레드팀 여부
     * 색상 표시할 때 사용됨
     */
    private boolean blueOrRed;// blue : true, red : false
    /**
     * 챔피언 이미지 url
     */
    private String championImageUrl;
    /**
     * 스펠 이미지 url
     */
    private String spell1ImageUrl;
    /**
     * 스펠 이미지 url
     */
    private String spell2ImageUrl;
    /**
     * 룬 이미지 url
     */
    private String rune1ImageUrl;
    /**
     * 룬 이미지 url
     */
    private String rune2ImageUrl;
    /**
     * 닉네임
     */
    private String nickname;
    /**
     * 승률
     */
    private String winRate;
    /**
     * 티어 이미지 url
     */
    private String tearImageUrl;
    /**
     * 티어 문자
     */
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

    @NonNull
    @Override
    public String toString() {
        return "InGameDataObject{" +
                "blueOrRed=" + blueOrRed +
                ", championImageUrl='" + championImageUrl + '\'' +
                ", spell1ImageUrl='" + spell1ImageUrl + '\'' +
                ", spell2ImageUrl='" + spell2ImageUrl + '\'' +
                ", rune1ImageUrl='" + rune1ImageUrl + '\'' +
                ", rune2ImageUrl='" + rune2ImageUrl + '\'' +
                ", nickname='" + nickname + '\'' +
                ", winRate='" + winRate + '\'' +
                ", tearImageUrl='" + tearImageUrl + '\'' +
                ", tearText='" + tearText + '\'' +
                '}';
    }
}
