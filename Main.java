/** 
to declare a variable we use the syntax type name_of_the_varible = value;

Operadores Lógicos:

== 

&&

|| 

!=
& 

se (verdadeiro & verdadeiro)
le tudo
se (falso & verdadeiro)
ele pula o primeiro falso e vai pro próximo bloco de código 

operador ++ incremento -- 
se pré ele faz o uso do incremento


public class Main{
    public static void main(String[] args){
    String name = "Pedro";
    int years_old = 25;
    double salary = 1923.00;
    boolean married = true;

System.out.println("Name: " + name +"\nyears_old: "+ years_old +"\nSalary: "+ salary +"\nmarried: "+ married);    
    }
} 

int contador = 0 

for(in contador = 0; contador < 10;++contador){
    System.out.println(
        contador
    );
}

while(contador <= 10) {
    System.out.println(contador);
    contador = contador + 1;
}

do {
    System.out.println(contador);
    contador =  contador + 1;
}while(contador  <=10);

 }
 /* código abaixo não está funcionando como esperado. De acordo com suas entradas, o resultado esperado era que na saída fosse exibido “Resultado dentro do esperado”, porém não é o que está acontecendo. Analise o código abaixo e, caso necessário, faça as correções necessárias para que ele funcione como esperado.
 */
///O retorno do método somar precisa ser int E o If precisa ser ==

public class TempApplication {
   public static void main(String[] args) {
       int var1 = 10, var2 = 20;
 
       int resultado = somar(var1, var2);
 
       if(resultado == 30) {
           System.out.println("Resultado dentro do esperado!");
       } else {
           System.out.println("Resultado fora do esperado!");
       }
   }
/*Sempre declarar o tipo */ 
   private static string somar(int num1, int num2) {
       return num1 + num2;
   }
}