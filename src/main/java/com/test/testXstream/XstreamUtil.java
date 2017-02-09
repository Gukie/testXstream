/**
 * hongshiwl.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.test.testXstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * 
 * @author Gushu
 * @version $Id: XstreamUtil.java, v 0.1 2016��10��24�� ����1:45:17 Gushu Exp $
 */
public class XstreamUtil {
    /**

     * ��beanת��Ϊxml

     * @param obj ת����bean

     * @return beanת��Ϊxml

     */

    public static String objectToXml(Object obj) {

        XStream xStream = new XStream();

        //xstreamʹ��ע��ת��

        //        xStream.processAnnotations(obj.getClass());
        xStream.processAnnotations(new Class[] { RequestTest.class, ResponseTest.class });

        return xStream.toXML(obj);

    }

    /**

     * ��xmlת��Ϊbean

     * @param <T> ����

     * @param xml Ҫת��Ϊbean��xml

     * @param cls bean��Ӧ��Class

     * @return xmlת��Ϊbean

     */

    public static <T> T xmlToObject(String xml, Class<T> cls) {

        XStream xstream = new XStream(new DomDriver());

        //xstreamʹ��ע��ת��

        xstream.processAnnotations(cls);

        return (T) xstream.fromXML(xml);

    }
}
