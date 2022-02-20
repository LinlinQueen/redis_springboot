package com.example.redis_springboot.leetcodetest;

import java.util.Arrays;

/**
 * @Yanx
 * @Create 2022-02-20-15:46
 */
public class test773 {
    public static void main(String[] args) {
        int[][] image = { {1,1,1},{1,1,0},{1,0,1}};
//        System.out.println(image[0].length);
//        System.out.println(image.length);
//        System.out.println(image[1].length);
        int sr = 1, sc = 1, newColor = 2;
        int[][] ints = testaa.floodFill(image, sr, sc, newColor);
        for (int[] date : ints){
            System.out.println(Arrays.toString(date));
        }


    }


}
class testaa {
    public  static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        helper(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    public static void helper(int[][] image, int x, int y, int newColor, int oldColor) {
        if (x < 0 || x>= image.length || y<0 || y>=image[0].length ||
                image[x][y] == newColor || image[x][y] != oldColor ){
            return;
        }
        image[x][y] = newColor;
        helper(image,x,y+1,newColor,oldColor);
        helper(image,x,y-1,newColor,oldColor);
        helper(image,x+1,y,newColor,oldColor);
        helper(image,x-1,y,newColor,oldColor);
    }
}