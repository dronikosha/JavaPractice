package ru.practice_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private int first_score;
    private int second_score;
    private String last_scorer;
    private String winner;
    private final JLabel result = new JLabel("Result: " + first_score + "X" + second_score, SwingConstants.CENTER);
    private final JLabel last = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    private final JLabel Winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public GUI () {
        super("Soccer");
        this.setBounds(200, 200, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        JButton milan = new JButton("AC Milan");
        container.add(milan);
        milan.addActionListener(new ButtonClickMilanListener ());
        JButton madrid = new JButton("Real Madrid");
        container.add(madrid);
        madrid.addActionListener(new ButtonClickMadridListener ());
        container.add(result);
        container.add(last);
        container.add(Winner);
        JLabel author = new JLabel("<html>Made by<br> Nikita Derevyankin <br>INBO-02-20", SwingConstants.CENTER);
        container.add(author);

        JMenuBar menu = new JMenuBar();
        menu.add(settings());
        setJMenuBar(menu);


    }

    private JMenu settings() {
        JMenu settings = new JMenu("Setting");
        JMenuItem reset = new JMenuItem("Reset");
        settings.add(reset);
        reset.addActionListener(e -> {
             first_score = 0;
             second_score = 0;
             result.setText("Result: " + first_score + "X" + second_score);
             last_scorer = "N/A";
             last.setText("Last Scorer: " + last_scorer);
             Winner.setText("Winner: DRAW");

        });
        return settings;
    }


    class ButtonClickMilanListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            first_score++;
            result.setText("Result: " + first_score + "X" + second_score);
            last_scorer = "AC Milan";
            last.setText("Last Scorer: " + last_scorer);
            winner_team();

        }
    }

    class ButtonClickMadridListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            second_score++;
            result.setText("Result: " + first_score + "X" + second_score);
            last_scorer = "Real Madrid";
            last.setText("Last Scorer: " + last_scorer);
            winner_team();
        }
    }

    private void winner_team() {
        if (first_score > second_score) {
            Winner.setText("Winner: AC Milan");
        }
        else if (first_score == second_score) {
            Winner.setText("Winner: DRAW");
        }
        else {
            Winner.setText("Winner: Real Madrid");
        }
    }
}
