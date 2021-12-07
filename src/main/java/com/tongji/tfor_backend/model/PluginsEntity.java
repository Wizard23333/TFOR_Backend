package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PLUGINS", schema = "information_schema", catalog = "")
public class PluginsEntity {
    private String pluginName;
    private String pluginVersion;
    private String pluginStatus;
    private String pluginType;
    private String pluginTypeVersion;
    private String pluginLibrary;
    private String pluginLibraryVersion;
    private String pluginAuthor;
    private String pluginDescription;
    private String pluginLicense;
    private String loadOption;

    @Basic
    @Column(name = "PLUGIN_NAME")
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    @Basic
    @Column(name = "PLUGIN_VERSION")
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    @Basic
    @Column(name = "PLUGIN_STATUS")
    public String getPluginStatus() {
        return pluginStatus;
    }

    public void setPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    @Basic
    @Column(name = "PLUGIN_TYPE")
    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    @Basic
    @Column(name = "PLUGIN_TYPE_VERSION")
    public String getPluginTypeVersion() {
        return pluginTypeVersion;
    }

    public void setPluginTypeVersion(String pluginTypeVersion) {
        this.pluginTypeVersion = pluginTypeVersion;
    }

    @Basic
    @Column(name = "PLUGIN_LIBRARY")
    public String getPluginLibrary() {
        return pluginLibrary;
    }

    public void setPluginLibrary(String pluginLibrary) {
        this.pluginLibrary = pluginLibrary;
    }

    @Basic
    @Column(name = "PLUGIN_LIBRARY_VERSION")
    public String getPluginLibraryVersion() {
        return pluginLibraryVersion;
    }

    public void setPluginLibraryVersion(String pluginLibraryVersion) {
        this.pluginLibraryVersion = pluginLibraryVersion;
    }

    @Basic
    @Column(name = "PLUGIN_AUTHOR")
    public String getPluginAuthor() {
        return pluginAuthor;
    }

    public void setPluginAuthor(String pluginAuthor) {
        this.pluginAuthor = pluginAuthor;
    }

    @Basic
    @Column(name = "PLUGIN_DESCRIPTION")
    public String getPluginDescription() {
        return pluginDescription;
    }

    public void setPluginDescription(String pluginDescription) {
        this.pluginDescription = pluginDescription;
    }

    @Basic
    @Column(name = "PLUGIN_LICENSE")
    public String getPluginLicense() {
        return pluginLicense;
    }

    public void setPluginLicense(String pluginLicense) {
        this.pluginLicense = pluginLicense;
    }

    @Basic
    @Column(name = "LOAD_OPTION")
    public String getLoadOption() {
        return loadOption;
    }

    public void setLoadOption(String loadOption) {
        this.loadOption = loadOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PluginsEntity that = (PluginsEntity) o;

        if (pluginName != null ? !pluginName.equals(that.pluginName) : that.pluginName != null) return false;
        if (pluginVersion != null ? !pluginVersion.equals(that.pluginVersion) : that.pluginVersion != null)
            return false;
        if (pluginStatus != null ? !pluginStatus.equals(that.pluginStatus) : that.pluginStatus != null) return false;
        if (pluginType != null ? !pluginType.equals(that.pluginType) : that.pluginType != null) return false;
        if (pluginTypeVersion != null ? !pluginTypeVersion.equals(that.pluginTypeVersion) : that.pluginTypeVersion != null)
            return false;
        if (pluginLibrary != null ? !pluginLibrary.equals(that.pluginLibrary) : that.pluginLibrary != null)
            return false;
        if (pluginLibraryVersion != null ? !pluginLibraryVersion.equals(that.pluginLibraryVersion) : that.pluginLibraryVersion != null)
            return false;
        if (pluginAuthor != null ? !pluginAuthor.equals(that.pluginAuthor) : that.pluginAuthor != null) return false;
        if (pluginDescription != null ? !pluginDescription.equals(that.pluginDescription) : that.pluginDescription != null)
            return false;
        if (pluginLicense != null ? !pluginLicense.equals(that.pluginLicense) : that.pluginLicense != null)
            return false;
        if (loadOption != null ? !loadOption.equals(that.loadOption) : that.loadOption != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pluginName != null ? pluginName.hashCode() : 0;
        result = 31 * result + (pluginVersion != null ? pluginVersion.hashCode() : 0);
        result = 31 * result + (pluginStatus != null ? pluginStatus.hashCode() : 0);
        result = 31 * result + (pluginType != null ? pluginType.hashCode() : 0);
        result = 31 * result + (pluginTypeVersion != null ? pluginTypeVersion.hashCode() : 0);
        result = 31 * result + (pluginLibrary != null ? pluginLibrary.hashCode() : 0);
        result = 31 * result + (pluginLibraryVersion != null ? pluginLibraryVersion.hashCode() : 0);
        result = 31 * result + (pluginAuthor != null ? pluginAuthor.hashCode() : 0);
        result = 31 * result + (pluginDescription != null ? pluginDescription.hashCode() : 0);
        result = 31 * result + (pluginLicense != null ? pluginLicense.hashCode() : 0);
        result = 31 * result + (loadOption != null ? loadOption.hashCode() : 0);
        return result;
    }
}
