package com.rasmoo.client.raspay.integration;

import com.rasmoo.client.raspay.dto.CustomerDto;
import com.rasmoo.client.raspay.integration.impl.WsRaspayIntegrationImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WsRaspayIntegrationImplTest {

    @Autowired
    private WsRaspayIntegrationImpl wsRaspayIntegration;

    @Test
    void createCustomesWhenDtoOK() {
        CustomerDto dto = new CustomerDto(null, "Felipe", "Alves", "teste@teste", "57175188030");
        wsRaspayIntegration.createCustomer(dto);
    }


}
