package org.anti_ad.mc.ipnext.debug

import net.minecraft.network.NetworkSide
import net.minecraft.network.Packet

object DebugFunc {

    fun dumpPacketId() {
        //dump(NetworkSide.SERVERBOUND)
        //dump(NetworkSide.CLIENTBOUND)
    }

    private fun dump(side: NetworkSide) {
        println(side)
        var packet: Packet<*>
        //for (i in 0..5000) {
        //packet = trySwallow { NetworkState.PLAY.getPacketHandler(side, i) } ?: return
        //println("$i ${packet.javaClass.usefulName}")
        //}
    }

    // see ServerPlayNetworkHandler onClickWindow line 1202
}