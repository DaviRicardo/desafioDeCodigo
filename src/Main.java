import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcaoMenu;
        String input;

        opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(
                null, "1 - Reverter String", "Escolha uma opção: ", JOptionPane.INFORMATION_MESSAGE));

        switch (opcaoMenu) {
            case 1:
                Ex1 exercicio1 = new Ex1();
                input = JOptionPane.showInputDialog("Digite uma frase: ");
                JOptionPane.showMessageDialog(null, exercicio1.inverterPalavras(input), "Frase invertida", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}