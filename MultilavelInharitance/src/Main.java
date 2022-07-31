class Student {
    int Roll;
    String Name = new String();

    void GetData() {
        Roll = 493549;
        Name = "Ashim Rudra Paul";
    }

    void Display() {
        System.out.println("Inside Student Class");
        System.out.println("Roll Is :" + Roll);
        System.out.println("Name Is :" + Name);
    }
}
    class Exam extends Student{
        float Mark;
        void GetData(){
            Mark = 80.75f;
        }
        void Display(){
            System.out.println("Extend Exam Class");
            System.out.println("Mark Is :"+Mark);
        }
    }

    class Result extends Exam{
        Student S = new Student();
        Exam E = new Exam();
        void GetData(){
            S.GetData();
            E.GetData();
        }
        void Display(){
            S.Display();
            E.Display();
        }
    }

    class multi{
    public static void main(String args[]){
        Result R=new Result();
        R.GetData();
        R.Display();
    }
    }



