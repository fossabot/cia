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
// Generated on: 2019.02.24 at 11:39:49 PM CET 
//


package com.hack23.cia.model.external.val.riksdagsvalkrets.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class SwedenParliamentElectoralRegionContainer.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwedenParliamentElectoralRegionContainer", propOrder = {
    "parliamentElectoralRegions"
})
@Entity(name = "SwedenParliamentElectoralRegionContainer")
@Table(name = "SWEDEN_PARLIAMENT_ELECTORAL__0")
@Inheritance(strategy = InheritanceType.JOINED)
public class SwedenParliamentElectoralRegionContainer
    implements ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The parliament electoral regions. */
    @XmlElement(name = "riksdagsvalkrets", required = true)
    protected List<SwedenParliamentElectoralRegion> parliamentElectoralRegions;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the parliament electoral regions.
	 *
	 * @return the parliament electoral regions
	 */
    @OneToMany(targetEntity = SwedenParliamentElectoralRegion.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARLIAMENT_ELECTORAL_REGIONS_0")
    public List<SwedenParliamentElectoralRegion> getParliamentElectoralRegions() {
        if (parliamentElectoralRegions == null) {
            parliamentElectoralRegions = new ArrayList<>();
        }
        return this.parliamentElectoralRegions;
    }

    /**
	 * Sets the parliament electoral regions.
	 *
	 * @param parliamentElectoralRegions the new parliament electoral regions
	 */
    public void setParliamentElectoralRegions(final List<SwedenParliamentElectoralRegion> parliamentElectoralRegions) {
        this.parliamentElectoralRegions = parliamentElectoralRegions;
    }

    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
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
        final SwedenParliamentElectoralRegionContainer that = ((SwedenParliamentElectoralRegionContainer) object);
        {
            List<SwedenParliamentElectoralRegion> lhsParliamentElectoralRegions;
            lhsParliamentElectoralRegions = (((this.parliamentElectoralRegions!= null)&&(!this.parliamentElectoralRegions.isEmpty()))?this.getParliamentElectoralRegions():null);
            List<SwedenParliamentElectoralRegion> rhsParliamentElectoralRegions;
            rhsParliamentElectoralRegions = (((that.parliamentElectoralRegions!= null)&&(!that.parliamentElectoralRegions.isEmpty()))?that.getParliamentElectoralRegions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parliamentElectoralRegions", lhsParliamentElectoralRegions), LocatorUtils.property(thatLocator, "parliamentElectoralRegions", rhsParliamentElectoralRegions), lhsParliamentElectoralRegions, rhsParliamentElectoralRegions)) {
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
