/*
2. Remova todos os caracteres duplicados da string abaixo:
a. Input: "Hello, World!"
b. Output: "Helo, Wrd!"
*/
public class Ex2 {
    public Ex2() {

    }

    public String removerDuplicados(String str) {
        StringBuilder novaString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char caractereAtual = str.charAt(i);
                if (novaString.indexOf(String.valueOf(caractereAtual)) == -1) {
                    novaString.append(caractereAtual);
                }
        }
        return novaString.toString();
    }
}
