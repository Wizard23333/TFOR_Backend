package cn.edu.tongji.tfor_backend.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "user", schema = "seDB", catalog = "")
@IdClass(UserEntityPK.class)
public class UserEntity {
    private int userId;
    private String userName;
    private byte userGender;
    private String userPwd;
    private String userEmail;
    private String userTel;
    private byte[] userImage;
    private int userFollowingNum;
    private int userFollowedNum;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_gender")
    public byte getUserGender() {
        return userGender;
    }

    public void setUserGender(byte userGender) {
        this.userGender = userGender;
    }

    @Basic
    @Column(name = "user_pwd")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_tel")
    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    @Basic
    @Column(name = "user_image")
    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

    @Basic
    @Column(name = "user_following_num")
    public int getUserFollowingNum() {
        return userFollowingNum;
    }

    public void setUserFollowingNum(int userFollowingNum) {
        this.userFollowingNum = userFollowingNum;
    }

    @Basic
    @Column(name = "user_followed_num")
    public int getUserFollowedNum() {
        return userFollowedNum;
    }

    public void setUserFollowedNum(int userFollowedNum) {
        this.userFollowedNum = userFollowedNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userGender != that.userGender) return false;
        if (userFollowingNum != that.userFollowingNum) return false;
        if (userFollowedNum != that.userFollowedNum) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(that.userPwd) : that.userPwd != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userTel != null ? !userTel.equals(that.userTel) : that.userTel != null) return false;
        if (!Arrays.equals(userImage, that.userImage)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) userGender;
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userTel != null ? userTel.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userImage);
        result = 31 * result + userFollowingNum;
        result = 31 * result + userFollowedNum;
        return result;
    }
}
