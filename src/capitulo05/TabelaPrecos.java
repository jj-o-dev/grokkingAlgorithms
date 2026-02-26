package capitulo05;

import java.util.HashMap;
import java.util.Map;

public class TabelaPrecos {
    public static void main(String[] args) {
        Map<String, Double> tabela = new HashMap<>();

        tabela.put("Maçã", 0.67);
        tabela.put("Leite", 1.49);
        tabela.put("Abacate", 1.49);

        System.out.println(tabela);
        System.out.println(tabela.get("Abacate"));
    }
}
