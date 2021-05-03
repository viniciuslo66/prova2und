public class Pilha {

    public char[] pilha;
    public int posicaoPilha;
    int tamanho;

    public Pilha(int tamanho) {
        this.posicaoPilha = -1;
        this.pilha = new char[tamanho]; 
    }

    public char topo() {
        if (tamanho == -1) {
            System.out.println("Lista vazia");
        }
        return pilha[tamanho];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0; 
        }
        return this.posicaoPilha + 1;
    }

    public void empilhar(char valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public char desempilhar() {
        if (pilhaVazia()) {
            char nu = '0';
            return nu;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public boolean testarString(char[] caracteres) {

        Pilha pilha = new Pilha(caracteres.length);

        for (int i = 0; i < caracteres.length - 1; i++) {
            if (pilha.pilhaVazia() && caracteres[i] == ')' || caracteres[i] == ']' || caracteres[i] == '}') {
                return false;
            } else {
                if (caracteres[i] == '(') {
                    pilha.empilhar(caracteres[i]);
                } else if (caracteres[i] == '[') {
                    pilha.empilhar(caracteres[i]);
                } else if (caracteres[i] == '{') {
                    pilha.empilhar(caracteres[i]);
                }

                if (!pilha.pilhaVazia() && caracteres[i] == ')') {
                    if (pilha.topo() == '(')
                        pilha.desempilhar();
                } else if (!pilha.pilhaVazia() && caracteres[i] == ']') {
                    if (pilha.topo() == '[')
                        pilha.desempilhar();
                } else if (!pilha.pilhaVazia() && caracteres[i] == '}') {
                    if (pilha.topo() == '{')
                        pilha.desempilhar();
                }
            }
        }

        if (pilhaVazia()) {
            return true;
        } else {
            return false;
        }
    }
}
