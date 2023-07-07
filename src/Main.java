import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int opcaoMenu;
        String input;

        opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(
                null, """
                        1 - Reverter String
                        2 - Remover duplicatas
                        3 - Substring palindrômica
                        4 - Primeira letra maiúscula
                        """, "Escolha uma opção", JOptionPane.INFORMATION_MESSAGE));


        switch (opcaoMenu) {
            case 1 -> {
                Ex1 exercicio1 = new Ex1();
                input = JOptionPane.showInputDialog("Digite uma frase: ");
                JOptionPane.showMessageDialog(null, exercicio1.inverterPalavras(input), "Frase invertida", JOptionPane.INFORMATION_MESSAGE);
            }
            case 2 -> {
                Ex2 exercicio2 = new Ex2();
                input = JOptionPane.showInputDialog("Digite uma frase: ");
                JOptionPane.showMessageDialog(null, exercicio2.removerDuplicados(input), "String sem duplicatas", JOptionPane.INFORMATION_MESSAGE);
            }
            case 3 -> {
                Ex3 exercicio3 = new Ex3();
                input = JOptionPane.showInputDialog("Digite uma string: ");
                JOptionPane.showMessageDialog(null, "Maior substring palindrômica: " + exercicio3.maiorStringPalindroma(input), "Substring extraída", JOptionPane.INFORMATION_MESSAGE);
            }
            case 4 -> {
                Ex4 exercicio4 = new Ex4();
                input = JOptionPane.showInputDialog("Digite uma frase: ");
                JOptionPane.showMessageDialog(null, exercicio4.converterMaisculo(input), "Frase com primeiras letras maísculas", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}