/*
 * Copyright © 2019-2021 CDK8S (cdk8s@qq.com)
 * All rights reserved.
 * 文件名称：OauthTokenParamArgumentResolver.java
 * 项目名称：sculptor-boot-pojo
 * 项目描述：简单类
 * 版权说明：本软件属CDK8S所有
 */

package com.cdk8s.sculptor.pojo.dto.param.oauth.resolve;

import com.cdk8s.sculptor.pojo.dto.param.oauth.OauthTokenParam;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class OauthTokenParamArgumentResolver implements HandlerMethodArgumentResolver {

	@Override
	public boolean supportsParameter(MethodParameter methodParameter) {
		return methodParameter.getParameterType().equals(OauthTokenParam.class);
	}

	@Override
	public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) {
		OauthTokenParam param = new OauthTokenParam();
		param.setGrantType(nativeWebRequest.getParameter("grant_type"));
		param.setClientId(nativeWebRequest.getParameter("client_id"));
		param.setClientSecret(nativeWebRequest.getParameter("client_secret"));
		param.setCode(nativeWebRequest.getParameter("code"));
		param.setRefreshToken(nativeWebRequest.getParameter("refresh_token"));
		param.setRedirectUri(nativeWebRequest.getParameter("redirect_uri"));
		param.setUsername(nativeWebRequest.getParameter("username"));
		param.setPassword(nativeWebRequest.getParameter("password"));
		param.setDeviceId(nativeWebRequest.getParameter("device_id"));
		param.setValidateCode(nativeWebRequest.getParameter("validate_code"));
		param.setBoolIsRememberMe(Boolean.valueOf(nativeWebRequest.getParameter("bool_is_remember_me")));
		return param;
	}

}
