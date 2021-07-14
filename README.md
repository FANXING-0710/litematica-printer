# Litematica-Printer

## Setup

To set this up just add the latest litematica version to your mods folder as well as this, it will replace easy place with printer. This does not use accurate placement protocol and therefore means that in order to place blocks in some rotations, you need to rotate your player. If I stop lazy, I will add one that does use accurate placement.

## Settings

### Printer settings:

`easyPlaceModeRange (x,y,z)`:&emsp;	"X,Y,Z Range for EasyPlace"
`easyPlaceModeMaxBlocks`:&emsp;		"Max block interactions per cycle"
`easyPlaceModeBreakBlocks`:&emsp;	"Automatically breaks blocks. Currently only works in creative."

### Handy litematica settings:

`easyPlaceMode`:&emsp;				"When enabled, then simply trying to use an item/place a block on schematic blocks will place that block in that position."<br/>
`easyPlaceModeHoldEnabled`:&emsp;	"When enabled, then simply holding down the use key and looking at different schematic blocks will place them"<br/>
`easyPlaceClickAdjacent`:&emsp;		"If enabled, then the Easy Place mode will try to click on existing adjacent blocks. This may help on Spigot or similar servers, which don't allow clicking on air blocks."<br/>
`pickBlockAuto`:&emsp;				"Automatically pick block before every placed block"<br/>
`pickBlockEnabled`:&emsp;			"Enables the schematic world pick block hotkeys. There is also a hotkey for toggling this option to toggle those hotkeys... o.o", "Pick Block Hotkeys"<br/>
`pickBlockIgnoreNBT`:&emsp;			"Ignores the NBT data on the expected vs. found items for pick block. Allows the pick block to work for example with renamed items."<br/>
`pickBlockableSlots`:&emsp;			"The hotbar slots that are allowed to be used for the schematic pick block. Can use comma separated individual slots and dash separated slot ranges (no spaces anywhere). Example: 2,4-6,9"<br/>
`placementInfrontOfPlayer`:&emsp;	"When enabled, created placements or moved placements are positioned so that they are fully infront of the player, instead of the placement's origin point being at the player's location"<br/>
`renderMaterialListInGuis`:&emsp;	"Whether or not the material list should be rendered inside GUIs"<br/>
`signTextPaste`:&emsp;				"Automatically set the text in the sign GUIs from the schematic"<br/>
<br/>
`easyPlaceActivation`:&emsp;		"When the easyPlaceMode is enabled, this key must be held to enable placing the blocks when using the vanilla Use key"<br/>
`easyPlaceToggle`:&emsp;			"Allows quickly toggling on/off the Easy Place mode"<br/>

## Support
If you have any issues with this mod **DO NOT** contact and bother masa with it. Please message me in discord, I am usually around Scicraft, Mechanists, and Hekate. 

## Credits
Masa is the writer of the actual litematica mod and allowed all of this to be possible.
Andrews is the one who made the litematica printer implimentation, I just converted it to mixin.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
