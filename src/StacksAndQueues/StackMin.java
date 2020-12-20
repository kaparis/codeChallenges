/*
*
* Problem
* =====================
* Delete Middle Node
*
* How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element?
* Push, pop and min should all operate in 0(1) time.
*
* Questions to ask
* =====================
* Is space a constraint?
* Can I assume a fixed size for this stack?
*
* Example
* =====================
* push(5); // stack is {5}, min is 5
* push(6); // stack is {6, 5}, min is 5
* push(3); // stack is {3, 6, 5}, min is 3
* push(7); // stack is {7, 3, 6, 5}, min is 3
* pop(); // pops 7. stack is {3, 6, 5}, min is 3
* pop(); // pops 3. stack is {6, 5}. min is 5
*
* Solution Notes
* =====================
* create a array that maintains a pointer to laster element, enables push, pop
* create a pointer that maintains min location, reevalute on push or pop new min.
*
* Solution Evolution
* =====================
* Start with fixed size array
* Evolve to use a object to maintain value and current min value on stack
* Evolve to use a dynamically growing list (use a built in object or build yourself)
* Evolve to use less space
*/

package StacksAndQueues;

import java.util.Stack;

public class StackMin {

    private int stackTop = 0;
    private int stack[] = new int[10];
    private int stackminTopIndex = 0;
    private int stackmin[] = new int[10];


    void push(int value)
    {
        stack[stackTop++] = value;

        //String minvalue = Integer.toString(stackmin[stackminTopIndex]);
        //util.log.consoleLog(minvalue);

        if (stackminTopIndex == 0) {
            //initilaized
            stackmin[stackminTopIndex] = stackmin[stackminTopIndex];
        } else if  (stackmin[stackminTopIndex] < value) {
            stackmin[stackminTopIndex++] = stackmin[stackminTopIndex];
        } else {
            stackmin[stackminTopIndex++] = value;
        }
    }

    int pop()
    {
        stackminTopIndex--;
        return stack[stackTop--];
    }
    
    int min()
    {
        return stack[stackminTopIndex];
    }
}