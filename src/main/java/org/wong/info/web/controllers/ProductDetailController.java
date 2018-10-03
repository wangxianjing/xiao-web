package org.wong.info.web.controllers;

import com.alibaba.fastjson.JSONObject;
 import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import ProductDetail;
import org.wong.info.web.utils.InfoResponseBody;
import org.wong.info.service.ProductDetailService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wong on 2018\8\19 0019
 */
@Controller()
@RequestMapping("/product/detail")
public class ProductDetailController extends BaseController{
    @Resource
    ProductDetailService productDetailService;

    @ResponseBody
    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public InfoResponseBody save(@RequestBody JSONObject requestBody, HttpServletRequest request) {
        InfoResponseBody responseBody = new InfoResponseBody();
        System.out.println("request:" + requestBody);
//        String title = requestBody.getString("title");
//        System.out.println("title:" + title);
//        ProductDetail productDetail = new ProductDetail();
//        productDetailService.save(productDetail);
        responseBody.setData("success");
        return responseBody;
    }
}