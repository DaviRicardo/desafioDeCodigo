/*
3. Encontre a substring palindroma mais longa na string abaixo:
a. Input: "babad"
b. Output: "bab" (Observação: pode haver várias saidas válidas, você só precisa
retornar uma delas.)
*/
public class Ex3 {
    public Ex3() {

    }
    public String maiorStringPalindroma(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        int inicio = 0;
        int fim = 0;

        for (int i = 0; i < input.length(); i++) {
            int comprimento1 = expandirDoCentro(input, i, i);    // Considerando o centro com apenas um caractere
            int comprimento2 = expandirDoCentro(input, i, i + 1); // Considerando o centro com dois caracteres

            int comprimentoMaximo = Math.max(comprimento1, comprimento2);

            if (comprimentoMaximo > fim - inicio) {
                inicio = i - (comprimentoMaximo - 1) / 2;
                fim = i + comprimentoMaximo / 2;
                }
            }

            return input.substring(inicio, fim + 1);
        }
        private static int expandirDoCentro(String input, int esquerda, int direita) {
            while (esquerda >= 0 && direita < input.length() && input.charAt(esquerda) == input.charAt(direita)) {
                esquerda--;
                direita++;
            }
            return direita - esquerda - 1;
        }
    }
