/*
Given the coordinates of four points in 2D space p1, p2, p3 and p4, return true if the four points construct a square.

The coordinate of a point pi is represented as [xi, yi]. The input is not given in any order.

A valid square has four equal sides with positive length and four equal angles (90-degree angles).

Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
Output: true
*/

import java.util.HashSet;
import java.util.Set;

public class valid_square {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        set.add(dist(p1,p2));
        set.add(dist(p1,p3));
        set.add(dist(p1,p4));
        set.add(dist(p2,p3));
        set.add(dist(p2,p4));
        set.add(dist(p3,p4));
        
        return set.size() == 2 && !set.contains(0);
        
    }
    
    public int dist(int[] p, int[] q){
        return (q[0]-p[0])*(q[0]-p[0]) + (q[1]-p[1])*(q[1]-p[1]);
    }
}