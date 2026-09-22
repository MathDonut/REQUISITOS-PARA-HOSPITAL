package medico;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Medico {
public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);


final int valor_hora = 55250;
String nombre,edad,especialidad,turno;
double sueldo =0,descuento=0,sueldopagar=0;
int horas=0;


System.out.println ("INGRESE EL NOMBRE  ");
nombre = teclado.nextLine();

System.out.println("INGRESE SU EDAD   ");
edad = teclado.nextLine();

System.out.println ("INGRESE SU ESPECIALIDAD  ");
especialidad = teclado.nextLine();

System.out.println ("INGRESE LA HORA DE INICIO DE SU TURNO   ");
turno= teclado.nextLine();

System.out.println ("INGRESE LAS HORAS TRABAJADAS   ");
horas = teclado.nextInt();
sueldo = (horas) * (valor_hora);


  if (sueldo > 55250 && sueldo <= 235000) {
    descuento = (sueldo)* (0.04);
  }
   
   if (sueldo > 235000 && sueldo <= 575000 ) {
     descuento = (sueldo) * (0.055);
   }
   
   if (sueldo > 575000 && sueldo <= 1750905 ) {
       descuento = (sueldo) * (0.12);
   }
       
     sueldopagar = (sueldo) - (descuento);
     
     LocalDate fecha = LocalDate.now();
     LocalTime hora = LocalTime.now();
     
     
     //informacion registrada en la consola
     
     System.out.println ("***DATOS DEL REGISTRO***");
     System.out.println ("LA FECHA DEL REGISTRO ES:   "+ fecha);
     System.out.println ("LA HORA DEL REGISTRO ES:    " + hora);
     System.out.println ("EL NOMBRE REGISTRADO ES:   " + nombre);
     System.out.println ("LA EDAD REGISTRADA ES:   " + edad);
     System.out.println ("LA ESPECIALIDAD REGISTRADA ES:  " + especialidad);
     System.out.println ("LAS HORAS TRABAJADAS REGISTRADAS SON:   " + horas);
     System.out.println ("LA HORA DE INICIO DE TURNO REGISTRADA ES:   " + turno);
     System.out.println ("EL SUELDO TOTAL ES:   " + sueldo);
     System.out.println ("EL DESCUENTO TOTAL ES:   " + descuento);
     System.out.println ("EL SUELDO A PAGAR ES:   " + sueldopagar);
     
     
     try {
     
     FileWriter fw = new FileWriter ("C:\\Users\\Janus\\OneDrive\\Desktop\\PAGODELMEDICO.txt");
     BufferedWriter bw = new BufferedWriter (fw);
     bw.write ("Nombre:   " + nombre +"\n" );
     bw.write ("Fecha capturada:   " + fecha + "\n");
     bw.write ("Hora capturada:  " + hora + "\n");
     bw.write ("Edad capturada:   " +edad + "\n");
     bw.write ("Especialidad capturada: " +especialidad + "\n");
     bw.write ("Horas de inicio de turno:  " +turno + "\n");
     bw.write ("Horas de trabajo registradas:  " +horas + "\n");
     bw.write ("Sueldo capturado:  " +sueldo + "\n");
     bw.write ("Descuento capturado:  " + descuento + "\n");
     bw.write ("Sueldo a pagar capturado:  " +sueldopagar + "\n");
     bw.close();
     fw.close();
     }
   catch (IOException error) {
    System.out.println ("ALERTA VERIFICAR RESPALDO" + error.getMessage());
    }
     
    teclado.close();
     
 }   
 }
 
    

