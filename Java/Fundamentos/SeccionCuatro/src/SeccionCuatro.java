
import java.util.Scanner;


public class SeccionCuatro {

    public static void main(String args[]) {

/*Clase25 OPERADORES ARITMETICOS EN JAVA
        
        //Operador aritmetico + significa suma
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado de suma = " + resultado);

        //Operador aritmetico - significa resta
        resultado = a - b;
        System.out.println("resultado de resta = " + resultado);

        //Operador aritmetico * significa multiplicacion 
        resultado = a * b;
        System.out.println("resultado de multiplicacion = " + resultado);

        //Operador aritmetico / significa division
        resultado = a / b; //En este ejemplo unicamente se muestra el resultado de la divsion pero sin el residuo
        System.out.println("resultado de division con Int = " + resultado);

        var resultado2 = 3.0 / b; //Devido a que las variables son de tipo int el sultado sera entero pero si se cambian a float el resultado sera con decimal
        System.out.println("resultado de division con Float = " + resultado2);

        //Operador aritmetico % significa Modulo (Este realiza una division y el residuo de la division lo asigna a la variable
        resultado = a % b;
        System.out.println("resulado de modulo = " + resultado);

        //Ejemplo practico
        if ((a % b) == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar " + resultado);
        }

        //Otro ejemplo es 
        resultado = 10 % 7;
        System.out.println("resultado = " + resultado);
         */

 /*Clase26 OPERADORES DE ASIGNACION EN JAVA

        int a = 3, b = 2;
        int c = a + 5 - b; //El valor = se utiliza para asignar //El valor de == Es para comparar
        System.out.println("c = " + c);
        
        //Operador de composicion de SUMA
        a += 1; //Es la sustitucion de a = a + 1
        System.out.println("a = " + a);
        a += 3; //Es la sustitucion de a = a + 3
        System.out.println("a = " + a);
        
        //Operador de composicion de RESTA
        a -= 2; //Es la sustitucion de a = a - 2
        System.out.println("a = " + a);
        
        //Operador de composicion de MULTIPLICACION
        a *= 2; //Es la sustitucion de a = a * 2
        System.out.println("a = " + a);

        //Operador de composicion de DIVISION
        a /= 2; //Es la sustitucion de a = a / 2
        System.out.println("a = " + a);

        //Operador de composicion de MODULO
        a %= 2; //Es la sustitucion de a = a % 2        
        System.out.println("a = " + a);
         */

 /*Clase27 OPERADORES UNITARIOS EN JAVA

        //Operador unario para cambio de signo 
        var a = 3;
        var b = -a; //Cambiando el valor de a a negativo
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Operador unario para cambio de signo de un dato BOLEANO
        var c = true;
        var d = !c; //Solo aplica para valores BOLEANOS y es la inversa de la variable c gracias a !
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Operador unario de decremento o incremento (Existen varias variantes)
        
        //Incremento
        
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;//Primeoro se utiliza la varible y despues se utiliza su valor
        System.out.println("e = " + e);//Este valor ya se preincremento 
        System.out.println("f = " + f);//Esta varaible toma el valor de e ya preincrementado
        
        //2.postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;//Primero se utiliza el valaor y despues se incrementa
        System.out.println("g = " + g);//Recibe el valor del postincremento
        System.out.println("h = " + h);//Toma el valor sin el incremento
        
        //Decremento 
        //Este es disminuir en UNO el valor de nuestra Variable
        
        //1.Predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);//El valor ya esta decrementado
        System.out.println("j = " + j);//El valor asignado es el que ya se decremento
        
        //2.Postdecremento
        var k = 4;
        var l = k--;//Primero se usa el valor de la variable y queda pendiente el decremento
        System.out.println("k = " + k);//Se ejecuta el decremento pendiente
        System.out.println("l = " + l);//Se hace uso de la variable k sin el decremento
         */
 /*Clase28 OPERADORES RELACIONALES Y DE IGUALDAD EN JAVA

        //Operador de igualdad
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a !=b;
        System.out.println("d = " + d);
        
        //Para comparar datos de tipo string se hace uso de .equals
        
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var f = cadena1 == cadena2; //Esta no es la manera correcta de hacer esto 
        var g = cadena1.equals(cadena2); //Esta es la manera correcta de hcae la comparacion de datos de un Sting
        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
         */

 /*Clase29 Operadores relacionales
        
        //Operadores relacionales: Nos indican si un valor es Igual o Menor o Igual o Mayor
        
        var a = 3;
        var b = 2;
        
        var g = a > b; //El valor de a es mayor al valor de b (Es True)
        System.out.println("g = " + g);
        
        var h = a >= b; //El valor de a es igual o menor que el valor de b (Es True)
        System.out.println("h = " + h);
        
        //Ejemplo con If 
        if(a % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
         */
 /*Clase30 OPERADORES CONDICIONALES EN JAVA && y ||

        //Operador && = and = y (Para el resultado sea True las expreciones relacionadas tienen que ser True)
        var a = 5;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado = a >= valorMinimo && a <= valorMaximo;
        
        if(resultado){
            System.out.println("Dentro del rango");
        }else{
            System.out.println("Fuera del rango");
        }    
        
        //Operador || = or = o (Para que el resultado sea True solo una de las "expresiones o variables" tiene que ser True)
        
        var vacaciones = true;
        var diaDescanso = false;
        
        if (vacaciones || diaDescanso){
            System.out.println("El padre puede ir al juego de hijo");
        }else{
            System.out.println("El padre esta ocupado");
        }*/

 /*Clase31 OPERADOR TERNARIO EN JAVA
        //El operador TERNARIO consta de tres partes (Expresion que retorne un valor Boleano)(Verdad = ?)(Falsa = :)
        //El operador TERNARIO solo es RECOMENDABLE SI SON EXPRESIONES SENCILLAS
        var resultado = 5 > 4 ? "Verdad" : "Falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 7;
        resultado = (numero % 2 == 0) ? "Numero Par" : "Numero Impar";
        System.out.println("resultado = " + resultado);
        */
 
 /*Clase32 PRESEDENCIA DE OPERADORES EN JAVA
        var x = 5;
        var y = 10;
        var z = ++x + y--; //Preincremento y pos incremento
     
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        //Ejemplo 1
        var resultado = 4 + 5 * 6 / 3; // 4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);// 14
        
        //Ejemplo 2 reutilizando valores
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);//18
        */
 
 /*Tarea 4: Rectangulo 
        
        int alto = 0;
        int ancho = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Proporciona el alto:");
        alto = scanner.nextInt();
        System.out.println("Proporciona el ancho:");
        ancho = scanner.nextInt();
        
        var area = alto * ancho ;
        var perimetro = (alto + ancho) * 2;
        
        System.out.println("Area:" + area);
        System.out.println("Perimetro:" + perimetro);
        */
 
 /*Tarea 5: El mayor de dos numeros*/
 
        int numero1 = 0;
        int numero2 = 0;
        
        Scanner readnumero = new Scanner(System.in);
        
        System.out.println("Proporciona el numero1:");
        numero1 = Integer.parseInt(readnumero.nextLine());
        
        System.out.println("Proporciona el numero2:");
        numero2 = Integer.parseInt(readnumero.nextLine());
        
        var resultado = numero1 > numero2 ? numero1  : numero2 ;
        
        
        System.out.println("El numero mayor es");
        System.out.println(resultado);

    }
}
