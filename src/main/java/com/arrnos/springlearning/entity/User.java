package com.arrnos.springlearning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@Data
//@AllArgsConstructor
//@RequiredArgsConstructor
//@NoArgsConstructor
//public class User {
//    private Long id;
//    private String name;
//    private Integer age;
//    private String email;
//}

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

@TableName("user")
@Data
public class User extends Model<User> implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

