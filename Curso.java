package com.mycompany.atividade02;

/**
 *
 * @author jonatas
 */
public class Curso {
 
    private String nomeCurso;
    private int quantidadeSemestres;
    private Coordenador coordenador;

    public Curso(String nomeCurso, int quantidadeSemestres, Coordenador coordenador) {
        this.nomeCurso = nomeCurso;
        this.quantidadeSemestres = quantidadeSemestres;
        this.coordenador = coordenador;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }
}
}
