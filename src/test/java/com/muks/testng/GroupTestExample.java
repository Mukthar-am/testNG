package com.muks.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by mukthar.ahmed on 4/16/16.
 */
public class GroupTestExample {

    String message = ".com";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(groups = {"functest", "checkintest"})

    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = ".com";
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(groups = {"checkintest"})

    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "tutorialspoint" + ".com";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }

    @Test(groups = {"functest"})

    public void testingExitMessage() {
        System.out.println("Inside testExitMessage()");
        message = "www." + "tutorialspoint" + ".com";
        Assert.assertEquals(message, messageUtil.exitMessage());
    }


    /*
    * This class prints the given message on console.
    */
    class MessageUtil {
        private String message;

        // Constructor
        // @param message to be printed
        public MessageUtil(String message) {
            this.message = message;
        }

        // prints the message
        public String printMessage() {
            System.out.println(message);
            return message;
        }

        // add "tutorialspoint" to the message
        public String salutationMessage() {
            message = "tutorialspoint" + message;
            System.out.println(message);
            return message;
        }

        // add "www." to the message
        public String exitMessage() {
            message = "www." + message;
            System.out.println(message);
            return message;
        }
    }
}
