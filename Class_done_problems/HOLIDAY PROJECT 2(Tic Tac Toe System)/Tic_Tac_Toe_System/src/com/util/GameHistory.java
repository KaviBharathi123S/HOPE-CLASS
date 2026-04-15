package com.util;
import java.util.*;
public class GameHistory {
    private List<String> history = new ArrayList<>();

    public void addResult(String result) {
        history.add(result);
    }
    public void showHistory() {
        System.out.println("\nGame History:");
        for(String h : history) {
            System.out.println(h);
        }
    }
    public void showLatestFirst() {
        Collections.reverse(history);
        System.out.println("\nLatest First:");
        for(String h : history) {
            System.out.println(h);
        }
    }
}