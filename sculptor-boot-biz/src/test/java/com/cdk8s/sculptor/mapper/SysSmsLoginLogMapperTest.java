/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：SysSmsLoginLogMapperTest.java
 * 项目名称：sculptor-boot-biz
 * 项目描述：sculptor-boot-biz
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.mapper;

import com.cdk8s.sculptor.Application;
import com.cdk8s.sculptor.constant.GlobalConstant;
import com.cdk8s.sculptor.constant.GlobalConstantToJunit;
import com.cdk8s.sculptor.enums.BooleanEnum;
import com.cdk8s.sculptor.enums.SmsProviderTypeEnum;
import com.cdk8s.sculptor.enums.UserTypeEnum;
import com.cdk8s.sculptor.pojo.bo.mapper.bases.BatchDeleteMapperBO;
import com.cdk8s.sculptor.pojo.bo.mapper.bases.IdListMapperBO;
import com.cdk8s.sculptor.pojo.bo.mapper.bases.IdMapperBO;
import com.cdk8s.sculptor.pojo.bo.mapper.syssmsloginlog.SysSmsLoginLogPageQueryMapperBO;
import com.cdk8s.sculptor.pojo.entity.SysSmsLoginLog;
import com.cdk8s.sculptor.strategy.UserInfoContext;
import com.cdk8s.sculptor.util.DatetimeUtil;
import com.cdk8s.sculptor.util.RandomUtil;
import com.cdk8s.sculptor.util.id.GenerateIdUtil;
import com.cdk8s.tkey.client.rest.pojo.dto.OauthUserAttribute;
import com.cdk8s.tkey.client.rest.pojo.dto.OauthUserProfile;
import com.google.common.collect.Lists;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;

@Slf4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SysSmsLoginLogMapperTest {

	private static final Long ID = GenerateIdUtil.getId();

	@Autowired
	private SysSmsLoginLogMapper sysSmsLoginLogMapper;

	// =====================================预处理 start=====================================

	@SneakyThrows
	@BeforeClass
	public static void a_beforeClass() {
		OauthUserProfile oauthUserProfile = new OauthUserProfile();
		oauthUserProfile.setUsername(GlobalConstantToJunit.USERNAME);
		oauthUserProfile.setName(GlobalConstantToJunit.USERNAME);
		oauthUserProfile.setId(GlobalConstantToJunit.USER_ID);
		oauthUserProfile.setUserId(GlobalConstantToJunit.USER_ID);

		OauthUserAttribute oauthUserAttribute = new OauthUserAttribute();
		Map<String, Object> userAttributeExt = new HashMap<>();
		userAttributeExt.put(GlobalConstant.USER_TYPE_ENUM_MAP_KEY, UserTypeEnum.ADMIN.getCode());
		userAttributeExt.put(GlobalConstant.TENANT_ID_MAP_KEY, GlobalConstant.TOP_TENANT_ID);
		oauthUserAttribute.setUserAttributeExt(userAttributeExt);

		oauthUserAttribute.setRealName(GlobalConstantToJunit.USERNAME);
		oauthUserAttribute.setEmail(GlobalConstantToJunit.USER_EMAIL);
		oauthUserAttribute.setUserId(GlobalConstantToJunit.USER_ID);
		oauthUserAttribute.setUsername(GlobalConstantToJunit.USERNAME);
		oauthUserAttribute.setTenantId(GlobalConstantToJunit.TOP_TENANT_ID);
		oauthUserAttribute.setUserType(String.valueOf(UserTypeEnum.ADMIN.getCode()));

		oauthUserProfile.setUserAttribute(oauthUserAttribute);
		UserInfoContext.setCurrentUser(oauthUserProfile);
	}

	// =====================================预处理 end=====================================
	// =====================================查询业务 start=====================================

	@Test
	public void a_selectById() {
		SysSmsLoginLog result = sysSmsLoginLogMapper.selectById(new IdMapperBO(ID));

		assertThat(result, Matchers.notNullValue());
	}

	@Test
	public void a_selectByIdList() {
		ArrayList<Long> idList = Lists.newArrayList(ID, 222222222222222222L);
		List<SysSmsLoginLog> result = sysSmsLoginLogMapper.selectByIdList(new IdListMapperBO(idList));

		assertThat(result.size(), Matchers.greaterThan(0));
	}

	@Test
	public void a_selectAll() {
		List<SysSmsLoginLog> result = sysSmsLoginLogMapper.selectAll();

		assertThat(result.size(), Matchers.greaterThan(0));
	}

	@Test
	public void a_selectByPageQueryMapperBo() {
		SysSmsLoginLogPageQueryMapperBO mapperBO = new SysSmsLoginLogPageQueryMapperBO();
		mapperBO.setCreateDateStartDate(631183520000L);
		mapperBO.setCreateDateEndDate(1893487520000L);

		List<SysSmsLoginLog> result = sysSmsLoginLogMapper.selectByPageQueryMapperBo(mapperBO);

		assertThat(result.size(), Matchers.greaterThan(0));
	}


	// =====================================查询业务 end=====================================
	// =====================================操作业务 start=====================================

	@Test
	public void a_batchCreate() {
		long currentEpochMilli = DatetimeUtil.currentEpochMilli();
		Long currentUserId = UserInfoContext.getCurrentUserId();

		List<SysSmsLoginLog> entityList = new ArrayList<>();
		for (int i = 0; i < 13; i++) {
			SysSmsLoginLog entity = new SysSmsLoginLog();
			// cdk8stodo 根据业务补充其他属性：RandomUtil.randomAlphabetic(6)
			entity.setId(ID + i);
			entity.setUserId(UserInfoContext.getCurrentUserId());
			entity.setUserMobilePhone(RandomUtil.randomAlphabetic(6));
			entity.setVerificationCode(RandomUtil.randomAlphabetic(6));
			entity.setSmsProviderTypeEnum(SmsProviderTypeEnum.getRandomEnum().getCode());
			entity.setBoolServiceStateEnum(BooleanEnum.getRandomEnum().getCode());
			entity.setMessageContent(RandomUtil.randomAlphabetic(6));
			entity.setBoolUseEnum(BooleanEnum.getRandomEnum().getCode());
			entity.setTenantId(RandomUtil.nextLong(1, 10));

			entity.setIpAddress(RandomUtil.randomAlphabetic(6));
			entity.setUserAgent(RandomUtil.randomAlphabetic(6));


			entity.setCreateDate(currentEpochMilli);
			entity.setCreateUserId(currentUserId);
			entityList.add(entity);
		}

		int result = sysSmsLoginLogMapper.batchInsertList(entityList);

		assertThat(result, Matchers.greaterThan(0));
	}


	@Transactional
	@Test
	public void m_deleteByIdList() {
		ArrayList<Long> idList = Lists.newArrayList(ID, 222222222222222222L);

		BatchDeleteMapperBO bo = new BatchDeleteMapperBO();
		bo.setIdList(idList);

		int result = sysSmsLoginLogMapper.deleteByIdList(bo);

		assertThat(result, Matchers.greaterThan(0));
	}

	// =====================================操作业务 end=====================================
	// =====================================私有方法 start=====================================

	// =====================================私有方法 end=====================================


}
