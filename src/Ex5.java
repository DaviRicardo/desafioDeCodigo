/*
5. Verifique se a string é um anagrama de um palindromo:
a. Input: "racecar"
b. Output: true

(Atenção: Um anagrama de "racecar" pode formar um palindromo: "racecar")
*/
import java.util.HashMap;
import java.util.Map;

public class Ex5 {
    public Ex5() {

    }

    public boolean anagramaPalindromo(String input) {
        Map<Character, Integer> mapaContadorChar = new HashMap<>();

        for (char c : input.toCharArray()) {
            mapaContadorChar.put(c, mapaContadorChar.getOrDefault(c, 0) + 1);
        }

        int contImpar = 0;

        for (int count : mapaContadorChar.values()) {
            if (count % 2 != 0) {
                contImpar++;
            }
            if (contImpar > 1) {
                    return false;
            }
        }
        return true;
    }
}
