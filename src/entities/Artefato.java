package entities;

import java.util.Date;
import java.util.List;

    public class Artefato {
        private int id; //(identificador único para cada artefato)
        private String nome; //(nome do artefato)
        private String descricao; //(descrição detalhada do artefato)
        private String material; //(material do qual o artefato é feito)
        private String origem; //(local de origem do artefato)
        private Date datacao; // (data estimada ou precisa de criação do artefato)
        private String estadoConservacao; //(bom, regular, ruim)
        private String valorHistorico; // (descrição do valor histórico do artefato)
        private List<Evento> historico; // (Lista de eventos relacionados ao artefato como aquisição, restauração, exposição)

    }
