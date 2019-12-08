/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Jeferson
 */
public class Combo {

    private String Combo;
    private String codCombo;

    public Combo(String codigo, String nome) {
        this.codCombo = codigo;
        this.Combo = nome;
    }

    public String toString() {
        return Combo;
    }

    public String getKey() {
        return codCombo;
    }
}

//}
