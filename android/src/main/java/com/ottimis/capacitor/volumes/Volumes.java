package com.ottimis.capacitor.volumes;

import static android.content.Context.AUDIO_SERVICE;

import android.content.Context;
import android.media.AudioManager;

public class Volumes {

    Context context;

    public Volumes(Context applicationContext) {
        context = applicationContext;
    }

    public float getVolumeLevel(int type) {
        AudioManager am = (AudioManager) context.getSystemService(AUDIO_SERVICE);
        int volume_level= am.getStreamVolume(type);
        int max_volume_level = am.getStreamMaxVolume(type);

        // Normalize between 0 e 1
        return (float) volume_level / max_volume_level;
    }

    public int getVolumeMaxLevel(int type) {
        AudioManager am = (AudioManager) context.getSystemService(AUDIO_SERVICE);
        int volume_max_level= am.getStreamMaxVolume(type);
        return volume_max_level;
    }

    public float setVolumeLevel(int type, float normalizedValue) {
        AudioManager am = (AudioManager) context.getSystemService(AUDIO_SERVICE);

        // Converti il valore normalizzato (0-1) in un valore reale di volume
        int maxValue = am.getStreamMaxVolume(type);
        int volume_level_fixed = Math.round(normalizedValue * maxValue);

        am.setStreamVolume(type, volume_level_fixed, 0);

        // Restituisci il nuovo livello normalizzato tra 0 e 1
        return getVolumeLevel(type);
    }
}
