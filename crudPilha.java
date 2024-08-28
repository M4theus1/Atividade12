package Atividade12;
import java.util.Scanner;
import java.util.Stack;

// Classe que representa um Currículo
class Curriculo {
    String nome;
    String dataNascimento;
    String formacao;
    String experiencias;
    double nota;

    // Construtor para criar um currículo
    public Curriculo(String nome, String dataNascimento, String formacao, String experiencias, double nota) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.experiencias = experiencias;
        this.nota = nota;
    }

    // Método para exibir o currículo em formato de texto
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Formação: " + formacao + "\n" +
               "Experiências: " + experiencias + "\n" +
               "Nota: " + nota + "\n";
    }
}

