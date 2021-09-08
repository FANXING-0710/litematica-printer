# Litematica-Printer

## Setup

To set this up just add the latest litematica version to your mods folder as well as this, it will replace easy place with printer. If carpet extra /quickcarpet enabled accurateblockplacement, you can turn on option, and... here goes the overpowered printer.

## Install guide

Install fabric (well, use MultiMC), litematica, malilib, and put this into mods folder. then you can just use easyplace. 

## Caution

(WON'T FIX) paper, spigot or other types can have their own anti cheat to prevent 'not-looking' placement, which means you can't do anything with this. There's some option to nerf printing action at https://github.com/jensvh/litematica-printer/releases/tag/v1.0.4, but still we can't assure if it would work or not. Use this if you are sure about it.

## Settings

### Printer settings:

`easyPlaceModeRange (x,y,z)`:&emsp;	"X,Y,Z Range for EasyPlace"<br/>
`easyPlaceModeMaxBlocks`:&emsp;		"Max block interactions per cycle"<br/>
`easyPlaceModeBreakBlocks`:&emsp;	"Automatically breaks blocks."<br/>
`easyPlaceModeDelay`:&emsp;			"Delay between printing blocks.Do not set to 0 if you are playing on a server."<br/>
`easyPlaceModeHotbarOnly`:&emsp;	"Only place blocks from your hotbar. This bypasses some anti-cheats."<br/>
`easyPlaceModeFlippincactus`:&emsp;			"Allows Rotating incorrect blocks when carpet option is enabled and holding cactus on your mainhand"<br/>
`easyPlaceModeClearArea`:&emsp;			"Remove nearby fluids, within easyplace range, to prevent errors. uses slime block to remove lava, sponges for water. WILL STOP OTHER ACTIONS"<br/>
`easyPlaceModeClearAreaCobblestone`:&emsp;			"Use cobblestones instead of slime block to remove lava <br/> REQUIRES : easyPlaceModeClearArea TRUE"<br/>
`ClearSnowLayer`:&emsp;			"It will place string where snow layer exists, ignores placement boxes, Only use if you need to. DEFAULT : FALSE"<br/>
`AccurateBlockPlacement`:&emsp;			"If carpet mod AccurateBlockPlacement is enabled (from extra or quickcarpet), you can turn on and printer will be rotation-free"<br/>
`easyPlaceModeUsePumpkinPie`:&emsp;			"If composter Level filling is needed, printer will use pumpkin pie to adjust its level"<br/>
`CarpetExtraFixedVersion`:&emsp;			"Carpet extra currently not supports some blocks, if its updated or server is using Quickcarpet, test this."<br/>
`easyPlaceModeObserverAvoidAll`:&emsp;			" Observer will avoid being placed when its watching state(not block) is not correct"<br/>
`BedrockBreaking`:&emsp;			"Removes bedrock when it needs to, will stop other actions, it needs BreakBlocks TRUE and haste 2, eff 5 pickaxe, works more well with accurateblockplacement.<br/> REQUIRES : easyPlaceModeBreakBlocks TRUE"<br/>
`BedrockBreakingUseSlimeBlocks`:&emsp;			"Places slime block to easily remove it"<br/>
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

## TODO List (most possible to least possible)
Water placement - should be done with ice placement and request breaking.

Waterlogged block placement - will be placed when water source is there because it will automatically waterlog it

Fix block "face" rounding(rotation) issue, due to player rotation while using right click. 

Sorter item filling - not likely

