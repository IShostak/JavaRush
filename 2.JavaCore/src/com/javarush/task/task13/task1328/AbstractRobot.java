package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    private static int hitCount;
    private String name;

    public AbstractRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = 0;
        int add = (int)(Math.random()*3);
        hitCount = hitCount + add;

        if (hitCount == 1) {
            hitCount = 0;
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            hitCount = 0;
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }else if (hitCount == 0) {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }

        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = 0;
        int add = (int)(Math.random()*3);
        hitCount = hitCount + add;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
            hitCount = 0;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
            hitCount = 0;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
            hitCount = 0;
        }
        else if (hitCount == 0) {
            defendedBodyPart = BodyPart.CHEST;
            hitCount = 0;
        }

        return defendedBodyPart;
    }
}
