package s23_recursion;

/**
 *
 * @author Tim Barber
 */
public class recurSimpl {

    public static void main(String[] args) {
        System.out.println(go(4));
        System.out.println(go(5));
    }

    public static int go(int x) {
        if (x < 1) {
            return 1;
        } else {
            return x + go(x - 4) + go(x - 1);
        }
    }

    /*
     * 1
     */
    public static int add1ToN(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        return count;
    }

    /*
     * 2
     */
    public static int recurAdd1ToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recurAdd1ToN(n - 1);
    }

    /*
     * 3
     */
    public static int add1ToN2(int n) {
        return n * (n + 1) / 2;
    }

    public static int sum(int n) {
        return n < 2 ? 1 : n + sum(n - 1);
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
