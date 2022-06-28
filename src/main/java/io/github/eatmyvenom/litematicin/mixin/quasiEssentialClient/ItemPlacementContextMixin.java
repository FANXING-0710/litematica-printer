package io.github.eatmyvenom.litematicin.mixin.quasiEssentialClient;

import io.github.eatmyvenom.litematicin.utils.FakeAccurateBlockPlacement;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemPlacementContext.class)
public class ItemPlacementContextMixin {
	@Inject(method = "getPlayerLookDirection", at = @At("HEAD"), cancellable = true, require = 0)
	private void onGetDirection(CallbackInfoReturnable<Direction> cir) {
		if (FakeAccurateBlockPlacement.fakeDirection != null) {
			cir.setReturnValue(FakeAccurateBlockPlacement.fakeDirection);
		}
	}
}