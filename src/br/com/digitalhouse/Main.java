package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Adelbaldo", 449478816);
        Pessoa pessoa2 = new Pessoa("Antunes", 449478816);

        System.out.println(pessoa1.equals(pessoa2));

    }
}
