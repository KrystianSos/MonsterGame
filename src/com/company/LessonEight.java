package com.company;

public class LessonEight {

    public static void main(String[] args) {
        MonsterTwo.buildBattleBoard();

        char[][] tempBattleBoard = new char [10][10];

        MonsterTwo[] Monsters = new MonsterTwo[4];

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[0] = new MonsterTwo(500, 40, 2, "George");
        Monsters[0] = new MonsterTwo(750, 30, 2, "Paul");
        Monsters[0] = new MonsterTwo(800, 34, 1, "Hank");

        MonsterTwo.redrawBoard();

    }

}
