/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：SysLoginLogCreateRequestParam.java
 * 项目名称：sculptor-boot-pojo
 * 项目描述：简单类
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.pojo.dto.param.sysloginlog;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.SafeHtml;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import com.cdk8s.sculptor.pojo.dto.param.sysloginlog.bases.SysLoginLogCreateBaseRequestParam;

@Setter
@Getter
@ToString(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysLoginLogCreateRequestParam extends SysLoginLogCreateBaseRequestParam {

	private static final long serialVersionUID = -1L;


}
