/*
1. Reverta a ordem das palavras nas frases, mantendo a ordem das palavras:
a. Input: "Hello, World! OpenAl is amazing."
b. Output: "amazing. is OpenAI World! Hello,"
*/
public class Ex1 {
    public Ex1() {

    }

    public String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]).append(" ");
        }
        return fraseInvertida.toString().trim();
    }
}
