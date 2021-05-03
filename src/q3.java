public class q3 {
    public static void main(String[] args) {
        ListaEncadeadaSimples<Integer> lista1 = new ListaEncadeadaSimples<Integer>();
        ListaEncadeadaSimples<Integer> listaInvertida = new ListaEncadeadaSimples<Integer>();

        int ultimoElemento = 9;

        lista1.addLast(4);
        lista1.addLast(5);
        lista1.addLast(1);
        lista1.addLast(ultimoElemento);
        lista1.show();

        for (int i = 0; i <= ultimoElemento; i++) {
            if (lista1.search(i) != null) {
                listaInvertida.addFirst(lista1.search(i));
            } 
        }

        listaInvertida.show();
    }
}