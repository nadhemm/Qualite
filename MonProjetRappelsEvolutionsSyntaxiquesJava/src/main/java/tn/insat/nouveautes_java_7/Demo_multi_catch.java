package tn.insat.nouveautes_java_7;

import sun.rmi.runtime.Log;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Demo_multi_catch {
    public static void main(String[] args) {

         Logger logger = Logger.getLogger(Demo_multi_catch.class.getName());

        try {

            int array[] = new int[10];
            array[10] = 30/0;

        } catch(ArithmeticException | IndexOutOfBoundsException  e) {
            logger.severe (e.getMessage());

        }
    }
}
