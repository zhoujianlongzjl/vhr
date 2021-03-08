package com.zjl.vhr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 周建龙
 * @since 2020-08-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Employeeremove implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer eid;

    /**
     * 调动后部门
     */
    @TableField("afterDepId")
    private Integer afterDepId;

    /**
     * 调动后职位
     */
    @TableField("afterJobId")
    private Integer afterJobId;

    /**
     * 调动日期
     */
    @TableField("removeDate")
    private LocalDate removeDate;

    /**
     * 调动原因
     */
    private String reason;

    private String remark;


}
