package org.mybatis.generator;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class HairyCommentGenerator extends DefaultCommentGenerator {

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        // ���ɷ���ע��
        method.addJavaDocLine("/**");
        String method_name = method.getName();

        if ("deleteByPrimaryKey".equals(method_name)) {
            method.addJavaDocLine(" * ��������ɾ�����ݿ�ļ�¼");
        } else if ("insert".equals(method_name)) {
            method.addJavaDocLine(" * �������ݿ��¼");
        } else if ("selectByPrimaryKey".equals(method_name)) {
            method.addJavaDocLine(" * ����������ȡһ�����ݿ��¼");
        } else if ("updateByPrimaryKey".equals(method_name)) {
            method.addJavaDocLine(" * �����������������ݿ��¼");
        } else if ("selectAll".equals(method_name)) {
            method.addJavaDocLine(" * ��ȡȫ�����ݿ��¼");
        } else if ("insertSelective".equals(method_name)) {
            method.addJavaDocLine(" * �������ݿ��¼");
        } else if ("updateByPrimaryKeySelective".equals(method_name)) {
            method.addJavaDocLine(" * ��������������ָ���ֶ�����");
        }
        method.addJavaDocLine(" *");
        List<Parameter> parameterList = method.getParameters();
        String paramterName;
        for (Parameter parameter : parameterList) {
            paramterName = parameter.getName();
            method.addJavaDocLine(" * @param " + paramterName);
        }
        // addJavadocTag(method, false);
        method.addJavaDocLine(" */");
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        // ��ע�ͣ�������
        String shortName = innerClass.getType().getShortName();
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine(" * ��ע��");
        innerClass.addJavaDocLine(" * " + shortName);
        innerClass.addJavaDocLine(" * ���ݿ��" + introspectedTable.getFullyQualifiedTable());
        // addJavadocTag(innerClass, false);
        innerClass.addJavaDocLine(" */");
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        // ��ע�ͣ�������
        String shortName = innerClass.getType().getShortName();
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine(" * ��ע��");
        innerClass.addJavaDocLine(" * " + shortName);
        innerClass.addJavaDocLine(" * ���ݿ��" + introspectedTable.getFullyQualifiedTable());
        // addJavadocTag(innerClass, false);
        innerClass.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // ����ֶ�ע��
        // StringBuffer sb = new StringBuffer();
        field.addJavaDocLine("/**");
        // field.addJavaDocLine(" * <pre>");
        if (introspectedColumn.getRemarks() != null)
            field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
        // sb.append(" * ���ֶ� : ");
        // sb.append(introspectedTable.getFullyQualifiedTable());
        // sb.append('.');
        // sb.append(introspectedColumn.getActualColumnName());
        // field.addJavaDocLine(sb.toString());
        // field.addJavaDocLine(" * </pre>");
        // addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // get����ע��
        StringBuffer sb = new StringBuffer();
        method.addJavaDocLine("/**");
        // method.addJavaDocLine(" * <pre>");
        method.addJavaDocLine(" * ��ȡ��" + introspectedColumn.getRemarks());
        // sb.append(" * ���ֶΣ�");
        // sb.append(introspectedTable.getFullyQualifiedTable());
        // sb.append('.');
        // sb.append(introspectedColumn.getActualColumnName());
        // method.addJavaDocLine(sb.toString());
        // method.addJavaDocLine(" * </pre>");
        // method.addJavaDocLine(" *");
        // sb = new StringBuffer();
        sb.append(" * @return ");
        // sb.append(introspectedTable.getFullyQualifiedTable());
        // sb.append('.');
        // sb.append(introspectedColumn.getActualColumnName());
        // sb.append("��");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString());
        // addJavadocTag(method, false);
        method.addJavaDocLine(" */");
    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // set����ע��
        // StringBuffer sb = new StringBuffer();
        method.addJavaDocLine("/**");
        // method.addJavaDocLine(" * <pre>");
        method.addJavaDocLine(" * ���ã�" + introspectedColumn.getRemarks());
        // sb.append(" * ���ֶΣ�");
        // sb.append(introspectedTable.getFullyQualifiedTable());
        // sb.append('.');
        // sb.append(introspectedColumn.getActualColumnName());
        // method.addJavaDocLine(sb.toString());
        // method.addJavaDocLine(" * </pre>");
        // method.addJavaDocLine(" *");
        Parameter parm = method.getParameters().get(0);
        method.addJavaDocLine(" * @param " + parm.getName() + " " + introspectedColumn.getRemarks());
        // sb = new StringBuffer();
        // sb.append(" * ");
        // sb.append(introspectedTable.getFullyQualifiedTable());
        // sb.append('.');
        // sb.append(introspectedColumn.getActualColumnName());
        // sb.append("��");
        // sb.append(introspectedColumn.getRemarks());
        // method.addJavaDocLine(sb.toString());
        // addJavadocTag(method, false);
        method.addJavaDocLine(" */");
    }

}
