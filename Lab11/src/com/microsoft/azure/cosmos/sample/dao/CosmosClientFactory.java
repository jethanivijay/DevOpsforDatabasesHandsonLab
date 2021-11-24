package com.microsoft.azure.cosmos.sample.dao;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {
    private static final String HOST = "https://vijayjavacosmos.documents.azure.com:443/";
    private static final String MASTER_KEY = "tW620OVWwLoB4LhKU76Qe6pkEmXyEtxY3Jb0hYYGf8aaoYhl2zWP10p6oGDbAkrc5GFq0ksOh1x7WbL1tVMSsw==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }

}
