package com.example.helloandroid;

public class ThreadTest extends Thread{
    public void run(){
            try {
                Thread.sleep(2000);
                System.out.println("Test Class : " + DataHandlerObject.summonerIds.getId());
                System.out.println("Test Class : " + DataHandlerObject.leagueInfos.get(0).getTier());
                System.out.println("Test Class : " + DataHandlerObject.leagueInfos.get(0).getRank());
                //System.out.println(("Test : " + DataHandlerObject.spector.getParticipants().get(1).getSummonerName()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
