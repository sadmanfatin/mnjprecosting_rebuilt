package mnj.mfg.model.services.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 23 17:25:42 BDT 2015
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {

    String copyRecords(String type, String headerId, String lineId);

    String createItems(String headerId);

    double getCostProdPerLine(String name, String projectionNo);

    String createOrder(String headerId);

    String updateOrder(String headerId);

    void ApproveNForward(String headerId);

    void Approve(String headerId);

    Row createLines();

    void CopyPrecost(String type);

    void MakeLinesClone();

    void setSessionValues(String userId, String orgId, String respId,
                          String respApplId);

    void refreshProdCostLineWise(String unitName);

    double getPOCFinCost(String type);

    double getProdCostUnitWise(String unitName);

    void createBPODetailRow();

    String createOrderLines(String headerId, String lineId);


    String createTBAOrder(String headerId);

    String UpdateBPO(String headerId);

    String CancelBPO(String headerId);

    double getBPOQty_Tot();

    void UploadBPO_Block();

    void CopyAllPrecost(String type);

    void ClearTempUploadBlock();

    void CopyItemsDetail();

    void StyleTracking();
}
