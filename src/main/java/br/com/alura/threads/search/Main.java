package br.com.alura.threads.search;

public class Main {
    public static void main(String[] args) {

        String name = "da";

        Thread assinature1 = new Thread(new NameSearch("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\threads\\search\\assinaturas1.txt", name));
        Thread assinature2 = new Thread(new NameSearch("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\threads\\search\\assinaturas2.txt", name));
        Thread author = new Thread(new NameSearch("C:\\Users\\Karina\\IdeaProjects\\Java\\src\\main\\java\\br\\com\\alura\\threads\\search\\autores.txt", name));

        assinature2.start();
        assinature1.start();
        author.start();
    }
}
