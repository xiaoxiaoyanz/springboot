package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * adtf_ministry_bill
 * @author 
 */
@Data
public class AdtfMinistryBill implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 单据编号
     */
    private String code;

    /**
     * 单据类型
     */
    private String type;

    /**
     * 区划
     */
    private String rgCode;

    /**
     * 年度
     */
    private String setYear;

    /**
     * 单位ID
     */
    private String orgId;

    /**
     * 单位编码
     */
    private String orgCode;

    /**
     * 单位名称
     */
    private String orgName;

    /**
     * 流程状 -2初始状态 -1草稿 0待送审 1流程中 2完成
     */
    private String status;

    /**
     * 生效状态 0未生效 1已生效
     */
    private String isEffect;

    /**
     * 单位类型编码
     */
    private String orgTypeCode;

    /**
     * 单位类型名称
     */
    private String orgTypeName;

    /**
     * 中央文号编码
     */
    private String centralDocNoCode;

    /**
     * 中央文号
     */
    private String centralDocNoName;

    /**
     * 文件标题
     */
    private String docTitle;

    /**
     * 拨付方式编码
     */
    private String appropriateTypeCode;

    /**
     * 拨付方式名称
     */
    private String appropriateTypeName;

    /**
     * 主题词
     */
    private String docThemeWord;

    /**
     * 中央下达金额
     */
    private BigDecimal releaseAmount;

    /**
     * 发文日期
     */
    private Date releaseDocDate;

    /**
     * 发文单位编码
     */
    private String releaseDocOrgCode;

    /**
     * 发文单位名称
     */
    private String releaseDocOrgName;

    /**
     * 内容简介
     */
    private String docContentIntroduction;

    /**
     * 审核人员ID
     */
    private String auditorId;

    /**
     * 审核人员名称
     */
    private String auditor;

    /**
     * 审核时间
     */
    private Date auditortime;

    /**
     * 制单人ID
     */
    private String creatorId;

    /**
     * 编制人
     */
    private String creator;

    /**
     * 制单日期
     */
    private Date creationtime;

    /**
     * 最后修改人ID
     */
    private String modifierId;

    /**
     * 最后修改人
     */
    private String modifier;

    /**
     * 最后修改时间
     */
    private Date modifiedtime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 系统类型：adtf全国转移支付，gui贵州转移支付
     */
    private String sysType;

    /**
     * 公密号编码
     */
    private String publicNoCode;

    /**
     * 公密号
     */
    private String publicNoName;

    /**
     * 经费年度
     */
    private Integer fundsYear;

    /**
     * 本次下达金额
     */
    private BigDecimal releasethisAmount;

    /**
     * 中央已下达金额
     */
    private BigDecimal releasedAmount;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdtfMinistryBill other = (AdtfMinistryBill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRgCode() == null ? other.getRgCode() == null : this.getRgCode().equals(other.getRgCode()))
            && (this.getSetYear() == null ? other.getSetYear() == null : this.getSetYear().equals(other.getSetYear()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsEffect() == null ? other.getIsEffect() == null : this.getIsEffect().equals(other.getIsEffect()))
            && (this.getOrgTypeCode() == null ? other.getOrgTypeCode() == null : this.getOrgTypeCode().equals(other.getOrgTypeCode()))
            && (this.getOrgTypeName() == null ? other.getOrgTypeName() == null : this.getOrgTypeName().equals(other.getOrgTypeName()))
            && (this.getCentralDocNoCode() == null ? other.getCentralDocNoCode() == null : this.getCentralDocNoCode().equals(other.getCentralDocNoCode()))
            && (this.getCentralDocNoName() == null ? other.getCentralDocNoName() == null : this.getCentralDocNoName().equals(other.getCentralDocNoName()))
            && (this.getDocTitle() == null ? other.getDocTitle() == null : this.getDocTitle().equals(other.getDocTitle()))
            && (this.getAppropriateTypeCode() == null ? other.getAppropriateTypeCode() == null : this.getAppropriateTypeCode().equals(other.getAppropriateTypeCode()))
            && (this.getAppropriateTypeName() == null ? other.getAppropriateTypeName() == null : this.getAppropriateTypeName().equals(other.getAppropriateTypeName()))
            && (this.getDocThemeWord() == null ? other.getDocThemeWord() == null : this.getDocThemeWord().equals(other.getDocThemeWord()))
            && (this.getReleaseAmount() == null ? other.getReleaseAmount() == null : this.getReleaseAmount().equals(other.getReleaseAmount()))
            && (this.getReleaseDocDate() == null ? other.getReleaseDocDate() == null : this.getReleaseDocDate().equals(other.getReleaseDocDate()))
            && (this.getReleaseDocOrgCode() == null ? other.getReleaseDocOrgCode() == null : this.getReleaseDocOrgCode().equals(other.getReleaseDocOrgCode()))
            && (this.getReleaseDocOrgName() == null ? other.getReleaseDocOrgName() == null : this.getReleaseDocOrgName().equals(other.getReleaseDocOrgName()))
            && (this.getDocContentIntroduction() == null ? other.getDocContentIntroduction() == null : this.getDocContentIntroduction().equals(other.getDocContentIntroduction()))
            && (this.getAuditorId() == null ? other.getAuditorId() == null : this.getAuditorId().equals(other.getAuditorId()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditortime() == null ? other.getAuditortime() == null : this.getAuditortime().equals(other.getAuditortime()))
            && (this.getCreatorId() == null ? other.getCreatorId() == null : this.getCreatorId().equals(other.getCreatorId()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
            && (this.getModifierId() == null ? other.getModifierId() == null : this.getModifierId().equals(other.getModifierId()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifiedtime() == null ? other.getModifiedtime() == null : this.getModifiedtime().equals(other.getModifiedtime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSysType() == null ? other.getSysType() == null : this.getSysType().equals(other.getSysType()))
            && (this.getPublicNoCode() == null ? other.getPublicNoCode() == null : this.getPublicNoCode().equals(other.getPublicNoCode()))
            && (this.getPublicNoName() == null ? other.getPublicNoName() == null : this.getPublicNoName().equals(other.getPublicNoName()))
            && (this.getFundsYear() == null ? other.getFundsYear() == null : this.getFundsYear().equals(other.getFundsYear()))
            && (this.getReleasethisAmount() == null ? other.getReleasethisAmount() == null : this.getReleasethisAmount().equals(other.getReleasethisAmount()))
            && (this.getReleasedAmount() == null ? other.getReleasedAmount() == null : this.getReleasedAmount().equals(other.getReleasedAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRgCode() == null) ? 0 : getRgCode().hashCode());
        result = prime * result + ((getSetYear() == null) ? 0 : getSetYear().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsEffect() == null) ? 0 : getIsEffect().hashCode());
        result = prime * result + ((getOrgTypeCode() == null) ? 0 : getOrgTypeCode().hashCode());
        result = prime * result + ((getOrgTypeName() == null) ? 0 : getOrgTypeName().hashCode());
        result = prime * result + ((getCentralDocNoCode() == null) ? 0 : getCentralDocNoCode().hashCode());
        result = prime * result + ((getCentralDocNoName() == null) ? 0 : getCentralDocNoName().hashCode());
        result = prime * result + ((getDocTitle() == null) ? 0 : getDocTitle().hashCode());
        result = prime * result + ((getAppropriateTypeCode() == null) ? 0 : getAppropriateTypeCode().hashCode());
        result = prime * result + ((getAppropriateTypeName() == null) ? 0 : getAppropriateTypeName().hashCode());
        result = prime * result + ((getDocThemeWord() == null) ? 0 : getDocThemeWord().hashCode());
        result = prime * result + ((getReleaseAmount() == null) ? 0 : getReleaseAmount().hashCode());
        result = prime * result + ((getReleaseDocDate() == null) ? 0 : getReleaseDocDate().hashCode());
        result = prime * result + ((getReleaseDocOrgCode() == null) ? 0 : getReleaseDocOrgCode().hashCode());
        result = prime * result + ((getReleaseDocOrgName() == null) ? 0 : getReleaseDocOrgName().hashCode());
        result = prime * result + ((getDocContentIntroduction() == null) ? 0 : getDocContentIntroduction().hashCode());
        result = prime * result + ((getAuditorId() == null) ? 0 : getAuditorId().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditortime() == null) ? 0 : getAuditortime().hashCode());
        result = prime * result + ((getCreatorId() == null) ? 0 : getCreatorId().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getModifierId() == null) ? 0 : getModifierId().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifiedtime() == null) ? 0 : getModifiedtime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSysType() == null) ? 0 : getSysType().hashCode());
        result = prime * result + ((getPublicNoCode() == null) ? 0 : getPublicNoCode().hashCode());
        result = prime * result + ((getPublicNoName() == null) ? 0 : getPublicNoName().hashCode());
        result = prime * result + ((getFundsYear() == null) ? 0 : getFundsYear().hashCode());
        result = prime * result + ((getReleasethisAmount() == null) ? 0 : getReleasethisAmount().hashCode());
        result = prime * result + ((getReleasedAmount() == null) ? 0 : getReleasedAmount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", code=").append(code);
        sb.append(", type=").append(type);
        sb.append(", rgCode=").append(rgCode);
        sb.append(", setYear=").append(setYear);
        sb.append(", orgId=").append(orgId);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", orgName=").append(orgName);
        sb.append(", status=").append(status);
        sb.append(", isEffect=").append(isEffect);
        sb.append(", orgTypeCode=").append(orgTypeCode);
        sb.append(", orgTypeName=").append(orgTypeName);
        sb.append(", centralDocNoCode=").append(centralDocNoCode);
        sb.append(", centralDocNoName=").append(centralDocNoName);
        sb.append(", docTitle=").append(docTitle);
        sb.append(", appropriateTypeCode=").append(appropriateTypeCode);
        sb.append(", appropriateTypeName=").append(appropriateTypeName);
        sb.append(", docThemeWord=").append(docThemeWord);
        sb.append(", releaseAmount=").append(releaseAmount);
        sb.append(", releaseDocDate=").append(releaseDocDate);
        sb.append(", releaseDocOrgCode=").append(releaseDocOrgCode);
        sb.append(", releaseDocOrgName=").append(releaseDocOrgName);
        sb.append(", docContentIntroduction=").append(docContentIntroduction);
        sb.append(", auditorId=").append(auditorId);
        sb.append(", auditor=").append(auditor);
        sb.append(", auditortime=").append(auditortime);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", creator=").append(creator);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", modifierId=").append(modifierId);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifiedtime=").append(modifiedtime);
        sb.append(", remark=").append(remark);
        sb.append(", sysType=").append(sysType);
        sb.append(", publicNoCode=").append(publicNoCode);
        sb.append(", publicNoName=").append(publicNoName);
        sb.append(", fundsYear=").append(fundsYear);
        sb.append(", releasethisAmount=").append(releasethisAmount);
        sb.append(", releasedAmount=").append(releasedAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}