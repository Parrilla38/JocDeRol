/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;
import io.Utilidades;
import java.util.ArrayList;
import joc.*;
import java.util.*;

/**
 *
 * @author Jesús Parra <Jesús Parra>
 */
public class JocDeRol {

    
    static ArrayList<Player> Jugadores = new ArrayList();
    static ArrayList<Team> Equipos = new ArrayList();
    static ArrayList<Item> Armas = new ArrayList();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        
        while (true)
        {
            
            System.out.println("Bienvenido al Juego de Rol [FASE BETA]");
            System.out.println("");
            System.out.println("------------------ MENÚ  ------------------");
            System.out.println("1. Configuración");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            double respuesta = Utilidades.leerDouble("Elija su opción: ");


            if (respuesta == 1)
            {

                System.out.println("------- MENÚ DE CONFIGURACIÓN -------");
                System.out.println("1.1. Gestión de jugadores");
                System.out.println("1.2. Gestión de equipos");
                System.out.println("1.3. Gestión de objetos");
                System.out.println("1.4. Salir");
                
                double respuesta_2 = Utilidades.leerDouble("Elija su opción: ");
                
                if (respuesta_2 == 1.1)
                {
                    
                    System.out.println("------- MENÚ DE JUGADORES -------");
                    System.out.println("1.1.1. Crear Jugador");
                    System.out.println("1.1.2. Mostrar Jugadores");
                    System.out.println("1.1.3. Borrar Jugador");
                    System.out.println("1.1.4. Asignar jugador a un equipo");
                    System.out.println("1.1.5. Asignar objeto a un jugador");
                    System.out.println("1.1.6. Salir");
                    
                    String respuesta_3 = Utilidades.leerTexto("Elija su opción: ");
                    
                    if ("1.1.1".equals(respuesta_3))
                    {
                        
                        System.out.println("CLASES:\nA: Alien\nW: Warrior\nH: Humano");
                        String tipo = Utilidades.leerTexto("Introduzca la letra de la clase que quiere: ");
                        
                        if ("A".equals(tipo))
                        {
                            
                            String nombre_alien = Utilidades.leerTexto("Introduzca el nombre del personaje: ");
                            int pa = Utilidades.leerEntero("Introduzca los puntos de ataque del personaje, tiene que ser mayor que 0 y menor que 100: ");
                            if (pa < 0 || pa > 100)
                            {
                                
                                pa = Utilidades.leerEntero("Los puntos de ataque deben de ser mayor que 0 y menor que 100, vuelva a intentarlo: ");
                                
                            }
                            int pd = 100 - pa;
                            Alien aliens = new Alien(nombre_alien, pa, pd,100);
                            boolean encontrado = false;
                            for (int y = 0; y < Jugadores.size(); y++)
                            {
                                
                                if (Jugadores.get(y).equals(aliens))
                                {
                                    
                                    encontrado = true;
                                    System.out.println("El nombre del jugador ya existe.");
                                    
                                }
                                
                            }
                            
                            if (!encontrado)
                            {
                                
                                Jugadores.add(aliens);
                                
                            }
                            
                            
                        }
                        else if ("W".equals(tipo))
                        {
                            
                            String nombre_warrior = Utilidades.leerTexto("Introduzca el nombre del personaje: ");
                            int pa = Utilidades.leerEntero("Introduzca los puntos de ataque del personaje, tiene que ser mayor que 0 y menor que 100: ");
                            if (pa < 0 || pa > 100)
                            {
                                
                                pa = Utilidades.leerEntero("Los puntos de ataque deben de ser mayor que 0 y menor que 100, vuelva a intentarlo: ");
                                
                            }
                            int pd = 100 - pa;
                            Warrior warriors = new Warrior(nombre_warrior, pa, pd,100);
                            boolean encontrado = false;
                            for (int y = 0; y < Jugadores.size(); y++)
                            {
                                
                                if (Jugadores.get(y).equals(warriors))
                                {
                                    
                                    encontrado = true;
                                    System.out.println("El nombre del jugador ya existe.");
                                    
                                }
                                
                            }
                            
                            if (!encontrado)
                            {
                                
                                Jugadores.add(warriors);
                                
                            }
                            
                        }
                        else if ("H".equals(tipo))
                        {
                            
                            String nombre_humano = Utilidades.leerTexto("Introduzca el nombre del personaje: ");
                            int pa = Utilidades.leerEntero("Introduzca los puntos de ataque del personaje, tiene que ser mayor que 0 y menor que 100: ");
                            if (pa < 0 || pa > 100)
                            {
                                
                                pa = Utilidades.leerEntero("Los puntos de ataque deben de ser mayor que 0 y menor que 100, vuelva a intentarlo: ");
                                
                            }
                            int pd = 100 - pa;
                            Human humanos = new Human(nombre_humano, pa, pd,100);
                            boolean encontrado = false;
                            for (int y = 0; y < Jugadores.size(); y++)
                            {
                                
                                if (Jugadores.get(y).equals(humanos))
                                {
                                    
                                    encontrado = true;
                                    System.out.println("El nombre del jugador ya existe.");
                                    
                                }
                                
                            }
                            
                            if (!encontrado)
                            {
                                
                                Jugadores.add(humanos);
                                
                            }
                            
                        }
                        
                        
                    }
                    else if ("1.1.2".equals(respuesta_3))
                    {
                        
                        System.out.println(Jugadores);
                        
                    }
                    else if ("1.1.3".equals(respuesta_3))
                    {

                        String eliminar_player = Utilidades.leerTexto("Introduzca el nombre del jugador que desea eliminar: ");
                        Player borrado = new Human();
                        for (int i = 0; i < Jugadores.size(); i++)
                        {
                            
                            if (Jugadores.get(i).getName().equals(eliminar_player))
                            {
                                
                                borrado = Jugadores.get(i);
                                
                            }
                            
                        }
                        
                        Jugadores.remove(borrado);
                        
                    }
                    else if ("1.1.4".equals(respuesta_3))
                    {
                        
                        
                        String añadir_player = Utilidades.leerTexto("Introduzca el nombre del jugador al que desea añadir el equipo: ");
                        
                        System.out.println(Equipos);
                        String añadir_equipo = Utilidades.leerTexto("Introduzca el nombre del equipo que desea añadir: ");
                        
                        Team eq = new Team();
                        Player jugador = new Human();
                        
                        for (int i = 0; i < Jugadores.size(); i++)
                        {
                            
                            if (Jugadores.get(i).getName().equals(añadir_player))
                            {
                                
                                jugador = Jugadores.get(i);
                                
                                
                            }
                            
                        }
                        for (int x = 0; x < Equipos.size(); x++)
                                {
                                    
                                    if (Equipos.get(x).getName().equals(añadir_equipo))
                                    {
                                        
                                        
                                        eq = Equipos.get(x);
                                        
                                    }
                                    
                                }
                        
                        try
                        {
                            
                            jugador.add(eq);
                            eq.add(jugador);
                            
                        }
                        catch(MiExcepcion ex)
                                {
                                    
                                    
                                }
                        
                        
                    }
                    else if ("1.1.5".equals(respuesta_3))
                    {
                        
                        System.out.println(Armas);
                        String objeto_añadir = Utilidades.leerTexto("Introduzca el nombre del objeto que desa añadir: ");

                        String añadir_player = Utilidades.leerTexto("Introduzca el nombre del jugador al que desea añadir el objeto: ");
                        
                        int posicion;
                        Item eq = new Item();
                        Player jugador = new Human();
                        
                        for (int i = 0; i < Armas.size(); i++)
                        {
                            
                            if (Armas.get(i).getName().equals(objeto_añadir))
                            {
                                
                                eq = Armas.get(i);
                                
                                
                            }
                            
                        }
                        for (int x = 0; x < Jugadores.size(); x++)
                                {
                                    
                                    if (Jugadores.get(x).getName().equals(añadir_player))
                                    {
                                        
                                        
                                        jugador = Jugadores.get(x);
                                        
                                    }
                                    
                                }
                        
                        jugador.add(eq);
                        
                        
                        
                        
                        
                    }
                    else if ("1.1.6".equals(respuesta_3))
                    {
                        
                        break;
                        
                    }
                    
                    
                    
                }
                else if (respuesta_2 == 1.2)
                {
                    
                    System.out.println("------- MENÚ DE EQUIPOS -------");
                    System.out.println("1.2.1. Crear Equipo");
                    System.out.println("1.2.2. Mostrar Equipos");
                    System.out.println("1.2.3. Borrar Equipo");
                    System.out.println("1.2.4. Asignar Equipo a jugador");
                    System.out.println("1.2.5. Salir");
                    
                    String respuesta_4 = Utilidades.leerTexto("Elija su opción: ");
                    
                    
                    if ("1.2.1".equals(respuesta_4))
                    {
                        
                       String nombre_equipo = Utilidades.leerTexto("Introduce el nombre del equipo que deseas crear: ");
                       Team equipo = new Team(nombre_equipo);
                       
                       boolean encontrado = false;
                       for (int i = 0; i < Equipos.size(); i++)
                       {
                           
                           if (Equipos.get(i).equals(equipo))
                           {
                               
                               encontrado = true;
                               System.out.println("El nombre del equipo ya existe.");
                               
                           }
                           
                           
                           
                       }
                       
                       if (!encontrado)
                           {
                               
                               Equipos.add(equipo);
                               
                           }
                        
                    }
                    else if ("1.2.2".equals(respuesta_4))
                    {
                        
                        System.out.println(Equipos);
                        
                    }
                    else if ("1.2.3".equals(respuesta_4))
                    {
                        
                        String equipo_borrar = Utilidades.leerTexto("Introduzca el nombre del equipo que desa borrar: ");
                        
                        Team borrado = new Team();
                        for (int i = 0; i < Equipos.size(); i++)
                        {
                            
                            if (Equipos.get(i).getName().equals(equipo_borrar))
                            {
                                
                                borrado = Equipos.get(i);
                                
                            }
                            
                        }
                        
                        Equipos.remove(borrado);
                        
                    }
                    else if ("1.2.4".equals(respuesta_4))
                    {
                        
                        String equipo_añadir = Utilidades.leerTexto("Introduzca el nombre del equipo que desea añadir al un Jugador: ");
                        
                        
                        String añadir_jugador = Utilidades.leerTexto("Introduzca el nombre del jugador que desea añadir al equipo: ");
                        
                        Team eq = new Team();
                        Player jugador = new Human();
                        
                        for (int i = 0; i < Equipos.size(); i++)
                        {
                            
                            if (Equipos.get(i).getName().equals(equipo_añadir))
                            {
                                
                                eq = Equipos.get(i);
                                
                                
                            }
                            
                        }
                        for (int x = 0; x < Jugadores.size(); x++)
                                {
                                    
                                    if (Jugadores.get(x).getName().equals(añadir_jugador))
                                    {
                                        
                                        
                                        jugador = Jugadores.get(x);
                                        
                                    }
                                    
                                }
                        
                        try
                        {
                            
                            eq.add(jugador);
                            jugador.add(eq);
                            
                        }
                        catch(MiExcepcion ex)
                                {
                                    
                                    
                                }
                        
                        
                        
                    }
                    else if ("1.2.5".equals(respuesta_4))
                    {
                        
                        break;
                        
                    }
                    
                        
                }
                else if (respuesta_2 == 1.3)
                {
                    
                    System.out.println("------- MENÚ DE OBJETOS -------");
                    System.out.println("1.3.1. Crear Objeto");
                    System.out.println("1.3.2. Mostrar Objetos");
                    System.out.println("1.3.3. Borrar Objeto");
                    System.out.println("1.3.4. Asignar Objeto a Jugador");
                    System.out.println("1.3.5. Salir");
                    
                    String respuesta_5 = Utilidades.leerTexto("Elija su opción: ");
                    
                    if ("1.3.1".equals(respuesta_5))
                    {
                        
                        String nom_obj = Utilidades.leerTexto("Introduzca el nombre del objeto que desea crear: ");
                        int pa = Utilidades.leerEntero("Introduzca los puntos de ataque del objeto, tiene que ser mayor que 0 y menor que 100: ");
                            if (pa < 0 || pa > 100)
                            {
                                
                                pa = Utilidades.leerEntero("Los puntos de ataque deben de ser mayor que 0 y menor que 100, vuelva a intentarlo: ");
                                
                            }
                            int pd = 100 - pa;
                            Item objeto = new Item(nom_obj, pa, pd);
                            
                            boolean encontrado = false;
                            for (int i = 0; i < Armas.size(); i++)
                            {

                                if (Armas.get(i).equals(objeto))
                                {

                                    encontrado = true;
                                    System.out.println("El nombre del objeto ya existe.");

                                }
                                


                            }
                            if (!encontrado)
                                {

                                    Armas.add(objeto);

                                }
                        
                    }
                    else if ("1.3.2".equals(respuesta_5))
                    {
                        
                        System.out.println(Armas);
                        
                    }
                    else if ("1.3.3".equals(respuesta_5))
                    {
                        
                        String objeto_borrar = Utilidades.leerTexto("Introduzca el nombre del objeto que desea borrar: ");
                        
                        Item borrado = new Item();
                        
                        for (int i = 0; i < Armas.size(); i++)
                        {
                            
                            if (Armas.get(i).getName().equals(objeto_borrar))
                            {
                                
                                borrado = Armas.get(i);
                                
                            }
                            
                        }
                        
                        Armas.remove(borrado);
                        
                    }
                    else if ("1.3.4".equals(respuesta_5))
                    {
                        
                        String objeto_añadir = Utilidades.leerTexto("Introduzca el nombre del objeto que desea añadir: ");
                        String jugador_añadir = Utilidades.leerTexto("Introduzca el nombre del Jugador al que desea añadir el objeto: ");
                        
                        Item arma = new Item();
                        Player jugador = new Human();
                        
                        for (int i = 0; i < Armas.size(); i++)
                        {
                            
                            if (Armas.get(i).getName().equals(objeto_añadir))
                            {
                                
                                arma = Armas.get(i);
                                
                                
                            }
                            
                        }
                        for (int x = 0; x < Jugadores.size(); x++)
                        {

                            if (Jugadores.get(x).getName().equals(jugador_añadir))
                            {


                                jugador = Jugadores.get(x);

                            }

                        }
                        
                        System.out.println("arma");
                        System.out.println(arma);
                        jugador.add(arma);
                        
                    }
                    else if ("1.3.5".equals(respuesta_5))
                    {
                        
                        break;
                        
                    }
                    
                    
                    
                }
                
                
            }
            else if (respuesta == 2)
            {
                
                Random random = new Random();
                
                System.out.println("|| QUE EMPIECE EL JUEGO!! ||");
                
                Alien Macia = new Alien("Macia", 60, 20, 100);
                Human Passif = new Human("Passif", 30, 70, 100);
                Warrior Jorge = new Warrior("Jorge", 10, 90, 100);
                Human Jesus = new Human("Jesus", 20, 80, 100);
                Jugadores.add(Macia);
                Jugadores.add(Passif);
                Jugadores.add(Jorge);
                Jugadores.add(Jesus);
                Player Jugador1_atras = new Human();
                Player Jugador2_atras = new Human();
                
                while (Jugadores.size() >= 1)
                {
                    
                    
                    Scanner scanner = new Scanner(System.in);
                    String entrada  ="";
                    System.out.println("Presione enter para continuar con el ataque");        
                     do{
                        entrada  = scanner.nextLine();
                        System.out.println(entrada);
                        
                    
                    boolean aprobado = false;
                    System.out.println("Eligiendo jugador número ||     1     ||");
                    
                    System.out.println("...");
                    Player Jugador1 = Jugadores.get(random.nextInt(Jugadores.size()));
                    System.out.println("JUGADOR ELEGIDO!!");
                    
                    
                    System.out.println("Eligiendo jugador número ||     2     ||");
                    
                    System.out.println("...");
                    Player Jugador2 = Jugadores.get(random.nextInt(Jugadores.size()));
                     System.out.println("JUGADOR ELEGIDO!!");
                     
                         System.out.println("-----");
                         System.out.println(Jugadores);
                    
                    if (Jugador1_atras != Jugador1 && Jugador2_atras != Jugador2 && Jugador1 != Jugador2)
                    {
                        
                        aprobado = true;
                        
                    }
                    
                    Jugador1_atras = Jugador1;
                    Jugador2_atras = Jugador2;
                    

                    if (aprobado == true)
                    {
                        
                        if (Jugador1.getLife() == 0)
                        {
                            
                            Jugadores.remove(Jugador1);
                            
                        }
                        if (Jugador2.getLife() == 0)
                        {

                            Jugadores.remove(Jugador2);
                            
                        }
                        if (Jugadores.size() >= 2)
                        {
                            
                            try
                            {
                                Jugador1.attack(Jugador2);
                                System.out.println(Jugador1.getLife());
                                System.out.println("VIDA JUGADOR 2");
                                System.out.println(Jugador2.getLife());
                                if (Jugador2.getLife() > 0)
                                {
                                    Jugador2.attack(Jugador1);
                                }
                                
                                
                            }
                            catch(MiExcepcion ex)
                            {

                                
                                
                            }
                            
                            
                        }
                        else if (Jugadores.size() == 1)
                        {
                            
                            System.out.println("El jugador " + Jugadores.get(0) + " ha ganado.");
                            
                        }
                        
                    }
                    else
                    {
                        
                        Jugador1 = Jugadores.get(random.nextInt(Jugadores.size()));
                        Jugador2 = Jugadores.get(random.nextInt(Jugadores.size()));
                    }

                     }
                     while(!entrada.equals("")); 
                    

                    

                    

                    
                    
                
                
                }
                
                

            }
            else if (respuesta == 3)
            {

                System.out.println("Gracias por jugar a nuestro juego, hasta la próxima!");
                break;

            }


            }
        
        
        
    }
    

    
    
    
    static public void provaFase()
    {
        /*
        // CREACION CLASES
        System.out.println("Va a crearse un Humano");
        Human Byllorge = new Human("Byllorge", 20, 20, 200);
        System.out.println("Humano creado");
        System.out.println("");
        System.out.println("Va a crearse un Guerrero");
        Warrior PassiveSky = new Warrior("PassiveSky", 15, 30, 250);
        System.out.println("Guerrero creado");
        System.out.println("");
        System.out.println("Va a crearse un Alien");
        Alien MrMacia = new Alien("MrMacia", 40, 10, 120);
        System.out.println("Alien creado");
        
        // CREO 2 ITEMS
        Item SunGlasses = new Item("SunGlasses", -1, -1);
        Item Bazooka = new Item("Bazooka", 20, -10);
        
        
        // AÑADO 2 ITEMS
        PassiveSky.add(SunGlasses);
        PassiveSky.add(Bazooka);
        System.out.println(PassiveSky);
        System.out.println(PassiveSky);
        System.out.println(MrMacia);

        
        
        // CREO 2 EQUIPOS
        Team PeppoClown = new Team("PeppoClown");
        Team Parrillas = new Team ("Parrillas");
        
        // AÑADO 3 PERSONAJES A EQUIPOS
        PeppoClown.add(MrMacia);
        PeppoClown.add(Byllorge);
        Parrillas.add(Byllorge);
        PeppoClown.add(PassiveSky);
        
        
        System.out.println("-----------");
        PeppoClown.listar();
        // PRINT DEL ITEM GAFAS
        System.out.println(SunGlasses); */
        
    }
    
}
