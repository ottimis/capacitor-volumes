enum VolumeTypes {
  voice_call = 0,
  system = 1,
  ring = 2,
  default = 3,
  music = 3,
  alarm = 4,
  notification = 5,
  dtmf = 8,
}

export interface VolumesPlugin {
  /**
   * 
   * type parameter is only available on Android
   */
  getVolumeLevel( options?: { type?: VolumeTypes }): Promise<{ value: number }>;
  /**
   * 
   * this works only on Android
   * value parameter is an integer between 0 and 10 for android
   */
  setVolumeLevel( options: { value: number, type?: VolumeTypes }): Promise<{ value: number }>;
}
