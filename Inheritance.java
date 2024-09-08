class FundamentalForce{
    void Force(){
        System.out.println("There are four fundamental forces.");
    }
}
class Gravitational extends FundamentalForce{
    void Gravity(){
        System.out.println("Fruits fall to the ground due to gravitational force.");
    }
}
class Inheritance{
    /*
     * Single
     * Multi-level
     * Hierarchical
     */
    public static void main(String[] args){
        Gravitational G = new Gravitational();
        G.Force();
        G.Gravity();
    }
}