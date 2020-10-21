package game.utils;

public class Utils implements Comparable<Utils> {
    private int id;
    private String name;
    private int[][] comparison = {
      //         rock    paper   scissor
      /*rock*/  {   0,      -1,      1},
      /*paper*/ {   1,      0,      -1},
      /*scissor*/{   -1,      1,      0}
    };

    public int compareTo(Utils others){
        return comparison[id][others.id];
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getId() {
        return id;
    }

    protected String getName(int id) {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
