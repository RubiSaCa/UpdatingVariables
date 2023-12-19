package rubi.com.main;

public class UpdatingVariables {
    public static void main(String[] args){
        int salary = 1000;

        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida: $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizado cadenas de texto
        String empoyeeName = "Rubi";
        empoyeeName = empoyeeName + "Salcedo Castro";
        System.out.println(empoyeeName);

        empoyeeName = "Mi nombre es: " + empoyeeName;
        System.out.println(empoyeeName);

    }
}