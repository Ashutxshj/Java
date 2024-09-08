class Loops{
    public static void main(String[] args){
        //There are three types of Loops
        /*
         * For
         * While
         * Do While
         */
        for(int i=1;i<=10;i++){
            System.out.println("2* "+i+" = "+2*i);
        }
        System.out.println("BREAK KE BAAD");
        int[] prime={1,3,5,7,11,13,17,19};
        for(int i:prime){
            System.out.println(i);
        }
        int i=10;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }
}