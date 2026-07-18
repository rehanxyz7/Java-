class Mobile{
    String name;
    int model;
    int year;
    void Switch(){
        System.out.println("Switch off ");

    }
    //constrictor 
    Mobile(String n, int m,int y){
        name =n;
        model =m;
        year=y;
    }
}

class firstprogram {
public static void main(String[]abc){
    Mobile x = new Mobile("Motorola ", 2,2021);
    Mobile y=  new Mobile("Apple ", 8,2016);

    System.out.println(x.name);
    System.out.println(y.model);
    x.name= "Oppo";
    System.out.println(x.name);
}    
}
