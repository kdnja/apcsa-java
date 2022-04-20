public class Celebrity {
    String name = "";
    String clue = "";
    String type = "";

    // Constructor
    Celebrity(String name, String clue, String type) {
        this.name = name;
        this.clue = clue;
        this.type = type;
    }

    Celebrity() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
