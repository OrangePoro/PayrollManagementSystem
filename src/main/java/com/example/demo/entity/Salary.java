package com.example.demo.entity;/*
/*
 * Copyright © 2020-2035 erupt.xyz All rights reserved.
 * Author: YuePeng (erupts@126.com)
 */

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

@Erupt(name = "薪资",
        power = @Power(add = true, delete = true,
                edit = true, query = true,
                importable = true, export = true,viewDetails = false)
)
@Table(name = "salary")
@Entity
public class Salary extends BaseModel {

    @EruptField(
            views = @View(
                    title = "工号"
            ),
            edit = @Edit(
                    title = "工号",
                    type = EditType.INPUT, search = @Search, notNull = true,
                    inputType = @InputType
            )
    )
    private String stuffNum;

    @EruptField(
            views = @View(
                    title = "员工姓名"
            ),
            edit = @Edit(
                    title = "员工姓名",
                    type = EditType.INPUT, search = @Search, notNull = true,
                    inputType = @InputType
            )
    )
    private String stuffName;

    @EruptField(
            views = @View(
                    title = "时间"
            ),
            edit = @Edit(
                    title = "时间",
                    type = EditType.DATE, search = @Search, notNull = true,
                    dateType = @DateType
            )
    )
    private Date time;

    @EruptField(
            views = @View(
                    title = "基本工资"
            ),
            edit = @Edit(
                    title = "基本工资",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String basicSalary;

    @EruptField(
            views = @View(
                    title = "课时费"
            ),
            edit = @Edit(
                    title = "课时费",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String lessonFee;

    @EruptField(
            views = @View(
                    title = "基础绩效"
            ),
            edit = @Edit(
                    title = "基础绩效",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String basePerformance;

    @EruptField(
            views = @View(
                    title = "工龄工资"
            ),
            edit = @Edit(
                    title = "工龄工资",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String senioritySalary;

    @EruptField(
            views = @View(
                    title = "个人所得税"
            ),
            edit = @Edit(
                    title = "个人所得税",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String personalIncomeTax;

    @EruptField(
            views = @View(
                    title = "医疗保险"
            ),
            edit = @Edit(
                    title = "医疗保险",
                    type = EditType.INPUT, notNull = true,
                    inputType = @InputType
            )
    )
    private String medicalInsurance;

    @EruptField(
            views = @View(
                    title = "实发工资"
            ),
            edit = @Edit(
                    title = "实发工资",
                    type = EditType.NUMBER, notNull = true,
                    numberType = @NumberType
            )
    )
    private Integer payRoll;

}