package com.tiantian.springintejms.controller;

import com.tiantian.springintejms.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jms.Destination;

/**
 * Created by xin on 15-2-8 下午8:46
 *
 * @project activeMQ
 * @package com.tiantian.springintejms.controller
 * @Description
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @github https://github.com/888xin
 */

@Controller
@RequestMapping("mq")
public class SenderController {

    @Autowired
    private ProducerService producerService;
    @Autowired
    @Qualifier("queueDestination")
    private Destination destination;

    @Autowired
    @Qualifier("topicDestination")
    private Destination topicDestination ;

    @RequestMapping("/send")
    public void send(){
        for (int i=0; i<2; i++) {
            producerService.sendMessage(destination, "你好，生产者！这是消息：" + (i+1));
        }
    }
}
