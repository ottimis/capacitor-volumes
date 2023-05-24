package com.ottimis.capacitor.volumes;

import static android.content.Context.AUDIO_SERVICE;

import android.content.Context;
import android.media.AudioManager;

public class Volumes {

    Context context;

    public Volumes(Context applicationContext) {
        context = applicationContext;
    }

    public int getVolumeLevel(int type) {
        AudioManager am = (AudioManager) context.getSystemService(AUDIO_SERVICE);
        int volume_level= am.getStreamVolume(type);
        return volume_level;
    }

    public int getVolumeMaxLevel(int type) {
        AudioManager am = (AudioManager) context.getSystemService(AUDIO_SERVICE);
        int volume_max_level= am.getStreamMaxVolume(type);
        return volume_max_level;
    }

    public int setVolumeLevel(int type, int value) {
        AudioManager am = (AudioManager) context.getSystemService(AUDIO_SERVICE);

        // Get the proportional value having 10 steps
        int maxValue = am.getStreamMaxVolume(type);
        int volume_level_fixed = (int) Math.ceil((value * maxValue) / 10);

        am.setStreamVolume(type, volume_level_fixed, 0);

        int volume_level = getVolumeLevel(type);
        return volume_level;
    }
}
