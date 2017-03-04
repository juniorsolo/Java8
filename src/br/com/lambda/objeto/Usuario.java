package br.com.lambda.objeto;

public class Usuario {
    private String nome;
    private Integer pontos;
    private Boolean  moderador= false;
    public Usuario() {
    }
    
    public Usuario(String nome) {
        this.nome = nome;
    }
    
    public Usuario(String nome, Integer pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }
    
    public Usuario(String nome, Integer pontos, Boolean moderador) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = moderador;
    }
    
    public String getNome() {
        return nome;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Boolean isModerador(){
        return moderador;
    } 
    
    public void tornaModerador(){
        moderador = true;
    }
    
    @Override
    public String toString(){
        return "Usuario: " + getNome() + " Pontos: " + getPontos() 
                + " Moderador: " + isModerador();
    }
}
