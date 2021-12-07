package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "RESOURCE_GROUPS", schema = "information_schema", catalog = "")
public class ResourceGroupsEntity {
    private String resourceGroupName;
    private Object resourceGroupType;
    private byte resourceGroupEnabled;
    private byte[] vcpuIds;
    private int threadPriority;

    @Basic
    @Column(name = "RESOURCE_GROUP_NAME")
    public String getResourceGroupName() {
        return resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    @Basic
    @Column(name = "RESOURCE_GROUP_TYPE")
    public Object getResourceGroupType() {
        return resourceGroupType;
    }

    public void setResourceGroupType(Object resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
    }

    @Basic
    @Column(name = "RESOURCE_GROUP_ENABLED")
    public byte getResourceGroupEnabled() {
        return resourceGroupEnabled;
    }

    public void setResourceGroupEnabled(byte resourceGroupEnabled) {
        this.resourceGroupEnabled = resourceGroupEnabled;
    }

    @Basic
    @Column(name = "VCPU_IDS")
    public byte[] getVcpuIds() {
        return vcpuIds;
    }

    public void setVcpuIds(byte[] vcpuIds) {
        this.vcpuIds = vcpuIds;
    }

    @Basic
    @Column(name = "THREAD_PRIORITY")
    public int getThreadPriority() {
        return threadPriority;
    }

    public void setThreadPriority(int threadPriority) {
        this.threadPriority = threadPriority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceGroupsEntity that = (ResourceGroupsEntity) o;

        if (resourceGroupEnabled != that.resourceGroupEnabled) return false;
        if (threadPriority != that.threadPriority) return false;
        if (resourceGroupName != null ? !resourceGroupName.equals(that.resourceGroupName) : that.resourceGroupName != null)
            return false;
        if (resourceGroupType != null ? !resourceGroupType.equals(that.resourceGroupType) : that.resourceGroupType != null)
            return false;
        if (!Arrays.equals(vcpuIds, that.vcpuIds)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resourceGroupName != null ? resourceGroupName.hashCode() : 0;
        result = 31 * result + (resourceGroupType != null ? resourceGroupType.hashCode() : 0);
        result = 31 * result + (int) resourceGroupEnabled;
        result = 31 * result + Arrays.hashCode(vcpuIds);
        result = 31 * result + threadPriority;
        return result;
    }
}
