/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioFecha {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarFecha(Fecha f1) {
        String[] Smeses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};

        System.out.println("Ingrese Año");
        f1.setAnio(leer.nextInt());
        if (f1.getAnio() < 1900 || f1.getAnio() > 2021) {
            f1.setAnio(1900);
            System.out.println("la fecha ingresada no es correcta, se tomara por defecto 1900");
        }

        System.out.println("Ingrese Mes");
        int mes = leer.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Ingrese mes correctamente");
            mes = leer.nextInt();

        }
        f1.setMes(mes);

        System.out.println("Ingrese Día");
        f1.setDia(leer.nextInt());
        switch (f1.getMes()) {
            case 1:

            case 3:

            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               
                System.out.println("Usted ingreso el mes " + Smeses[(f1.getMes() - 1)] + " que tiene 31 días");
                while (f1.getDia() < 1 || f1.getDia() > 31) {
                    System.out.println("Ingrese Día nuevamente");
                    f1.setDia(leer.nextInt());
                }

                break;
            case 2:

                if ((f1.getAnio() % 4 == 0) && (f1.getAnio() % 100 != 0) || (f1.getAnio() % 400 == 0)) {
                    System.out.println("Usted ingreso el mes de febrero que tiene 29 días");
                    while (f1.getDia() < 1 || f1.getDia() > 29) {

                        System.out.println("Ingrese Día nuevamente");
                        f1.setDia(leer.nextInt());

                    }
                } else {
                    System.out.println("Usted ingreso el mes de febrero que tiene 28 días");
                    while (f1.getDia() < 1 || f1.getDia() > 28) {
                        System.out.println("Ingrese Día nuevamente");
                        f1.setDia(leer.nextInt());
                    }

                }

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Usted ingreso el mes " + Smeses[(f1.getMes() - 1)] + " que tiene 30 días");
                while (f1.getDia() < 1 || f1.getDia() > 30) {
                    System.out.println("Ingrese Día nuevamente");
                    f1.setDia(leer.nextInt());
                }
                break;

        }

    }

    public void diaAnterior(Fecha f1) {

        if (f1.getDia() != 1) {
            System.out.println("El día anterior es " + (f1.getDia() - 1) + " / " + f1.getMes() + " / " + f1.getAnio());

        } else if (f1.getMes() == 4 || f1.getMes() == 6 || f1.getMes() == 9 || f1.getMes() == 11 || f1.getMes() == 8 || f1.getMes() == 2) {
            System.out.println("El día anterior es 31 / " + (f1.getMes() - 1) + " / " + f1.getAnio());

        } else if (f1.getMes() == 3) {
            if ((f1.getAnio() % 4 == 0) && (f1.getAnio() % 100 != 0) || (f1.getAnio() % 400 == 0)) {
                System.out.println("El día anterior es 29 / " + (f1.getMes() - 1) + " / " + f1.getAnio());

            } else{
            
             System.out.println("El día anterior es 28 / " + (f1.getMes() - 1) + " / " + f1.getAnio());
            }
           
            //5 7 10 12
        } else if (f1.getMes() == 5 || f1.getMes() == 7 || f1.getMes() == 10 || f1.getMes() == 12) {

            System.out.println("El día anterior es 30 / " + (f1.getMes() - 1) + " / " + f1.getAnio());

        } else{
        System.out.println("El día anterior es 31 / 12 / " + (f1.getAnio()-1));
        
        }

    }

    public void diaPosterior(Fecha f1) {
         //1 3 5 7 8 10 12
        if (f1.getMes()==1 || f1.getMes()==5|| f1.getMes()==7|| f1.getMes()==8|| f1.getMes()==10|| f1.getMes()==3) {
            if (f1.getDia()==31) {
                 System.out.println("El día posterior es 01 / " + (f1.getMes() + 1) + " / " + f1.getAnio());
                
            } else{
            System.out.println("El día posterior "+(f1.getDia()+1) + " / " +(f1.getMes()) + " / " + f1.getAnio());
            
            }
            
        } else if (f1.getMes()==4||f1.getMes()==6||f1.getMes()==9||f1.getMes()==11) {
            if (f1.getDia()==30) {
                 System.out.println("El día posterior es 01 / " + (f1.getMes() + 1) + " / " + f1.getAnio());
                
            } else{
            System.out.println("El día posterior "+(f1.getDia()+1) + " / " +(f1.getMes()) + " / " + f1.getAnio());
            
            }
            
        } else if (f1.getMes()==2) {
            if ((f1.getAnio() % 4 == 0) && (f1.getAnio() % 100 != 0) || (f1.getAnio() % 400 == 0)) {
                if (f1.getDia()==29) {
                     System.out.println("El día posterior 01 / " + (f1.getMes() + 1) + " / " + f1.getAnio());
                    
                } else{
                System.out.println("El día posterior es "+ (f1.getDia()+1)+ " / " +f1.getMes()+ " / " + f1.getAnio());
                
                }
                
            } else{
                if (f1.getDia()==28) {
                     System.out.println("El día posterior 01 / " + (f1.getMes() + 1) + " / " + f1.getAnio());
                    
                } else{
                System.out.println("El día posterior es "+ (f1.getDia()+1)+ " / " +f1.getMes()+ " / " + f1.getAnio());
                
                }
                
            
            }
            
        } else{
            if (f1.getDia()==31) {
                     System.out.println("El día posterior 01 / 01 / " + (f1.getAnio()+1));
                    
                } else{
                System.out.println("El día posterior es "+ (f1.getDia()+1)+ " / " +f1.getMes()+ " / " + f1.getAnio());
                
                }
        
        }
        
        

    }

}
