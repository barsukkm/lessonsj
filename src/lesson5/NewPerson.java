package lesson5;


public class NewPerson {

    public static void doArrPerson(){
        Person[] arrPer = new Person[5];
        arrPer[0] = new Person("Sam", "Manager", "sam@mail.com", "123456788", 1100, 41);
        arrPer[1] = new Person("Naomi", "Manager", "naomi@mail.com", "213456788", 1100, 25);
        arrPer[2] = new Person("Kirill", "Manager", "kirill@mail.com", "123546788", 1100, 39);
        arrPer[3] = new Person("Sally", "Manager", "sally@mail.com", "123456712", 1100, 45);
        arrPer[4] = new Person("Artem", "Manager", "artem@mail.com", "123996788", 1100, 41);
        for(int i=0; i <= arrPer.length; i++){
            if(arrPer[i].getAge() > 40)
                System.out.print(arrPer[i]);
        }
    }

    public static void main(String[] args){
        doArrPerson();

    }

}
