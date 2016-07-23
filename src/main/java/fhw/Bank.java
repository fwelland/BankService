package fhw;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "BNK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bank.findAll", query = "SELECT b FROM Bank b"),
    @NamedQuery(name = "Bank.findByBnkId", query = "SELECT b FROM Bank b WHERE b.bnkId = :bnkId"),
    @NamedQuery(name = "Bank.findByBnkNm", query = "SELECT b FROM Bank b WHERE b.bnkNm = :bnkNm"),
    @NamedQuery(name = "Bank.findByBnkAbaNum", query = "SELECT b FROM Bank b WHERE b.bnkAbaNum = :bnkAbaNum"),
    @NamedQuery(name = "Bank.findByBnkEin", query = "SELECT b FROM Bank b WHERE b.bnkEin = :bnkEin"),
    @NamedQuery(name = "Bank.findByInstOpAcctNum", query = "SELECT b FROM Bank b WHERE b.instOpAcctNum = :instOpAcctNum"),
    @NamedQuery(name = "Bank.findByStmtTelNum", query = "SELECT b FROM Bank b WHERE b.stmtTelNum = :stmtTelNum"),
    @NamedQuery(name = "Bank.findByStmtUrl", query = "SELECT b FROM Bank b WHERE b.stmtUrl = :stmtUrl"),
    @NamedQuery(name = "Bank.findByStmtEmail", query = "SELECT b FROM Bank b WHERE b.stmtEmail = :stmtEmail"),
    @NamedQuery(name = "Bank.findByTrmInd", query = "SELECT b FROM Bank b WHERE b.trmInd = :trmInd"),
    @NamedQuery(name = "Bank.findByAssetClsCd", query = "SELECT b FROM Bank b WHERE b.assetClsCd = :assetClsCd"),
    @NamedQuery(name = "Bank.findByInstitutionId", query = "SELECT b FROM Bank b WHERE b.institutionId = :institutionId"),
    @NamedQuery(name = "Bank.findByChipsMbrNum", query = "SELECT b FROM Bank b WHERE b.chipsMbrNum = :chipsMbrNum"),
    @NamedQuery(name = "Bank.findByBnkLctnId", query = "SELECT b FROM Bank b WHERE b.bnkLctnId = :bnkLctnId"),
    @NamedQuery(name = "Bank.findByChipsUid", query = "SELECT b FROM Bank b WHERE b.chipsUid = :chipsUid"),
    @NamedQuery(name = "Bank.findByCrtDt", query = "SELECT b FROM Bank b WHERE b.crtDt = :crtDt"),
    @NamedQuery(name = "Bank.findByUpdDt", query = "SELECT b FROM Bank b WHERE b.updDt = :updDt"),
    @NamedQuery(name = "Bank.findByModUsrId", query = "SELECT b FROM Bank b WHERE b.modUsrId = :modUsrId"),
    @NamedQuery(name = "Bank.findByProcFlg", query = "SELECT b FROM Bank b WHERE b.procFlg = :procFlg"),
    @NamedQuery(name = "Bank.findByFeeClassId", query = "SELECT b FROM Bank b WHERE b.feeClassId = :feeClassId"),
    @NamedQuery(name = "Bank.findByCsrId", query = "SELECT b FROM Bank b WHERE b.csrId = :csrId"),
    @NamedQuery(name = "Bank.findByCreditRtId", query = "SELECT b FROM Bank b WHERE b.creditRtId = :creditRtId"),
    @NamedQuery(name = "Bank.findByCharterTypId", query = "SELECT b FROM Bank b WHERE b.charterTypId = :charterTypId"),
    @NamedQuery(name = "Bank.findByPymtMthdTyp", query = "SELECT b FROM Bank b WHERE b.pymtMthdTyp = :pymtMthdTyp"),
    @NamedQuery(name = "Bank.findByBnkStat", query = "SELECT b FROM Bank b WHERE b.bnkStat = :bnkStat"),
    @NamedQuery(name = "Bank.findByNtwkInstTypId", query = "SELECT b FROM Bank b WHERE b.ntwkInstTypId = :ntwkInstTypId"),
    @NamedQuery(name = "Bank.findByBnk1099Typ", query = "SELECT b FROM Bank b WHERE b.bnk1099Typ = :bnk1099Typ"),
    @NamedQuery(name = "Bank.findByLmtTypId", query = "SELECT b FROM Bank b WHERE b.lmtTypId = :lmtTypId"),
    @NamedQuery(name = "Bank.findByCaSuspendInd", query = "SELECT b FROM Bank b WHERE b.caSuspendInd = :caSuspendInd"),
    @NamedQuery(name = "Bank.findByBatchConfAppr", query = "SELECT b FROM Bank b WHERE b.batchConfAppr = :batchConfAppr"),
    @NamedQuery(name = "Bank.findByFdicCertNum", query = "SELECT b FROM Bank b WHERE b.fdicCertNum = :fdicCertNum"),
    @NamedQuery(name = "Bank.findByPinBnkStat", query = "SELECT b FROM Bank b WHERE b.pinBnkStat = :pinBnkStat"),
    @NamedQuery(name = "Bank.findByCallRptTyp", query = "SELECT b FROM Bank b WHERE b.callRptTyp = :callRptTyp"),
    @NamedQuery(name = "Bank.findByFeeClassExceptionExpDt", query = "SELECT b FROM Bank b WHERE b.feeClassExceptionExpDt = :feeClassExceptionExpDt"),
    @NamedQuery(name = "Bank.findByFeeClassModUsrId", query = "SELECT b FROM Bank b WHERE b.feeClassModUsrId = :feeClassModUsrId"),
    @NamedQuery(name = "Bank.findByFeeClassExceptionReasonId", query = "SELECT b FROM Bank b WHERE b.feeClassExceptionReasonId = :feeClassExceptionReasonId")})
public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BNK_ID")
    private Integer bnkId;
    @Size(max = 40)
    @Column(name = "BNK_NM")
    private String bnkNm;
    @Size(max = 9)
    @Column(name = "BNK_ABA_NUM")
    private String bnkAbaNum;
    @Size(max = 9)
    @Column(name = "BNK_EIN")
    private String bnkEin;
    @Size(max = 10)
    @Column(name = "INST_OP_ACCT_NUM")
    private String instOpAcctNum;
    @Size(max = 20)
    @Column(name = "STMT_TEL_NUM")
    private String stmtTelNum;
    @Size(max = 80)
    @Column(name = "STMT_URL")
    private String stmtUrl;
    @Size(max = 50)
    @Column(name = "STMT_EMAIL")
    private String stmtEmail;
    @Column(name = "TRM_IND")
    private Character trmInd;
    @Column(name = "ASSET_CLS_CD")
    private Character assetClsCd;
    @Column(name = "INSTITUTION_ID")
    private Character institutionId;
    @Size(max = 4)
    @Column(name = "CHIPS_MBR_NUM")
    private String chipsMbrNum;
    @Column(name = "BNK_LCTN_ID")
    private Short bnkLctnId;
    @Size(max = 6)
    @Column(name = "CHIPS_UID")
    private String chipsUid;
    @Column(name = "CRT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtDt;
    @Column(name = "UPD_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updDt;
    @Size(max = 50)
    @Column(name = "MOD_USR_ID")
    private String modUsrId;
    @Column(name = "PROC_FLG")
    private Character procFlg;
    @Column(name = "FEE_CLASS_ID")
    private Short feeClassId;
    @Size(max = 3)
    @Column(name = "CSR_ID")
    private String csrId;
    @Column(name = "CREDIT_RT_ID")
    private Character creditRtId;
    @Column(name = "CHARTER_TYP_ID")
    private Character charterTypId;
    @Column(name = "PYMT_MTHD_TYP")
    private Character pymtMthdTyp;
    @Column(name = "BNK_STAT")
    private Character bnkStat;
    @Column(name = "NTWK_INST_TYP_ID")
    private Short ntwkInstTypId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BNK_1099_TYP")
    private Character bnk1099Typ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LMT_TYP_ID")
    private short lmtTypId;
    @Column(name = "CA_SUSPEND_IND")
    @Temporal(TemporalType.TIMESTAMP)
    private Date caSuspendInd;
    @Column(name = "BATCH_CONF_APPR")
    private Character batchConfAppr;
    @Column(name = "FDIC_CERT_NUM")
    private BigInteger fdicCertNum;
    @Column(name = "PIN_BNK_STAT")
    private Character pinBnkStat;
    @Size(max = 4)
    @Column(name = "CALL_RPT_TYP")
    private String callRptTyp;
    @Column(name = "FEE_CLASS_EXCEPTION_EXP_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feeClassExceptionExpDt;
    @Size(max = 50)
    @Column(name = "FEE_CLASS_MOD_USR_ID")
    private String feeClassModUsrId;
    @Column(name = "FEE_CLASS_EXCEPTION_REASON_ID")
    private Short feeClassExceptionReasonId;

    public Bank() {
    }

    public Bank(Integer bnkId) {
        this.bnkId = bnkId;
    }

    public Bank(Integer bnkId, Character bnk1099Typ, short lmtTypId) {
        this.bnkId = bnkId;
        this.bnk1099Typ = bnk1099Typ;
        this.lmtTypId = lmtTypId;
    }

    public Integer getBnkId() {
        return bnkId;
    }

    public void setBnkId(Integer bnkId) {
        this.bnkId = bnkId;
    }

    public String getBnkNm() {
        return bnkNm;
    }

    public void setBnkNm(String bnkNm) {
        this.bnkNm = bnkNm;
    }

    public String getBnkAbaNum() {
        return bnkAbaNum;
    }

    public void setBnkAbaNum(String bnkAbaNum) {
        this.bnkAbaNum = bnkAbaNum;
    }

    public String getBnkEin() {
        return bnkEin;
    }

    public void setBnkEin(String bnkEin) {
        this.bnkEin = bnkEin;
    }

    public String getInstOpAcctNum() {
        return instOpAcctNum;
    }

    public void setInstOpAcctNum(String instOpAcctNum) {
        this.instOpAcctNum = instOpAcctNum;
    }

    public String getStmtTelNum() {
        return stmtTelNum;
    }

    public void setStmtTelNum(String stmtTelNum) {
        this.stmtTelNum = stmtTelNum;
    }

    public String getStmtUrl() {
        return stmtUrl;
    }

    public void setStmtUrl(String stmtUrl) {
        this.stmtUrl = stmtUrl;
    }

    public String getStmtEmail() {
        return stmtEmail;
    }

    public void setStmtEmail(String stmtEmail) {
        this.stmtEmail = stmtEmail;
    }

    public Character getTrmInd() {
        return trmInd;
    }

    public void setTrmInd(Character trmInd) {
        this.trmInd = trmInd;
    }

    public Character getAssetClsCd() {
        return assetClsCd;
    }

    public void setAssetClsCd(Character assetClsCd) {
        this.assetClsCd = assetClsCd;
    }

    public Character getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Character institutionId) {
        this.institutionId = institutionId;
    }

    public String getChipsMbrNum() {
        return chipsMbrNum;
    }

    public void setChipsMbrNum(String chipsMbrNum) {
        this.chipsMbrNum = chipsMbrNum;
    }

    public Short getBnkLctnId() {
        return bnkLctnId;
    }

    public void setBnkLctnId(Short bnkLctnId) {
        this.bnkLctnId = bnkLctnId;
    }

    public String getChipsUid() {
        return chipsUid;
    }

    public void setChipsUid(String chipsUid) {
        this.chipsUid = chipsUid;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Date getUpdDt() {
        return updDt;
    }

    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    public String getModUsrId() {
        return modUsrId;
    }

    public void setModUsrId(String modUsrId) {
        this.modUsrId = modUsrId;
    }

    public Character getProcFlg() {
        return procFlg;
    }

    public void setProcFlg(Character procFlg) {
        this.procFlg = procFlg;
    }

    public Short getFeeClassId() {
        return feeClassId;
    }

    public void setFeeClassId(Short feeClassId) {
        this.feeClassId = feeClassId;
    }

    public String getCsrId() {
        return csrId;
    }

    public void setCsrId(String csrId) {
        this.csrId = csrId;
    }

    public Character getCreditRtId() {
        return creditRtId;
    }

    public void setCreditRtId(Character creditRtId) {
        this.creditRtId = creditRtId;
    }

    public Character getCharterTypId() {
        return charterTypId;
    }

    public void setCharterTypId(Character charterTypId) {
        this.charterTypId = charterTypId;
    }

    public Character getPymtMthdTyp() {
        return pymtMthdTyp;
    }

    public void setPymtMthdTyp(Character pymtMthdTyp) {
        this.pymtMthdTyp = pymtMthdTyp;
    }

    public Character getBnkStat() {
        return bnkStat;
    }

    public void setBnkStat(Character bnkStat) {
        this.bnkStat = bnkStat;
    }

    public Short getNtwkInstTypId() {
        return ntwkInstTypId;
    }

    public void setNtwkInstTypId(Short ntwkInstTypId) {
        this.ntwkInstTypId = ntwkInstTypId;
    }

    public Character getBnk1099Typ() {
        return bnk1099Typ;
    }

    public void setBnk1099Typ(Character bnk1099Typ) {
        this.bnk1099Typ = bnk1099Typ;
    }

    public short getLmtTypId() {
        return lmtTypId;
    }

    public void setLmtTypId(short lmtTypId) {
        this.lmtTypId = lmtTypId;
    }

    public Date getCaSuspendInd() {
        return caSuspendInd;
    }

    public void setCaSuspendInd(Date caSuspendInd) {
        this.caSuspendInd = caSuspendInd;
    }

    public Character getBatchConfAppr() {
        return batchConfAppr;
    }

    public void setBatchConfAppr(Character batchConfAppr) {
        this.batchConfAppr = batchConfAppr;
    }

    public BigInteger getFdicCertNum() {
        return fdicCertNum;
    }

    public void setFdicCertNum(BigInteger fdicCertNum) {
        this.fdicCertNum = fdicCertNum;
    }

    public Character getPinBnkStat() {
        return pinBnkStat;
    }

    public void setPinBnkStat(Character pinBnkStat) {
        this.pinBnkStat = pinBnkStat;
    }

    public String getCallRptTyp() {
        return callRptTyp;
    }

    public void setCallRptTyp(String callRptTyp) {
        this.callRptTyp = callRptTyp;
    }

    public Date getFeeClassExceptionExpDt() {
        return feeClassExceptionExpDt;
    }

    public void setFeeClassExceptionExpDt(Date feeClassExceptionExpDt) {
        this.feeClassExceptionExpDt = feeClassExceptionExpDt;
    }

    public String getFeeClassModUsrId() {
        return feeClassModUsrId;
    }

    public void setFeeClassModUsrId(String feeClassModUsrId) {
        this.feeClassModUsrId = feeClassModUsrId;
    }

    public Short getFeeClassExceptionReasonId() {
        return feeClassExceptionReasonId;
    }

    public void setFeeClassExceptionReasonId(Short feeClassExceptionReasonId) {
        this.feeClassExceptionReasonId = feeClassExceptionReasonId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bnkId != null ? bnkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bank)) {
            return false;
        }
        Bank other = (Bank) object;
        if ((this.bnkId == null && other.bnkId != null) || (this.bnkId != null && !this.bnkId.equals(other.bnkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fhw.Bank[ bnkId=" + bnkId + " ]";
    }
    
}
