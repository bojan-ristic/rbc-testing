package com.productdock.rbc2024.integration;

import com.productdock.rbc2024.Rbc2024Application;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(
        webEnvironment = RANDOM_PORT,
        classes = Rbc2024Application.class,
        properties = "wiremock-http-port=8888")
public abstract class BaseIntegrationTest {

}
