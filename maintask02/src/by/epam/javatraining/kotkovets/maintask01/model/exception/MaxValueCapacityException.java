package by.epam.javatraining.kotkovets.maintask01.model.exception;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;
import org.apache.log4j.Logger;

/**
 * This class describes the MaxValueCapacityException.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0 19.06.2019
 * @see Exception
 * @since JDK1.0
 */

public class MaxValueCapacityException extends Exception {
    private static final Logger logger = Logger.getRootLogger();

    public MaxValueCapacityException(){
        super("MaxValueCapacityException!");
        logger.error("MaxValueCapacity");
    }
}
