package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewGameSetupView extends View {

    private JPanel contentPanel;

    private JButton startGameButton;
    private JButton mainMenuButton;
    private JTextField characterNameField;
    private JTextField resilienceField;

    public NewGameSetupView() {
        this.contentPanel = new JPanel(new GridBagLayout());
        GridBagConstraints layout = new GridBagConstraints();

        JLabel label;

        label = new JLabel("New Game", SwingConstants.CENTER);
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.gridwidth = 4;
        layout.gridx = 0;
        layout.gridy = 0;
        this.contentPanel.add(label, layout);

        label = new JLabel("Choose your character name:");
        layout = new GridBagConstraints();
        layout.weightx = 0.2;
        layout.gridx = 0;
        layout.gridy = 1;
        this.contentPanel.add(label, layout);

        this.characterNameField = new JTextField();
        characterNameField.setPreferredSize(new Dimension(200,24));
        layout = new GridBagConstraints();
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.weightx = 0.3;
        layout.gridx = 1;
        layout.gridy = 1;
        this.contentPanel.add(characterNameField, layout);

        label = new JLabel("Resilience: ");
        layout = new GridBagConstraints();
        layout.weightx = 0.2;
        layout.gridx = 2;
        layout.gridy = 1;
        this.contentPanel.add(label, layout);

        this.resilienceField = new JTextField();
        resilienceField.setPreferredSize(new Dimension(50,24));
        resilienceField.setText("9");
        resilienceField.setEditable(false);
        layout = new GridBagConstraints();
        layout.fill = GridBagConstraints.HORIZONTAL;
        layout.weightx = 0.3;
        layout.gridx = 3;
        layout.gridy = 1;
        this.contentPanel.add(resilienceField, layout);

        this.startGameButton = new JButton("Begin Adventure!");
        layout = new GridBagConstraints();
        layout.gridx = 0;
        layout.gridy = 2;
        this.contentPanel.add(startGameButton, layout);

        this.mainMenuButton = new JButton("Return to Main Menu");
        layout = new GridBagConstraints();
        layout.gridx = 1;
        layout.gridy = 2;
        this.contentPanel.add(mainMenuButton, layout);
    }

    @Override
    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public String getCharacterName() {
        return this.characterNameField.getText();
    }

    public int getResilience() {
        return Integer.parseInt(this.resilienceField.getText());
    }

    public void addStartGameButtonListener(ActionListener listener) {
        this.startGameButton.addActionListener(listener);
    }

    public void addMainMenuButtonListener(ActionListener listener) {
        this.mainMenuButton.addActionListener(listener);
    }
}
