/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

import Mundo.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ISABELLA
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
    
    
    //lista para guardar los datos de estudiantes
     ArrayList<Alumno> listAl = new ArrayList<Alumno>();
     
     //creacion del escaner para todo el codigo y poder ingresar los datos 
     Scanner cons= new Scanner(System.in);
     
     //boolean para que funcione el do
     boolean opcion = true;
     
     //MENU PRINCIPAL 
     do{
        System.out.println("=================================");
            System.out.println("==========Menu:===========");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Eliminar alumno");
            System.out.println("3. Modificar alumno");
            System.out.println("4. Consultar alumnos");
            System.out.println("5. Generar reporte y registro de los alumnos");
            System.out.println("6. Salir");
            System.out.println("Seleccionar una opcion:");
            System.out.println("================================="); 
            
            int op =cons.nextInt();
            
            switch(op){
                case 1: ingresarAlumno(listAl);
                break;
                case 2: eliminarAlumno(listAl);
                break;
                case 3: modificarAlumno(listAl);
                break;
                case 4: consultarAlumno(listAl);
                break;
                case 5: generarReporte(listAl);
                break;
                case 6:
                    System.out.println("Has digitado la opcion salir, vuelve pronto");
                    break;
                default:
                    System.out.println("Digita nuevamente otra opcion, para poder continuar");
            }          
        }while(opcion);
}
      //CREACION DE METODOS
     //metodo para ingresar el alumno 
     public static void ingresarAlumno( ArrayList<Alumno> listAl){
         Alumno a = new Alumno();  //se crea un objeto para guardar la informacion del alumno, para poder llamar a los atributos de la clase alumno
                Scanner cons1 = new Scanner (System.in);
                System.out.println("Introduce el nombre del alumno: ");
                String Nombre = cons1.nextLine();
                a.setNombre(Nombre);
                    
                System.out.println("Introduce el apellido del alumno: ");
                String Apellido = cons1.nextLine();
                a.setApellido(Apellido);
                
                System.out.println("Introduce la semestre del alumno: ");
                String Semestre = cons1.next();
                a.setSemestre(0);
                
                System.out.println("Introduce el correo del alumno: ");
                String Correo = cons1.next();
                a.setCorreo(Correo);
                
                System.out.println("Introduce el celular del alumno: ");
                String Celular= cons1.next();
                a.setCelular(Celular);
                
                System.out.println("Introduce el cedula del alumno: ");
                String Cedula= cons1.next();
                a.setCedula(Cedula);
                
                listAl.add(a);
     }
     //CREACION DE METODOS
     //metodo para eliminar alumno 
     public static void eliminarAlumno(ArrayList<Alumno> listAl){
         System.out.print("Ingrese la cedula del alumno a eliminar: ");
         Scanner cons = new Scanner (System.in);
         String eliminar = cons.next();
         Alumno a = new Alumno();
         int opcion =0;
         for(Alumno alumno: listAl){    
          if(alumno.getCedula().equals(eliminar)){
               System.out.println("El estudiante a borrar es: "); 
                System.out.println("Cedula: " + alumno.getCedula()); 
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Apellido: " + alumno.getApellido());
                System.out.println("=================================");
                
                a= alumno;
                
                 System.out.println("¿Esta seguro que desea eliminarlo?");
                 System.out.println("1. Si");
                 System.out.println("2. No");
                 
                 opcion= cons.nextInt();
          }else{
              System.out.println("El documento ingresado no es valido");
          }
         }
        if(opcion==1){
            //.remove eliminar 
            listAl.remove(a);
            System.out.println("Estudiante eliminado exitosamente");
        }
         
     }
     //CREACION DE METODOS
     //metodo para modificar alumno
     public static void modificarAlumno(ArrayList<Alumno> listAl){
         System.out.println("Ingrese la cedula del estudiante a modificar");
         Scanner cons= new Scanner (System.in);
         String cedu =cons.next();
         int op;
         
         //for que recorre y busca al usuario para poder modificarlo
         for(Alumno alumno: listAl){
             do{
                 System.out.println("Digite el dato a modificar");
                 System.out.println("1.Nombre");
                 System.out.println("2.Apellido");
                 System.out.println("3.Semestre");
                 System.out.println("4.Correo");
                 System.out.println("5.Celular");
                 System.out.println("6.volver");
                 
                 op = cons.nextInt();
                 
                 switch(op){
                     case 1: 
                         System.out.println("Digite el nombre a modificar:");
                         String nM= cons.next();
                         if (!nM.isEmpty()){
                             alumno.setNombre(nM);
                         }
                         break;
                         
                     case 2:
                         System.out.println("Digite el apellido a modificar:");
                         String aM =cons.next();
                         if (!aM.isEmpty()){
                             alumno.setApellido(aM);
                         }
                         break;
                     case 3:
                         System.out.println("Digite el semestre a modificar:");
                         int sM= cons.nextInt();
                         
                         break;
                     case 4: 
                         System.out.println("Digite el correo para modificar:");
                         String cM= cons.next();
                         if (!cM.isEmpty()){
                             alumno.setCorreo(cM);
                         }
                         break;
                     case 5:
                         System.out.println("Digite el celular para modificar:");
                         String celM= cons.next();
                         if(!celM.isEmpty()){
                             alumno.setCelular(celM);
                         }
                         break;
                     default:
                         System.out.println("Ingresar una opcion valida:");
                 }
                 
             }while(op !=6);
                     
         }
         
         
     }
     //CREACION DE METODOS
     //metodo para consultar alumno
     public static void consultarAlumno(ArrayList<Alumno> listAl){
         System.out.println("Lista de estudiantes");
        //for para mostrar datos guardados en el array
        for(Alumno alumno: listAl){
            System.out.println("Datos del alumno:");
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Semestre: " + alumno.getSemestre());
            System.out.println("Correo:" + alumno.getCorreo());
            System.out.println("Celular:" + alumno.getCelular());
            System.out.println("Cedula: " + alumno.getCedula());
            
        }
        
         }
         
     
     //CREACION DE METODOS
     //metodo para generar reporte de los alumnos registrados con el txt
     public static void generarReporte(ArrayList<Alumno> listAl)throws FileNotFoundException{
         System.out.println("Haciendo reporte");
         File archivo = new File("./data/reporteAlumnos.txt");
         //pluma
         PrintWriter pluma =new PrintWriter(archivo);
         Alumno a =new Alumno();
         pluma.println("Reporte de estudiantes: ");
         
         for(Alumno alumno: listAl){
             pluma.println("Los datos del los alumnos son: ");
             pluma.println("Nombre: " + alumno.getNombre());
             pluma.println("Apellido: " + alumno.getApellido());
             pluma.println("Semestre: " + alumno.getSemestre());
             pluma.println("Correo: " + alumno.getCorreo());
             pluma.println("Celular: " + alumno.getCelular());
             pluma.println("Cedula: " + alumno.getCedula());
             
             System.out.println("reporte generado exitosamente");
             
         }
         pluma.close();
     }
     
}
