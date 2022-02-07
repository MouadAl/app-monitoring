package com.example;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class Application {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);
        testMemory();
        testCpu();


    }
    public static void testMemory() {
        boolean quit = false;
        ArrayList<Integer> mytestArray = new ArrayList<Integer>();
        while (!quit) {
            System.out.println("Donner un nombre1");
            int nombre1 = scanner.nextInt();
            System.out.println("Donner un nombre2");
            int nombre2 = scanner.nextInt();
            mytestArray.add(nombre1 * 1000000);
            mytestArray.add(nombre2 * 1000000);


            System.out.println("voulez-vous continuez ? 1 pour continuez 0 pour quitter ");
            int saisie = scanner.nextInt();
            if (saisie == 0) {
                quit = true;
            }
        }
    }
    public static void testCpu(){
        for (int i=0;;i++){
            System.out.println("Hello Mouad");

        }
    }

    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(Application.class);

        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
}
