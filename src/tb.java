public interface tb {


    public void displayTable();
    public int getSize();
    public void editTable(int id,String deviceModel,String deviceType,String deviceColor,String deviceBrightness);
    public void clear();
    public void editBulb(int id, String deviceModel, String deviceType, String deviceColor,String deviceBrightness);
    public void editOutlet(int id,String deviceModel,String deviceType,String deviceColor,String deviceBrightness);
    public void addDevice(String deviceModel,String deviceType,String deviceColor,String deviceBrightness,int id);
    public void setBulb(int id,boolean isEdit);
    public void removeDevice(int id);
}
