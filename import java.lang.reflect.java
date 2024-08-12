import java.lang.reflect.Array;

//-------------------------------------------------------------------------------------------------------------------|
// Conceito de pilha: Podemos analisar uma pilha, exatamento como uma pilha de pratos que utilzamos.                 |
// se colocarmos os pratos em pilhas 1 por 1, "preenchendo" essa pilha. (last in, First out).                        |
//Quando formos reutilizar os pratos, pegamos sempre o que está no topo da pilha, ou seja , o ultimo que guardamos   |
//-------------------------------------------------------------------------------------------------------------------|


// Criamos a classe e utilizamos o <T> para informar que ela é uma classe genérica
// ou seja, podemos reutilizar ela para vários tipos de dados ao inves de recriar uma classe
// para cada tipo de dado ( Pilha<Integer> , Pilha<String>)
public class Pilha<T> {
    // definimos o tamanho da lista como -1 para definir que a lista está vazia
    private int top = -1;
    // definimos um array que será utilizado para armazenar os elementos da pilha
    private T[] data;

    // usamos o construtor para inicializar o array com o tamanho fornecido
    public Pilha(int size){
        data = (T[]) new Object[size];

    }
    // metodo para adicionar um elemento no topo da pilha
    public void push(T value){
        // verifica se a lista está cheia, se o isFull retornar True ele retorna que a pilha está cheia
        if (isFull()){
            System.out.println("A pilha está cheia.");
            return;
        }
        // armazena o valor e encrementa o top
        data[++top] = value;
    }
    // A função pop () para remover e retornar o ultimo elemento da pilha.
    public T pop(){
        // verifica se está vazio a lista
        if (isEmpty()){
            System.out.println("A pilha está vazia.");
            return null;
        }
        // retorna o dado e decrementa do top
        return data[top--];
    }
    // metodo para esvaziar a pilha
    public void clear(){
        //Apenas definimos o top para -1;
        top = -1;
    }
    // metodo para verificar se a pilha está cheia
    public boolean isFull(){
        // verifica se o top alcançou o ultimo indice da lista
        return top == data.length - 1;
    }
    // metodo para verificar se a pilha está vazia
    public boolean isEmpty(){
        // apenas verifica se o top é == -1 ainda.
        return top == -1;
    }
    // metodo para ver o item no topo da lista sem removelo
    public T peek(){
        if (isEmpty()){
            System.out.println("A pilha está vazia.");
            return null;

        }
        // retorna o valor de top sem modificar ele
        return data[top];
    }
}
