package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4j {
private static Logger log = LogManager.getLogger(DemoLog4j.class);

    public static void main(String[] args) {
        System.out.println("\n Hello World! \n");

        log.trace("Trace log");
        log.debug("Debug log");
        log.info("Infor log");
        log.warn("Warn log");
        log.error("Error log");
        log.fatal("Fatal log");

        System.out.println("\n Completed \n");

    }
}
