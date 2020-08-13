package StacksAndQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeStackTest {

    @Test
    void ThreeStackGood() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        ThreeStack problem = new ThreeStack(3);

        problem.push(0, 10);
        problem.push(0, 11);
        problem.push(0, 12);

        problem.push(1, 20);
        problem.push(1, 21);
        problem.push(1, 22);

        problem.push(2, 30);
        problem.push(2, 31);
        problem.push(2, 32);

        problem.printStack();

        System.out.println();
        System.out.println("Stack 0 Peek : " + problem.peek(0));
        System.out.println("Stack 1 Peek : " + problem.peek(1));
        System.out.println("Stack 2 Peek : " + problem.peek(2));

        //assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void ThreeStackStackPops() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        ThreeStack problem = new ThreeStack(3);

        problem.push(0, 10);
        problem.push(0, 11);
        problem.push(0, 12);
        problem.pop(0);
        problem.pop(0);
        problem.pop(0);

        problem.push(1, 20);
        problem.push(1, 21);
        problem.push(1, 22);
        problem.pop(1);

        problem.push(2, 30);
        problem.push(2, 31);
        problem.push(2, 32);
        problem.pop(2);

        problem.printStack();

        //assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void ThreeStackStackPopsExceed() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        ThreeStack problem = new ThreeStack(3);

        problem.push(0, 10);
        problem.push(0, 11);
        problem.push(0, 12);
        problem.pop(0);

        problem.push(1, 20);
        problem.push(1, 21);
        problem.push(1, 22);
        problem.pop(1);
        problem.pop(1);
        problem.pop(1);
        try {
            problem.pop(1);
        } catch (Exception e)
        {
            System.out.println("Pop not possible");
            assertTrue(true);
        }


        problem.push(2, 30);
        problem.push(2, 31);
        problem.push(2, 32);
        problem.pop(2);

        problem.printStack();

        //assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void ThreeStackStackOneExceed() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        ThreeStack problem = new ThreeStack(3);

        problem.push(0, 10);
        problem.push(0, 11);
        problem.push(0, 12);
        try {

            problem.push(0, 13);
        } catch (Exception e)
        {
            System.out.println("Push not possible");
            assertTrue(true);
        }

        problem.push(1, 20);
        problem.push(1, 21);
        problem.push(1, 22);

        problem.push(2, 30);
        problem.push(2, 31);
        problem.push(2, 32);

        problem.printStack();

        //assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void ThreeStackStackTwoExceed() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        ThreeStack problem = new ThreeStack(3);

        problem.push(0, 10);
        problem.push(0, 11);
        problem.push(0, 12);


        problem.push(1, 20);
        problem.push(1, 21);
        problem.push(1, 22);
        try {
            problem.push(1, 13);
        } catch (Exception e)
        {
            System.out.println("Push not possible");
            assertTrue(true);
        }

        problem.push(2, 30);
        problem.push(2, 31);
        problem.push(2, 32);

        problem.printStack();

        //assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

    @Test
    void ThreeStackStackThreeExceed() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        ThreeStack problem = new ThreeStack(3);

        problem.push(0, 10);
        problem.push(0, 11);
        problem.push(0, 12);

        problem.push(1, 20);
        problem.push(1, 21);
        problem.push(1, 22);

        problem.push(2, 30);
        problem.push(2, 31);
        problem.push(2, 32);
        try {
            problem.push(2, 13);
        } catch (Exception e)
        {
            System.out.println("Push not possible");
            assertTrue(true);
        }

        problem.printStack();

        //assertEquals(true, result);
        util.log.consoleLog("\n**** End");
    }

}