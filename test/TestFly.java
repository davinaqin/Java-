package edu.swun.test;

import edu.swun.fly.Balloon;
import edu.swun.fly.Bird;
import edu.swun.fly.Fly;
import edu.swun.fly.Plane;

public class TestFly {
    public static void main(String[] args) {
        Fly p = new Plane();
        Fly bi = new Bird();
        Fly ba = new Balloon();
        p.fly();
        bi.fly();
        ba.fly();
    }
}
