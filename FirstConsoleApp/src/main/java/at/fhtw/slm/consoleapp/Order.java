package at.fhtw.slm.consoleapp;

public class Order {
    private int id;
    private String produkte;

    public Order(int id, String produkte) {
        this.id = id;
        this.produkte = produkte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdukte() {
        return produkte;
    }

    public void setProdukte(String produkte) {
        this.produkte = produkte;
    }
}
