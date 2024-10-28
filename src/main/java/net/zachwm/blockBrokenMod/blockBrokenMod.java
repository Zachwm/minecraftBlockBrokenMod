package net.zachwm.blockBrokenMod;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(blockBrokenMod.MOD_ID)
@Mod.EventBusSubscriber(modid = blockBrokenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class blockBrokenMod {
    public static final String MOD_ID = "blockbrokenmod";

    // Listen for block-breaking events
    @SubscribeEvent
    public static void onBlockBroken(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        Block brokenBlock = event.getState().getBlock();
        player.displayClientMessage(Component.literal("You broke: " + brokenBlock.getName().getString()), true);
    }
}
