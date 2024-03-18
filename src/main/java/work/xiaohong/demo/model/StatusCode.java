package work.xiaohong.demo.model;

import java.io.Serializable;

/**
 * @author Kevin
 * @version 1.0
 * @date 2021/10/21 0021 10:47
 * @description 响应状态码实体类
 */
public class StatusCode implements Serializable {

    public static final Integer OK = 20000; // 成功

    public static final Integer ERROR = 20001; // 失败

    public static final Integer NO_LOGIN = 20002; // 未登录

    public static final Integer NO_PERMISSION = 40001; // 无权限

}
