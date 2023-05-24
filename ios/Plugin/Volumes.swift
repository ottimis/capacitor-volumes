import Foundation
import AVFoundation
import MediaPlayer

@objc public class Volumes: NSObject {
    @objc public func getVolumeLevel() -> Float {
        let vol = AVAudioSession.sharedInstance().outputVolume
        return vol
    }
    @objc public func setVolumeLevel(_ value: Float) -> Float {
        MPVolumeView.setVolume(value / 10)
        return value / 10
    }
}

extension MPVolumeView {
  static func setVolume(_ volume: Float) {
    let volumeView = MPVolumeView()
    let slider = volumeView.subviews.first(where: { $0 is UISlider }) as? UISlider

    DispatchQueue.main.asyncAfter(deadline: DispatchTime.now() + 0.01) {
      slider?.value = volume
    }
  }
}
