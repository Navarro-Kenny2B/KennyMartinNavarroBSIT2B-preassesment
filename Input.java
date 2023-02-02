public class Input extends Item {
    
    private String put = "Input";
    
    public Input(String name, String con, String avail) {
        super(name, con, avail);
    }
    
    public void showInfo() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }
    
    public void getInput() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
