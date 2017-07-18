package com.ums.web.controller;

import com.ums.web.dto.PaymentChannelDto;
import com.ums.web.service.PaymentChannelDtoService;
import com.ums.web.util.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * Created by jianggp on 2017/4/28.
 */
@RestController
@RequestMapping("/PaymentChannelDto")
public class PaymentChannelDtoController {

    private static final Logger logger = LoggerFactory.getLogger(PaymentChannelDtoController.class);

    private String c = "ccc";

    @Autowired
    private PaymentChannelDtoService paymentChannelDtoService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addPaymentChannel(@RequestBody PaymentChannelDto paymentChannelDto){

        try {

            paymentChannelDto = paymentChannelDtoService.addPaymentChannelDto(paymentChannelDto);

            return Response.successResponse(paymentChannelDto);

        } catch (Exception e){
            logger.error("新增支付渠道异常 ", e);
            return Response.errorResponse("新增支付渠道异常");
        }
    }

    /**
     * 修改支付渠道信息
     * @param paymentChannelDto
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> updatePaymentChannel(@RequestBody PaymentChannelDto paymentChannelDto,
                                                    @PathVariable("id") Long id){

        try{
            paymentChannelDto.setId(id);
            paymentChannelDto = paymentChannelDtoService.updatePaymentChannelDto(paymentChannelDto);

            return Response.successResponse(paymentChannelDto);
        } catch (Exception e){
            logger.error("新增支付渠道异常 ", e);
            return Response.errorResponse("新增支付渠道异常");
        }
    }

    /**
     * 根据ID查询支付渠道信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findPaymentChannelById(@PathVariable("id") Long id){

        try{

            String a;

            if(id.equals(1)){
                a = "1的变量：" + c;
                System.out.println("1的变量：" + c);
            }else {
                c = "bbb";
                a = "c的变量：" + c;
                System.out.println("c的变量：" + c);
            }
            //PaymentChannelDto paymentChannelDto = paymentChannelDtoService.findPaymentChannelById(id);

            return Response.successResponse(a);
        }catch (Exception e){
            logger.error("根据ID查询支付渠道异常 ", e);
            return Response.errorResponse("根据ID查询支付渠道异常");
        }
    }

    /**
     * 根据ID删除支付渠道信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Map<String, Object> deletePaymentChannelById(@PathVariable("id") Long id){

        try{

            paymentChannelDtoService.deletePaymentChannelDtoById(id);

            return Response.successResponse();
        }catch (Exception e){
            logger.error("根据ID删除支付渠道异常 ", e);
            return Response.errorResponse("根据ID上次支付渠道异常");
        }
    }

    @RequestMapping(value = "/findPaymentChannelDtoList", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findPaymentChannelDtoList(@RequestParam(value = "channelName", required = false) String channelName,
                                                         @RequestParam(value = "startDate",  required = false) Date startDate,
                                                         @RequestParam(value = "endDate", required = false) Date endDate,
                                                         @RequestParam("pageNo") Integer pageNo,
                                                         @RequestParam("pageSize") Integer  pageSize){

        try{
            Map<String, Object> data = paymentChannelDtoService.
                    findPaymentChannelDtoList(channelName, startDate, endDate, pageNo, pageSize);

            return Response.successResponse(data);

        } catch (Exception e){
            logger.error("查询支付渠道列表异常 ", e);
            return Response.errorResponse("查询支付渠道列表异常");
        }
    }
}
