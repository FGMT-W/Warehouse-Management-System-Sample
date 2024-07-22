package com.yeqifu.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * InnoDB free: 9216 kB
 * </p>
 *
 * @author luoyi-
 * @since 2019-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_permission")
public class Permission implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer pid;

    private String type;

    private String title;

    /**
     * 权限编码[只有type=permission才有 user:view]
     */
    private String percode;

    private String icon;

    private String href;

    private String target;

    private Integer open;

    private Integer ordernum;

    /**
     * 是否可用[0不可用，1可用]
     */
    private Integer available;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPid() {
        return pid;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getPercode() {
        return percode;
    }

    public String getIcon() {
        return icon;
    }

    public String getHref() {
        return href;
    }

    public String getTarget() {
        return target;
    }

    public Integer getOpen() {
        return open;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public Integer getAvailable() {
        return available;
    }
}
