package com.osp.npo.core.common;


import com.osp.npo.core.AbstractList;
import com.osp.npo.core.common.ExecuteHistoryInfo;


/**
 * Generate by script
 * Generate date: 02/17/2011 10:15:26 AM
 */
public class ExecuteHistoryList extends AbstractList {


    /**
     * <P>Generate Instance.</P>
     *
     */
    public ExecuteHistoryList() {
        super();
    }


    /**
     * <P>Get object Info from List</P>
     *
     * @param index Index
     * @return object Info
     */
    public ExecuteHistoryInfo get(int index) {
        return ((ExecuteHistoryInfo) this.list.get(index));
    }


    /**
     * <P>Add object Info to List.</P>
     *
     * @param info object Info
     * @return List of ojbect after add object Info
     */
    public boolean add(ExecuteHistoryInfo info) {
        return this.list.add(info);
    }
}
