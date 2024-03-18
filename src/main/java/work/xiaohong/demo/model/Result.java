package work.xiaohong.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author Kevin
 * @version 1.0
 * @date 2021/10/21 0021 11:01
 * @description 响应结果实体类
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "Result",description = "通用响应实体")
public class Result<T> implements Serializable {
//  @Schema(description = "响应标志")
//  private boolean flag;
  @Schema(description = "响应码")
  private Integer code;
  @Schema(description = "响应消息")
  private String message;
  @Schema(description = "响应体")
  private T data;

  public Result(boolean flag, Integer code, String message) {
//    this.flag = flag;
    this.code = code;
    this.message = message;
  }

  public static <T> Result<T> OK(String message) {
    Result<T> result = new Result<>();
//    result.setFlag(true);
    result.setCode(StatusCode.OK);
    result.setMessage(message);
    result.setData(null);
//    log.info(message);
    return result;
  }

  public static <T> Result<T> OK(String message, T data) {
    Result<T> result = new Result<>();
//    result.setFlag(true);
    result.setCode(StatusCode.OK);
    result.setMessage(message);
    result.setData(data);
//    log.info(message);
    return result;
  }

  public static <T> Result<T> ERROR(String message) {
    Result<T> result = new Result<>();
//    result.setFlag(false);
    result.setCode(StatusCode.ERROR);
    result.setMessage(message);
    result.setData(null);
//    log.error(message);
    return result;
  }

  public static <T> Result<T> NO_LOGIN(String message) {
    Result<T> result = new Result<>();
//    result.setFlag(false);
    result.setCode(StatusCode.NO_LOGIN);
    result.setMessage(message);
    result.setData(null);
//    log.error(message);
    return result;
  }

  public static <T> Result<T> NO_PERMISSION(String message) {
    Result<T> result = new Result<>();
//    result.setFlag(false);
    result.setCode(StatusCode.NO_PERMISSION);
    result.setMessage(message);
    result.setData(null);
//    log.error(message);
    return result;
  }

  public static <T> Result<T> ERROR(String message, T data) {
    Result<T> result = new Result<>();
//    result.setFlag(false);
    result.setCode(StatusCode.ERROR);
    result.setMessage(message);
    result.setData(data);
//    log.error(message);
    return result;
  }


}

