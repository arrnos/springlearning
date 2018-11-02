package com.arrnos.springlearning.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author arrnos
 * @since 2018-11-01
 */
@Data
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("NAME")
    private String name;
    private Integer age;
    private String email;

    public static final String ID = "id";
    public static final String NAME = "NAME";
    public static final String AGE = "age";
    public static final String EMAIL = "email";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
