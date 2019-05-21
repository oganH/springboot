package cn.com.springboot.mapper;

import cn.com.springboot.entity.Demo;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by xlm on  2019/5/21
 */
public interface DemoMapper {

    @Insert("INSERT INTO demo(name) VALUES(#{name})")
    void insert(Demo demo);
}
