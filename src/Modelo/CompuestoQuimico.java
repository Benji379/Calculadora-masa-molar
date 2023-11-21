package Modelo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class CompuestoQuimico {

    private final String formula;
    private final TablaPeriodica tabla;

    public CompuestoQuimico(String formula, TablaPeriodica tabla) {
        this.formula = formula;
        this.tabla = tabla;
    }

    public String getFormulaQuimica() {
        Map<String, Integer> elementos = parseFormula();
        StringBuilder formulaHill = new StringBuilder();
        for (Map.Entry<String, Integer> entry : elementos.entrySet()) {
            formulaHill.append(entry.getKey());
            if (entry.getValue() > 1) {
                formulaHill.append(entry.getValue());
            }
        }
        return formulaHill.toString();
    }

    public double getMasaMolar() {
        Map<String, Integer> elementos = parseFormula();
        double masaMolar = 0.0;
        for (Map.Entry<String, Integer> entry : elementos.entrySet()) {
            String simbolo = entry.getKey();
            int cantidad = entry.getValue();
            String atributoMasa = "Masa";
            String masaElemento = tabla.getValorPorSimbolo(simbolo, atributoMasa);
            double masa = 0.0;
            try {
                masa = Double.parseDouble(masaElemento.replace(",", "."));
            } catch (NumberFormatException e) {
//                System.out.println("Error al convertir masa: " + e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            masaMolar += masa * cantidad;
        }
        return masaMolar;
    }

    private Map<String, Integer> parseFormula() {
        Map<String, Integer> elementos = new HashMap<>();
        Pattern pattern = Pattern.compile("([A-Z][a-z]?)(\\d*)");
        Matcher matcher = pattern.matcher(formula);
        while (matcher.find()) {
            String elemento = matcher.group(1);
            String cantidadStr = matcher.group(2);
            int cantidad = 1;
            if (cantidadStr != null && !cantidadStr.isEmpty()) {
                cantidad = Integer.parseInt(cantidadStr);
            }
            elementos.put(elemento, elementos.getOrDefault(elemento, 0) + cantidad);
        }
        return elementos;
    }

    public List<String> getSimbolosElementos() {
        List<String> simbolos = new ArrayList<>();
        Map<String, Integer> elementos = parseFormula();
        for (String elemento : elementos.keySet()) {
            simbolos.add(elemento);
        }
        return simbolos;
    }

    public List<Integer> getNumerosAtomosElementos() {
        List<Integer> numerosAtomos = new ArrayList<>();
        Map<String, Integer> elementos = parseFormula();
        for (String elemento : elementos.keySet()) {
            numerosAtomos.add(elementos.get(elemento));
        }
        return numerosAtomos;
    }
    
    public static void main(String[] args) {
        TablaPeriodica tabla = new TablaPeriodica("src\\Data\\TablaPeriodica.json");
        String formula = "CH3COONH4Na";
        CompuestoQuimico compuesto = new CompuestoQuimico(formula, tabla);

        String formulaQuimica = compuesto.getFormulaQuimica();
        System.out.println("Fórmula química en notación de Hill: " + formulaQuimica);

        double masaMolar = compuesto.getMasaMolar();
        System.out.println("Masa molar total del compuesto: " + masaMolar + " g/mol");
        List<String> simbolos = compuesto.getSimbolosElementos();
        for(String h : simbolos){
            System.out.println(h);
        }
    }
}
