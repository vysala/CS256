package ArraysOfObjects;
class FruitBasket{
    String name;
    int noofitems;
    public FruitBasket() {
        this.name=" ";
        this.noofitems=0;
    }
    public FruitBasket(String name, int noofitems) {
        this.name = name;
        this.noofitems = noofitems;
    }

    

}



public class FruitsArrayofObjects {
    public static void main(String[] args) {
        String[] fruits=new String[3];
        fruits[0]="apple";
        fruits[1]="orange";
        fruits[2]="kiwi";
    for(int i=0;i<fruits.length;i++){
        System.out.print(fruits[i] + " ");
    }
 
   
    //FruitBasket[] arrname=new FruitBasket[5];
    FruitBasket b1=new FruitBasket("apple",5);
    FruitBasket b2=new FruitBasket("oranges", 5);
    FruitBasket b3=new FruitBasket("kiwi", 10);

    FruitBasket[] arrofFruitBaskets={b1,b2,b3};

    System.out.println();

    System.out.println(arrofFruitBaskets[0].name);
    System.err.println(arrofFruitBaskets[0].noofitems);

    }
   
}
