package entities;

import java.util.Date;
import java.util.List;

    public class Artefato {
        private int id; //(identificador único para cada artefato)
        private String nome; //(nome do artefato)
        private String descricao; //(descrição detalhada do artefato)
        private String material; //(material do qual o artefato é feito)
        private String origem; //(local de origem do artefato)
        private int datacao; // (data estimada ou precisa de criação do artefato)
        private String estadoConservacao; //(bom, regular, ruim)
        private int valorHistorico; // (descrição do valor histórico do artefato)


        public Artefato(int id, String nome, String descricao, String material, String origem, int datacao, String estadoConservacao, int valorHistorico) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
            this.material = material;
            this.origem = origem;
            this.datacao = datacao;
            this.estadoConservacao = estadoConservacao;
            this.valorHistorico = valorHistorico;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getOrigem() {
            return origem;
        }

        public void setOrigem(String origem) {
            this.origem = origem;
        }

        public int getDatacao() {
            return datacao;
        }

        public void setDatacao(int datacao) {
            this.datacao = datacao;
        }

        public String getEstadoConservacao() {
            return estadoConservacao;
        }

        public void setEstadoConservacao(String estadoConservacao) {
            this.estadoConservacao = estadoConservacao;
        }

        public int getValorHistorico() {
            return valorHistorico;
        }

        public void setValorHistorico(int valorHistorico) {
            this.valorHistorico = valorHistorico;
        }

    }
