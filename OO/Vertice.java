/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosAula.OO;

/**
 *
 * @author Glasielly
 * @param <T>
 */
public class Vertice<T> {

    private T rotulo;
    private static int id = 0;
    private final int index;

    public Vertice(T rotulo) {
        this.rotulo = rotulo;
        this.index = id++;
    }

    public void imprime() {
        System.out.print(rotulo);
    }

    /**
     * @return the rotulo
     */
    public T getRotulo() {
        return rotulo;
    }

    /**
     * @param rotulo the rotulo to set
     */
    public void setRotulo(T rotulo) {
        this.rotulo = rotulo;
    }

    public int getIndex() {
        return index;
    }

}
