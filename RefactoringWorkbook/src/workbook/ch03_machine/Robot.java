package workbook.ch03_machine;

public class Robot {
    Machine location;
    NullBin data = new NullBin();

	public Robot() {}

    public Machine location() {return location;}
    public void moveTo(Machine location) {this.location = location;}

    public void pick() {this.data.bin = location.take();}
    public String bin() {
    	return data.bin;
    	}

    public void release() {
        location.put(data.bin);
        data.bin = null;
    }
}
