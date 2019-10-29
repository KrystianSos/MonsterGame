package com.company;

import org.apache.commons.lang3.ArrayUtils;

public class LessonEight {

    public static void main(String[] args) {
        MonsterTwo.buildBattleBoard();

        //char[][] tempBattleBoard = new char[10][10];

        MonsterTwo[] Monsters = new MonsterTwo[4];

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[1] = new MonsterTwo(500, 40, 2, "George");
        Monsters[2] = new MonsterTwo(850, 30, 2, "Paul");
        Monsters[3] = new MonsterTwo(800, 34, 1, "Hank");

        MonsterTwo.redrawBoard();

        for (MonsterTwo m : Monsters)
        {

            if(m.getAlive())
            {
                int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
                m.moveMonster(Monsters, arrayItemIndex);
            }

        }

        MonsterTwo.redrawBoard();
    }

}
