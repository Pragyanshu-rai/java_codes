class GrandParent{

    void showName(){

        System.out.print("GP");
    }

}

class Parent extends GrandParent{

    void showName(){

        System.out.print("P");
    }


}

class child extends Parent{

    void showName(){

        System.out.print("Child");
    }


}

public class Inher{
    
    public static void main(String[] args) {
        child ch = new child();
        ch.showName();
    }

}