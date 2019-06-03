/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b32_enderezoalumno;

/**
 *
 * @author lvazquezdorna
 */
public class Alumno {

    public String nome;
    public int nota;
    public Enderezo enderezo;

    public Alumno() {
    }

    public Alumno(String nome, int nota, Enderezo enderezo) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    Alumno(String nombre, int i, String castelao, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno:  \n\tnome: " + nome + "\n\tnota: " + nota + "\n\tenderezo: " + enderezo;
    }

    public void cambiarNota(int n) {
        nota = n;
        System.out.println("La nota del alumno "+nome+" ha sido modificada por un "+nota);
    }

    public void amosar(){
        System.out.println("Alumno:\n\tnome:" + nome + "\n\tnota: " + nota + "\n\tenderezo: " + enderezo);
    
    }
    
    private class Enderezo {

        public String rua;
        public int numero;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "rua: " + rua + ", numero: " + numero;
        }
        
        
 

    }

}
