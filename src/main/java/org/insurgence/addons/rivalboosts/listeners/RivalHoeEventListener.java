package org.insurgence.addons.rivalboosts.listeners;

import me.rivaldev.harvesterhoes.api.events.HoeEssenceReceiveEnchantEvent;
import me.rivaldev.harvesterhoes.api.events.HoeMoneyReceiveEnchant;
import me.rivaldev.harvesterhoes.api.events.HoeXPGainEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.insurgence.addons.rivalboosts.utils.AddonUtils;

public final class RivalHoeEventListener implements Listener {

    @EventHandler
    private void onReceive(HoeEssenceReceiveEnchantEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Essence");

        if (multi > 0) {
            event.setEssence(AddonUtils.calculateAmount(event.getEssence(), multi));
        }
    }

    @EventHandler
    private void onReceive(HoeMoneyReceiveEnchant event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Money");

        if (multi > 0) {
            event.setMoney(AddonUtils.calculateAmount(event.getMoney(), multi));
        }
    }

    @EventHandler
    private void onGain(HoeXPGainEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "XP");

        if (multi > 0) {
            event.setXP(AddonUtils.calculateAmount(event.getXP(), multi));
        }
    }
}
