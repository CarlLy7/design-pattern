package com.geek.designpattern.adapterPattern;

/**
 * @author: carl
 * @date: 2025.02.19
 */

public class solution {
    public static void main(String[] args) {
        AdvancedPlayer advancedPlayer = new AdvancedPlayer();
        MediaPlayerAdaptor mediaPlayerAdaptor = new MediaPlayerAdaptor(advancedPlayer);
        mediaPlayerAdaptor.play("test.mp3");
        mediaPlayerAdaptor.play("test.avi");
    }
}
