package academy.devdojo.maratonajava.intrducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + -/ *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezigualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezigualDez "+isDezigualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);


    }
}
