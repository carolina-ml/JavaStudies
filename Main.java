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
*/

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