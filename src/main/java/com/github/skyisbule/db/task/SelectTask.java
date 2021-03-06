package com.github.skyisbule.db.task;

import com.github.skyisbule.db.struct.SelectRange;

import java.util.List;

/**
 * 处理流程
 * serverSocket解析sql生成selectTask，生成查询范围
 * 传给mainThread，根据查询范围读取，视情况回滚
 */
public class SelectTask implements Task{

    Integer           transactionId;//事务id
    boolean           hasFilter;//是否有过滤条件  目前不用
    String            tableName; //表名
    boolean           selectAll;//是否查询全部，即查询条件中是否有“主键”的过滤条件
    boolean           isRange;  //是否是范围，若不是则代表查询指定主键的值
    List<Integer>     PK;       //主键  如（id =1 or id = 2....)
    List<SelectRange> ranges;   //查找范围
    CRUDTaskType      crudTaskType = CRUDTaskType.SELECT;


    public SelectTask(Integer transcationId, String tableName, boolean selectAll) {
        this.transactionId = transcationId;
        this.tableName = tableName;
        this.selectAll = selectAll;
    }

    public List<SelectRange> getRanges(){
        return this.ranges;
    }

    @Override
    public CRUDTaskType getCRUDtype() {
        return this.crudTaskType;
    }

    public Integer getTranscationId() {
        return transactionId;
    }

    public void setTranscationId(Integer transcationId) {
        this.transactionId = transcationId;
    }

    public boolean isHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public boolean isSelectAll() {
        return selectAll;
    }

    public void setSelectAll(boolean selectAll) {
        this.selectAll = selectAll;
    }

    public boolean isRange() {
        return isRange;
    }

    public void setRange(boolean range) {
        isRange = range;
    }

    public List<Integer> getPK() {
        return PK;
    }

    public void setPK(List<Integer> PK) {
        this.PK = PK;
    }

    public void setRanges(List<SelectRange> ranges) {
        this.ranges = ranges;
    }
}
