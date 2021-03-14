package mnj.mfg.model.views;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 07 16:24:14 BDT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BomBpoLinesAllVoImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        BomId {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getBomId();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setBomId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getLineId();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        BpoNo {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getBpoNo();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        SaleOrderId {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getSaleOrderId();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setSaleOrderId((Number)value);
            }
        }
        ,
        SealeNo {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getSealeNo();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setSealeNo((String)value);
            }
        }
        ,
        Brand {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getBrand();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setBrand((String)value);
            }
        }
        ,
        StyleNo {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getStyleNo();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setStyleNo((String)value);
            }
        }
        ,
        UserItemDesc {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getUserItemDesc();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setUserItemDesc((String)value);
            }
        }
        ,
        EndUserDesc {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getEndUserDesc();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setEndUserDesc((String)value);
            }
        }
        ,
        OrderQty {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getOrderQty();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setOrderQty((Number)value);
            }
        }
        ,
        Fit {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getFit();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setFit((String)value);
            }
        }
        ,
        Season {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getSeason();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Percent {
            public Object get(BomBpoLinesAllVoImpl obj) {
                return obj.getPercent();
            }

            public void put(BomBpoLinesAllVoImpl obj, Object value) {
                obj.setPercent((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(BomBpoLinesAllVoImpl object);

        public abstract void put(BomBpoLinesAllVoImpl object, Object value);

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


    public static final int BOMID = AttributesEnum.BomId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int BPONO = AttributesEnum.BpoNo.index();
    public static final int SALEORDERID = AttributesEnum.SaleOrderId.index();
    public static final int SEALENO = AttributesEnum.SealeNo.index();
    public static final int BRAND = AttributesEnum.Brand.index();
    public static final int STYLENO = AttributesEnum.StyleNo.index();
    public static final int USERITEMDESC = AttributesEnum.UserItemDesc.index();
    public static final int ENDUSERDESC = AttributesEnum.EndUserDesc.index();
    public static final int ORDERQTY = AttributesEnum.OrderQty.index();
    public static final int FIT = AttributesEnum.Fit.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int PERCENT = AttributesEnum.Percent.index();

    /**
     * This is the default constructor (do not remove).
     */
    public BomBpoLinesAllVoImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.views.BomBpoLinesAllVo");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for BomId, using the alias name BomId.
     * @return the BomId
     */
    public Number getBomId() {
        return (Number)getAttributeInternal(BOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BomId.
     * @param value value to set the BomId
     */
    public void setBomId(Number value) {
        setAttributeInternal(BOMID, value);
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for BpoNo, using the alias name BpoNo.
     * @return the BpoNo
     */
    public String getBpoNo() {
        return (String)getAttributeInternal(BPONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoNo.
     * @param value value to set the BpoNo
     */
    public void setBpoNo(String value) {
        setAttributeInternal(BPONO, value);
    }

    /**
     * Gets the attribute value for SaleOrderId, using the alias name SaleOrderId.
     * @return the SaleOrderId
     */
    public Number getSaleOrderId() {
        return (Number)getAttributeInternal(SALEORDERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SaleOrderId.
     * @param value value to set the SaleOrderId
     */
    public void setSaleOrderId(Number value) {
        setAttributeInternal(SALEORDERID, value);
    }

    /**
     * Gets the attribute value for SealeNo, using the alias name SealeNo.
     * @return the SealeNo
     */
    public String getSealeNo() {
        return (String)getAttributeInternal(SEALENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SealeNo.
     * @param value value to set the SealeNo
     */
    public void setSealeNo(String value) {
        setAttributeInternal(SEALENO, value);
    }

    /**
     * Gets the attribute value for Brand, using the alias name Brand.
     * @return the Brand
     */
    public String getBrand() {
        return (String)getAttributeInternal(BRAND);
    }

    /**
     * Sets <code>value</code> as the attribute value for Brand.
     * @param value value to set the Brand
     */
    public void setBrand(String value) {
        setAttributeInternal(BRAND, value);
    }

    /**
     * Gets the attribute value for StyleNo, using the alias name StyleNo.
     * @return the StyleNo
     */
    public String getStyleNo() {
        return (String)getAttributeInternal(STYLENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for StyleNo.
     * @param value value to set the StyleNo
     */
    public void setStyleNo(String value) {
        setAttributeInternal(STYLENO, value);
    }

    /**
     * Gets the attribute value for UserItemDesc, using the alias name UserItemDesc.
     * @return the UserItemDesc
     */
    public String getUserItemDesc() {
        return (String)getAttributeInternal(USERITEMDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserItemDesc.
     * @param value value to set the UserItemDesc
     */
    public void setUserItemDesc(String value) {
        setAttributeInternal(USERITEMDESC, value);
    }

    /**
     * Gets the attribute value for EndUserDesc, using the alias name EndUserDesc.
     * @return the EndUserDesc
     */
    public String getEndUserDesc() {
        return (String)getAttributeInternal(ENDUSERDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndUserDesc.
     * @param value value to set the EndUserDesc
     */
    public void setEndUserDesc(String value) {
        setAttributeInternal(ENDUSERDESC, value);
    }

    /**
     * Gets the attribute value for OrderQty, using the alias name OrderQty.
     * @return the OrderQty
     */
    public Number getOrderQty() {
        return (Number)getAttributeInternal(ORDERQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderQty.
     * @param value value to set the OrderQty
     */
    public void setOrderQty(Number value) {
        setAttributeInternal(ORDERQTY, value);
    }

    /**
     * Gets the attribute value for Fit, using the alias name Fit.
     * @return the Fit
     */
    public String getFit() {
        return (String)getAttributeInternal(FIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fit.
     * @param value value to set the Fit
     */
    public void setFit(String value) {
        setAttributeInternal(FIT, value);
    }

    /**
     * Gets the attribute value for Season, using the alias name Season.
     * @return the Season
     */
    public String getSeason() {
        return (String)getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for Season.
     * @param value value to set the Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for Percent, using the alias name Percent.
     * @return the Percent
     */
    public Number getPercent() {
        return (Number)getAttributeInternal(PERCENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Percent.
     * @param value value to set the Percent
     */
    public void setPercent(Number value) {
        setAttributeInternal(PERCENT, value);
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
     * @param lineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number lineId) {
        return new Key(new Object[]{lineId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_BOM_BPO_LINES_ALL_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setLineId(sVal);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }
}
