package application;


import entities.Funcionario;
import entities.Visitante;


public class ArvoreVisitante {
    private No<Visitante> raiz = null;
    private int fatorBal;


    // Construtor que ordena a árvore pelo salário do Funcionario
    public ArvoreVisitante() {
    }

    public void inserir(Visitante visitante) {
        this.raiz = this.inserirBRec(this.raiz, visitante);
    }

    private No<Visitante> inserirBRec(No<Visitante> raiz, Visitante visitante) {
        if (raiz == null) {
            return new No<>(visitante);
        } else {

            if (raiz.getObjeto().getIdade() > visitante.getIdade()) {
                raiz.setLeft(this.inserirBRec(raiz.getLeft(), visitante));
            } else {
                raiz.setRight(this.inserirBRec(raiz.getRight(), visitante));
            }
        }
        fatorBalanceamento();
        return ajustarBalanceamento(raiz);
    }

    private No ajustarBalanceamento(No noAtual) {
        if (noAtual.getFb() > 1) {
            if (noAtual.getLeft().getFb() >= 0) {
                return rotacionarDireita(noAtual);
            } else {
                return rotacaoDulpaDireita(noAtual);
            }
        }

        if (noAtual.getFb() < -1) {
            if (noAtual.getRight().getFb() <= 0) {
                return rotacionarEsquerda(noAtual);
            } else {
                return rotacaoDulpaEsquerda(noAtual);
            }
        }

        return noAtual;
    }

    private No rotacionarDireita(No no) {
        No novoRaiz = no.getLeft();
        No subArvoreDireita = novoRaiz.getRight();
        no.setLeft(subArvoreDireita);
        novoRaiz.setRight(no);
        no.setFb(calcularFatorBalanceamento(no));
        novoRaiz.setFb(calcularFatorBalanceamento(novoRaiz));

        return novoRaiz;
    }

    private No rotacionarEsquerda(No no) {
        No novoRaiz = no.getRight();
        No subArvoreEsquerda = novoRaiz.getLeft();
        novoRaiz.setLeft(no);
        no.setRight(subArvoreEsquerda);
        no.setFb(calcularFatorBalanceamento(no));
        novoRaiz.setFb(calcularFatorBalanceamento(novoRaiz));
        return novoRaiz;
    }

    private No rotacaoDulpaDireita(No no) {
        no.setLeft(rotacionarEsquerda(no.getLeft()));
        return rotacionarDireita(no);
    }

    private No rotacaoDulpaEsquerda(No no) {
        no.setRight(rotacionarDireita(no.getRight()));
        return rotacionarEsquerda(no);
    }

    private int calcularFatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return calculaAltura(no.getLeft()) - calculaAltura(no.getRight());
    }

    private int calculaAltura(No no) {
        if (no == null) {
            return 0;
        }
        return Math.max(calculaAltura(no.getLeft()), calculaAltura(no.getRight())) + 1;
    }

    public void preorder() {
        this.preorderRec(this.raiz);
        System.out.println("Arvore preorder");
    }

    private void preorderRec(No<Visitante> raiz) {
        if (raiz != null) {
            System.out.print(raiz.getObjeto().getNome() + ": " + raiz.getObjeto().getIdade() + " | ");
            this.preorderRec(raiz.getLeft());
            this.preorderRec(raiz.getRight());
        }
    }

    public void inorder() {
        this.inorderRec(this.raiz);
        System.out.println("Arvore inorder");
    }

    private void inorderRec(No<Visitante> raiz) {
        if (raiz != null) {
            this.inorderRec(raiz.getLeft());
            System.out.print(raiz.getObjeto().getNome() + ": " + raiz.getObjeto().getIdade() + " | ");
            this.inorderRec(raiz.getRight());
        }
    }

    public void postorder() {
        this.postorderRec(this.raiz);
        System.out.println("Árvore postorder");
    }

    private void postorderRec(No<Visitante> raiz) {
        if (raiz != null) {
            this.postorderRec(raiz.getLeft());
            this.postorderRec(raiz.getRight());
            System.out.print(raiz.getObjeto().getNome() + ": " + raiz.getObjeto().getIdade() + " | ");
        }
    }

    public boolean buscar(Visitante visitante) {
        if (this.buscarRec(this.raiz, visitante)) {
            System.out.println("O visitante com idade " + visitante.getIdade() + " está na árvore.");
            return true;
        } else {
            System.out.println("O visitante com idade " + visitante.getIdade() + " não está na árvore.");
            return false;
        }
    }

    private boolean buscarRec(No<Visitante> raiz, Visitante visitante) {
        if (raiz == null) {
            return false;
        } else {
            if (raiz.getObjeto().getIdade() == visitante.getIdade()) {
                return true;
            } else if (raiz.getObjeto().getIdade() > visitante.getIdade()) {
                return this.buscarRec(raiz.getLeft(), visitante);
            } else {
                return this.buscarRec(raiz.getRight(), visitante);
            }
        }
    }

    public void removerNo(Visitante visitante) {
        this.raiz = this.removerRec(this.raiz, visitante);
    }

    private No<Visitante> removerRec(No<Visitante> raiz, Visitante visitante) {
        if (raiz == null) {
            return null;
        } else {
            if (raiz.getObjeto().getIdade() > visitante.getIdade()) {
                raiz.setLeft(this.removerRec(raiz.getLeft(), visitante));
            } else if (raiz.getObjeto().getIdade() < visitante.getIdade()) {
                raiz.setRight(this.removerRec(raiz.getRight(), visitante));
            } else {
                // Caso 1: nó sem filhos
                if (raiz.getLeft() == null && raiz.getRight() == null) {
                    return null;
                }

                // Caso 2: nó com apenas um filho
                if (raiz.getLeft() == null) {
                    return raiz.getRight();
                } else if (raiz.getRight() == null) {
                    return raiz.getLeft();
                }

                // // Caso 3: nó com dois filhos - Substituição pelo menor valor da subárvore direita
                No<Visitante> temp = raiz.getRight();
                while (temp.getLeft() != null) {
                    temp = temp.getLeft();
                }
                raiz.setObjeto(temp.getObjeto());
                raiz.setRight(this.removerRec(raiz.getRight(), temp.getObjeto()));
            }
            fatorBalanceamento();
            return ajustarBalanceamento(raiz);
        }
    }


    public void fatorBalanceamento() {
        this.calculaFBRec(this.raiz);
    }

    private int calculaFBRec(No<Visitante> no) {
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

    private void imprimirArvoreRec(No<Visitante> no, int nivel) {
        if (no != null) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }
            System.out.println("Nome: " + no.getObjeto().getNome() + " Idade: " + no.getObjeto().getIdade() + " nível: " + nivel + " FB: " + no.getFb());
            this.imprimirArvoreRec(no.getLeft(), nivel + 1);
            this.imprimirArvoreRec(no.getRight(), nivel + 1);
        }
    }
}
