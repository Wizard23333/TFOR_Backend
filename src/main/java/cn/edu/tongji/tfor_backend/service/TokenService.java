package cn.edu.tongji.tfor_backend.service;

public interface TokenService {
    /*
    type有三种类型
    type=0时，arg表示uid
    type=1时，arg表示email
    type=2时，arg表示tel
     */
    String createToken(String arg, int type);
}
