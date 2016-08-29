
package stringbuilder;


public class Stringbuilder {

    public static void main(String[] args) {

        /*String texto = "esto es un";
        texto += " esxto en " + " Java";
        System.out.println(texto);
        //al utilizar la clase StringBuilder mejora el rendimiento de la aplicacion
        StringBuilder sb = new StringBuilder();
        
        sb.append("esto es un ").append("texto en").append(" Java");
        System.out.println(sb.toString());*/
        
        //demostracion de rendimiento utilizando StringBuilder
        
        long tiempo_inicio = System.nanoTime();//muestra tiempo en nanosegundos
        
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 1000; i++){
            
            builder.append(i);
        }
        
        long tiempo_fin = System.nanoTime();
        double diferencia = (tiempo_fin - tiempo_inicio);
        
        System.out.println("utilizando StringBuilder : " + diferencia);
        
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        //demostracion de rendimiento utilizando concatenacion normal con el +
        
        long tiempo_inicio2 = System.nanoTime();//muestra tiempo en nanosegundos
        
        String texto = "";
        for(int i = 0; i < 1000; i++){
            
            texto += i;
        }
        
        long tiempo_fin2 = System.nanoTime();
        double diferencia2 = (tiempo_fin2 - tiempo_inicio2);
        
        System.out.println("normal utilizando + : " + diferencia2);
        
    }
    
}
