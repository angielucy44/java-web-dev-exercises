package exercises.technology;

public class AbstractEntity {
    //variables

    private Integer id;

    //constructor
    public AbstractEntity(Integer id) {
        this.id = id;
    }

    //methods
    public Integer assignId() {
        return this.id += 1;
    }
}
