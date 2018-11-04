package view;

import model.Model;

import javax.swing.*;
import java.awt.*;

public class RootView extends JFrame {

    private Model model;

    private int windowHeight;
    private int windowWidth;

    public RootView(int height, int width, Model model) {
        this.model = model;
        this.windowHeight = height;
        this.windowWidth = width;

        this.setSize(windowWidth, windowHeight);
        this.setTitle("Text Adventure Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setWindowContentPanel(JPanel contentPanel) {
        this.setContentPane(contentPanel);
        this.validate();
    }

    public Component getWindowContentPanel() {
        return this.getContentPane();
    }
}
