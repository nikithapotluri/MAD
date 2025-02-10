package com.example.a22501a0516recycler;

public class crickter {
    private int cpic;
    private String cname,crole;

    public crickter(int cpic, String cname, String crole) {
        this.cpic = cpic;
        this.cname = cname;
        this.crole = crole;
    }

    public int getCpic() {
        return cpic;
    }

    public void setCpic(int cpic) {
        this.cpic = cpic;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCrole() {
        return crole;
    }

    public void setCrole(String crole) {
        this.crole = crole;
    }
}
