package org.walleth.data.networks

import org.kethereum.model.ChainDefinition
import org.walleth.data.blockexplorer.EtherscanBlockExplorer

interface NetworkDefinition {
    fun getNetworkName(): String
    fun getBlockExplorer(): EtherscanBlockExplorer

    val chain: ChainDefinition
    val genesis: String
    val bootNodes: List<String>
    val statsSuffix: String
}