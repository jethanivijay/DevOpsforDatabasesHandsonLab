package com.microsoft.azure.cosmos.sample.dao;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {
    private static final String HOST = "https://vijayjavacosmoshol.documents.azure.com:443/";
    private static final String MASTER_KEY = "inJVnKY1f3iYgiyxWJXkgiy3vn2yoxIACVmlSWBoGpEzov9TDVrZogsyVZ9uYqNx7KTYTCyuRMslaElENugpxw==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }

}
