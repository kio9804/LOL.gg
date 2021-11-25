//작성자: 김선호
//작성일자 : 21-11-20
//클래스 목적 : 매치 정보 파싱을 위한 데이터셋

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
