package org.insurgence.addons.rivalboosts;

import org.insurgence.addons.rivalboosts.listeners.RivalHoeEventListener;
import org.insurgence.addons.rivalboosts.listeners.RivalPickaxeEventListener;
import org.insurgence.addons.rivalboosts.listeners.RivalRodEventListener;
import org.insurgence.addons.rivalboosts.listeners.RivalSwordEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;
import org.insurgencedev.insurgenceboosters.libs.fo.Common;

@IBoostersAddon(name = "RivalBoostAddon", version = "1.0.0", author = "InsurgenceDev", description = "All-in-one Rival Essence & XP boost")
public class RivalBoostAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadAblesStart() {
        if (Common.doesPluginExist("RivalPickaxes")) {
            registerEvent(new RivalPickaxeEventListener());
        }

        if (Common.doesPluginExist("RivalHarvesterHoes")) {
            registerEvent(new RivalHoeEventListener());
        }

        if (Common.doesPluginExist("RivalFishingRods")) {
            registerEvent(new RivalRodEventListener());
        }

        if (Common.doesPluginExist("RivalMobSwords")) {
            registerEvent(new RivalSwordEventListener());
        }
    }
}
