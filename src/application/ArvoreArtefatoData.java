package application;

import entities.Artefato;

public class ArvoreArtefatoData {
    private No<Artefato> raiz = null;
    private int fatorBal;


    // Construtor que ordena a árvore pelo salário do Funcionario
    public ArvoreArtefatoData() {
    }

    public void inserir(Artefato artefato) {
        this.raiz = this.inserirBRec(this.raiz, artefato);
    }

    private No<Artefato> inserirBRec(No<Artefato> raiz, Artefato artefato) {
        if (raiz == null) {
            return new No<>(artefato);
        } else {

            if (raiz.getObjeto().getDatacao() > artefato.getDatacao()) {
                raiz.setLeft(this.inserirBRec(raiz.getLeft(), artefato));
            } else{
                raiz.setRight(this.inserirBRec(raiz.getRight(), artefato));
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

    private No rotacaoDulpaDireita(No no){
        no.setLeft(rotacionarEsquerda(no.getLeft()));
        return rotacionarDireita(no);
    }

    private No rotacaoDulpaEsquerda(No no){
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

    private void preorderRec(No<Artefato> raiz) {
        if (raiz != null) {
            System.out.print(raiz.getObjeto().getNome() +": "+ raiz.getObjeto().getDatacao() + " |");
            this.preorderRec(raiz.getLeft());
            this.preorderRec(raiz.getRight());
        }
    }

    public void inorder() {
        this.inorderRec(this.raiz);
        System.out.println("Arvore inorder");
    }

    private void inorderRec(No<Artefato> raiz) {
        if (raiz != null) {
            this.inorderRec(raiz.getLeft());
            System.out.print(raiz.getObjeto().getNome() +": "+raiz.getObjeto().getDatacao() + " |");
            this.inorderRec(raiz.getRight());
        }
    }

    public void postorder() {
        this.postorderRec(this.raiz);
        System.out.println("Árvore postorder");
    }

    private void postorderRec(No<Artefato> raiz) {
        if (raiz != null) {
            this.postorderRec(raiz.getLeft());
            this.postorderRec(raiz.getRight());
            System.out.print(raiz.getObjeto().getNome() +": "+raiz.getObjeto().getDatacao() + " |");
        }
    }

    public boolean buscar(Artefato artefato) {
        if (this.buscarRec(this.raiz, artefato)) {
            System.out.println("O artefato com data " + artefato.getDatacao() + " está na árvore.");
            return true;
        } else {
            System.out.println("O artefato com data " + artefato.getDatacao() + " não está na árvore.");
            return false;
        }
    }

    private boolean buscarRec(No<Artefato> raiz, Artefato artefato) {
        if (raiz == null) {
            return false;
        } else {
            if (artefato.getDatacao() == raiz.getObjeto().getDatacao()) {
                return true;
            } else if (raiz.getObjeto().getDatacao() < artefato.getDatacao()) {
                return this.buscarRec(raiz.getLeft(), artefato);
            } else {
                return this.buscarRec(raiz.getRight(), artefato);
            }
        }
    }

    public void removerNo(Artefato artefato) {
        this.raiz = this.removerRec(this.raiz, artefato);
    }

    private No<Artefato> removerRec(No<Artefato> raiz, Artefato artefato) {
        if (raiz == null) {
            return null;
        } else {
            if (raiz.getObjeto().getDatacao() > artefato.getDatacao()) {
                raiz.setLeft(this.removerRec(raiz.getLeft(), artefato));
            } else if (raiz.getObjeto().getDatacao() < artefato.getDatacao()) {
                raiz.setRight(this.removerRec(raiz.getRight(), artefato));
            } else {
                // Caso 1: nó sem filhos
                if (raiz.getLeft() == null && raiz.getRight() == null) {
                    return null;
                }

                // Caso 2: nó com apenas um filho
                if (raiz.getLeft() == null) {
                    return raiz.getRight();
                }else if (raiz.getRight() == null) {
                    return raiz.getLeft();
                }

                // // Caso 3: nó com dois filhos - Substituição pelo menor valor da subárvore direita
                No<Artefato> temp = raiz.getRight();
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

    private int calculaFBRec(No<Artefato> no) {
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

    private void imprimirArvoreRec(No<Artefato> no, int nivel) {
        if (no != null) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }
            System.out.println( "Nome: "+ no.getObjeto().getNome()+ " Data: "+no.getObjeto().getDatacao() + " nível: " + nivel + " FB: " + no.getFb());
            this.imprimirArvoreRec(no.getLeft(), nivel + 1);
            this.imprimirArvoreRec(no.getRight(), nivel + 1);
        }
    }

    public int contadorIDT() {
        return 0;
    }
}
