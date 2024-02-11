package pl.sdacademy.java.advanced.exercises.day1.Task7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class WeaponClip {
//    private final Deque<String> bullets = new ArrayDeque<>();     //ArrayDeque
    private final Stack<String> bullets = new Stack<>();     // Stack
    private final int maxNumberOfBulletsInClip;

    public WeaponClip(int capacity) {
        maxNumberOfBulletsInClip = capacity;
    }

    public void loadBullet(String bullet) {
        if(bullets.size() == maxNumberOfBulletsInClip) {
            throw new IllegalArgumentException("Clip is full");
            //return false;
        }
        bullets.push(bullet);
//        bullets.add(bullet);
    }
    public boolean isLoaded() {
        return !bullets.isEmpty();
    }
    public String shot(){
        if(isLoaded()){
            //wystrzel nabój
            return bullets.pop();
        }
        //zwroc komunikat o pustym magazynku
        return "*clic*";
    }
}
