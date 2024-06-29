
public class TiposPrimitivos {
    public static void main(String[] args) {
        //variável e tipo de dado texto
        String txt = "Francisco Gabriel S.";
        //imprime variável
        System.out.println(txt);
        //sobreescreve variável
        txt = "Cubos Academy";
        //imprime variavel sobrescrita
        System.out.println(txt);
        //constante
        final String txt2 = "Minha primeira constante";
        //imprie constante
        System.out.println(txt2);

        //Números
        //números inteiros
        int numeroInteiro = 12;
        System.out.println(numeroInteiro);
        // números decimais
        double numeroDecimal = 12.0534;
        System.out.println(numeroDecimal);
        //Lógico
        boolean verdadeiroOuFalso = true;
        System.out.println(verdadeiroOuFalso);

        // ==, >=, <=, !=, >, <
        // &&, ||, !

        int numero1 = 15;
        int numero2 = 20;

        if (numero1 > numero2) {
            System.out.println("Número 1 é maior");
        } else if (numero1 == numero2) {
            System.out.println("número 1 é igual ao número 2");
        } else {
            System.out.println("número 2 é maior");
        }
    }
}