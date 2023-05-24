# @ottimis/capacitor-volumes

Manage device volume from capacitor.

Get volume level in a range between 1 and 10.
Volume will be set proportionally in a scale between 0 and "maxVolumeOfDevice".

⭐️ Any suggestion will be appreciated

## Supported platforms

| Platform | Supported |
| -------- | --------- |
| Android  | ✅        |
| iOS      | ✅        | (only getVolumeLevel)
| Web      | ❌        |

## Install

```bash
npm install @ottimis/capacitor-volumes
npx cap sync
```

## API

<docgen-index>

* [`getVolumeLevel(...)`](#getvolumelevel)
* [`setVolumeLevel(...)`](#setvolumelevel)
* [Enums](#enums)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getVolumeLevel(...)

```typescript
getVolumeLevel(options?: { type?: VolumeTypes | undefined; } | undefined) => Promise<{ value: number; }>
```

type parameter is only available on Android

| Param         | Type                                                            |
| ------------- | --------------------------------------------------------------- |
| **`options`** | <code>{ type?: <a href="#volumetypes">VolumeTypes</a>; }</code> |

**Returns:** <code>Promise&lt;{ value: number; }&gt;</code>

--------------------


### setVolumeLevel(...)

```typescript
setVolumeLevel(options: { value: number; type?: VolumeTypes; }) => Promise<{ value: number; }>
```

this works only on Android
value parameter is an integer between 0 and 10 for android

| Param         | Type                                                                           |
| ------------- | ------------------------------------------------------------------------------ |
| **`options`** | <code>{ value: number; type?: <a href="#volumetypes">VolumeTypes</a>; }</code> |

**Returns:** <code>Promise&lt;{ value: number; }&gt;</code>

--------------------


### Enums


#### VolumeTypes

| Members            | Value          |
| ------------------ | -------------- |
| **`voice_call`**   | <code>0</code> |
| **`system`**       | <code>1</code> |
| **`ring`**         | <code>2</code> |
| **`default`**      | <code>3</code> |
| **`music`**        | <code>3</code> |
| **`alarm`**        | <code>4</code> |
| **`notification`** | <code>5</code> |
| **`dtmf`**         | <code>8</code> |

</docgen-api>
