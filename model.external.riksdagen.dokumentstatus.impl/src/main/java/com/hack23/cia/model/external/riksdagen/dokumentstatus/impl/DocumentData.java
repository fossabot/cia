/*
 * Copyright 2010 James Pether Sörling
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.24 at 11:40:07 PM CET 
//


package com.hack23.cia.model.external.riksdagen.dokumentstatus.impl;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;


/**
 * The Class DocumentData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentData", propOrder = {
    "hangarId",
    "id",
    "rm",
    "label",
    "documentType",
    "subType",
    "tempLabel",
    "org",
    "numberValue",
    "finalNumber",
    "madePublicDate",
    "title",
    "subTitle",
    "documentUrlText",
    "documentUrlHtml",
    "documentStatusUrlXml",
    "documentStatusUrlWWW",
    "committeeReportUrlXml",
    "status"
})
@Entity(name = "DocumentData")
@Table(name = "DOCUMENT_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class DocumentData
    implements ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The hangar id. */
    @XmlElement(name = "hangar_id", required = true)
    protected String hangarId;
    
    /** The id. */
    @XmlElement(name = "dok_id", required = true)
    protected String id;
    
    /** The rm. */
    @XmlElement(required = true)
    protected String rm;
    
    /** The label. */
    @XmlElement(name = "beteckning", required = true)
    protected String label;
    
    /** The document type. */
    @XmlElement(name = "typ", required = true)
    protected String documentType;
    
    /** The sub type. */
    @XmlElement(name = "subtyp", required = true)
    protected String subType;
    
    /** The temp label. */
    @XmlElement(name = "tempbeteckning", required = true)
    protected String tempLabel;
    
    /** The org. */
    @XmlElement(name = "organ", required = true)
    protected String org;
    
    /** The number value. */
    @XmlElement(name = "nummer", required = true)
    protected BigInteger numberValue;
    
    /** The final number. */
    @XmlElement(name = "slutnummer", required = true)
    protected BigInteger finalNumber;
    
    /** The made public date. */
    @XmlElement(name = "publicerad", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date madePublicDate;
    
    /** The title. */
    @XmlElement(name = "titel", required = true)
    protected String title;
    
    /** The sub title. */
    @XmlElement(name = "subtitel", required = true)
    protected String subTitle;
    
    /** The document url text. */
    @XmlElement(name = "dokument_url_text", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentUrlText;
    
    /** The document url html. */
    @XmlElement(name = "dokument_url_html", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentUrlHtml;
    
    /** The document status url xml. */
    @XmlElement(name = "dokumentstatus_url_xml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentStatusUrlXml;
    
    /** The document status url WWW. */
    @XmlElement(name = "dokumentstatus_url_www", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String documentStatusUrlWWW;
    
    /** The committee report url xml. */
    @XmlElement(name = "utskottsforslag_url_xml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String committeeReportUrlXml;
    
    /** The status. */
    @XmlElement(required = true)
    protected String status;

    /**
	 * Gets the hangar id.
	 *
	 * @return the hangar id
	 */
    @Basic
    @Column(name = "HANGAR_ID")
    public String getHangarId() {
        return hangarId;
    }

    /**
	 * Sets the hangar id.
	 *
	 * @param value the new hangar id
	 */
    public void setHangarId(final String value) {
        this.hangarId = value;
    }

    /**
	 * Gets the id.
	 *
	 * @return the id
	 */
    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    /**
	 * Sets the id.
	 *
	 * @param value the new id
	 */
    public void setId(final String value) {
        this.id = value;
    }

    /**
	 * Gets the rm.
	 *
	 * @return the rm
	 */
    @Basic
    @Column(name = "RM")
    public String getRm() {
        return rm;
    }

    /**
	 * Sets the rm.
	 *
	 * @param value the new rm
	 */
    public void setRm(final String value) {
        this.rm = value;
    }

    /**
	 * Gets the label.
	 *
	 * @return the label
	 */
    @Basic
    @Column(name = "LABEL")
    public String getLabel() {
        return label;
    }

    /**
	 * Sets the label.
	 *
	 * @param value the new label
	 */
    public void setLabel(final String value) {
        this.label = value;
    }

    /**
	 * Gets the document type.
	 *
	 * @return the document type
	 */
    @Basic
    @Column(name = "DOCUMENT_TYPE")
    public String getDocumentType() {
        return documentType;
    }

    /**
	 * Sets the document type.
	 *
	 * @param value the new document type
	 */
    public void setDocumentType(final String value) {
        this.documentType = value;
    }

    /**
	 * Gets the sub type.
	 *
	 * @return the sub type
	 */
    @Basic
    @Column(name = "SUB_TYPE")
    public String getSubType() {
        return subType;
    }

    /**
	 * Sets the sub type.
	 *
	 * @param value the new sub type
	 */
    public void setSubType(final String value) {
        this.subType = value;
    }

    /**
	 * Gets the temp label.
	 *
	 * @return the temp label
	 */
    @Basic
    @Column(name = "TEMP_LABEL")
    public String getTempLabel() {
        return tempLabel;
    }

    /**
	 * Sets the temp label.
	 *
	 * @param value the new temp label
	 */
    public void setTempLabel(final String value) {
        this.tempLabel = value;
    }

    /**
	 * Gets the org.
	 *
	 * @return the org
	 */
    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    /**
	 * Sets the org.
	 *
	 * @param value the new org
	 */
    public void setOrg(final String value) {
        this.org = value;
    }

    /**
	 * Gets the number value.
	 *
	 * @return the number value
	 */
    @Basic
    @Column(name = "NUMBER_VALUE", precision = 20)
    public BigInteger getNumberValue() {
        return numberValue;
    }

    /**
	 * Sets the number value.
	 *
	 * @param value the new number value
	 */
    public void setNumberValue(final BigInteger value) {
        this.numberValue = value;
    }

    /**
	 * Gets the final number.
	 *
	 * @return the final number
	 */
    @Basic
    @Column(name = "FINAL_NUMBER", precision = 20)
    public BigInteger getFinalNumber() {
        return finalNumber;
    }

    /**
	 * Sets the final number.
	 *
	 * @param value the new final number
	 */
    public void setFinalNumber(final BigInteger value) {
        this.finalNumber = value;
    }

    /**
	 * Gets the made public date.
	 *
	 * @return the made public date
	 */
    @Basic
    @Column(name = "MADE_PUBLIC_DATE")
    @Temporal(TemporalType.DATE)
    public Date getMadePublicDate() {
        return madePublicDate;
    }

    /**
	 * Sets the made public date.
	 *
	 * @param value the new made public date
	 */
    public void setMadePublicDate(final Date value) {
        this.madePublicDate = value;
    }

    /**
	 * Gets the title.
	 *
	 * @return the title
	 */
    @Basic
    @Column(name = "TITLE", length = 65536)
    public String getTitle() {
        return title;
    }

    /**
	 * Sets the title.
	 *
	 * @param value the new title
	 */
    public void setTitle(final String value) {
        this.title = value;
    }

    /**
	 * Gets the sub title.
	 *
	 * @return the sub title
	 */
    @Basic
    @Column(name = "SUB_TITLE")
    public String getSubTitle() {
        return subTitle;
    }

    /**
	 * Sets the sub title.
	 *
	 * @param value the new sub title
	 */
    public void setSubTitle(final String value) {
        this.subTitle = value;
    }

    /**
	 * Gets the document url text.
	 *
	 * @return the document url text
	 */
    @Basic
    @Column(name = "DOCUMENT_URL_TEXT")
    public String getDocumentUrlText() {
        return documentUrlText;
    }

    /**
	 * Sets the document url text.
	 *
	 * @param value the new document url text
	 */
    public void setDocumentUrlText(final String value) {
        this.documentUrlText = value;
    }

    /**
	 * Gets the document url html.
	 *
	 * @return the document url html
	 */
    @Basic
    @Column(name = "DOCUMENT_URL_HTML")
    public String getDocumentUrlHtml() {
        return documentUrlHtml;
    }

    /**
	 * Sets the document url html.
	 *
	 * @param value the new document url html
	 */
    public void setDocumentUrlHtml(final String value) {
        this.documentUrlHtml = value;
    }

    /**
	 * Gets the document status url xml.
	 *
	 * @return the document status url xml
	 */
    @Basic
    @Column(name = "DOCUMENT_STATUS_URL_XML")
    public String getDocumentStatusUrlXml() {
        return documentStatusUrlXml;
    }

    /**
	 * Sets the document status url xml.
	 *
	 * @param value the new document status url xml
	 */
    public void setDocumentStatusUrlXml(final String value) {
        this.documentStatusUrlXml = value;
    }

    /**
	 * Gets the document status url WWW.
	 *
	 * @return the document status url WWW
	 */
    @Basic
    @Column(name = "DOCUMENT_STATUS_URL_WWW")
    public String getDocumentStatusUrlWWW() {
        return documentStatusUrlWWW;
    }

    /**
	 * Sets the document status url WWW.
	 *
	 * @param value the new document status url WWW
	 */
    public void setDocumentStatusUrlWWW(final String value) {
        this.documentStatusUrlWWW = value;
    }

    /**
	 * Gets the committee report url xml.
	 *
	 * @return the committee report url xml
	 */
    @Basic
    @Column(name = "COMMITTEE_REPORT_URL_XML")
    public String getCommitteeReportUrlXml() {
        return committeeReportUrlXml;
    }

    /**
	 * Sets the committee report url xml.
	 *
	 * @param value the new committee report url xml
	 */
    public void setCommitteeReportUrlXml(final String value) {
        this.committeeReportUrlXml = value;
    }

    /**
	 * Gets the status.
	 *
	 * @return the status
	 */
    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    /**
	 * Sets the status.
	 *
	 * @param value the new status
	 */
    public void setStatus(final String value) {
        this.status = value;
    }

    /**
	 * With hangar id.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withHangarId(final String value) {
        setHangarId(value);
        return this;
    }

    /**
	 * With id.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withId(final String value) {
        setId(value);
        return this;
    }

    /**
	 * With rm.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withRm(final String value) {
        setRm(value);
        return this;
    }

    /**
	 * With label.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withLabel(final String value) {
        setLabel(value);
        return this;
    }

    /**
	 * With document type.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withDocumentType(final String value) {
        setDocumentType(value);
        return this;
    }

    /**
	 * With sub type.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withSubType(final String value) {
        setSubType(value);
        return this;
    }

    /**
	 * With temp label.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withTempLabel(final String value) {
        setTempLabel(value);
        return this;
    }

    /**
	 * With org.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withOrg(final String value) {
        setOrg(value);
        return this;
    }

    /**
	 * With number value.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withNumberValue(final BigInteger value) {
        setNumberValue(value);
        return this;
    }

    /**
	 * With final number.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withFinalNumber(final BigInteger value) {
        setFinalNumber(value);
        return this;
    }

    /**
	 * With made public date.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withMadePublicDate(final Date value) {
        setMadePublicDate(value);
        return this;
    }

    /**
	 * With title.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withTitle(final String value) {
        setTitle(value);
        return this;
    }

    /**
	 * With sub title.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withSubTitle(final String value) {
        setSubTitle(value);
        return this;
    }

    /**
	 * With document url text.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withDocumentUrlText(final String value) {
        setDocumentUrlText(value);
        return this;
    }

    /**
	 * With document url html.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withDocumentUrlHtml(final String value) {
        setDocumentUrlHtml(value);
        return this;
    }

    /**
	 * With document status url xml.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withDocumentStatusUrlXml(final String value) {
        setDocumentStatusUrlXml(value);
        return this;
    }

    /**
	 * With document status url WWW.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withDocumentStatusUrlWWW(final String value) {
        setDocumentStatusUrlWWW(value);
        return this;
    }

    /**
	 * With committee report url xml.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withCommitteeReportUrlXml(final String value) {
        setCommitteeReportUrlXml(value);
        return this;
    }

    /**
	 * With status.
	 *
	 * @param value the value
	 * @return the document data
	 */
    public DocumentData withStatus(final String value) {
        setStatus(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}


    /* (non-Javadoc)
     * @see org.jvnet.jaxb2_commons.lang.Equals#equals(org.jvnet.jaxb2_commons.locator.ObjectLocator, org.jvnet.jaxb2_commons.locator.ObjectLocator, java.lang.Object, org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy)
     */
    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DocumentData that = ((DocumentData) object);
        {
            String lhsHangarId;
            lhsHangarId = this.getHangarId();
            String rhsHangarId;
            rhsHangarId = that.getHangarId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hangarId", lhsHangarId), LocatorUtils.property(thatLocator, "hangarId", rhsHangarId), lhsHangarId, rhsHangarId)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsRm;
            lhsRm = this.getRm();
            String rhsRm;
            rhsRm = that.getRm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rm", lhsRm), LocatorUtils.property(thatLocator, "rm", rhsRm), lhsRm, rhsRm)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            String lhsDocumentType;
            lhsDocumentType = this.getDocumentType();
            String rhsDocumentType;
            rhsDocumentType = that.getDocumentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentType", lhsDocumentType), LocatorUtils.property(thatLocator, "documentType", rhsDocumentType), lhsDocumentType, rhsDocumentType)) {
                return false;
            }
        }
        {
            String lhsSubType;
            lhsSubType = this.getSubType();
            String rhsSubType;
            rhsSubType = that.getSubType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subType", lhsSubType), LocatorUtils.property(thatLocator, "subType", rhsSubType), lhsSubType, rhsSubType)) {
                return false;
            }
        }
        {
            String lhsTempLabel;
            lhsTempLabel = this.getTempLabel();
            String rhsTempLabel;
            rhsTempLabel = that.getTempLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tempLabel", lhsTempLabel), LocatorUtils.property(thatLocator, "tempLabel", rhsTempLabel), lhsTempLabel, rhsTempLabel)) {
                return false;
            }
        }
        {
            String lhsOrg;
            lhsOrg = this.getOrg();
            String rhsOrg;
            rhsOrg = that.getOrg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "org", lhsOrg), LocatorUtils.property(thatLocator, "org", rhsOrg), lhsOrg, rhsOrg)) {
                return false;
            }
        }
        {
            BigInteger lhsNumberValue;
            lhsNumberValue = this.getNumberValue();
            BigInteger rhsNumberValue;
            rhsNumberValue = that.getNumberValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberValue", lhsNumberValue), LocatorUtils.property(thatLocator, "numberValue", rhsNumberValue), lhsNumberValue, rhsNumberValue)) {
                return false;
            }
        }
        {
            BigInteger lhsFinalNumber;
            lhsFinalNumber = this.getFinalNumber();
            BigInteger rhsFinalNumber;
            rhsFinalNumber = that.getFinalNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalNumber", lhsFinalNumber), LocatorUtils.property(thatLocator, "finalNumber", rhsFinalNumber), lhsFinalNumber, rhsFinalNumber)) {
                return false;
            }
        }
        {
            Date lhsMadePublicDate;
            lhsMadePublicDate = this.getMadePublicDate();
            Date rhsMadePublicDate;
            rhsMadePublicDate = that.getMadePublicDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "madePublicDate", lhsMadePublicDate), LocatorUtils.property(thatLocator, "madePublicDate", rhsMadePublicDate), lhsMadePublicDate, rhsMadePublicDate)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsSubTitle;
            lhsSubTitle = this.getSubTitle();
            String rhsSubTitle;
            rhsSubTitle = that.getSubTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subTitle", lhsSubTitle), LocatorUtils.property(thatLocator, "subTitle", rhsSubTitle), lhsSubTitle, rhsSubTitle)) {
                return false;
            }
        }
        {
            String lhsDocumentUrlText;
            lhsDocumentUrlText = this.getDocumentUrlText();
            String rhsDocumentUrlText;
            rhsDocumentUrlText = that.getDocumentUrlText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentUrlText", lhsDocumentUrlText), LocatorUtils.property(thatLocator, "documentUrlText", rhsDocumentUrlText), lhsDocumentUrlText, rhsDocumentUrlText)) {
                return false;
            }
        }
        {
            String lhsDocumentUrlHtml;
            lhsDocumentUrlHtml = this.getDocumentUrlHtml();
            String rhsDocumentUrlHtml;
            rhsDocumentUrlHtml = that.getDocumentUrlHtml();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentUrlHtml", lhsDocumentUrlHtml), LocatorUtils.property(thatLocator, "documentUrlHtml", rhsDocumentUrlHtml), lhsDocumentUrlHtml, rhsDocumentUrlHtml)) {
                return false;
            }
        }
        {
            String lhsDocumentStatusUrlXml;
            lhsDocumentStatusUrlXml = this.getDocumentStatusUrlXml();
            String rhsDocumentStatusUrlXml;
            rhsDocumentStatusUrlXml = that.getDocumentStatusUrlXml();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentStatusUrlXml", lhsDocumentStatusUrlXml), LocatorUtils.property(thatLocator, "documentStatusUrlXml", rhsDocumentStatusUrlXml), lhsDocumentStatusUrlXml, rhsDocumentStatusUrlXml)) {
                return false;
            }
        }
        {
            String lhsDocumentStatusUrlWWW;
            lhsDocumentStatusUrlWWW = this.getDocumentStatusUrlWWW();
            String rhsDocumentStatusUrlWWW;
            rhsDocumentStatusUrlWWW = that.getDocumentStatusUrlWWW();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentStatusUrlWWW", lhsDocumentStatusUrlWWW), LocatorUtils.property(thatLocator, "documentStatusUrlWWW", rhsDocumentStatusUrlWWW), lhsDocumentStatusUrlWWW, rhsDocumentStatusUrlWWW)) {
                return false;
            }
        }
        {
            String lhsCommitteeReportUrlXml;
            lhsCommitteeReportUrlXml = this.getCommitteeReportUrlXml();
            String rhsCommitteeReportUrlXml;
            rhsCommitteeReportUrlXml = that.getCommitteeReportUrlXml();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "committeeReportUrlXml", lhsCommitteeReportUrlXml), LocatorUtils.property(thatLocator, "committeeReportUrlXml", rhsCommitteeReportUrlXml), lhsCommitteeReportUrlXml, rhsCommitteeReportUrlXml)) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
