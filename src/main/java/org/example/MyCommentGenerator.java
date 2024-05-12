/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2024 All Rights Reserved.
 */
package org.example;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 *
 * @author nycp42j feng.li15
 * @version : MyCommentGenerator.java, v 0.1 2024-03-06 15:15 feng.li15 Exp $$
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

    private boolean suppressAllComments;

    private boolean addRemarkComments;

    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
        addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
//        if (suppressAllComments) {
//            return ;
//        }
        String remarks = introspectedColumn.getRemarks();
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            field.addJavaDocLine("/**");
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));
            for(String remarkLine : remarkLines) {
                field.addJavaDocLine(" *   " + remarkLine);
            }
            field.addJavaDocLine(" */");
        }
    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
    }

    @Override
    public void addComment(XmlElement xmlElement) {
    }


}