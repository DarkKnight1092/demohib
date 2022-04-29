package com.telusuko.demohib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExp {
    private static final Logger logger = LoggerFactory.getLogger(LogExp.class);
    public static void main(String []args){

       logger.error("Error message");
        logger.warn("warn message");
        logger.info("info message");
        logger.debug("debug message");

    }

}
