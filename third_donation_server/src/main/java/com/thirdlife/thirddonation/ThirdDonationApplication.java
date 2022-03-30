package com.thirdlife.thirddonation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * This is start point of ThirdDonationApplication.
 */
@EnableJpaAuditing
@SpringBootApplication
public class ThirdDonationApplication {
    /**
     * This is main of ThirdDonationApplication.
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        SpringApplication.run(ThirdDonationApplication.class, args);
    }

}
