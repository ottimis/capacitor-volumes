import { registerPlugin } from '@capacitor/core';

import type { VolumesPlugin } from './definitions';

const Volumes = registerPlugin<VolumesPlugin>('Volumes', {
  web: () => import('./web').then(m => new m.VolumesWeb()),
});

export * from './definitions';
export { Volumes };
