package com.zero.hazelcast.read;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class ZeroHazelcastReadApplicationTests {

    @Test
    void contextLoads() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setClusterName("hazelcast-cluster");
        HazelcastInstance instance = HazelcastClient.newHazelcastClient(clientConfig);
        Map<Integer, String> clusterMap = instance.getMap("map");
    }

}
