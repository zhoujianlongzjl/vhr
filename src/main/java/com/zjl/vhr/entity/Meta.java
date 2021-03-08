package com.zjl.vhr.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Meta {
    // @TableField("keepAlive")
    private Boolean keepAlive;

    // @TableField("requireAuth")
    private Boolean requireAuth;
}
