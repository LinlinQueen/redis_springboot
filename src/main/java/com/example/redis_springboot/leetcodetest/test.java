package com.example.redis_springboot.leetcodetest;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Yanx
 * @Create 2022-02-19-12:38
 */
public class test {
    @Test
    public void test(){
        String s ="EBBANCF";
       /* HashMap<Character, Integer> map=new HashMap<>();
        int maxLen=0;//用于记录最大不重复子串的长度
        int left=0;//滑动窗口左指针
        // E B B A N C F
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            //不管是否更新left，都要更新 s.charAt(i) 的位置！
            map.put(s.charAt(i),i);
            maxLen=Math.max(maxLen,i-left+1);
        }*/
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int i = 0;i<s.length();i++){
            if(map.containsKey((s.charAt(i)))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            maxLen = Math.max(maxLen,i-left+1);
        }


        System.out.println(maxLen);
    }
}
