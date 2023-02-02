public class Output extends Item {
    
    private String put = "Output";
    
    public Output(String name, String con, String avail, Object par3) {
        super(name, con, avail);
    }
    
    public void showInfo() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }
    
    public void getOutput() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
