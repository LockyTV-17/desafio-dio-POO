package br.com.dio.desafio.dominio;

import java.time.LocalDate;


public class Mentoria {
    private String titulo;
    private String descricao;
    private String cargahoraria;
    private LocalDate data;
    
    public Mentoria(){
        
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo +
         ", descricao=" + descricao + ", cargahoraria=" + cargahoraria + ", data="
                + data + "]";
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(String cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    
}
