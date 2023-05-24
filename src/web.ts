import { WebPlugin } from '@capacitor/core';

import type { VolumesPlugin } from './definitions';

export class VolumesWeb extends WebPlugin implements VolumesPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
