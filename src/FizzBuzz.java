public class FizzBuzz {

    //vérifier si le nombre est un multiple de 3
    public static boolean isMultiple3(int nombre){
        if(nombre % 3 == 0){
            return true;
        }else{
            return false;
        }
    }

    //vérifier si le nombre est un multiple de 5
    public static boolean isMultiple5(int nombre){
        if(nombre % 5 == 0){
            return true;
        }else{
            return false;
        }
    }

    //vérifier si le nombre est un multiple de 3 et de 5
    public static boolean isMultiple3And5(int nombre){
        if(isMultiple3(nombre) && isMultiple5(nombre)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        //Boucle pour traiter les nombres de 1 à 100
        for (int nombre = 1 ; nombre <= 100 ; nombre ++){
            //si le nombre est un multiple de 3 et 5
            if(isMultiple3And5(nombre)){
                System.out.println(nombre + " FizzBuzz");
            }
            //si le nombre est un multiple de 3
            else if(isMultiple3(nombre)){
                System.out.println(nombre + " Fizz");
            }
            //si le nombre est un multiple de 5
            else if(isMultiple5(nombre)){
                System.out.println(nombre + " Buzz");
            }
            //dans tous les cas
            else{
                System.out.println(nombre);
            }

        }



    }
}
