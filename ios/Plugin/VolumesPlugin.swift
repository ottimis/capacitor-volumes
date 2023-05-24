import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(VolumesPlugin)
public class VolumesPlugin: CAPPlugin {
    private let implementation = Volumes()

    @objc func getVolumeLevel(_ call: CAPPluginCall) {
        call.resolve([
            "value": implementation.getVolumeLevel()
        ])
    }
    
    @objc func setVolumeLevel(_ call: CAPPluginCall) {
        let value = call.getFloat("value") ?? 5
        call.resolve([
            "value": implementation.setVolumeLevel(value)
        ])
    }
}
