package com.example.helloandroid;

public class ThreadTest extends Thread{
    public void run(){
            try {
                Thread.sleep(2000);
                System.out.println("Test Class : " + DataHandelObject.summonerIds.getId());
                System.out.println("Test Class : " + DataHandelObject.leagueInfos.get(0).getTier());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
