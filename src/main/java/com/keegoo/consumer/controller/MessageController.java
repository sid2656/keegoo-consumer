/**
 * Project Name:mvc
 * File Name:UserController.java
 * Package Name:springTest.mvc.controller
 * Date:2015年8月25日下午12:06:55
 * Copyright (c) 2015, sid Jenkins All Rights Reserved.
 * 
 *
*/
package com.keegoo.consumer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keegoo.consumer.service.MessageService;


/**
 * 
 * ClassName: MessageController 
 * Reason:	 增加message的controller. 
 * date: 2015年9月10日 上午10:12:26 
 *
 * @author sid
 */
@RestController
@RequestMapping(value="/msg")
public class MessageController {
	private static Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@Autowired
	private MessageService msgService;
	
	@RequestMapping(value="/pullGroup")
	public String pullGroup(HttpServletRequest request,HttpServletResponse response){
		logger.debug("主动获取分组消息");
		String groupid = ServletRequestUtils.getStringParameter(request, "groupid","哈哈");
		String msgId = ServletRequestUtils.getStringParameter(request, "msgId","哈哈");
		return msgService.pullGroup(groupid,msgId);
	}
	
	@RequestMapping(value="/pullSole")
	public String pullSole(HttpServletRequest request,HttpServletResponse response){
		logger.debug("主动获取单独消息");
		String msgId = ServletRequestUtils.getStringParameter(request, "msgId","单独消息");
		return msgService.pullSole(msgId);
	}
}

