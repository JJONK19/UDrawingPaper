/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udrawing_paper;

import java.io.File;
import  com.jayway.jsonpath.JsonPath;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;


/**
 *
 * @author JJONK19
 */
public class Main {
    static int carga = 0; //Bandera que indica si ya se cargó la información
    static int ventanas = 0; // Guarda el número de ventanillas. Si el usuario asigna 0 o no lo hace, muestra error.
    static Cola Clientes = new Cola(); //G Cola de Clientes que entran a la empresa
    static ListaPilas Ventanilla = new ListaPilas(); //G Ventanillas de la empresa
    static ListaSimple Atendidos = new ListaSimple(); //Lista de Clientes atendidos
    static Cola BN = new Cola(); //Impresora en blanco y negro
    static Cola C = new Cola(); //Impresora a color
    static ListaDCircularL Espera = new ListaDCircularL(); //Lista de Clientes esperando
    static String[] Nombres = new String []{"Olivia", "Emma", "Ava", "Charlotte", "Sophia", "Amelia", "Isabella", "Mia", "Evelyn", "Harper", "Camila", "Gianna", "Abigail", "Luna", "Ella", "Elizabeth", "Emily", "Avery", "Mila", "Scarlett", "Eleanor", "Madison", "Layla", "Penelope", "Aria", "Chloe", "Grace", "Ellie", "Nora", "Zoey", "Liam", "Noah", "Oliver", "Elijah", "William", "James", "Benjamin", "Lucas", "Henry", "Alexander", "Mason", "Michael", "Ethan", "Daniel", "Jacob", "Logan", "Jackson", "Levi", "Sebastian", "Mateo", "Jack", "Owen", "Theodore", "Aiden", "Samuel", "Joseph", "John", "David", "Luke", "Asher" };
    static String[] Apellidos = new String []{"Smith", "Johnson", "Martin", "Wright", "Thompson", "Lopez", "Williams", "Garcia", "Hill", "Jones", "Martibnez", "Scott", "Brown", "Robinson", "Green", "Davis", "Clark", "Adams", "Miller", "Rodriguez", "Baker", "Wilson", "Lewis", "Gonzalez", "Moore", "Lee", "Nelson", "Taylor", "Walker", "Carter", "Anderson", "Hall", "Mitchell", "Thomas", "Allen", "Perez", "Jackson", "Young", "Roberts", "White", "Hernandez", "Turner", "Harris", "King", "Phillips", "Parker", "Campbell", "Ward", "Gray", "Long", "Flores", "Foster", "Perry", "Sanchez", "Butler", "Morris", "Cook", "Ross", "Murphy"};
    
    
    public static void main(String[] args){
        String x = "";
        //Inicialización de grafos
        Atendidos.add(null, "Vacio");
        BN.enqueue(null, "Libre");
        C.enqueue(null, "Libre");
        ListaSimple lt = new ListaSimple();
        lt.add(null, "Vacio");
        Espera.add(lt, "Vacio", null);
        Scanner a = new Scanner(System.in);
        while(!"0".equals(x)){
            System.out.println("UDrawing Paper");
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Paraametros Iniciales");
            System.out.println("2. Ejecutar Paso");
            System.out.println("3. Estado en memoría de las estructuras");
            System.out.println("4. Reportes");
            System.out.println("5. Acerca de");
            System.out.println("0. Salir");
            System.out.println("---------------------------------------------------------");
            System.out.println("Ingrese el número de una instrucción:");
            x = String.valueOf(a.nextLine());  
            System.out.println("---------------------------------------------------------");
            
            //Carga y Definición de Datos Iniciales***********************************************
            if ("1".equals(x)){
                String x1 = "";
                while(!"0".equals(x1)){
                    System.out.println("UDrawing Paper");
                    System.out.println("PARAMETROS INICIALES");
                    System.out.println("1. Carga de Clientes");
                    System.out.println("2. Definir número de ventanillas");
                    System.out.println("0. Regresar");
                    System.out.println("---------------------------------------------------------");
                    System.out.println("Ingrese el número de una instrucción:");
                    x1 = String.valueOf(a.nextLine());  
                    System.out.println("---------------------------------------------------------");
                    
                    //Carga de datos
                    if ("1".equals(x1)){ 
                        try{
                            Scanner a1 = new Scanner(System.in);
                            String ruta;
                            System.out.println("Ingrese la ruta del archivo:");
                            ruta = a1.nextLine();  
                            
                            //Aplicación de la libreria: https://stackoverflow.com/questions/55976047/extracting-objects-from-an-array-with-jackson-streaming-api
                            //Compilador de prueba para JSONPath: http://jsonpath.com/
                            File json = new File(ruta).getAbsoluteFile();
                            List<Map> clientes = JsonPath.parse(json).read("$.*"); //Al leer, guarda las coincnidencias como un diccionario y esos los guarda en la lista
                            for (int i =0; i<clientes.size();i++){
                                
                                //Lectura de los diccionarios
                                Map temp = clientes.get(i);
                                String id = (String)temp.get("id_cliente");
                                String nom = (String) temp.get("nombre_cliente");
                                int col = Integer.parseInt((String)temp.get("img_color"));
                                int bn = Integer.parseInt((String)temp.get("img_bw"));
                                
                                //Creacion del objeto cliente
                                Cliente c = new Cliente(id, nom, col, bn);
                                
                                //Añadirlos a la cola inicial
                                Clientes.enqueue(c, nom);
                              
                            }
                            carga = 1;
                            
                            System.out.println("");
                            System.out.println("MENSAJE: Información cargada correctamente.");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------");

                        }catch(Exception e){
                            System.out.println("");
                            System.out.println("ERROR: No se pudo leer el archivo de carga.");
                            System.out.println("---------------------------------------------------------");
                        }
                    }

                    //Número de Ventanillas
                    if ("2".equals(x1)){
                        System.out.println("Ingrese el número de ventanillas a manejar:");
                        try{
                            ventanas = a.nextInt();
                            a.nextLine();
                            Pila [] prueba = new Pila[ventanas];
                            String [] ab = new String[ventanas];
                            String n;
                            for(int i = 0; i < ventanas; i++){
                                prueba[i] = new Pila();
                                prueba[i].push(null, "Libre");
                                ab[i] = "Ventanilla_" + Integer.toString(i+1);
                        }
                      
                        for(int i = 0; i < ventanas; i++){ 
                            Ventanilla.add(prueba[i], ab[i]);
                        }
                        }catch(Exception e){
                            
                        }
                        
                        System.out.println("---------------------------------------------------------");
                        System.out.println("");
                        System.out.println("MENSAJE: Número de ventanillas actualizado.");
                        System.out.println("");
                        System.out.println("---------------------------------------------------------");
                    }  
                } 
            }
            
            
            //Siguiente Paso********************************************************************
            if ("2".equals(x)){
                if( carga == 0 || ventanas == 0 ){
                    System.out.println("");
                    System.out.println("ERROR: Debe cargar la infromación y definir la cantidad de ventanillas antes de proceder.");
                    System.out.println("");
                    System.out.println("---------------------------------------------------------");
                }else{
                    System.out.println("*********************************************************");
                    System.out.println("                   RESUMEN DEL PASO");
                    System.out.println("*********************************************************");

                //Manejo de la Cola------------------------------------------------------------
                    //Inicializar cola
                    NodoCola tcc = Clientes.head;
                    if(tcc.name.equals("Vacio")){
                        Clientes.deleteL();
                    }
                            
                    //Añadir clientes nuevos
                    Random r = new Random();
                    int nuevos = r.nextInt(4);
                    for(int i = 0; i < nuevos+1; i++){
                        String nombre = Nombres[r.nextInt(Nombres.length)];
                        String apellido = Apellidos[r.nextInt(Apellidos.length)];
                        String NA = nombre + " " + apellido;
                        String ID = UUID.randomUUID().toString();
                        int bnc = r.nextInt(5);
                        int cc = r.nextInt(5);
                        Cliente c = new Cliente(ID, NA, bnc, cc);
                        Clientes.enqueue(c, NA);    
                        System.out.println(NA + " entra a la empresa.");
                    }

                //Manejo de las Ventanillas-----------------------------------------------------
                    //Vaciar espacios
                    NodoListaPilas temp = Ventanilla.head;
                    for(int i = 0; i < Ventanilla.no; i++){

                        if(temp.content != null){   //Está llena
                            Cliente ct = (Cliente)temp.content;
                            int sub = ct.bn + ct.color;     //Imagenes que el cliente no ha procesado

                            if(sub == 0){                           //Sacar Cliente de la ventanilla
                                ct.ventana = temp.name;
                                ct.pasos++;

                                //Inicializa la lista´para poder añadir clientes 
                                NodoListaDobleCircular tes = Espera.head;
                                if(tes.name.equals("Vacio")){
                                    Espera.deleteL();
                                }

                                //Añade al cliente a la lista
                                ListaSimple tsi = new ListaSimple();
                                tsi.add(null, "Vacio");
                                
                                Espera.add(tsi, "\"" + ct.nombre + "\"", ct);
                                System.out.println(ct.nombre + " entra en la lista de espera.");

                                //Sacar al cliente de la ventanilla
                                temp.content = null;

                                //Vaciar Pila de imagenes
                                Pila pt = (Pila)temp.structure;
                                while(pt.head != null){
                                    Imagen it = (Imagen)pt.pop();
                                    if(it.Tipo.equals("Color")){
                                        //Inicializar Impresoras
                                        NodoCola tbn = BN.head;
                                        tbn = C.head;
                                        if(tbn.name.equals("Libre")){
                                            C.deleteL();
                                        }
                                        C.enqueue(it, it.Nombre);
                                    }else{
                                        //Inicializar Impresoras 
                                        NodoCola tbn = BN.head;
                                        if(tbn.name.equals("Libre")){
                                            BN.deleteL();
                                        }
                                        BN.enqueue(it, it.Nombre);
                                    }
                                }
                                System.out.println("Las " + Integer.toString(ct.total) +" imagenes de " + ct.nombre + " son enviadas a las colas de impresión.");

                                //Reiniciar Pila de Imagenes
                                 pt.push(null, "Libre");

                            }else{                                  //Añadir una imagen del cliente en la pila
                                if(ct.bn != 0){
                                    String nombre = ct.nombre + " - " +Integer.toString(sub);
                                    Pila t = (Pila)temp.structure;
                                    t.push(new Imagen(ct.ID, nombre, "BN"), nombre);
                                    ct.bn--;
                                    ct.pasos++;
                                    System.out.println(ct.nombre + " registra una imagen en blanco y negro.");
                                }else{
                                    String nombre = ct.nombre + " - " +Integer.toString(sub);
                                    Pila t = (Pila)temp.structure;
                                    t.push(new Imagen(ct.ID, nombre, "Color"), nombre);
                                    ct.color--;
                                    ct.pasos++;
                                    System.out.println(ct.nombre + " registra una imagen a color.");
                                }
                            }
                        }           
                        temp = temp.next;
                    }

                    //Añadir Clientes a las ventanillas vacias
                    temp = Ventanilla.head;
                    for(int i = 0; i < Ventanilla.no; i++){

                        if(temp.content == null){   //Está vacía
                            //Inicializar Pila de Imagenes borrando nodo libre
                            Pila t = (Pila)temp.structure;
                            t.deleteP();
                            
                            //Ingresar Cliente a la ventanilla
                            Cliente ct = (Cliente)Clientes.dequeue();
                            int sub = ct.bn + ct.color;     //Imagenes que el cliente no ha procesado
                            temp.content = ct;
                            System.out.println(ct.nombre + " sale de la cola y se mueve a " + temp.name +".");
                            
                            //Ingresar imagen a la pila
                            if(ct.bn != 0){
                                String nombre = ct.nombre + " - " +Integer.toString(sub);
                                t.push(new Imagen(ct.ID, nombre, "BN"), nombre);
                                ct.bn--;
                                ct.pasos++;
                                System.out.println(ct.nombre + " registra una imagen en blanco y negro.");
                            }else{
                                String nombre = ct.nombre + " - " +Integer.toString(sub);
                                t.push(new Imagen(ct.ID, nombre, "Color"), nombre);
                                ct.color--;
                                ct.pasos++;
                                System.out.println(ct.nombre + " registra una imagen a color.");
                            }
                        }      
                        temp = temp.next;
                    }
                    
                    //Verificar si la cola está vacia y sumar un paso a cada cliente que queda
                    tcc = Clientes.head;
                    if(tcc == null){
                        Clientes.enqueue(null, "Vacio");
                    }else{
                        while(tcc.next != null){
                            Cliente ct = (Cliente)tcc.content;
                            ct.pasos++;
                            tcc = tcc.next;
                        }
                    }
                 
                    
                //Manejo de las impresoras------------------------------------------------------------
                
                //FIN DEL PROCESO
                    System.out.println("---------------------------------------------------------");
                }
            }
                
                
            //Mostrar Estructuras***************************************************************
            if ("3".equals(x)){
                if( carga == 0 || ventanas == 0 ){
                    System.out.println("");
                    System.out.println("ERROR: Debe cargar la infromación y definir la cantidad de ventanillas antes de proceder.");
                    System.out.println("");
                    System.out.println("---------------------------------------------------------");
                }else{
                    
                    Clientes.dibujar("Estructuras\\Cola Clientes.txt", "Estructuras\\Cola Clientes.png");
                    Ventanilla.dibujar("Estructuras\\Ventanillas.txt", "Estructuras\\Ventanillas.png");
                    Atendidos.dibujar("Estructuras\\Clientes atendidos.txt", "Estructuras\\Clientes Atendidos.png");
                    BN.dibujar("Estructuras\\Fotocopiadora BN.txt", "Estructuras\\Fotocopiadora BN.png");
                    C.dibujar("Estructuras\\Fotocopiadora Color.txt", "Estructuras\\Fotocopiadora Color.png");
                    Espera.dibujar("Estructuras\\Clientes esperando.txt", "Estructuras\\Clientes esperando.png");
                    System.out.println("");
                    System.out.println("MENSAJE: Estrcturas actualizadas. Revise la carpeta estructuras dentro del proyecto.");
                    System.out.println("");
                    System.out.println("---------------------------------------------------------");
                }
            }
            
            
            //Reportes**************************************************************************
            if ("4".equals(x)){
                System.out.println("Funciona");
            }
            
            
            //Acerca de************************************************************************
            if ("5".equals(x)){
                System.out.println("ESTRUCTURAS DE DATOS SECCIÓN C");
                System.out.println("Josué Javier Aguilar López");
                System.out.println("201909035");
                System.out.println("---------------------------------------------------------");
            }
            
        }
    }
    
    //Metodo de ejemplo para usar estructuras
    public static void prueba(){
        //Ejemplo de como se debe de craer una cola
        Cola a = new Cola();
        a.enqueue(1, "Uno");
        a.enqueue(2, "Dos");
        a.enqueue(3, "Tres");
        a.dequeue();
        a.dibujar("Cola.txt", "Cola.png");
        
        //Ejemplo para crear una pila
        Pila b = new Pila();
        b.push(1, "Uno");
        b.push(2, "Dos");
        b.push(3, "Tres");
        b.pop();
        b.dibujar("Pila.txt", "Pila.png");
        
        //Ejemplo para crear una pila
        Pila b1 = new Pila();
        b1.push(1, "Uno");
        b1.push(2, "Dos");
        b1.push(3, "Tres");
        b1.pop();
        
        
        //Ejemplo para crear una pila
        Pila b2 = new Pila();
        b2.push(1, "Uno");
        b2.push(2, "Dos");
        b2.push(3, "Tres");
        b2.pop();
        
        //Ejemplo para crear una pila
        Pila b3 = new Pila();
        b3.push(1, "Uno");
        b3.push(2, "Dos");
        b3.push(3, "Tres");
        b3.push(4, "Hola");
        b3.push(5, "Cinco");
        b3.push(6, "Seis");
        b3.push(7, "Patata");
        
        //Ejemplo de una lista simple
        ListaSimple c = new ListaSimple();
        c.add(1, "Uno");
        c.add(2, "Dos");
        c.add(3, "Tres");
        c.dibujar("Lista.txt", "Lista.png");
        
        //Ejemplo de una lista simple
        ListaSimple c1 = new ListaSimple();
        c1.add(1, "UNO");
        c1.add(2, "DOS");
        c1.add(3, "TRES");
        c1.dibujar("Lista1.txt", "Lista1.png");
        
        //Ejemplo de una lista simple
        ListaSimple c2 = new ListaSimple();
        c2.add(1, "UNO");
        c2.add(2, "DOS");
        c2.add(3, "TRES");
        c2.dibujar("Lista2.txt", "Lista3.png");
        
        ListaSimple c3 = new ListaSimple();
        c3.add(1, "UNO");
        c3.add(2, "DOS");
        c3.add(3, "TRES");
       
        //Ejemplo de Lista de Listas
        ListaDCircularL d = new ListaDCircularL();
        d.add(c, "Números", null);
        d.add(c1, "Texto", null);
        d.add(c2, "Hola", null);
        d.add(c3, "Pedro", null);
        d.dibujar("DLC.txt", "DLC.png");
        
        //Ejemplo de una lista de pilas
        ListaPilas e = new ListaPilas();
        e.add(b, "UNI");
        e.add(b1, "Pueblos");
        e.add(b3, "Caballos");
        e.add(b2, "Rancho");
        e.dibujar("PL.txt", "PL.png");
    }
}