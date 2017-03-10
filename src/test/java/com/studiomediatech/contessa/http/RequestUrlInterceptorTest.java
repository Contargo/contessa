package com.studiomediatech.contessa.http;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.mockito.Mock;

import org.springframework.test.context.junit4.SpringRunner;

import com.studiomediatech.contessa.http.LinkHelper;
import com.studiomediatech.contessa.http.RequestUrlInterceptor;

import javax.servlet.http.HttpServletRequest;

import static org.mockito.Mockito.verify;


@RunWith(SpringRunner.class)
public class RequestUrlInterceptorTest {

    @Mock
    LinkHelper linkHelper;
    @Mock
    HttpServletRequest request;

    @Test
    public void ensureDispatchesToLinkHelperOnPreHandle() throws Exception {

        new RequestUrlInterceptor(linkHelper).preHandle(request, null, null);

        verify(linkHelper).setRootUrl(request);
    }
}