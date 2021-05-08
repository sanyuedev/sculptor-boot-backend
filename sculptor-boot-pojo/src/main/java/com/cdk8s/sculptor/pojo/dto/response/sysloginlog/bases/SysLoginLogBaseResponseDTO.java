/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：SysLoginLogBaseResponseDTO.java
 * 项目名称：sculptor-boot-pojo
 * 项目描述：简单类
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.pojo.dto.response.sysloginlog.bases;

import com.cdk8s.sculptor.pojo.entity.bases.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;
import java.util.List;
import java.math.BigDecimal;

@Setter
@Getter
@ToString(callSuper = true)
public class SysLoginLogBaseResponseDTO extends BaseEntity {

	private static final long serialVersionUID = -1L;

	private Long userId;

	private String username;

	private String clientId;

	private String token;

	private String message;

	private Long loginDate;

	private Long logoutDate;

	private String requestUrl;

	private Integer boolLoginSuccessEnum;

	private String boolLoginSuccessEnumString;

	private Integer boolNowOnlineEnum;

	private String boolNowOnlineEnumString;

	private Integer offlineTypeEnum;

	private String offlineTypeEnumString;

	private String exceptionMsg;

	private String ipAddress;

	private String ipRegion;

	private String ipRegionCountry;

	private String ipRegionProvince;

	private String ipRegionCity;

	private String ipRegionIsp;

	private String userAgent;

	private String deviceName;

	private String osName;

	private String browserName;

	private String browserLocale;

	private Integer boolNewUserEnum;

	private String boolNewUserEnumString;

	private Integer loginOriginEnum;

	private String loginOriginEnumString;


	private Long createDate;

	private Long createUserId;

	private String createUsername;



}
