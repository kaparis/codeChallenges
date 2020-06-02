/*
 * Problem
 * =====================
 * Three in One
 *
 * Describe how you could use a single array to implement three stacks.
 *
 * Create a data structure ThreeStack that represents three stacks.
 * Implementation of ThreeStacks should use only one array,
 * i.e., the three stacks should use the same array for storing elements.
 *
 * Example
 * =====================
 * array size 12
 * stack 1 : 0 to 3 --> 0 to 12/3 = 4 --> inclusive 0 to n/3 exclusive
 * Stack 2 : 4 to 8 --> 4 to 12/3 * 2 = 8 --> inclusive n/3 to 2n/3 exclusive
 * Stack 3 : 8 to 12 --> 8 to 12 --> inclusive 2n/3 N exclusive
 *
 * Solution Notes
 * =====================
 * Approach 1: all three stacks are equal in size, cavet is one stack could be empty
 * Approach 2: flexiable space allocation, space efficent
 *
 */

package StacksAndQueues;

public class ThreeStack {

    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    /* Push value onto stack. */
    public void push(int stackNum, int value) throws Exception {
        /* Check that we have space for the next element */
        if (isFull(stackNum)) {
            throw new Exception();
        }

        /* Increment stack pointer and then update top value. */
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    /* Pop item from top stack. */
    public int pop(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            throw new Exception();
        }

        int topindex = indexOfTop(stackNum);
        int value = values[topindex];// Get top
        values[topindex] = 0; // Clear
        sizes[stackNum]--; // Shrink
        return value;
    }

    /* Return top element. */
    public int peek(int stackNum) throws Exception {
        if (isEmpty(stackNum)) {
            throw new Exception();
        }
        return values[indexOfTop(stackNum)];
    }

    /* Return if stack is empty. */

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    /* Return if stack is full. */
    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    /* Returns index of the top of the stack. */
    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    public void printStack()
    {
//        int stackOneStart = 0;
//        int stackOneMiddle = stackNum / (stackCapacity * numberOfStacks) - 1;
//        int stackTwoEnd = 2*stackNum / (stackCapacity * numberOfStacks) - 1;
//        int stackThreeEnd = stackCapacity * numberOfStacks - 1;
//
////        for (int i = stackOneStart ; i < stackNum; i++)
////        {
////
////        }
////
        for(int value : values)
        {
            System.out.print("[" + value + "] ");
        }
    }
}