public class exStrings {
    public static void main(String[] atgs) {
        String str1 = new String("Orientação a objetos");
        String str2 = "ORIENTAÇÂO A OBJETOS";
        System.out.println("Aula : " + str1);
        System.out.println("Aula 02 : " + str2);
         // tanto esse formato quanto o STR2 dão o mesmo resultado.

        StringBuilder str3 = new StringBuilder("Orientação a Objetos");
        /* 
        StringBuilder str4 = "Orientação a Objetos";
            Não aceita da ERROR 
        */ 
        System.out.println("Aula 02 : " + str3);

        StringBuffer str5 = new StringBuffer("Orientação a Objetos.");
        /*
        StringBuffer str6 = "Orientação a Objetos."
            Não aceita da ERROR
        */
        System.out.println("Aula 03 : " + str5);
    }
}
