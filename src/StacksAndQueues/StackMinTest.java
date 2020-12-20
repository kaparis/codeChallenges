package StacksAndQueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackMinTest {

    @Test
    void IncrementingMin() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        StackMin problem = new StackMin();

        problem.push(1);
        System.out.println("Min Is : " + problem.min());

        problem.push(3);
        System.out.println("Min Is : " + problem.min());

        problem.push(2);
        System.out.println("Min Is : " + problem.min());

        System.out.println("Min Is : " + problem.min());

        int result = problem.min();

        assertEquals(1,result);



        util.log.consoleLog("\n**** End");
    }

    @Test
    void DecrementingMin() throws Exception {
        util.log.consoleLog("**** Start Test: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        StackMin problem = new StackMin();

        problem.push(3);
        System.out.println("Min Is : " + problem.min());

        problem.push(2);
        System.out.println("Min Is : " + problem.min());

        problem.push(1);
        System.out.println("Min Is : " + problem.min());

        System.out.println("Min Is : " + problem.min());

        int result = problem.min();

        assertEquals(1,result);

        util.log.consoleLog("\n**** End");
    }

}