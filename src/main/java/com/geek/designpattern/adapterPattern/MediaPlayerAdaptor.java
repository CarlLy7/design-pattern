package com.geek.designpattern.adapterPattern;

/**
 * 适配器类
 * 使用<b>组合</b> 实现
 * @author: carl
 * @date: 2025.02.19
 */

public class MediaPlayerAdaptor implements MediaPlayer{
    private AdvancedPlayer advancedPlayer;

    public MediaPlayerAdaptor(AdvancedPlayer advancedPlayer) {
        this.advancedPlayer = advancedPlayer;
    }

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3")){
            advancedPlayer.playMp3();
        }else{
            advancedPlayer.play(filename);
        }
    }
}
