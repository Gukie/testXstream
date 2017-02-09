/**
 * hongshiwl.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.test.testXstream;

/**
 * 
 * @author Gushu
 * @version $Id: XStreamMain.java, v 0.1 2016��10��24�� ����1:45:37 Gushu Exp $
 */
public class XStreamMain {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        RequestTest requestTest = new RequestTest();

        requestTest.setReturnCode("200");
        requestTest.setReturnMessage("ok");
        requestTest.setStatus(200);
        requestTest.setReqTime("2013-09-22 00:00:00");

        System.out.println(requestTest);

        String request = XstreamUtil.objectToXml(requestTest);
        System.out.println(request);

        ResponseTest responseTest = XstreamUtil.xmlToObject(request, ResponseTest.class);
        System.out.println(responseTest);

    }

}
