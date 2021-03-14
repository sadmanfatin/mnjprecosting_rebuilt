package mnj.mfg.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 23 13:29:34 BDT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgPrecostingQtyDEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        HeaderId {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getHeaderId();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        PocLineId {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getPocLineId();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setPocLineId((Number)value);
            }
        }
        ,
        Classification {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getClassification();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setClassification((String)value);
            }
        }
        ,
        BreakdownQty {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getBreakdownQty();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setBreakdownQty((Number)value);
            }
        }
        ,
        StartDate {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getStartDate();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        EndDate {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getEndDate();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgPrecostingQtyDEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgPrecostingQtyDEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgPrecostingQtyDEOImpl object);

        public abstract void put(MnjMfgPrecostingQtyDEOImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int POCLINEID = AttributesEnum.PocLineId.index();
    public static final int CLASSIFICATION = AttributesEnum.Classification.index();
    public static final int BREAKDOWNQTY = AttributesEnum.BreakdownQty.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgPrecostingQtyDEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjMfgPrecostingQtyDEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for PocLineId, using the alias name PocLineId.
     * @return the PocLineId
     */
    public Number getPocLineId() {
        return (Number)getAttributeInternal(POCLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PocLineId.
     * @param value value to set the PocLineId
     */
    public void setPocLineId(Number value) {
        setAttributeInternal(POCLINEID, value);
    }

    /**
     * Gets the attribute value for Classification, using the alias name Classification.
     * @return the Classification
     */
    public String getClassification() {
        return (String)getAttributeInternal(CLASSIFICATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Classification.
     * @param value value to set the Classification
     */
    public void setClassification(String value) {
        setAttributeInternal(CLASSIFICATION, value);
    }

    /**
     * Gets the attribute value for BreakdownQty, using the alias name BreakdownQty.
     * @return the BreakdownQty
     */
    public Number getBreakdownQty() {
        return (Number)getAttributeInternal(BREAKDOWNQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BreakdownQty.
     * @param value value to set the BreakdownQty
     */
    public void setBreakdownQty(Number value) {
        setAttributeInternal(BREAKDOWNQTY, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the StartDate
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the EndDate
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param headerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number headerId) {
        return new Key(new Object[]{headerId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_PRECOSTING_QTY_D_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setHeaderId(sVal);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }
}