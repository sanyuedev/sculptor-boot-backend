/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：SysJobPageQueryBaseMapperBO.java
 * 项目名称：sculptor-boot-pojo
 * 项目描述：简单类
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.pojo.bo.mapper.sysjob.bases;

import com.cdk8s.sculptor.pojo.dto.param.bases.PageParam;
import com.cdk8s.sculptor.enums.DeleteEnum;
import lombok.*;
import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class SysJobPageQueryBaseMapperBO extends PageParam {

	private static final long serialVersionUID = -1L;

	private Long id;
	private String jobName;
	private String jobGroup;
	private String invokeTarget;
	private String cronExpression;
	private Integer misfirePolicyEnum;
	private Integer boolSupportConcurrentEnum;
	private Integer ranking;
	private String description;
	private Integer stateEnum;
	private Long tenantId;
	private Long createUserId;


}
