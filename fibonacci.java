/**
* Author:       Conner Luzier
* Date:         1/19/2022
* Description:  Returns the nth term in the Fibonacci sequence given a number (index)
*
* @param  index     the number placed in the fibonacci sequence
* @return           the number of seconds it takes for the fibonacci sequence to reach the index
*/

class Fibonacci {
    public static long fibRecursive(long index) {
        //check arg to see if number is = 0, if so, return 0
        if (index == 0) {
            return 0;
        //check arg to see if number = 1, if so, return 1
        } else if (index == 1) {
            return 1;
        } else {
            //return fibRecursive(index - 1) + fibRecursive(index - 2)
            return fibRecursive(index - 1) + fibRecursive(index - 2);
        }
    }

    public static void main(String[] args) {
        //calls the recursive function with a argument of 10
        System.out.println(fibRecursive(10));
    }
}
