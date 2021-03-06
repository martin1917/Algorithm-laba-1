import ui.UserInterface;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import logic.Measure;
import logic.Solution;

public class App {
    public static void main(String[] args) throws Exception {
        UserInterface ui = new UserInterface();
        Solution solution = new Solution();

        int size = 100_000;
        int[] array = generateArray(size);

        ui.getLeftButton().addActionListener(e -> {
            int value = (int) ui.getLeftSpinner().getValue();

            int index1 = solution.nonOptimalLiniarSearch(array, value);
            double time1 = Measure.getTime(array, value, solution::nonOptimalLiniarSearch);            

            int index2 = solution.optimalLiniarSearch(array, value);
            double time2 = Measure.getTime(array, value, solution::optimalLiniarSearch);

            ui.getTimeFieldLeft1().setText("" + time1);
            ui.getIndexFieldLeft1().setText("" + index1);

            ui.getTimeFieldLeft2().setText("" + time2);
            ui.getIndexFieldLeft2().setText("" + index2);
        });
        
        ui.getRightButton().addActionListener(e -> {
            int value = (int) ui.getRightSpinner().getValue();

            int[] arrayCopy = array.clone();
            Arrays.sort(arrayCopy);

            int index1 = solution.optimalLiniarSearch(arrayCopy, value);
            double time1 = Measure.getTime(arrayCopy, value, solution::optimalLiniarSearch);            

            int index2 = solution.liniarSearchInSortedArray(arrayCopy, value);
            double time2 = Measure.getTime(arrayCopy, value, solution::liniarSearchInSortedArray);

            ui.getTimeFieldRight1().setText("" + time1);
            ui.getIndexFieldRight1().setText("" + index1);

            ui.getTimeFieldRight2().setText("" + time2);
            ui.getIndexFieldRight2().setText("" + index2);
        });


        SwingUtilities.invokeLater(() -> {
            JFrame frame = ui.draw("Лабораторная работа №1");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }

    private static int[] generateArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(25_000);
        }

        return arr;
    }
}