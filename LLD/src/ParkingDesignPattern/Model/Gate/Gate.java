package ParkingDesignPattern.Model.Gate;

public abstract class Gate {
   private int assignedFloorNo;
   private int gateNumber;
   private boolean isOpened;

   private  boolean isClosed;

    public Gate(int assignedFloorNo, int getNumber, boolean isOpened, boolean isClosed) {
        this.assignedFloorNo = assignedFloorNo;
        this.gateNumber = gateNumber;
        this.isOpened = isOpened;
        this.isClosed = isClosed;
    }

    public int getAssignedFloorNo() {
        return assignedFloorNo;
    }

    public void setAssignedFloorNo(int assignedFloorNo) {
        this.assignedFloorNo = assignedFloorNo;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "assignedFloorNo=" + assignedFloorNo +
                ", getNumber=" + gateNumber +
                ", isOpened=" + isOpened +
                ", isClosed=" + isClosed +
                '}';
    }
}
