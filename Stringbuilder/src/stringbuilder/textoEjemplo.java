package stringbuilder;

public class textoEjemplo {

    public static void main(String[] args) {

        String nombre = "andres";
        String apellido = "fragozo";

        StringBuilder t = new StringBuilder();
        
        t.append("Hola tu nombre es ").append(nombre).append(" ").append(apellido);
        System.out.println(t);
    }

}
