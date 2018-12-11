package pizzashop;

public class Pizza {
    int size;
    
    Pizza(int size){
        this.size = size;
    }

    Pizza() {}

    public String toString() {
        return "Pizza size: " + size;
    }
}