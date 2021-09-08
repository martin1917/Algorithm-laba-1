package ui;

import javax.swing.*;
import java.awt.*;

public class UserInterface {
    private final String FONT_FAMALY = "Times New Roman";

    private JFrame frame;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JLabel title;
    private JLabel titleLeftPanel;
    private JLabel titleRightPanel;
    private JLabel nonOptimalLabel;
    private JLabel optimalLabel;
    private JLabel nonSortedLabel;
    private JLabel sortedLabel;
    private JSpinner spinnerNumLeft;
    private JSpinner spinnerNumRight;
    private JTextField timeFieldLeft1;
    private JTextField indexFieldLeft1;
    private JTextField timeFieldLeft2;
    private JTextField indexFieldLeft2;
    private JTextField timeFieldRight1;
    private JTextField indexFieldRight1;
    private JTextField timeFieldRight2;
    private JTextField indexFieldRight2;
    private JButton buttonLeft;
    private JButton buttonRight;

    {
        frame = new JFrame();
        frame.setLayout(new GridBagLayout());

        panelLeft = new JPanel(new GridBagLayout());
        panelRight = new JPanel(new GridBagLayout()); 

        title = new JLabel("Последовательный поиск");
        title.setFont(new Font(FONT_FAMALY, Font.BOLD | Font.ITALIC, 24));
        title.setForeground(new Color(128, 0, 0));

        titleLeftPanel = new JLabel("Неупорядоченный массив");
        titleLeftPanel.setFont(new Font(FONT_FAMALY, Font.ITALIC, 20));
        titleLeftPanel.setForeground(new Color(0, 0, 128));

        titleRightPanel = new JLabel("Упорядоченный массив");
        titleRightPanel.setFont(new Font(FONT_FAMALY, Font.ITALIC, 20));
        titleRightPanel.setForeground(new Color(0, 0, 128));

        nonOptimalLabel = new JLabel("Неоптимальный поиск");
        nonOptimalLabel.setFont(new Font(FONT_FAMALY, Font.CENTER_BASELINE, 18));
        nonOptimalLabel.setForeground(new Color(0, 167, 204));

        optimalLabel = new JLabel("Оптимальный поиск");
        optimalLabel.setFont(new Font(FONT_FAMALY, Font.CENTER_BASELINE, 18));
        optimalLabel.setForeground(new Color(0, 167, 204));

        nonSortedLabel = new JLabel("Поиск как в неупорядоченном");
        nonSortedLabel.setFont(new Font(FONT_FAMALY, Font.CENTER_BASELINE, 18));
        nonSortedLabel.setForeground(new Color(0, 167, 204));

        sortedLabel = new JLabel("Поиск как в упорядоченном");
        sortedLabel.setFont(new Font(FONT_FAMALY, Font.CENTER_BASELINE, 18));
        sortedLabel.setForeground(new Color(0, 167, 204));

        spinnerNumLeft = new JSpinner(new SpinnerNumberModel(145, Integer.MIN_VALUE, Integer.MAX_VALUE, 1));
        spinnerNumRight = new JSpinner(new SpinnerNumberModel(145, Integer.MIN_VALUE, Integer.MAX_VALUE, 1));

        timeFieldLeft1 = new JTextField();
        indexFieldLeft1 = new JTextField();
        timeFieldLeft2 = new JTextField();
        indexFieldLeft2 = new JTextField();
        timeFieldRight1 = new JTextField();
        indexFieldRight1 = new JTextField();
        timeFieldRight2 = new JTextField();
        indexFieldRight2 = new JTextField();

        JTextField[] allFields = {
            timeFieldLeft1, indexFieldLeft1, timeFieldLeft2, indexFieldLeft2,
            timeFieldRight1, indexFieldRight1, timeFieldRight2, indexFieldRight2,
        };
        
        for(JTextField field : allFields){
            field.setEditable(false);
            field.setBackground(Color.WHITE);
        }

        buttonLeft = new JButton("Найти");
        buttonRight = new JButton("Найти");    
    }

    public JFrame draw(String nameWindow){
        frame.setTitle(nameWindow);

        //#region Left
        panelLeft.add(titleLeftPanel, new GridBagConstraints(0, 0, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(nonOptimalLabel, new GridBagConstraints(0, 1, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(new JLabel("Ключ"), new GridBagConstraints(0, 2, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(spinnerNumLeft, new GridBagConstraints(1, 2, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(new JLabel("Время"), new GridBagConstraints(0, 3, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(timeFieldLeft1, new GridBagConstraints(1, 3, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(new JLabel("Индекс"), new GridBagConstraints(0, 4, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(indexFieldLeft1, new GridBagConstraints(1, 4, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(optimalLabel, new GridBagConstraints(0, 5, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(new JLabel("Время"), new GridBagConstraints(0, 6, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(timeFieldLeft2, new GridBagConstraints(1, 6, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(new JLabel("Индекс"), new GridBagConstraints(0, 7, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(indexFieldLeft2, new GridBagConstraints(1, 7, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelLeft.add(buttonLeft, new GridBagConstraints(0, 8, 2, 1, 0, 0,
            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );        
        //#endregion

        //#region Right
        panelRight.add(titleRightPanel, new GridBagConstraints(0, 0, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(nonSortedLabel, new GridBagConstraints(0, 1, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(new JLabel("Ключ"), new GridBagConstraints(0, 2, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(spinnerNumRight, new GridBagConstraints(1, 2, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(new JLabel("Время"), new GridBagConstraints(0, 3, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(timeFieldRight1, new GridBagConstraints(1, 3, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(new JLabel("Индекс"), new GridBagConstraints(0, 4, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(indexFieldRight1, new GridBagConstraints(1, 4, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(sortedLabel, new GridBagConstraints(0, 5, 2, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(new JLabel("Время"), new GridBagConstraints(0, 6, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(timeFieldRight2, new GridBagConstraints(1, 6, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(new JLabel("Индекс"), new GridBagConstraints(0, 7, 1, 1, 0.2, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(indexFieldRight2, new GridBagConstraints(1, 7, 1, 1, 1, 0,
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        panelRight.add(buttonRight, new GridBagConstraints(0, 8, 2, 1, 0, 0,
            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );
        //#endregion

        //#region General
        JPanel titleInPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titleInPanel.add(title);
        frame.add(titleInPanel, new GridBagConstraints(0, 0, 2, 1, 1, 0, 
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        frame.add(panelLeft, new GridBagConstraints(0, 1, 1, 1, 1, 1, 
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );

        frame.add(panelRight, new GridBagConstraints(1, 1, 1, 1, 1, 1, 
            GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
            new Insets(2, 5, 2, 5), 0, 0)
        );
        //#endregion

        return frame;
    }

    public JButton getLeftButton(){
        return buttonLeft;
    }

    public JButton getRightButton(){
        return buttonRight;
    }

    public JTextField getTimeFieldLeft1(){
        return timeFieldLeft1;
    }

    public JTextField getIndexFieldLeft1(){
        return indexFieldLeft1;
    }

    public JTextField getTimeFieldLeft2(){
        return timeFieldLeft2;
    }

    public JTextField getIndexFieldLeft2(){
        return indexFieldLeft2;
    }

    public JTextField getTimeFieldRight1(){
        return timeFieldRight1;
    }

    public JTextField getIndexFieldRight1(){
        return indexFieldRight1;
    }

    public JTextField getTimeFieldRight2(){
        return timeFieldRight2;
    }

    public JTextField getIndexFieldRight2(){
        return indexFieldRight2;
    }

    public JSpinner getLeftSpinner(){
        return spinnerNumLeft;
    }

    public JSpinner getRightSpinner(){
        return spinnerNumRight;
    }
}
