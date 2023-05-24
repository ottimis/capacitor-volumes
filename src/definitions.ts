export interface VolumesPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
