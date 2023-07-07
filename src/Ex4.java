/*
4. Coloque em maiúscula a primeira letra de cada frase na string:
a. Input: "hello, how are you? i'm fine, thank you."
b. Output: "Hello. How are you? I'm fine, thank you."
*/
public class Ex4 {
    public Ex4() {

    }
    public String converterMaisculo(String input) {
        StringBuilder resultado = new StringBuilder();
        boolean verificarMaisculo = true; // Determina se o próximo caractere encontrado deve ou não ser maísculo

        for (char c : input.toCharArray()) {
            if (verificarMaisculo && Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
                verificarMaisculo = false;
            } else {
                resultado.append(c);
            }

            if (c == '.' || c == '!' || c == '?') {
                verificarMaisculo = true;
            }
        }
        return resultado.toString();
    }
}

