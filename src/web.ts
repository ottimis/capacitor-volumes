import { WebPlugin } from '@capacitor/core';

import type { VolumesPlugin } from './definitions';

export class VolumesWeb extends WebPlugin implements VolumesPlugin {

  NOT_SUPPORTED = "ERR_PLATFORM_NOT_SUPPORTED";

  async getVolumeLevel(): Promise<any> {
    return new Promise<void>((_resolve, reject) => {
      reject(this.NOT_SUPPORTED);
    });
  }

  async setVolumeLevel(): Promise<any> {
    return new Promise<void>((_resolve, reject) => {
      reject(this.NOT_SUPPORTED);
    });
  }
}
