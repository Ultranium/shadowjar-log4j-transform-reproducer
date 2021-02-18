package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    static final Logger logger = LogManager.getLogger("TestLogger");

    public static void main(String[] args) {
        logger.info("Test message");
    }
}
