
//Crie um programa que recebe um array de palavras e imprime apenas as que têm mais de 4 letras.
public class LocalizandoNomesMaior4letras {

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bia", "Carlos", "Daniel", "Eduardo", "Felipe", "Gustavo", "Hugo", "Igor", "João", "Kleber", "Lucas", "Mariana", "Natalia", "Oscar", "Paulo", "Quiteria", "Rafael", "Sandra", "Tatiana", "Ubirajara", "Vitor", "Wagner", "Xuxa", "Yuri", "Zelda"};

        for (String nome : nomes) {
            if (nome.length() < 4) {
                System.out.println(nome);
            }
        }
    }

}
