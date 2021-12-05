package com.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame {
    public Board() {
        final StringBuilder[] screen = {new StringBuilder()};
        final int[] result = new int[1];

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 520, 638);
        setLayout(null);
        Font font = new Font("Arial", Font.BOLD, 32);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton button_plus = new JButton("+");
        JButton button_minus = new JButton("-");
        JButton button_multi = new JButton("*");
        JButton button_division = new JButton("/");
        JButton button_equal = new JButton("=");
        JLabel screenView = new JLabel("0");

        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        button5.setFont(font);
        button6.setFont(font);
        button7.setFont(font);
        button8.setFont(font);
        button9.setFont(font);
        button0.setFont(font);
        button_division.setFont(font);
        button_minus.setFont(font);
        button_multi.setFont(font);
        button_plus.setFont(font);
        button_equal.setFont(font);
        screenView.setFont(font);
        screenView.setHorizontalAlignment(SwingConstants.RIGHT);

        screenView.setBounds(0,0,400,100);
        button_equal.setBounds(400,0,104,100);
        button1.setBounds(0,100,168,125);
        button2.setBounds(168,100,168,125);
        button3.setBounds(336,100,168,125);
        button4.setBounds(0,225,168,125);
        button5.setBounds(168,225,168,125);
        button6.setBounds(336,225,168,125);
        button7.setBounds(0,350,168,125);
        button8.setBounds(168,350,168,125);
        button9.setBounds(336,350,168,125);
        button_plus.setBounds(0,475,84,125);
        button_minus.setBounds(84,475,84,125);
        button0.setBounds(168,475,168,125);
        button_multi.setBounds(336,475,84,125);
        button_division.setBounds(420,475,84,125);

        add(screenView);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button0);
        add(button_plus);
        add(button_minus);
        add(button_multi);
        add(button_division);
        add(button_equal);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(1);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(2);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(3);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(4);
                screenView.setText(String.valueOf(screen[0]));
            }

        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(5);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(6);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(7);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(8);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(9);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(0);
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(" + ");
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(" - ");
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button_division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(" / ");
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button_multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                screen[0].append(" * ");
                screenView.setText(String.valueOf(screen[0]));
            }
        });

        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] values = String.valueOf(screen[0]).split(" ");
                result[0] = Integer.parseInt(values[0]);
                for(int i = 0; i < values.length; i++){
                    if (values[i].equals("+")){
                        result[0] += Integer.parseInt(values[i + 1]);
                    }
                    if (values[i].equals("*")){
                        result[0] *= Integer.parseInt(values[i + 1]);
                    }
                    if (values[i].equals("-")){
                        result[0] -= Integer.parseInt(values[i + 1]);
                    }
                    if (values[i].equals("/")){
                        result[0] /= Integer.parseInt(values[i + 1]);
                    }
                }
                screenView.setText(String.valueOf(result[0]));
                screen[0] = new StringBuilder("");
            }
        });
        setVisible(true);
    }
}
