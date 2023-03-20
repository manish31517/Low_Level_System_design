package ParkingDesignPattern.Model.Gate;

public abstract class Gate {
   private int assignedFloorNo;
   private int getNumber;
   private boolean isOpened;

   private  boolean isClosed;

    public Gate(int assignedFloorNo, int getNumber, boolean isOpened, boolean isClosed) {
        this.assignedFloorNo = assignedFloorNo;
        this.getNumber = getNumber;
        this.isOpened = isOpened;
        this.isClosed = isClosed;
    }

    public int getAssignedFloorNo() {
        return assignedFloorNo;
    }

    public void setAssignedFloorNo(int assignedFloorNo) {
        this.assignedFloorNo = assignedFloorNo;
    }

    public int getGetNumber() {
        return getNumber;
    }

    public void setGetNumber(int getNumber) {
        this.getNumber = getNumber;
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
                ", getNumber=" + getNumber +
                ", isOpened=" + isOpened +
                ", isClosed=" + isClosed +
                '}';
    }
}
