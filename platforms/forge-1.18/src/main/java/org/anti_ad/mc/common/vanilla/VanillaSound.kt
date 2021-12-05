package org.anti_ad.mc.common.vanilla

import org.anti_ad.mc.common.vanilla.alias.PositionedSoundInstance
import org.anti_ad.mc.common.vanilla.alias.SoundEvents
import org.anti_ad.mc.common.vanilla.glue.IVanillaSound
import org.anti_ad.mc.common.vanilla.glue.__glue_vanillaSound

fun initVanillaSound() {
    __glue_vanillaSound = VanillaSound
}

object VanillaSound: IVanillaSound {

    override fun playClick() {
        Vanilla.soundManager().play(PositionedSoundInstance.forUI(SoundEvents.UI_BUTTON_CLICK, //master(SoundEvents.UI_BUTTON_CLICK,
                                                                  1.0f))
    }

}