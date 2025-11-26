package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFInal = dataInicio.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    
    
    // public Bootcamp(String nome, String descicao, Set<Dev> devsIncritos, Set<Conteudo> conteudos) {
    //     this.nome = nome;
    //     this.descicao = descicao;
    //     this.devsIncritos = devsIncritos;
    //     this.conteudos = conteudos;
    // }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descicao) {
        this.descricao = descicao;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public LocalDate getDataFInal() {
        return dataFInal;
    }
    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }
    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
        result = prime * result + ((dataFInal == null) ? 0 : dataFInal.hashCode());
        result = prime * result + ((devsIncritos == null) ? 0 : devsIncritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (dataInicio == null) {
            if (other.dataInicio != null)
                return false;
        } else if (!dataInicio.equals(other.dataInicio))
            return false;
        if (dataFInal == null) {
            if (other.dataFInal != null)
                return false;
        } else if (!dataFInal.equals(other.dataFInal))
            return false;
        if (devsIncritos == null) {
            if (other.devsIncritos != null)
                return false;
        } else if (!devsIncritos.equals(other.devsIncritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

    
    
}
