package br.com.digitalhouse;

public class Pessoa {
    private String nome;
    private Integer rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    @Override
    public boolean equals(Object outraPessoa) {
        //if (!(outroAluno instanceof Aluno)) {
        //            return false;
        //        }
        //
        //        if (((Aluno) outroAluno).getRa() == this.getRa() &&
        //                ((Aluno) outroAluno).getNome().equals(this.getNome())) {
        //            return true;
        //
        //
        //        }
        //        return false;
        //    }

        if(!(outraPessoa instanceof Pessoa)){
            return false;
        }

        if(((Pessoa) outraPessoa).getRg().equals(this.getRg())){
            return true;
        }
        return false;
    }
}

