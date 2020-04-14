package com.runtoyou.api.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//로그인한 유저의 세션을 가져오는 어노테이션
@Target(ElementType.PARAMETER) //파라미터용
@Retention(RetentionPolicy.RUNTIME) //런타임 중에도 라이프타임을 유지한다
public @interface LoginUser {
}
