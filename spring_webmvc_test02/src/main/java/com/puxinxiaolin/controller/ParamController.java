package com.puxinxiaolin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.puxinxiaolin.pojo.User;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

@Controller
public class ParamController {

    @PostMapping("/param10")
    public String param10(@RequestBody MultipartFile multipartFile) throws IOException {
        System.out.println("multipartFile = " + multipartFile);
        // 保存文件
        // 1. 获得当前上传文件的输入流
        InputStream inputStream = multipartFile.getInputStream();
        // 2. 获得上传文件位置的输出流
        OutputStream outputStream = new FileOutputStream("F:\\" + multipartFile.getOriginalFilename());
        // 3. 执行文件拷贝
        IOUtils.copy(inputStream, outputStream);
        // 4. 关闭流
        outputStream.close();
        inputStream.close();
        return "/index.jsp";
    }

    /**
     * http://localhost/user/100?id=100，需要用 @PathVariable 获取路径参数进行填充成: http://localhost/user/100
     *
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public String findUserById(@PathVariable int id) {
        System.out.println("id = " + id);
        return "/index.jsp";
    }

    @PostMapping("/param9")
    public String param9(@RequestBody User user) {
        System.out.println(user);
        return "/index.jsp";
    }

    @PostMapping("/param8")
    public String param8(@RequestBody String body) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(body, User.class);
        System.out.println(user);
        return "/index.jsp";
    }

    // http://localhost/param6?username=zhangsan&age=18&hobbies=aaa&hobbies=bbb&hobbies=ccc&birthday=2004/07/02&address.city=fujian
    @GetMapping("/param6")
    public String param6(User user) {
        System.out.println(user);
        return "/index.jsp";
    }

    @GetMapping("/param3")
    public String sho3(@RequestParam Map<String, String> map) {
        map.forEach((k, v) -> System.out.println(k + "==" + v));
        return "/index.jsp";
    }

    @GetMapping("/param2")
    public String sho2(@RequestParam List<String> hobby) {
        hobby.forEach(System.out::println);
        return "/index.jsp";
    }

    @GetMapping("/param1")
    public String show(@RequestParam("userName") String name, int age) {
        System.out.println("userName = " + name + ", age = " + age);
        return "/index.jsp";
    }

}
