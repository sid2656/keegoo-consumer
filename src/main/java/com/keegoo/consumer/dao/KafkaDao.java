/**
 * Project Name:message-service
 * File Name:Kafka.java
 * Package Name:net.sidland.message.dao
 * Date:2015年9月10日上午10:25:30
 * Copyright (c) 2015, sid Jenkins All Rights Reserved.
 * 
 *
*/

package com.keegoo.consumer.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.keegoo.consumer.InitConsumer;

/**
 * ClassName:Kafka
 * Reason:	 kafka消息处理类. 
 * Date:     2015年9月10日 上午10:25:30 
 * @author   sid
 * @see 	 
 */
@Component
public class KafkaDao implements MessageDao {
	
	protected static Logger logger = LoggerFactory.getLogger(KafkaDao.class);

	public String pullGroup(String groupid,String msgId) {
		//TODO 具体获取消息的实现
		String group = InitConsumer.application.getProperty("consumer.url.group");
		logger.debug("pullGroup 地址："+group);
		return null;
	}
	
	public String pullSole(String msgId) {
		//TODO 具体获取消息的实现
		String sole = InitConsumer.application.getProperty("consumer.url.sole");
		logger.debug("pullSole 地址："+sole);
		return null;
	}

}

