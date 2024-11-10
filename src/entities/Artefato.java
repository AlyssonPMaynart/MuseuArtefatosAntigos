package entities;

import java.util.Date;
import java.util.List;

    public class Artefato {
        private int id;
        private String nome;
        private String descricao;
        private String material;
        private String origem;
        private Date datacao;
        private String estadoConservacao;
        private String valorHistorico;
        private String localizacao;
        private List<Evento> historico; // Lista de eventos relacionados ao artefato

    }
