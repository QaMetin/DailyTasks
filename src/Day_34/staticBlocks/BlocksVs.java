package Day_34.staticBlocks;

public class BlocksVs {
    int i;
    public BlocksVs(int i){
        this.i=i;
        System.out.println("constructor çalıştı");

    }
    static {
        System.out.println("statik blok çalıştı");
    }
    {
        System.out.println("intance block çalıştı");
    }
}
