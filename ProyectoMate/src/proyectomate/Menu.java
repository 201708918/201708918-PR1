/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomate;

import static proyectomate.ProyectoMate.In;

/**
 *
 * @author prisc
 */
public class Menu {
    public Menu(){
                            try {   //try y catch en caso que ingresen letras
            
            System.out.println("XXXXXXXXXXXXXXXXXXX- MENU PRINCIPAR -XXXXXXXXXXXXXXXXXXX");
            System.out.println("X                                                      X");
            System.out.println("X  > 1  RESOLVER MATRICES                              X");
            System.out.println("X  > 2  SALIR                                          X");
            System.out.println("X                                                      X");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.print("\n");
            System.out.println("USUARIO:");
            System.out.print("\n");
            int opcion = In.nextInt(); // ENTRADA DE LA OPCION DEL MENU
            In.skip("\n");
            System.out.print("\n");
            
            switch(opcion){
                case 1:
                    new Matriz();
                    break;
                default: System.out.println("Salida");
            }
                        
        } catch (Exception err) {
            System.out.println(err.toString());
            System.out.println("Ocurrió un error");
        }
    }
}
