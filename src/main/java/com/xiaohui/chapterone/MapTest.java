package com.xiaohui.chapterone;import java.util.HashMap;import java.util.Map;public class MapTest {    public static void main(String[] args) {        Map map = new HashMap<String,String>();        for (int i=0;i<11;i++){            map.put("key"+i,"value"+i);        }        System.out.println(map.size());    }}