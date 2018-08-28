package com.github.skyisbule.db.struct;

import com.github.skyisbule.db.type.StoredType;

import java.util.ArrayList;

//存储表结构的基本信息
public class DbTableStruct {

    //表名 记录数 字段信息
    public String                  tableName;
    public Integer                 recordNum;
    public ArrayList<DbTableField> fields;

    public ArrayList<String>     fieldNameList = new ArrayList<>();
    public ArrayList<StoredType> fieldTypeList = new ArrayList<>();
    public ArrayList<Integer>    fieldLensList = new ArrayList<>();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    public ArrayList<DbTableField> getFields() {
        return fields;
    }

    public void setFields(ArrayList<DbTableField> fields) {
        this.fields = fields;
    }

    public ArrayList<String> getFieldNameList() {
        return fieldNameList;
    }

    public void setFieldNameList(ArrayList<String> fieldNameList) {
        this.fieldNameList = fieldNameList;
    }

    public ArrayList<StoredType> getFieldTypeList() {
        return fieldTypeList;
    }

    public void setFieldTypeList(ArrayList<StoredType> fieldTypeList) {
        this.fieldTypeList = fieldTypeList;
    }

    public ArrayList<Integer> getFieldLensList() {
        return fieldLensList;
    }

    public void setFieldLensList(ArrayList<Integer> fieldLensList) {
        this.fieldLensList = fieldLensList;
    }
}
