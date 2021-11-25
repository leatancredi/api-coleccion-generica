package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
       //creamos la interface list
        List<String> miLista = new ArrayList<>();
//        De la izquierda mencionamos el tipo a la intrface,
//          de la derecja usamos la notacion de diamante
        
        //coleccion tipo add
        //agragamos objetos, elementos de los dias de la semana
        //las operaciones list guardan el orden, sulen ser mas lentas
        //puede duplicar elementos
        
        
        //ya no menciona los objetos como tipo object, sino que los alamcena como tipo String(en este caso)
        miLista.add("lunes");
        miLista.add("martes");
        miLista.add("miercoles");
        miLista.add("jueves");
        miLista.add("viernes");
        miLista.add("sabado");
        miLista.add("domingo");
        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
        System.out.println("");
        //para imprimir interamos la lista con for each
        //MANERA convencional
//        for( Object elemento: miLista){
//            System.out.println("elemento = " + elemento);
//        }
        //MANERA de funcion lamda, funcion flecha
//        miLista.forEach(elemento -> {
//                //recorre los elementos de la coleccion
//                    System.out.println("elemento = " + elemento);
//                });

         Set miSet = new HashSet();
         //las operaciones set, no guardan el orden, suelen ser mas rapidas
         //no se puede duplicar elementos
            miSet.add("lunes");
            miSet.add("martes");
            miSet.add("miercoles");
            miSet.add("jueves");
            miSet.add("viernes");
            miSet.add("sabado");
            miSet.add("domingo");
            
            imprimir(miSet);
            System.out.println("");
            
            Map miMapa = new HashMap();
            miMapa.put("valor1", "juan");
            miMapa.put("valor2", "karla");
             miMapa.put("valor3", "rosario");
            
//             String elemento = (String) miMapa.get("valor1");
             System.out.println("elemento = " + elemento);
             // key ser imprime el primer elemento y values , el segundo
//             imprimir(miMapa.keySet());
//             imprimir(miMapa.values());
             
             
            }
    // aplicando polimorfismo
    //collection es la clase padres para list y set
    public static void imprimir(Collection<String> coleccion){
        // indicamos <> el tipo que queremos trabajar
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
    
           
}
