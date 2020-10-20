package com.software.test;

import com.software.utils.RsaUtils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Demo_Null
 * @date 2020/10/20
 * @description 测试 RsaUtils
 */
public class RsaTest {

    private String publicKeyFile = "C:\\Users\\softw\\Desktop\\key\\pub_key";
    private String privateKeyFile = "C:\\Users\\softw\\Desktop\\key\\pri_key";

    /**
     * 测试生成密钥
     * @author Demo_Null
     * @date 2020/10/20
     * @param
     * @return void
     **/
    @Test
    public void generateKey() throws Exception {
        RsaUtils.generateKey(publicKeyFile, privateKeyFile, "Demo_Null", 2048);
    }

    /**
     * 测试获取公钥
     * @author Demo_Null
     * @date 2020/10/20
     * @param
     * @return void
     **/
    @Test
    public void getPublicKey() throws Exception {
        System.out.println(RsaUtils.getPublicKey(publicKeyFile));
    }

    /**
     * 测试获取私钥
     * @author Demo_Null
     * @date 2020/10/20
     * @param
     * @return void
     **/
    @Test
    public void getPrivateKey() throws Exception {
        System.out.println(RsaUtils.getPrivateKey(privateKeyFile));
    }

}
