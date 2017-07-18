package com.ums.web.service;

import com.ums.core.dao.PaymentChannelMapper;
import com.ums.core.model.PaymentChannel;
import com.ums.core.model.PaymentChannelExample;
import com.ums.web.dto.PaymentChannelDto;
import com.ums.web.util.Response;
import org.apache.commons.lang3.StringUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by jianggp on 2017/4/28.
 */
@Service
public class PaymentChannelDtoService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private PaymentChannelMapper paymentChannelMapper;


    /**
     *
     * @param id
     * @return
     */
    public PaymentChannelDto findPaymentChannelById(Long id){

        PaymentChannel paymentChannel = paymentChannelMapper.selectByPrimaryKey(id);

        return mapper.map(paymentChannel, PaymentChannelDto.class);
    }

    @Transactional
    public PaymentChannelDto addPaymentChannelDto(PaymentChannelDto paymentChannelDto){

        PaymentChannel paymentChannel = mapper.map(paymentChannelDto, PaymentChannel.class);
        paymentChannel.setCreatedTime(new Date());
        paymentChannel.setUpdatedTime(new Date());

        paymentChannelMapper.insertSelective(paymentChannel);

        paymentChannelDto.setId(paymentChannel.getId());
        return paymentChannelDto;
    }

    @Transactional
    public PaymentChannelDto updatePaymentChannelDto(PaymentChannelDto paymentChannelDto){

        PaymentChannel paymentChannel = mapper.map(paymentChannelDto, PaymentChannel.class);
        paymentChannel.setUpdatedTime(new Date());
        paymentChannelMapper.updateByPrimaryKeySelective(paymentChannel);

        return paymentChannelDto;
    }

    public void deletePaymentChannelDtoById(Long id){

        paymentChannelMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据条件查询支付渠道列表
     * @param channelName
     * @param startDate
     * @param endDate
     * @param pageNo
     * @param pageSize
     * @return
     */
    public Map<String, Object> findPaymentChannelDtoList(String channelName,
                                                         Date startDate,
                                                         Date endDate,
                                                         Integer pageNo,
                                                         Integer  pageSize){

        PaymentChannelExample example = new PaymentChannelExample();
        PaymentChannelExample.Criteria criteria = example.or();

        if(StringUtils.isNoneBlank(channelName)){
            criteria.andChannelNameLike("%" + channelName + "%");
        }

        if(startDate != null){
            criteria.andCreatedTimeGreaterThanOrEqualTo(startDate);
        }

        if(endDate != null){
            criteria.andCreatedTimeLessThanOrEqualTo(endDate);
        }

        example.setLimitStart(pageNo == null ? 0 : pageNo);
        example.setLimitNum(pageSize == null ? 10 : pageSize);

        List<PaymentChannel> paymentChannelList = paymentChannelMapper.selectByExample(example);
        List<PaymentChannelDto> paymentChannelDtoList = new ArrayList<>();
        paymentChannelList.forEach(paymentChannel -> {
            paymentChannelDtoList.add(mapper.map(paymentChannel, PaymentChannelDto.class));
        });

        int total = paymentChannelMapper.countByExample(example);

        return Response.pageData(paymentChannelDtoList, total);
    }

}
