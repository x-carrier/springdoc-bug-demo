package work.xiaohong.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import work.xiaohong.demo.model.Model1;
import work.xiaohong.demo.model.Model2;
import work.xiaohong.demo.model.Result;

/**
 * @author 陈鸿
 * @description
 * @since 2024/3/18 12:32
 */
@RestController
public class TestController {

    @GetMapping("/model1")
    public Result<Model1> test1(){
        Model1 model1 = new Model1();
        model1.setA("aaaa");
        return new Result<>(1, "success", model1);
    }


    @GetMapping("/model2")
    public Result<Model2> test2(){
        Model2 model2 = new Model2();
        model2.setB("bbbb");
        return new Result<>(2, "success", model2);
    }
}
