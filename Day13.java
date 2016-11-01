//Write MyBook Class
class MyBook extends Book{
    int price;
    MyBook(String t, String a, int price){
        super(t, a);
        this.price = price;
    }
    
    public void display(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}


