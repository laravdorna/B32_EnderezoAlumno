/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b32_enderezoalumno;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class B32_EnderezoAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno;
        alumno = new Alumno("Nombre", 10, "castelao", 2);
        System.out.println(alumno.toString());
        alumno.setNota(8);
        System.out.println(alumno.toString());
    }
}


