/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo;

/**
 *
 * @author ISABELLA
 */
public class Alumno {
    private String Nombre;
    private String Apellido;
    private int Semestre;
    private String Correo;
    private String Celular;
    private String Cedula;
    
    //constructor sin parametros
    public Alumno(){
    }
    //constructor con parametros 
    public Alumno(String Nombre, String Apellido,int Semestre,String Correo,String Celular, String Cedula){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Semestre= Semestre;
        this.Correo= Correo;
        this.Celular= Celular;
        this.Cedula= Cedula;
    }
    //setter y getters de los atributos
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre= Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
}
