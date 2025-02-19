package com.geek.designpattern.adapterPattern;

/**
 * 被适配类
 * @author: carl
 * @date: 2025.02.19
 */

public class AdvancedPlayer implements MediaPlayer{
    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3")){
            System.out.println("播放mp3格式的视频");
        }else{
            System.out.println("播放其他格式的视频");
        }
    }

    public void playMp3(){
        System.out.println("第三方应用播放mp3...");
    }
}
