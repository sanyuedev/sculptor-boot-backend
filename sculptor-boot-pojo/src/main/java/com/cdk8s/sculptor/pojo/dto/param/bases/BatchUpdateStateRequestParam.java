/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：BatchUpdateStateRequestParam.java
 * 项目名称：sculptor-boot-pojo
 * 项目描述：简单类
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.pojo.dto.param.bases;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;


@Setter
@Getter
@ToString(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchUpdateStateRequestParam extends BaseUpdateParam {

	private static final long serialVersionUID = -1L;


	@NotEmpty(message = "idList 不能为空")
	@Size(min = 1, message = "idList 至少需要一个元素")
	private List<Long> idList;


	@NotNull(message = "状态不能为空")
	@Range(min = 1, max = 2, message = "状态值只能是 1：启用 和 2：禁用")
	private Integer stateEnum;

}
