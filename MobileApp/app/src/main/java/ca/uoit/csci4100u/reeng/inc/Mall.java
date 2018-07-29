package ca.uoit.csci4100u.reeng.inc;

/**
 * Created by Bashini on 2018-07-28.
 */

public class Mall {
    private String mallName;
    private String mallAddress;

    public Mall(String mallName,String mallAddress){
        this.mallName= mallName;
        this.mallAddress= mallAddress;

    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallAddress() {
        return mallAddress;
    }

    public void setMallAddress(String mallAddress) {
        this.mallAddress = mallAddress;
    }
}
