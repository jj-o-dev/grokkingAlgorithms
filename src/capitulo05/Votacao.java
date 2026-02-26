package capitulo05;

import java.util.HashMap;
import java.util.Map;

public class Votacao {
    static Map<String, Boolean> eleitores = new HashMap<>();
    public static void main(String[] args) {
        verificaEleitor("Tom");
        verificaEleitor("Mike");
        verificaEleitor("Mike");
    }

    private static void verificaEleitor(String nome) {
        if (eleitores.containsKey(nome)) {
            System.out.println("Vaza fi...");
        } else {
            eleitores.put(nome, true);
            System.out.println("Pode votar!");
        }
    }
}
