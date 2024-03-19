package org.insurgence.addons.rivalboosts.listeners;

import me.rivaldev.pickaxes.api.events.PickaxeEssenceReceiveEnchantEvent;
import me.rivaldev.pickaxes.api.events.PickaxeMoneyReceiveEnchant;
import me.rivaldev.pickaxes.api.events.PickaxeXPGainEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.insurgence.addons.rivalboosts.utils.AddonUtils;

public final class RivalPickaxeEventListener implements Listener {

    @EventHandler
    private void onReceive(PickaxeEssenceReceiveEnchantEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Essence");

        if (multi > 0) {
            event.setEssence(AddonUtils.calculateAmount(event.getEssence(), multi));
        }
    }

    @EventHandler
    private void onReceive(PickaxeMoneyReceiveEnchant event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Money");

        if (multi > 0) {
            event.setMoney(AddonUtils.calculateAmount(event.getMoney(), multi));
        }
    }

    @EventHandler
    private void onGain(PickaxeXPGainEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "XP");

        if (multi > 0) {
            event.setXP(AddonUtils.calculateAmount(event.getXP(), multi));
        }
    }
}
