public class FizzBuzz {

    public static boolean isMultiple3(int nombre){
        if(nombre % 3 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isMultiple5(int nombre){
        if(nombre % 5 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isMultiple3And5(int nombre){
        if(isMultiple3(nombre) && isMultiple5(nombre)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        for (int nombre = 1 ; nombre <= 100 ; nombre ++){

            if(isMultiple3And5(nombre)){
                System.out.println(nombre + " FizzBuzz");
            }
            else if(isMultiple3(nombre)){
                System.out.println(nombre + " Fizz");
            }
            else if(isMultiple5(nombre)){
                System.out.println(nombre + " Buzz");
            }
            else{
                System.out.println(nombre);
            }

        }



    }
}
