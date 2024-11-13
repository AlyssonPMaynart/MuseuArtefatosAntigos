package application;

public class No<T> {
    private T objeto;
    private No<T> left;
    private No<T> right;
    private int fb;

    public No(T objeto) {
        this.objeto = objeto;
        this.left = null;
        this.right = null;
        this.fb = 0;
    }

    public T getObjeto() {
        return this.objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public No<T> getLeft() {
        return this.left;
    }

    public void setLeft(No<T> left) {
        this.left = left;
    }

    public No<T> getRight() {
        return this.right;
    }

    public void setRight(No<T> right) {
        this.right = right;
    }

    public int getFb() {
        return this.fb;
    }

    public void setFb(int fb) {
        this.fb = fb;
    }

    @Override
    public String toString() {
        return "No{objeto=" + objeto + ", left=" + left + ", right=" + right + ", fb=" + fb + "}";
    }
}

