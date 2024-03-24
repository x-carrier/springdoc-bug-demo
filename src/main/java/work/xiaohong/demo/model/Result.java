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
@Schema(name = "Result",description = "Common Result")
public class Result<T>  {
  @Schema(description = "code")
  private Integer code;
  @Schema(description = "message")
  private String message;
  @Schema(description = "data")
  private T data;
}

