package engtelecom.poo;

import java.util.ArrayList;

public class UnidadeCurricular {
    private String nome;
    private String codigo;
    private String sigla;
    private Integer creditos;
    private String ementa;
    private ArrayList<String> objetivo; //1 a n objetivos
    private ArrayList<String> conteudo; 


    // construtor padrão
    public UnidadeCurricular(String nome, String codigo, String sigla, Integer creditos, String ementa) {
        this.nome = nome;
        this.codigo = codigo;
        this.sigla = sigla;
        this.creditos = creditos;
        this.ementa = ementa;
        this.objetivo = new ArrayList<>();
        this.conteudo = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "UnidadeCurricular [nome=" + nome + ", codigo=" + codigo + ", sigla=" + sigla + ", creditos=" + creditos
                + ", ementa=" + ementa + ", objetivo=" + objetivo + ", conteudo=" + conteudo + "]";
    }


    public int getCargaHoraria() {
        return this.creditos * Curso.SEMANAS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public ArrayList<String> getObjetivo() {
        return objetivo;
    }

    public String obterObjetivo(int pos) {
        // pos inválida
        if (pos > objetivo.size()) {
            return null;
        }
        return objetivo.get(pos);
    }

    public void adicionarObjetivo(String obj) {
        objetivo.add(obj);
    }

    public void removerObjetivo(String obj) {
        objetivo.remove(obj);
    }

    public String obterConteudo(int pos) {
        // pos válida
        if (pos >= 0 && pos < conteudo.size()) {
            return conteudo.get(pos);
        }
        return null; 
    }

    public void adicionarConteudo(String c) {
        conteudo.add(c);
    }

    public void removerConteudo(int pos) {
        // pos válida
        if (pos >= 0 && pos < conteudo.size()) {
            conteudo.remove(pos);
        }
    }
}