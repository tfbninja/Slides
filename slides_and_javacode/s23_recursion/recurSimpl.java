package s23_recursion;

/**
 *
 * @author Tim Barber
 */
public class recurSimpl {

    public static void main(String[] args) {
        int[] testCases = {1, 2, 3, 4, 5, 6, 2000};
        int[] answers = {1, 3, 6, 10, 15, 21, 2001000};
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Sum from 1 to " + testCases[i] + " should be " + answers[i] + " and is " + add1ToN(testCases[i]));
            System.out.println("Sum from 1 to " + testCases[i] + " should be " + answers[i] + " and is " + recurAdd1ToN(testCases[i]));
            System.out.println("Sum from 1 to " + testCases[i] + " should be " + answers[i] + " and is " + add1ToN2(testCases[i]));
        }
    }

    public static int add1ToN(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        return count;
    }

    public static int recurAdd1ToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recurAdd1ToN(n - 1);
    }

    public static int add1ToN2(int n) {
        return n * (n - 1) / 2;
    }
}

/*
 * The MIT License
 *
 * Copyright (c) 2019 Tim Barber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
