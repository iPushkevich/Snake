package by.pushkevich;

import javax.swing.*;

public class Game extends JFrame {
    public Game(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(400,400);
        add(new Field());
        setVisible(true);
    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}
