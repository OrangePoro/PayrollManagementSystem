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

@Erupt(name = "用户")
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

//    @EruptField(
//            views = @View(
//                    title = "时间"
//            ),
//            edit = @Edit(
//                    title = "时间",
//                    type = EditType.DATE, search = @Search, notNull = true,
//                    dateType = @DateType
//            )
//    )
//    private Date time;

    @EruptField(
            views = @View(title = "时间"),
            edit = @Edit(title = "时间", search = @Search(vague = true))
    )
    private Date date;

    @EruptField(
            views = @View(
                    title = "分隔"
            ),
            edit = @Edit(
                    title = "分隔",
                    type = EditType.DIVIDE, notNull = true
            )
    )
    @Transient
    private String check;

    @EruptField(
            views = @View(
                    title = "工资"
            ),
            edit = @Edit(
                    title = "工资",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String money;

}