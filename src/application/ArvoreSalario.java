package application;

import entities.Funcionario;



public class ArvoreSalario {
    private No<Funcionario> raiz = null;
    private int fatorBal;


    // Construtor que ordena a árvore pelo salário do Funcionario
    public ArvoreSalario() {
    }

    public void inserir(Funcionario funcionario) {
        this.raiz = this.inserirBRec(this.raiz, funcionario);
    }

    private No<Funcionario> inserirBRec(No<Funcionario> raiz, Funcionario funcionario) {
        if (raiz == null) {
            return new No<>(funcionario);
        } else {

            if (raiz.getObjeto().getSalario() > funcionario.getSalario()) {
                raiz.setLeft(this.inserirBRec(raiz.getLeft(), funcionario));
            } else{
                raiz.setRight(this.inserirBRec(raiz.getRight(), funcionario));
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

    private void preorderRec(No<Funcionario> raiz) {
        if (raiz != null) {
            System.out.print(raiz.getObjeto().getNome()+" - Salario: "+ raiz.getObjeto().getSalario() + " |");
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
            System.out.print(raiz.getObjeto().getNome()+" - Salario: "+ raiz.getObjeto().getSalario() + " |");
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
            System.out.print(raiz.getObjeto().getNome()+" - Salario: "+ raiz.getObjeto().getSalario() + " |");
        }
    }

    public boolean buscar(int idFuncionario) {
        return buscarRec(raiz, idFuncionario);
    }

    private boolean buscarRec(No<Funcionario> no, int idFuncionario) {
        if (no == null) {
            return false;
        } else if (no.getObjeto().getIdFuncionario() == idFuncionario) {
            return true;
        } else if (idFuncionario < no.getObjeto().getIdFuncionario()) {
            return buscarRec(no.getLeft(), idFuncionario);
        } else {
            return buscarRec(no.getRight(), idFuncionario);
        }
    }

    public void removerNo(Funcionario funcionario) {
        this.raiz = this.removerRec(this.raiz, funcionario);
    }

    private No<Funcionario> removerRec(No<Funcionario> raiz, Funcionario funcionario) {
        if (raiz == null) {
            return null;
        } else {
            if (raiz.getObjeto().getSalario() > funcionario.getSalario()) {
                raiz.setLeft(this.removerRec(raiz.getLeft(), funcionario));
            } else if (raiz.getObjeto().getSalario() < funcionario.getSalario()) {
                raiz.setRight(this.removerRec(raiz.getRight(), funcionario));
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
                No<Funcionario> temp = raiz.getRight();
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
            System.out.println( "ID: "+ no.getObjeto().getIdFuncionario()+" - Nome: "+ no.getObjeto().getNome()+ " Salario: "+no.getObjeto().getSalario() + " nível: " + nivel + " FB: " + no.getFb());
            this.imprimirArvoreRec(no.getLeft(), nivel + 1);
            this.imprimirArvoreRec(no.getRight(), nivel + 1);
        }
    }

    private int contadorDeIDT = 0;
    public int contadorIDT() {
        return this.contadorRec(this.raiz);
    }

    private int contadorRec(No<Funcionario> raiz) {
        int contei = 0;
        if (raiz != null) {
            this.contadorRec(raiz.getLeft());
            this.contadorRec(raiz.getRight());
            contei++;
        }
        return this.contadorDeIDT = contei;
    }
}

