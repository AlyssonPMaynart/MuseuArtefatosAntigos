package application;

import entities.Funcionario;

import java.util.Comparator;

public class ArvoreSalario {
    private No<Funcionario> raiz = null;
    private int fatorBal;
    private Comparator<Funcionario> comparator;

    // Construtor que ordena a árvore pelo salário do Funcionario
    public ArvoreSalario() {
        this.comparator = Comparator.comparing(Funcionario::getSalario);
    }

    public void inserir(Funcionario funcionario) {
        this.raiz = this.inserirBRec(this.raiz, funcionario);
    }

    private No<Funcionario> inserirBRec(No<Funcionario> raiz, Funcionario funcionario) {
        if (raiz == null) {
            return new No<>(funcionario);
        } else {
            int comparacao = comparator.compare(funcionario, raiz.getObjeto());
            if (comparacao < 0) {
                raiz.setLeft(this.inserirBRec(raiz.getLeft(), funcionario));
            } else if (comparacao > 0) {
                raiz.setRight(this.inserirBRec(raiz.getRight(), funcionario));
            }

            return raiz;
        }
    }

    public void preorder() {
        this.preorderRec(this.raiz);
        System.out.println("Arvore preorder");
    }

    private void preorderRec(No<Funcionario> raiz) {
        if (raiz != null) {
            System.out.print(raiz.getObjeto().getSalario() + " ");
            this.preorderRec(raiz.getLeft());
            this.preorderRec(raiz.getRight());
        }
    }

    public void inorder() {
        this.inorderRec(this.raiz);
        System.out.println("Arvore inorder");
    }

    private void inorderRec(No<Funcionario> raiz) {
        if (raiz != null) {
            this.inorderRec(raiz.getLeft());
            System.out.print(raiz.getObjeto().getSalario() + " ");
            this.inorderRec(raiz.getRight());
        }
    }

    public void postorder() {
        this.postorderRec(this.raiz);
        System.out.println("Árvore postorder");
    }

    private void postorderRec(No<Funcionario> raiz) {
        if (raiz != null) {
            this.postorderRec(raiz.getLeft());
            this.postorderRec(raiz.getRight());
            System.out.print(raiz.getObjeto().getSalario() + " ");
        }
    }

    public boolean buscar(Funcionario funcionario) {
        if (this.buscarRec(this.raiz, funcionario)) {
            System.out.println("O funcionário com salário " + funcionario.getSalario() + " está na árvore.");
            return true;
        } else {
            System.out.println("O funcionário com salário " + funcionario.getSalario() + " não está na árvore.");
            return false;
        }
    }

    private boolean buscarRec(No<Funcionario> raiz, Funcionario funcionario) {
        if (raiz == null) {
            return false;
        } else {
            int comparacao = comparator.compare(funcionario, raiz.getObjeto());
            if (comparacao == 0) {
                return true;
            } else if (comparacao < 0) {
                return this.buscarRec(raiz.getLeft(), funcionario);
            } else {
                return this.buscarRec(raiz.getRight(), funcionario);
            }
        }
    }

    public void removerNo(Funcionario funcionario) {
        this.raiz = this.removerRec(this.raiz, funcionario);
    }

    private No<Funcionario> removerRec(No<Funcionario> raiz, Funcionario funcionario) {
        if (raiz == null) {
            return null;
        } else {
            int comparacao = comparator.compare(funcionario, raiz.getObjeto());
            if (comparacao < 0) {
                raiz.setLeft(this.removerRec(raiz.getLeft(), funcionario));
            } else if (comparacao > 0) {
                raiz.setRight(this.removerRec(raiz.getRight(), funcionario));
            } else {
                if (raiz.getLeft() == null) {
                    return raiz.getRight();
                }

                if (raiz.getRight() == null) {
                    return raiz.getLeft();
                }

                // Substituição pelo menor valor da subárvore direita
                No<Funcionario> temp = raiz.getRight();
                while (temp.getLeft() != null) {
                    temp = temp.getLeft();
                }
                raiz.setObjeto(temp.getObjeto());
                raiz.setRight(this.removerRec(raiz.getRight(), temp.getObjeto()));
            }

            return raiz;
        }
    }

    public void fatorBalanceamento() {
        this.calculaFBRec(this.raiz);
    }

    private int calculaFBRec(No<Funcionario> no) {
        if (no == null) {
            return 0;
        } else {
            int alturaEsquerda = this.calculaFBRec(no.getLeft());
            int alturaDireita = this.calculaFBRec(no.getRight());
            int fb = alturaEsquerda - alturaDireita;
            no.setFb(fb);
            return Math.max(alturaEsquerda, alturaDireita) + 1;
        }
    }

    public void imprimirArvore() {
        this.imprimirArvoreRec(this.raiz, 0);
    }

    private void imprimirArvoreRec(No<Funcionario> no, int nivel) {
        if (no != null) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }
            System.out.println(no.getObjeto().getSalario() + " nível: " + nivel + " FB: " + no.getFb());
            this.imprimirArvoreRec(no.getLeft(), nivel + 1);
            this.imprimirArvoreRec(no.getRight(), nivel + 1);
        }
    }
}

