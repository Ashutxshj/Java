class ClassMethods{
    public void fruits(){
        String fruits[]={"Apple","Banana","Mango","Strawberry"};
        System.out.println("Fruits:");
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
    }
    public static void main(String[] args){
        ClassMethods ex5=new ClassMethods();
        ex5.fruits();
    }
}