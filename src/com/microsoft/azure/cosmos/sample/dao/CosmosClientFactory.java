package com.microsoft.azure.cosmos.sample.dao;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {
    private static final String HOST = "https://vijayjavacosmos.documents.azure.com:443/";
    private static final String MASTER_KEY = "9Z3hIZb9DLTIZokh0N9Uugi8lj6dxljNY4i7I6pP7vxvX5DJ2eeCWhK5IB6pxtJNgTr0JGMXQndMa0gIMKlgfQ==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }

}
