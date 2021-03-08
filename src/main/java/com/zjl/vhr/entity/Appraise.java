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
public class Appraise implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer eid;

    /**
     * 考评日期
     */
    @TableField("appDate")
    private LocalDate appDate;

    /**
     * 考评结果
     */
    @TableField("appResult")
    private String appResult;

    /**
     * 考评内容
     */
    @TableField("appContent")
    private String appContent;

    /**
     * 备注
     */
    private String remark;


}
