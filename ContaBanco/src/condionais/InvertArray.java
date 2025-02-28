import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InvertArray {

    // agora vou usar metodo prontos Collections.reverse().
    // agora vou colocar comentarios em cada linha do codigo explicando o que ela faz.

    public static void main(String[] args){
        

        //crio um array de strings com 5 elementos.
        String[] nomes = {"João", "Maria", "José", "Antônio", "Thiago"};


        //crio um array de strings com 5 elementos.
        List<String> listaNomes = Arrays.asList(nomes);

        //converto o array de strings em uma lista de strings.
        Collections.reverse(listaNomes);


        //exibir lista invertida
        for(String nome : listaNomes){
            System.out.println(nome);
        }   

    }


    /*public static void main(String[] args){
        String[] nomes = {"João", "Maria", "José", "Antônio", "Thiago"};
        
        String[] nomesInvertidos = new String[nomes.length];

        for(int i = 0; i < nomes.length; i++){
            nomesInvertidos[i] = nomes[nomes.length - 1 - i];
        }

        for(String nome : nomesInvertidos){
            System.out.println(nome);
        }   


    }*/

}
