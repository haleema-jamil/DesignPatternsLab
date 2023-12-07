package GangOfFour.FlyWeight.Forest;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);

        // Adjust the size of the tree based on location
        int treeSize = 10; // Default size
        if (y < 200) {
            treeSize = 5; // Small in the North
        } else if (y < 400) {
            treeSize = 10; // Medium in the Middle
        } else {
            treeSize = 15; // Large in the South
        }

        // Draw the tree
        g.setColor(color);
        g.fillOval(x - treeSize, y - (2 * treeSize), 2 * treeSize, 2 * treeSize);

        // Draw fruits for fruit trees
        if (isFruitTree) {
            for (int i = 0; i < countOfFruits; i++) {
                g.setColor(Color.RED);
                g.fillOval(x + i * 5, y - treeSize - 5, 5, 5);
            }
        }
    }
}
