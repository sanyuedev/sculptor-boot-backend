/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：BaseUpdateMapperBO.java
 * 项目名称：sculptor-boot-pojo
 * 项目描述：简单类
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.pojo.bo.mapper.bases;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class BaseUpdateMapperBO implements Serializable {

	private static final long serialVersionUID = -1L;

	private Long id;
	private Long tenantId;
	private Long updateDate;
	private Long updateUserId;


}
