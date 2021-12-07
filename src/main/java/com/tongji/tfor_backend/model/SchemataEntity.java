package com.tongji.tfor_backend.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;

@Entity
@Table(name = "SCHEMATA", schema = "information_schema", catalog = "")
public class SchemataEntity {
    private String catalogName;
    private String schemaName;
    private String defaultCharacterSetName;
    private String defaultCollationName;
    private byte[] sqlPath;
    private Object defaultEncryption;

    @Basic
    @Column(name = "CATALOG_NAME")
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    @Basic
    @Column(name = "SCHEMA_NAME")
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Basic
    @Column(name = "DEFAULT_CHARACTER_SET_NAME")
    public String getDefaultCharacterSetName() {
        return defaultCharacterSetName;
    }

    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    @Basic
    @Column(name = "DEFAULT_COLLATION_NAME")
    public String getDefaultCollationName() {
        return defaultCollationName;
    }

    public void setDefaultCollationName(String defaultCollationName) {
        this.defaultCollationName = defaultCollationName;
    }

    @Basic
    @Column(name = "SQL_PATH")
    public byte[] getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(byte[] sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Basic
    @Column(name = "DEFAULT_ENCRYPTION")
    public Object getDefaultEncryption() {
        return defaultEncryption;
    }

    public void setDefaultEncryption(Object defaultEncryption) {
        this.defaultEncryption = defaultEncryption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchemataEntity that = (SchemataEntity) o;

        if (catalogName != null ? !catalogName.equals(that.catalogName) : that.catalogName != null) return false;
        if (schemaName != null ? !schemaName.equals(that.schemaName) : that.schemaName != null) return false;
        if (defaultCharacterSetName != null ? !defaultCharacterSetName.equals(that.defaultCharacterSetName) : that.defaultCharacterSetName != null)
            return false;
        if (defaultCollationName != null ? !defaultCollationName.equals(that.defaultCollationName) : that.defaultCollationName != null)
            return false;
        if (!Arrays.equals(sqlPath, that.sqlPath)) return false;
        if (defaultEncryption != null ? !defaultEncryption.equals(that.defaultEncryption) : that.defaultEncryption != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = catalogName != null ? catalogName.hashCode() : 0;
        result = 31 * result + (schemaName != null ? schemaName.hashCode() : 0);
        result = 31 * result + (defaultCharacterSetName != null ? defaultCharacterSetName.hashCode() : 0);
        result = 31 * result + (defaultCollationName != null ? defaultCollationName.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(sqlPath);
        result = 31 * result + (defaultEncryption != null ? defaultEncryption.hashCode() : 0);
        return result;
    }
}
