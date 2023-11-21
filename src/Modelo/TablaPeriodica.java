package Modelo;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class TablaPeriodica {

    private JSONObject elementos;

    public TablaPeriodica(String archivoJSON) {
        try {
            try (FileInputStream fileInputStream = new FileInputStream(archivoJSON)) {
                JSONTokener tokener = new JSONTokener(fileInputStream);
                elementos = new JSONObject(tokener);
            }
        } catch (JSONException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String getDato(int numeroAtomico, String atributo) {
        if (elementos != null) {
            JSONObject elemento = elementos.getJSONObject(String.valueOf(numeroAtomico));
            return elemento.optString(atributo, "Atributo no encontrado");
        } else {
            return "Error: No se pudo cargar el archivo JSON correctamente.";
        }
    }

    public String getValorPorSimbolo(String simbolo, String atributo) {
        if (elementos != null) {
            for (String numeroAtomico : elementos.keySet()) {
                JSONObject elemento = elementos.getJSONObject(numeroAtomico);
                if (elemento.has("Elemento") && elemento.getString("Elemento").equals(simbolo)) {
                    return elemento.optString(atributo, "Atributo no encontrado");
                }
            }
            return "Elemento no encontrado en la tabla periódica.";
        } else {
            return "Error: No se pudo cargar el archivo JSON correctamente.";
        }
    }

    public static void main(String[] args) {

//        int numeroAtomico = 4;
//        String atributo = "Masa";
//        String nombre = tabla.getDato(numeroAtomico, atributo);
//        System.out.println("El " + atributo + " del elemento con número atómico " + numeroAtomico + " es: " + nombre);

        TablaPeriodica tabla = new TablaPeriodica("src\\Data\\TablaPeriodica.json");
        String simbolo = "S";
        String atributoSimbolo = "Masa";
        String nombreSimbolo = tabla.getValorPorSimbolo(simbolo, atributoSimbolo);
        System.out.println("El " + atributoSimbolo + " del elemento con símbolo " + simbolo + " es: " + nombreSimbolo);
    }
}
