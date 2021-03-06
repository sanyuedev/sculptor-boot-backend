/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：RelDeptUserUserIdListToDeleteServiceBO.java
 * 项目名称：sculptor-boot-pojo
 * 项目描述：简单类
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.pojo.bo.service.reldeptuser;

import com.cdk8s.sculptor.pojo.bo.service.bases.BaseDeleteServiceBO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import java.util.List;
import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class RelDeptUserUserIdListToDeleteServiceBO extends BaseDeleteServiceBO {

	private static final long serialVersionUID = -1L;

	private List<Long> userIdList;

}
