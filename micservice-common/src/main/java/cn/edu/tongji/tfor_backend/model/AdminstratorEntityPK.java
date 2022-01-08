package cn.edu.tongji.tfor_backend.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AdminstratorEntityPK implements Serializable {
    private int admId;
    private String admPwd;

    @Column(name = "adm_id")
    @Id
    public int getAdmId() {
        return admId;
    }

    public void setAdmId(int admId) {
        this.admId = admId;
    }

    @Column(name = "adm_pwd")
    @Id
    public String getAdmPwd() {
        return admPwd;
    }

    public void setAdmPwd(String admPwd) {
        this.admPwd = admPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminstratorEntityPK that = (AdminstratorEntityPK) o;

        if (admId != that.admId) return false;
        if (admPwd != null ? !admPwd.equals(that.admPwd) : that.admPwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = admId;
        result = 31 * result + (admPwd != null ? admPwd.hashCode() : 0);
        return result;
    }
}
