package com.mycompany.java.tetris;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowGame {
    public static final int WIDTH = 445, HEIGHT = 629;

    private Board board;
    private Title title;
    private JFrame window;

    public WindowGame() {

        window = new JFrame("Tetris");
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        board = new Board();
        title = new Title(this);

        window.addKeyListener(board);
        window.addKeyListener(title);

        window.add(title);

        window.setVisible(true);
    }

    public void startTetris() {
        window.remove(title);
        window.addMouseMotionListener(board);
        window.addMouseListener(board);
        window.add(board);
        board.startGame();
        window.revalidate();
    }

    public void exitGame() {
        if (JOptionPane.showConfirmDialog(null, "ต้องการกลับไปหน้าหลัก?", null,
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            window.dispose();
            new MainMenu().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new WindowGame();
    }
}
