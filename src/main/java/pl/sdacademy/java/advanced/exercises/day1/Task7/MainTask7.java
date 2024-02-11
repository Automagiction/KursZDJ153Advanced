package pl.sdacademy.java.advanced.exercises.day1.Task7;

public class MainTask7 {
    public static void main(String[] args) {
        WeaponClip weaponClip = new WeaponClip(5);
        weaponClip.loadBullet("shot_1");
        weaponClip.loadBullet("shot_2");
        weaponClip.loadBullet("shot_3");
        weaponClip.loadBullet("shot_4");
        weaponClip.loadBullet("shot_5");
        //weaponClip.loadBullet("hello_6"); // ex: clip is full

        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
    }

}
