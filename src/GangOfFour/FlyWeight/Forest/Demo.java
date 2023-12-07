package GangOfFour.FlyWeight.Forest;

import java.awt.*;

public class Demo {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 10000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            int x = random(0, CANVAS_SIZE);
            int y = random(0, CANVAS_SIZE);
            boolean isFruitTree = i % 2 == 0;
            int countOfFruits = isFruitTree ? random(1, 5) : 0;

            if (y < CANVAS_SIZE / 3) {
                forest.plantTree(x, y, "Apple", Color.GREEN, "Oak", isFruitTree, countOfFruits);
            } else if (y < 2 * CANVAS_SIZE / 3) {
                forest.plantTree(x, y, "Pineapple", Color.ORANGE, "Oak", isFruitTree, countOfFruits);
            } else {
                forest.plantTree(x, y, "Mango", Color.YELLOW, "Oak", isFruitTree, countOfFruits);
            }
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}