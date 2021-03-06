/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：AppSysFolderInfoCreateRequestParam.java
 * 项目名称：sculptor-boot-biz
 * 项目描述：sculptor-boot-biz
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.multiapi.pojo.param;

import com.cdk8s.sculptor.pojo.dto.param.bases.BaseCreateParam;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.SafeHtml;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppSysFolderInfoCreateRequestParam extends BaseCreateParam {

	private static final long serialVersionUID = -1L;

	@NotNull(message = "父ID不能为空")
	private Long parentId;

	@NotBlank(message = "文件夹名称不能为空")
	@Length(max = 50, message = "文件夹名称长度不正确")
	@SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
	private String folderName;

	@Range(min = 1, max = 100, message = "排序数值不正确")
	private Integer ranking;

	@Length(max = 500, message = "备注长度不正确")
	@SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
	private String description;

	@Range(min = 1, max = 2, message = "是否置顶数值不正确")
	private Integer boolTopEnum;

	@Range(min = 1, max = 2, message = "启用状态数值不正确")
	private Integer stateEnum;


}
