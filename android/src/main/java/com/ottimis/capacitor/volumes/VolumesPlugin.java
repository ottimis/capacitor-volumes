package com.ottimis.capacitor.volumes;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Volumes")
public class VolumesPlugin extends Plugin {

    private Volumes implementation;

    @Override
    public void load() {
        implementation = new Volumes(getContext());
    }

    @PluginMethod
    public void getVolumeLevel(PluginCall call) {
        Integer type = call.getInt("type", 3);

        if (type == null)   {
            type = 3;
        }

        JSObject ret = new JSObject();
        ret.put("value", implementation.getVolumeLevel(type));
        call.resolve(ret);
    }

    @PluginMethod
    public void setVolumeLevel(PluginCall call) {
        Integer type = call.getInt("type", 3);
        Integer value = call.getInt("value");

        implementation.setVolumeLevel(type, value);
        call.resolve();
    }
}
