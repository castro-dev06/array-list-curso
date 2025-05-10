package application;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        //Criando uma lista do tipo String
        ArrayList<String> arrayList = new ArrayList<>();

        //Adicionando nomes na lista
        arrayList.add("Murilo");
        arrayList.add("Marcia");
        arrayList.add("Carlos");
        arrayList.add("Felipe");
        arrayList.add("Claudio");
        arrayList.add("Marcio");
        arrayList.add("Ana Clara");
        arrayList.add("Matheus");


        arrayList.remove(3);//removendo elemento na posição passada no parâmetro
        arrayList.remove(0);

        arrayList.add(2, "Paulo");//acessando a posição desejada e colocando um elemento dentro dela

        arrayList.remove("Marcia");//Removendo elemento que está na lista, passando o nome que quero excluir

        System.out.println(arrayList.size());//Acessando o tamanho da lista

        //Percorrendo a lista e imprimindo o nome em cada índice utilizando o for each
        for (String nomes : arrayList) {
            System.out.println(nomes);
        }
        System.out.println("---------------------");

        arrayList.removeIf(x -> x.charAt(0) == 'M');//Removendo da lista todo nome que inicia com a letra 'M'

        //Imprimindo na lista os nomes agora atualizados
        for (String nomes : arrayList) {
            System.out.println(nomes);
        }

        System.out.println("-----------------------");
        System.out.println("Index of Ana Clara: " + arrayList.indexOf("Ana Clara"));//Exibindo o índice do nome passando ele no parâmetro
        System.out.println("Index of Marcio: " + arrayList.indexOf("Marcio"));

        System.out.println("-----------------------");

        //Criando uma lista e recebendo nomes que se iniciam com 'C'utilizando o método stream e uma expressão lambda
        List<String> comecaComC = arrayList.stream().filter(nome -> nome.charAt(0) == 'C').collect(Collectors.toList());

        //Imprimindo todos os nomes com a inicial 'C'
        for (String nomeC : comecaComC){
            System.out.println(nomeC);
        }

        System.out.println("---------------------");

        //Procurando na lista o primeiro nome que se inicia com 'F'. Caso nao encontre a variável receberá null
        String nomeF = arrayList.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);

        //Imprimindo o primeiro nome que foi achado na lista que se inicia com 'F'
        if (nomeF != null){
            System.out.println(nomeF);
        } else {
            System.out.println("Nome não encontrado!");
        }
    }
}
