package comsoftware.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Demo_Null
 * @date 2020/10/20
 * @description 测试接口
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/find")
    @Secured("ROLE_USER")
    public String find() {
        return "查询成功！";
    }
}
