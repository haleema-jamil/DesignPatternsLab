package GangOfFour.FlyWeight.Forest;

import java.awt.*;

public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public void draw(Graphics g, int x, int y) {
        if (isFruitTree) {
            drawFruitTree(g, x, y);
        } else {
            drawRegularTree(g, x, y);
        }
    }

    private void drawRegularTree(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);

        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }

    private void drawFruitTree(Graphics g, int x, int y) {
        drawRegularTree(g, x, y);

        // Draw fruits on the tree
        g.setColor(Color.RED);
        for (int i = 0; i < countOfFruits; i++) {
            int offsetX = (i - countOfFruits / 2) * 5; // Adjust position based on count
            g.fillOval(x - 2 + offsetX, y - 15, 5, 5);
        }
    }
}
