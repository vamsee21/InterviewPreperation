/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

/**
 *
 * @author vamsee.n
 */
class GFG
{
    static int countStr(int n)
    {
    return 1 + (n * 2) +
           (n * ((n * n) - 1) / 2);
    }
 
// Driver code
public static void main (String[] args)
{
    int n = 4;
    System.out.println( countStr(n));
}
}