package com.example.demo.entity;

/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

import javax.persistence.*;
import xyz.erupt.annotation.*;
import xyz.erupt.annotation.sub_erupt.*;
import xyz.erupt.annotation.sub_field.*;
import xyz.erupt.annotation.sub_field.sub_edit.*;
import xyz.erupt.upms.model.base.HyperModel;
import xyz.erupt.jpa.model.BaseModel;
import java.util.Set;
import java.util.Date;

@Erupt(name = "用户",
        power = @Power(add = true, delete = true,
        edit = true, query = true,
        importable = true, export = false)
        )
@Table(name = "user")
@Entity
public class user extends BaseModel {

    @EruptField(
            views = @View(
                    title = "职工号"
            ),
            edit = @Edit(
                    title = "职工号",
                    type = EditType.INPUT, search = @Search, notNull = true,
                    inputType = @InputType
            )
    )
    private String stuNum;

    @EruptField(
            views = @View(
                    title = "姓名"
            ),
            edit = @Edit(
                    title = "姓名",
                    type = EditType.INPUT, search = @Search, notNull = true,
                    inputType = @InputType
            )
    )
    private String userName;

    @EruptField(
            views = @View(
                    title = "密码"
            ),
            edit = @Edit(
                    title = "密码",
                    type = EditType.INPUT, search = @Search, notNull = true,
                    inputType = @InputType(type = "password")
            )
    )
    private String userPass;

}
