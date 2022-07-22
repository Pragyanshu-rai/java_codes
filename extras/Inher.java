class GrandParent{

    void showName(){

        System.out.println("GP");
    }

}

class Parent extends GrandParent{

    void showName(){

        System.out.println("P");
    }


}

class child extends Parent{

    void showName(){

        System.out.println("Child");
    }


}

public class Inher{
    
    public static void main(String[] args) {
        child ch = new child();
        ch.showName();
    }

}