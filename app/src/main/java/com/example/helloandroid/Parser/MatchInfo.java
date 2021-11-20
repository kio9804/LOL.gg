package com.example.helloandroid.Parser;

import com.example.helloandroid.Parser.Info;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MatchInfo {
    @SerializedName("info")
    @Expose
    private Info info;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

}
