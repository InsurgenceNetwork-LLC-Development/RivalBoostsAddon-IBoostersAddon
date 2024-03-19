package org.insurgence.addons.rivalboosts.listeners;

import me.rivaldev.fishingrod.rivalfishingrods.api.RodEssenceReceiveEvent;
import me.rivaldev.fishingrod.rivalfishingrods.api.RodMoneyReceiveEvent;
import me.rivaldev.fishingrod.rivalfishingrods.api.RodXPGainEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.insurgence.addons.rivalboosts.utils.AddonUtils;

public final class RivalRodEventListener implements Listener {

    @EventHandler
    private void onReceive(RodEssenceReceiveEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Essence");

        if (multi > 0) {
            event.setEssence(AddonUtils.calculateAmount(event.getEssence(), multi));
        }
    }

    @EventHandler
    private void onReceive(RodMoneyReceiveEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Money");

        if (multi > 0) {
            event.setMoney(AddonUtils.calculateAmount(event.getMoney(), multi));
        }
    }

    @EventHandler
    private void onGain(RodXPGainEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "XP");

        if (multi > 0) {
            event.setXP(AddonUtils.calculateAmount(event.getXP(), multi));
        }
    }
}
