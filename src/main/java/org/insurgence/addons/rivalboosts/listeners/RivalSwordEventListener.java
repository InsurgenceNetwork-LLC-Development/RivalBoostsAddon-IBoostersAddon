package org.insurgence.addons.rivalboosts.listeners;

import me.rivaldev.mobsword.rivalmobswords.api.SwordEssenceReceiveEnchantEvent;
import me.rivaldev.mobsword.rivalmobswords.api.SwordMoneyReceiveEvent;
import me.rivaldev.mobsword.rivalmobswords.api.SwordXPGainEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.insurgence.addons.rivalboosts.utils.AddonUtils;

public final class RivalSwordEventListener implements Listener {

    @EventHandler
    private void onReceive(SwordEssenceReceiveEnchantEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Essence");

        if (multi > 0) {
            event.setEssence(AddonUtils.calculateAmount(event.getEssence(), multi));
        }
    }

    @EventHandler
    private void onReceive(SwordMoneyReceiveEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "Money");

        if (multi > 0) {
            event.setMoney(AddonUtils.calculateAmount(event.getMoney(), multi));
        }
    }

    @EventHandler
    private void onGain(SwordXPGainEvent event) {
        double multi = AddonUtils.getMulti(event.getPlayer(), "XP");

        if (multi > 0) {
            event.setXP(AddonUtils.calculateAmount(event.getXP(), multi));
        }
    }
}
