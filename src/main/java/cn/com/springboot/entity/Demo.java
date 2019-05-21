package cn.com.springboot.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by xlm on  2019/5/21
 */
@Data
@Alias("Demo")
public class Demo {
    private Long id;
    private String name;
}
