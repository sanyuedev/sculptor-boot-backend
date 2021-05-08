/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：SysBannerService.java
 * 项目名称：sculptor-boot-biz
 * 项目描述：sculptor-boot-biz
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.service;

import com.cdk8s.sculptor.mapper.SysBannerMapper;
import com.cdk8s.sculptor.mapper.ext.SysBannerMapperExt;
import com.cdk8s.sculptor.mapstruct.SysBannerMapStruct;
import com.cdk8s.sculptor.service.bases.SysBannerServiceBase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

@Slf4j
@CacheConfig(cacheNames = "SysBannerService")
@Service
public class SysBannerService extends SysBannerServiceBase {

	@Autowired
	private SysBannerMapper sysBannerMapper;

	@Autowired
	private SysBannerMapperExt sysBannerMapperExt;

	@Autowired
	private SysBannerMapStruct sysBannerMapStruct;

	// =====================================查询业务 start=====================================


	// =====================================查询业务 end=====================================
	// =====================================操作业务 start=====================================


	// =====================================操作业务 end=====================================
	// =====================================私有方法 start=====================================

	// =====================================私有方法 end=====================================

}
