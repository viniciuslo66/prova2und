public class q1 {
    public static void main(String[] args) {

        char[] caracteres;

        String exemplo1 = "()";
        String exemplo2 = "()[]{}";
        String exemplo3 = "(]";
        String exemplo4 = "([)]";
        String exemplo5 = "{[]}";

        caracteres = exemplo1.toCharArray();
        boolean saida = false;

        Pilha pilha = new Pilha(caracteres.length);
        saida = pilha.testarString(caracteres);

        System.out.println("Saida 1: " + saida);

        caracteres = exemplo2.toCharArray();

        pilha = new Pilha(caracteres.length);
        saida = pilha.testarString(caracteres);

        System.out.println("Saida 2: " + saida);

        caracteres = exemplo3.toCharArray();

        pilha = new Pilha(caracteres.length);
        saida = pilha.testarString(caracteres);

        System.out.println("Saida 3: " + saida);

        caracteres = exemplo4.toCharArray();

        pilha = new Pilha(caracteres.length);
        saida = pilha.testarString(caracteres);

        System.out.println("Saida 4: " + saida);

        caracteres = exemplo5.toCharArray();

        pilha = new Pilha(caracteres.length);
        saida = pilha.testarString(caracteres);

        System.out.println("Saida 5: " + saida);
    }
}