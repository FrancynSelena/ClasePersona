

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {

    	

    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();

        System.out.println("Ingrese el sexo");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese el peso");
        double peso = sc.nextDouble();

        System.out.println("Ingrese La altura");
        double altura = sc.nextDouble();
        sc.close();
        
        Persona objeto1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona objeto2 = new Persona(nombre, edad, sexo);
        Persona objeto3 = new Persona();
        objeto3.setNombre(nombre);
        objeto3.setEdad(edad);
        objeto3.setSexo(sexo);
        objeto3.setPeso(peso);
        objeto3.setAltura(altura);
        int res1 = objeto1.calcularIMC();
        int res2 = objeto2.calcularIMC();
        int res3 = objeto3.calcularIMC();
        switch (res1) {
            case -1:
                System.out.println("Esta debajo del peso requerido");
                break;
            case 0:
                System.out.println("Esta en el peso ideal");
                break;

            case 1:
                System.out.println("Esta en sobrepeso");

        }

        switch (res2) {
            case -1:
                System.out.println("Esta debajo del peso requerido");
                break;
            case 0:
                System.out.println("Esta en el peso ideal");
                break;

            case 1:
                System.out.println("Esta en sobrepeso");

        }

        switch (res3) {
            case -1:
                System.out.println("Esta debajo del peso requerido");
                break;
            case 0:
                System.out.println("Esta en el peso ideal");
                break;

            case 1:
                System.out.println("Esta en sobrepeso");
                break;
        }
        boolean resEdad1 = objeto1.esMayorDeEdad();
        boolean resEdad2 = objeto2.esMayorDeEdad();
        boolean resEdad3 = objeto3.esMayorDeEdad();
        if (resEdad1 == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        if (resEdad2 == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        if (resEdad3 == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("Datos objeto1");
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getEdad());
        System.out.println(objeto1.getPeso());
        System.out.println(objeto1.getSexo());
        System.out.println(objeto1.getAltura());

        System.out.println("Datos objeto2");
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getEdad());
        System.out.println(objeto2.getPeso());
        System.out.println(objeto2.getSexo());
        System.out.println(objeto2.getAltura());

        System.out.println("Datos objeto3");
        System.out.println(objeto3.getNombre());
        System.out.println(objeto3.getEdad());
        System.out.println(objeto3.getPeso());
        System.out.println(objeto3.getSexo());
        System.out.println(objeto3.getAltura());

    }

}
