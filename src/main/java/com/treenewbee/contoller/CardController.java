package com.treenewbee.contoller;

import com.treenewbee.dao.Card;
import com.treenewbee.mapper.CardMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Coi
 * @Description
 * @date 2021/2/5 15:38
 */
@Controller
@RequestMapping(value = "/card")
public class CardController {
    @Resource
    private CardMapper deptMapper;

    @ResponseBody
    @RequestMapping(value = "/select")
    public String select(){
        Card card = (Card) deptMapper.selectByPrimaryKey(1);
        String s = "hello!<br/>";
        if(card != null) {
            s += "id:" + card.getId() + ",number:" + card.getNumber();
        }
        return s;
    }

}
