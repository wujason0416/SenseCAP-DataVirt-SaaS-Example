package sd.sensecapd.webapi.model.DevSwitch;

/*
 * Switch info
 * (this object retrieved from the web and saved to DB, and back to front-end interface)
 * */
public class DevOutlet {
    //Unique identification, generated by database
    private int id;
    //devId: get from calling interface and save to database
    private String devId;
    //openOutlet: Usually, one switch controls one outlet
    //in this case, it is enough to set openOutlet
    private int openOutlet;
    //Sometimes a switch controls multiple outlets.
    // When you need to control three states, you need another outlet to support it
    // in this case, please use closeOutlet
    private int closeOutlet;
    //name: user sets this value through the interface and save to database
    private String name;
    //switch status,ex 0:off,1:on,2:stop
    private int onOff;
    //online status
    private boolean online;
    //isuse: default is false, user can set to true through the interface and save to database
    private boolean isuse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getOpenOutlet() {
        return openOutlet;
    }

    public void setOpenOutlet(int openOutlet) {
        this.openOutlet = openOutlet;
    }

    public int getCloseOutlet() {
        return closeOutlet;
    }

    public void setCloseOutlet(int closeOutlet) {
        this.closeOutlet = closeOutlet;
    }

    public int getOnOff() {
        return onOff;
    }

    public void setOnOff(int onOff) {
        this.onOff = onOff;
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse) {
        this.isuse = isuse;
    }
}