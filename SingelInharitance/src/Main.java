class Student {
    int Roll;
    String Name = new String();
}

class Result extends Student{
    float Mark;
    void GetData(){
      Roll = 493549;
      Name = "Ashim Rudra Paul";
      Mark = 75.4f;
    }
    void Display(){
        System.out.println("Roll Is :"+Roll);
        System.out.println("Name Is :"+Name);
        System.out.println("Mark Is :"+Mark);
    }
}

class Main{
    public static void main(String args[]){
        Result R=new Result();
        R.GetData();
        R.Display();
    }
}