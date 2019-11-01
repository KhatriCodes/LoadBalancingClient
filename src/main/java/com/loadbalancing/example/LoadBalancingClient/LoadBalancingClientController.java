package com.loadbalancing.example.LoadBalancingClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoadBalancingClientController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/client")
    public String PortDisplay()
    {
        return "Application is running on "+port;
    }
}
