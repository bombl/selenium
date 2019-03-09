package com.example.selenium.model;

import java.util.Date;

public class CashApplicationInfo {
    /**
     *
     */
    private Long id;

    /**
     *流程号
     */
    private String serialNo;

    /**
     *姓名
     */
    private String name;

    /**
     *身份证号码
     */
    private String idcardNo;

    /**
     *手机
     */
    private String mobile;

    /**
     *银行全称
     */
    private String bankName;

    /**
     *
     */
    private String bankcardNo;

    /**
     *用户id
     */
    private String userId;

    /**
     *紧急联系人姓名
     */
    private String firstContractName;

    /**
     *紧急联系人电话
     */
    private String firstContractPhone;

    /**
     *紧急联系人关系
     */
    private String firstContractRela;

    /**
     *第二紧急联系人姓名
     */
    private String secondContractName;

    /**
     *第二紧急联系人电话
     */
    private String secondContractPhone;

    /**
     *第二紧急联系人关系
     */
    private String secondContractRela;

    /**
     *申请合同来源,默认值空，线上现金贷-'OCL'，工友贷-'WML'，车交叉现金贷-'XSELL-CAR' ，3C交叉现金贷-'XSELL-MALLCASH'
     */
    private String source;

    /**
     *首次授信额度
     */
    private Double firstCreditAmount;

    /**
     *首次授信期数
     */
    private Integer firstCreditTerm;

    /**
     *首次授信时间
     */
    private Date creditDate;

    /**
     *上次授信额度
     */
    private Double lastCreditAmount;

    /**
     *上次授信期数
     */
    private Integer lastCreditTerm;

    /**
     *上次授信时间
     */
    private Date lastCreditDate;

    /**
     *上次调高额度时间
     */
    private Date lastPromoteCreditamountDate;

    /**
     *上次降低额度时间
     */
    private Date lastReduceCreditamountDate;

    /**
     *可用额度
     */
    private Double creditAvailable;

    /**
     *贷款金额（提现额度）
     */
    private Double cashAmount;

    /**
     *贷款期数（提现）
     */
    private Integer cashTerm;

    /**
     *每期还款金额（提现）
     */
    private Double phaseAmount;

    /**
     *额度激活时间
     */
    private Date activationDate;

    /**
     *首次取现时间
     */
    private Date firstEncashmentDate;

    /**
     *上次取现时间
     */
    private Date lastEncashmentDate;

    /**
     *上次取现状态
     */
    private String lastEncashmentState;

    /**
     *上次拒绝原因码
     */
    private String lastRefuseCode;

    /**
     *上次取现金额
     */
    private Double lastEncashmentAmount;

    /**
     *上次还款时间
     */
    private Date lastRepaymentDate;

    /**
     *上次还款金额
     */
    private Double lastRepaymentAmount;

    /**
     *历史累计取现次数
     */
    private Integer historyAccumEncashmentCnt;

    /**
     *历史累计取现成功次数
     */
    private Integer historyAccumEncashmentSuccCnt;

    /**
     *历史累计取现金额
     */
    private Double historyAccumEncashmentAmount;

    /**
     *历史累计还款笔数
     */
    private Integer historyAccumRepaymentCnt;

    /**
     *历史累计还款金额
     */
    private Double historyAccumRepaymentAmount;

    /**
     *分期授信额度
     */
    private Double amtInstallmentCreditLimit;

    /**
     *每月还款金额上限
     */
    private Double amtMthlyRptLimit;

    /**
     *授信金额
     */
    private Double amtCreditLimit;

    /**
     *上次成功取现时间
     */
    private String lastSuccLoanDate;

    /**
     *上次成功取现金额
     */
    private Double lastSuccLoanAmount;

    /**
     *上次成功取现期数
     */
    private Integer lastSuccLoanTerm;

    /**
     *设备指纹
     */
    private String appDeviceId;

    /**
     *提现时的纬度
     */
    private String appLng;

    /**
     *提现时的纬度
     */
    private String appLat;

    /**
     *提现时的IP
     */
    private String appIp;

    /**
     *提现时GPS对应城市
     */
    private String appGpsCity;

    /**
     *提现时IP对应城市
     */
    private String appIpCity;

    /**
     *MAC地址
     */
    private String appMacAddr;

    /**
     *IMEI
     */
    private String appImei;

    /**
     *提现类型
     */
    private String withdrawCashType;

    /**
     *首次提现金额
     */
    private Double firstWithdrawCashAmount;

    /**
     *上一笔成功贷款到期日期
     */
    private Date lastLoanEndDate;

    /**
     *上一笔成功贷款状态
     */
    private String lastLoanStatus;

    /**
     *上一笔成功贷款结清日期
     */
    private Date lastLoanClearDate;

    /**
     *历史逾期笔数
     */
    private Integer historyOverdueCnt;

    /**
     *历史逾期大于等于10天笔数
     */
    private Integer historyOverdue10Cnt;

    /**
     *合同进件来源
     */
    private String contractChannel;

    /**
     *提现提交时间
     */
    private Date withdrawCashTime;

    /**
     *是否首次提现
     */
    private String isFirstWithdrawCash;

    /**
     *请求号
     */
    private String requestNo;

    /**
     *自定义需要回传的字段
     */
    private String state;

    /**
     *备注
     */
    private String remark;

    /**
     *
     */
    private Date createTime;

    /**
     *合同状态
     */
    private String relatedContractStatus;

    /**
     *合同贷款余额
     */
    private String relatedContractBalance;

    /**
     *账户类型
     */
    private String relatedAccountStatus;

    /**
     *当前总额度
     */
    private String relatedCurrentCreditLimit;

    /**
     *当前可用额度
     */
    private String relatedCurrentCreditAvailable;

    /**
     *当前已用额度
     */
    private String relatedCurrentCreditUsed;

    /**
     *当前冻结额度
     */
    private String relatedCurrentCreditFreeze;

    /**
     *上次授信拒绝原因码
     */
    private String histLastCreditRefuseRcode;

    /**
     *上次授信汇总原因码
     */
    private String histLastCreditMergeRcode;

    /**
     *openId
     */
    private String openId;

    /**
     *经销商门店编码
     */
    private String dealerCompanyCode;

    /**
     *经销商门店风险等级
     */
    private String dealerCompanyRiskLevel;

    /**
     *是否为二手车
     */
    private String isOld;

    /**
     *车类
     */
    private String isLcv;

    /**
     *申请人与紧急联系人关系
     */
    private String relationEContact;

    /**
     *外部用户ID
     */
    private String outUserId;

    /**
     *渠道编号
     */
    private String channelCode;

    /**
     *还款方式
     */
    private String repaymentMethod;

    /**
     *车贷申请日期
     */
    private String carAppTime;

    /**
     *车贷人行查询结果
     */
    private String carRhMsg;

    /**
     *客户来源
     */
    private String customerSource;

    /**
     *产品编码
     */
    private String skuCode;

    /**
     *上次成功授信时随机对照组标签
     */
    private String lastCreditTestFlag;

    /**
     *上次成功授信时风险分组
     */
    private String lastCreditRiskLevel;

    /**
     *银行预留手机号
     */
    private String extraMobile;

    /**
     *身份证有效期
     */
    private Date idcardDeadline;

    /**
     *签发机关
     */
    private String signOrg;

    /**
     *民族
     */
    private String idCardEthnicity;

    /**
     *户籍地址-省
     */
    private String domicileProvince;

    /**
     *户籍地址-市
     */
    private String domicileCity;

    /**
     *户籍地址-区
     */
    private String domicileArea;

    /**
     *户籍地址（详细地址）
     */
    private String domicileaddress;

    /**
     *授信时同盾分
     */
    private Integer tdFinalScoreWhenCredit;

    /**
     *授信时同盾近3个月多头个数
     */
    private Integer tdThreemApptimWhenCredit;

    /**
     *授信时最终风险分组
     */
    private String finalRiskLevelWhenCredit;

    /**
     *授信时是否命中KO对照组
     */
    private String ifTestgroupWhenCredit;

    /**
     *授信时聚信立评分--机器学习版
     */
    private Double scoreXgbEtlWhenCredit;

    /**
     *客户当前系统定价
     */
    private String historyCustomerPriceSummary;

    /**
     *客户取现来源
     */
    private String cashSource;

    /**
     *收货人姓名，只有MOP-融360渠道的客户会有
     */
    private String consignee;

    /**
     *收货人手机号，只有MOP-融360渠道的客户会有
     */
    private String consigneemobile;

    /**
     *收货地址，只有MOP-融360渠道的客户会有
     */
    private String consigneeaddress;

    /**
     *车贷放款渠道
     */
    private String disbursmentSource;

    /**
     *浦发是否入催
     */
    private Integer ifPufaCollection;

    /**
     *
     */
    public Long getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *流程号
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     *流程号
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     *姓名
     */
    public String getName() {
        return name;
    }

    /**
     *姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *身份证号码
     */
    public String getIdcardNo() {
        return idcardNo;
    }

    /**
     *身份证号码
     */
    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo == null ? null : idcardNo.trim();
    }

    /**
     *手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     *手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     *银行全称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     *银行全称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     *
     */
    public String getBankcardNo() {
        return bankcardNo;
    }

    /**
     *
     */
    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo == null ? null : bankcardNo.trim();
    }

    /**
     *用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     *用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     *紧急联系人姓名
     */
    public String getFirstContractName() {
        return firstContractName;
    }

    /**
     *紧急联系人姓名
     */
    public void setFirstContractName(String firstContractName) {
        this.firstContractName = firstContractName == null ? null : firstContractName.trim();
    }

    /**
     *紧急联系人电话
     */
    public String getFirstContractPhone() {
        return firstContractPhone;
    }

    /**
     *紧急联系人电话
     */
    public void setFirstContractPhone(String firstContractPhone) {
        this.firstContractPhone = firstContractPhone == null ? null : firstContractPhone.trim();
    }

    /**
     *紧急联系人关系
     */
    public String getFirstContractRela() {
        return firstContractRela;
    }

    /**
     *紧急联系人关系
     */
    public void setFirstContractRela(String firstContractRela) {
        this.firstContractRela = firstContractRela == null ? null : firstContractRela.trim();
    }

    /**
     *第二紧急联系人姓名
     */
    public String getSecondContractName() {
        return secondContractName;
    }

    /**
     *第二紧急联系人姓名
     */
    public void setSecondContractName(String secondContractName) {
        this.secondContractName = secondContractName == null ? null : secondContractName.trim();
    }

    /**
     *第二紧急联系人电话
     */
    public String getSecondContractPhone() {
        return secondContractPhone;
    }

    /**
     *第二紧急联系人电话
     */
    public void setSecondContractPhone(String secondContractPhone) {
        this.secondContractPhone = secondContractPhone == null ? null : secondContractPhone.trim();
    }

    /**
     *第二紧急联系人关系
     */
    public String getSecondContractRela() {
        return secondContractRela;
    }

    /**
     *第二紧急联系人关系
     */
    public void setSecondContractRela(String secondContractRela) {
        this.secondContractRela = secondContractRela == null ? null : secondContractRela.trim();
    }

    /**
     *申请合同来源,默认值空，线上现金贷-'OCL'，工友贷-'WML'，车交叉现金贷-'XSELL-CAR' ，3C交叉现金贷-'XSELL-MALLCASH'
     */
    public String getSource() {
        return source;
    }

    /**
     *申请合同来源,默认值空，线上现金贷-'OCL'，工友贷-'WML'，车交叉现金贷-'XSELL-CAR' ，3C交叉现金贷-'XSELL-MALLCASH'
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     *首次授信额度
     */
    public Double getFirstCreditAmount() {
        return firstCreditAmount;
    }

    /**
     *首次授信额度
     */
    public void setFirstCreditAmount(Double firstCreditAmount) {
        this.firstCreditAmount = firstCreditAmount;
    }

    /**
     *首次授信期数
     */
    public Integer getFirstCreditTerm() {
        return firstCreditTerm;
    }

    /**
     *首次授信期数
     */
    public void setFirstCreditTerm(Integer firstCreditTerm) {
        this.firstCreditTerm = firstCreditTerm;
    }

    /**
     *首次授信时间
     */
    public Date getCreditDate() {
        return creditDate;
    }

    /**
     *首次授信时间
     */
    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    /**
     *上次授信额度
     */
    public Double getLastCreditAmount() {
        return lastCreditAmount;
    }

    /**
     *上次授信额度
     */
    public void setLastCreditAmount(Double lastCreditAmount) {
        this.lastCreditAmount = lastCreditAmount;
    }

    /**
     *上次授信期数
     */
    public Integer getLastCreditTerm() {
        return lastCreditTerm;
    }

    /**
     *上次授信期数
     */
    public void setLastCreditTerm(Integer lastCreditTerm) {
        this.lastCreditTerm = lastCreditTerm;
    }

    /**
     *上次授信时间
     */
    public Date getLastCreditDate() {
        return lastCreditDate;
    }

    /**
     *上次授信时间
     */
    public void setLastCreditDate(Date lastCreditDate) {
        this.lastCreditDate = lastCreditDate;
    }

    /**
     *上次调高额度时间
     */
    public Date getLastPromoteCreditamountDate() {
        return lastPromoteCreditamountDate;
    }

    /**
     *上次调高额度时间
     */
    public void setLastPromoteCreditamountDate(Date lastPromoteCreditamountDate) {
        this.lastPromoteCreditamountDate = lastPromoteCreditamountDate;
    }

    /**
     *上次降低额度时间
     */
    public Date getLastReduceCreditamountDate() {
        return lastReduceCreditamountDate;
    }

    /**
     *上次降低额度时间
     */
    public void setLastReduceCreditamountDate(Date lastReduceCreditamountDate) {
        this.lastReduceCreditamountDate = lastReduceCreditamountDate;
    }

    /**
     *可用额度
     */
    public Double getCreditAvailable() {
        return creditAvailable;
    }

    /**
     *可用额度
     */
    public void setCreditAvailable(Double creditAvailable) {
        this.creditAvailable = creditAvailable;
    }

    /**
     *贷款金额（提现额度）
     */
    public Double getCashAmount() {
        return cashAmount;
    }

    /**
     *贷款金额（提现额度）
     */
    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    /**
     *贷款期数（提现）
     */
    public Integer getCashTerm() {
        return cashTerm;
    }

    /**
     *贷款期数（提现）
     */
    public void setCashTerm(Integer cashTerm) {
        this.cashTerm = cashTerm;
    }

    /**
     *每期还款金额（提现）
     */
    public Double getPhaseAmount() {
        return phaseAmount;
    }

    /**
     *每期还款金额（提现）
     */
    public void setPhaseAmount(Double phaseAmount) {
        this.phaseAmount = phaseAmount;
    }

    /**
     *额度激活时间
     */
    public Date getActivationDate() {
        return activationDate;
    }

    /**
     *额度激活时间
     */
    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    /**
     *首次取现时间
     */
    public Date getFirstEncashmentDate() {
        return firstEncashmentDate;
    }

    /**
     *首次取现时间
     */
    public void setFirstEncashmentDate(Date firstEncashmentDate) {
        this.firstEncashmentDate = firstEncashmentDate;
    }

    /**
     *上次取现时间
     */
    public Date getLastEncashmentDate() {
        return lastEncashmentDate;
    }

    /**
     *上次取现时间
     */
    public void setLastEncashmentDate(Date lastEncashmentDate) {
        this.lastEncashmentDate = lastEncashmentDate;
    }

    /**
     *上次取现状态
     */
    public String getLastEncashmentState() {
        return lastEncashmentState;
    }

    /**
     *上次取现状态
     */
    public void setLastEncashmentState(String lastEncashmentState) {
        this.lastEncashmentState = lastEncashmentState == null ? null : lastEncashmentState.trim();
    }

    /**
     *上次拒绝原因码
     */
    public String getLastRefuseCode() {
        return lastRefuseCode;
    }

    /**
     *上次拒绝原因码
     */
    public void setLastRefuseCode(String lastRefuseCode) {
        this.lastRefuseCode = lastRefuseCode == null ? null : lastRefuseCode.trim();
    }

    /**
     *上次取现金额
     */
    public Double getLastEncashmentAmount() {
        return lastEncashmentAmount;
    }

    /**
     *上次取现金额
     */
    public void setLastEncashmentAmount(Double lastEncashmentAmount) {
        this.lastEncashmentAmount = lastEncashmentAmount;
    }

    /**
     *上次还款时间
     */
    public Date getLastRepaymentDate() {
        return lastRepaymentDate;
    }

    /**
     *上次还款时间
     */
    public void setLastRepaymentDate(Date lastRepaymentDate) {
        this.lastRepaymentDate = lastRepaymentDate;
    }

    /**
     *上次还款金额
     */
    public Double getLastRepaymentAmount() {
        return lastRepaymentAmount;
    }

    /**
     *上次还款金额
     */
    public void setLastRepaymentAmount(Double lastRepaymentAmount) {
        this.lastRepaymentAmount = lastRepaymentAmount;
    }

    /**
     *历史累计取现次数
     */
    public Integer getHistoryAccumEncashmentCnt() {
        return historyAccumEncashmentCnt;
    }

    /**
     *历史累计取现次数
     */
    public void setHistoryAccumEncashmentCnt(Integer historyAccumEncashmentCnt) {
        this.historyAccumEncashmentCnt = historyAccumEncashmentCnt;
    }

    /**
     *历史累计取现成功次数
     */
    public Integer getHistoryAccumEncashmentSuccCnt() {
        return historyAccumEncashmentSuccCnt;
    }

    /**
     *历史累计取现成功次数
     */
    public void setHistoryAccumEncashmentSuccCnt(Integer historyAccumEncashmentSuccCnt) {
        this.historyAccumEncashmentSuccCnt = historyAccumEncashmentSuccCnt;
    }

    /**
     *历史累计取现金额
     */
    public Double getHistoryAccumEncashmentAmount() {
        return historyAccumEncashmentAmount;
    }

    /**
     *历史累计取现金额
     */
    public void setHistoryAccumEncashmentAmount(Double historyAccumEncashmentAmount) {
        this.historyAccumEncashmentAmount = historyAccumEncashmentAmount;
    }

    /**
     *历史累计还款笔数
     */
    public Integer getHistoryAccumRepaymentCnt() {
        return historyAccumRepaymentCnt;
    }

    /**
     *历史累计还款笔数
     */
    public void setHistoryAccumRepaymentCnt(Integer historyAccumRepaymentCnt) {
        this.historyAccumRepaymentCnt = historyAccumRepaymentCnt;
    }

    /**
     *历史累计还款金额
     */
    public Double getHistoryAccumRepaymentAmount() {
        return historyAccumRepaymentAmount;
    }

    /**
     *历史累计还款金额
     */
    public void setHistoryAccumRepaymentAmount(Double historyAccumRepaymentAmount) {
        this.historyAccumRepaymentAmount = historyAccumRepaymentAmount;
    }

    /**
     *分期授信额度
     */
    public Double getAmtInstallmentCreditLimit() {
        return amtInstallmentCreditLimit;
    }

    /**
     *分期授信额度
     */
    public void setAmtInstallmentCreditLimit(Double amtInstallmentCreditLimit) {
        this.amtInstallmentCreditLimit = amtInstallmentCreditLimit;
    }

    /**
     *每月还款金额上限
     */
    public Double getAmtMthlyRptLimit() {
        return amtMthlyRptLimit;
    }

    /**
     *每月还款金额上限
     */
    public void setAmtMthlyRptLimit(Double amtMthlyRptLimit) {
        this.amtMthlyRptLimit = amtMthlyRptLimit;
    }

    /**
     *授信金额
     */
    public Double getAmtCreditLimit() {
        return amtCreditLimit;
    }

    /**
     *授信金额
     */
    public void setAmtCreditLimit(Double amtCreditLimit) {
        this.amtCreditLimit = amtCreditLimit;
    }

    /**
     *上次成功取现时间
     */
    public String getLastSuccLoanDate() {
        return lastSuccLoanDate;
    }

    /**
     *上次成功取现时间
     */
    public void setLastSuccLoanDate(String lastSuccLoanDate) {
        this.lastSuccLoanDate = lastSuccLoanDate == null ? null : lastSuccLoanDate.trim();
    }

    /**
     *上次成功取现金额
     */
    public Double getLastSuccLoanAmount() {
        return lastSuccLoanAmount;
    }

    /**
     *上次成功取现金额
     */
    public void setLastSuccLoanAmount(Double lastSuccLoanAmount) {
        this.lastSuccLoanAmount = lastSuccLoanAmount;
    }

    /**
     *上次成功取现期数
     */
    public Integer getLastSuccLoanTerm() {
        return lastSuccLoanTerm;
    }

    /**
     *上次成功取现期数
     */
    public void setLastSuccLoanTerm(Integer lastSuccLoanTerm) {
        this.lastSuccLoanTerm = lastSuccLoanTerm;
    }

    /**
     *设备指纹
     */
    public String getAppDeviceId() {
        return appDeviceId;
    }

    /**
     *设备指纹
     */
    public void setAppDeviceId(String appDeviceId) {
        this.appDeviceId = appDeviceId == null ? null : appDeviceId.trim();
    }

    /**
     *提现时的纬度
     */
    public String getAppLng() {
        return appLng;
    }

    /**
     *提现时的纬度
     */
    public void setAppLng(String appLng) {
        this.appLng = appLng == null ? null : appLng.trim();
    }

    /**
     *提现时的纬度
     */
    public String getAppLat() {
        return appLat;
    }

    /**
     *提现时的纬度
     */
    public void setAppLat(String appLat) {
        this.appLat = appLat == null ? null : appLat.trim();
    }

    /**
     *提现时的IP
     */
    public String getAppIp() {
        return appIp;
    }

    /**
     *提现时的IP
     */
    public void setAppIp(String appIp) {
        this.appIp = appIp == null ? null : appIp.trim();
    }

    /**
     *提现时GPS对应城市
     */
    public String getAppGpsCity() {
        return appGpsCity;
    }

    /**
     *提现时GPS对应城市
     */
    public void setAppGpsCity(String appGpsCity) {
        this.appGpsCity = appGpsCity == null ? null : appGpsCity.trim();
    }

    /**
     *提现时IP对应城市
     */
    public String getAppIpCity() {
        return appIpCity;
    }

    /**
     *提现时IP对应城市
     */
    public void setAppIpCity(String appIpCity) {
        this.appIpCity = appIpCity == null ? null : appIpCity.trim();
    }

    /**
     *MAC地址
     */
    public String getAppMacAddr() {
        return appMacAddr;
    }

    /**
     *MAC地址
     */
    public void setAppMacAddr(String appMacAddr) {
        this.appMacAddr = appMacAddr == null ? null : appMacAddr.trim();
    }

    /**
     *IMEI
     */
    public String getAppImei() {
        return appImei;
    }

    /**
     *IMEI
     */
    public void setAppImei(String appImei) {
        this.appImei = appImei == null ? null : appImei.trim();
    }

    /**
     *提现类型
     */
    public String getWithdrawCashType() {
        return withdrawCashType;
    }

    /**
     *提现类型
     */
    public void setWithdrawCashType(String withdrawCashType) {
        this.withdrawCashType = withdrawCashType == null ? null : withdrawCashType.trim();
    }

    /**
     *首次提现金额
     */
    public Double getFirstWithdrawCashAmount() {
        return firstWithdrawCashAmount;
    }

    /**
     *首次提现金额
     */
    public void setFirstWithdrawCashAmount(Double firstWithdrawCashAmount) {
        this.firstWithdrawCashAmount = firstWithdrawCashAmount;
    }

    /**
     *上一笔成功贷款到期日期
     */
    public Date getLastLoanEndDate() {
        return lastLoanEndDate;
    }

    /**
     *上一笔成功贷款到期日期
     */
    public void setLastLoanEndDate(Date lastLoanEndDate) {
        this.lastLoanEndDate = lastLoanEndDate;
    }

    /**
     *上一笔成功贷款状态
     */
    public String getLastLoanStatus() {
        return lastLoanStatus;
    }

    /**
     *上一笔成功贷款状态
     */
    public void setLastLoanStatus(String lastLoanStatus) {
        this.lastLoanStatus = lastLoanStatus == null ? null : lastLoanStatus.trim();
    }

    /**
     *上一笔成功贷款结清日期
     */
    public Date getLastLoanClearDate() {
        return lastLoanClearDate;
    }

    /**
     *上一笔成功贷款结清日期
     */
    public void setLastLoanClearDate(Date lastLoanClearDate) {
        this.lastLoanClearDate = lastLoanClearDate;
    }

    /**
     *历史逾期笔数
     */
    public Integer getHistoryOverdueCnt() {
        return historyOverdueCnt;
    }

    /**
     *历史逾期笔数
     */
    public void setHistoryOverdueCnt(Integer historyOverdueCnt) {
        this.historyOverdueCnt = historyOverdueCnt;
    }

    /**
     *历史逾期大于等于10天笔数
     */
    public Integer getHistoryOverdue10Cnt() {
        return historyOverdue10Cnt;
    }

    /**
     *历史逾期大于等于10天笔数
     */
    public void setHistoryOverdue10Cnt(Integer historyOverdue10Cnt) {
        this.historyOverdue10Cnt = historyOverdue10Cnt;
    }

    /**
     *合同进件来源
     */
    public String getContractChannel() {
        return contractChannel;
    }

    /**
     *合同进件来源
     */
    public void setContractChannel(String contractChannel) {
        this.contractChannel = contractChannel == null ? null : contractChannel.trim();
    }

    /**
     *提现提交时间
     */
    public Date getWithdrawCashTime() {
        return withdrawCashTime;
    }

    /**
     *提现提交时间
     */
    public void setWithdrawCashTime(Date withdrawCashTime) {
        this.withdrawCashTime = withdrawCashTime;
    }

    /**
     *是否首次提现
     */
    public String getIsFirstWithdrawCash() {
        return isFirstWithdrawCash;
    }

    /**
     *是否首次提现
     */
    public void setIsFirstWithdrawCash(String isFirstWithdrawCash) {
        this.isFirstWithdrawCash = isFirstWithdrawCash == null ? null : isFirstWithdrawCash.trim();
    }

    /**
     *请求号
     */
    public String getRequestNo() {
        return requestNo;
    }

    /**
     *请求号
     */
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    /**
     *自定义需要回传的字段
     */
    public String getState() {
        return state;
    }

    /**
     *自定义需要回传的字段
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     *备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     *备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     *
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *合同状态
     */
    public String getRelatedContractStatus() {
        return relatedContractStatus;
    }

    /**
     *合同状态
     */
    public void setRelatedContractStatus(String relatedContractStatus) {
        this.relatedContractStatus = relatedContractStatus == null ? null : relatedContractStatus.trim();
    }

    /**
     *合同贷款余额
     */
    public String getRelatedContractBalance() {
        return relatedContractBalance;
    }

    /**
     *合同贷款余额
     */
    public void setRelatedContractBalance(String relatedContractBalance) {
        this.relatedContractBalance = relatedContractBalance == null ? null : relatedContractBalance.trim();
    }

    /**
     *账户类型
     */
    public String getRelatedAccountStatus() {
        return relatedAccountStatus;
    }

    /**
     *账户类型
     */
    public void setRelatedAccountStatus(String relatedAccountStatus) {
        this.relatedAccountStatus = relatedAccountStatus == null ? null : relatedAccountStatus.trim();
    }

    /**
     *当前总额度
     */
    public String getRelatedCurrentCreditLimit() {
        return relatedCurrentCreditLimit;
    }

    /**
     *当前总额度
     */
    public void setRelatedCurrentCreditLimit(String relatedCurrentCreditLimit) {
        this.relatedCurrentCreditLimit = relatedCurrentCreditLimit == null ? null : relatedCurrentCreditLimit.trim();
    }

    /**
     *当前可用额度
     */
    public String getRelatedCurrentCreditAvailable() {
        return relatedCurrentCreditAvailable;
    }

    /**
     *当前可用额度
     */
    public void setRelatedCurrentCreditAvailable(String relatedCurrentCreditAvailable) {
        this.relatedCurrentCreditAvailable = relatedCurrentCreditAvailable == null ? null : relatedCurrentCreditAvailable.trim();
    }

    /**
     *当前已用额度
     */
    public String getRelatedCurrentCreditUsed() {
        return relatedCurrentCreditUsed;
    }

    /**
     *当前已用额度
     */
    public void setRelatedCurrentCreditUsed(String relatedCurrentCreditUsed) {
        this.relatedCurrentCreditUsed = relatedCurrentCreditUsed == null ? null : relatedCurrentCreditUsed.trim();
    }

    /**
     *当前冻结额度
     */
    public String getRelatedCurrentCreditFreeze() {
        return relatedCurrentCreditFreeze;
    }

    /**
     *当前冻结额度
     */
    public void setRelatedCurrentCreditFreeze(String relatedCurrentCreditFreeze) {
        this.relatedCurrentCreditFreeze = relatedCurrentCreditFreeze == null ? null : relatedCurrentCreditFreeze.trim();
    }

    /**
     *上次授信拒绝原因码
     */
    public String getHistLastCreditRefuseRcode() {
        return histLastCreditRefuseRcode;
    }

    /**
     *上次授信拒绝原因码
     */
    public void setHistLastCreditRefuseRcode(String histLastCreditRefuseRcode) {
        this.histLastCreditRefuseRcode = histLastCreditRefuseRcode == null ? null : histLastCreditRefuseRcode.trim();
    }

    /**
     *上次授信汇总原因码
     */
    public String getHistLastCreditMergeRcode() {
        return histLastCreditMergeRcode;
    }

    /**
     *上次授信汇总原因码
     */
    public void setHistLastCreditMergeRcode(String histLastCreditMergeRcode) {
        this.histLastCreditMergeRcode = histLastCreditMergeRcode == null ? null : histLastCreditMergeRcode.trim();
    }

    /**
     *openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     *openId
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     *经销商门店编码
     */
    public String getDealerCompanyCode() {
        return dealerCompanyCode;
    }

    /**
     *经销商门店编码
     */
    public void setDealerCompanyCode(String dealerCompanyCode) {
        this.dealerCompanyCode = dealerCompanyCode == null ? null : dealerCompanyCode.trim();
    }

    /**
     *经销商门店风险等级
     */
    public String getDealerCompanyRiskLevel() {
        return dealerCompanyRiskLevel;
    }

    /**
     *经销商门店风险等级
     */
    public void setDealerCompanyRiskLevel(String dealerCompanyRiskLevel) {
        this.dealerCompanyRiskLevel = dealerCompanyRiskLevel == null ? null : dealerCompanyRiskLevel.trim();
    }

    /**
     *是否为二手车
     */
    public String getIsOld() {
        return isOld;
    }

    /**
     *是否为二手车
     */
    public void setIsOld(String isOld) {
        this.isOld = isOld == null ? null : isOld.trim();
    }

    /**
     *车类
     */
    public String getIsLcv() {
        return isLcv;
    }

    /**
     *车类
     */
    public void setIsLcv(String isLcv) {
        this.isLcv = isLcv == null ? null : isLcv.trim();
    }

    /**
     *申请人与紧急联系人关系
     */
    public String getRelationEContact() {
        return relationEContact;
    }

    /**
     *申请人与紧急联系人关系
     */
    public void setRelationEContact(String relationEContact) {
        this.relationEContact = relationEContact == null ? null : relationEContact.trim();
    }

    /**
     *外部用户ID
     */
    public String getOutUserId() {
        return outUserId;
    }

    /**
     *外部用户ID
     */
    public void setOutUserId(String outUserId) {
        this.outUserId = outUserId == null ? null : outUserId.trim();
    }

    /**
     *渠道编号
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     *渠道编号
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     *还款方式
     */
    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    /**
     *还款方式
     */
    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod == null ? null : repaymentMethod.trim();
    }

    /**
     *车贷申请日期
     */
    public String getCarAppTime() {
        return carAppTime;
    }

    /**
     *车贷申请日期
     */
    public void setCarAppTime(String carAppTime) {
        this.carAppTime = carAppTime == null ? null : carAppTime.trim();
    }

    /**
     *车贷人行查询结果
     */
    public String getCarRhMsg() {
        return carRhMsg;
    }

    /**
     *车贷人行查询结果
     */
    public void setCarRhMsg(String carRhMsg) {
        this.carRhMsg = carRhMsg == null ? null : carRhMsg.trim();
    }

    /**
     *客户来源
     */
    public String getCustomerSource() {
        return customerSource;
    }

    /**
     *客户来源
     */
    public void setCustomerSource(String customerSource) {
        this.customerSource = customerSource == null ? null : customerSource.trim();
    }

    /**
     *产品编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     *产品编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     *上次成功授信时随机对照组标签
     */
    public String getLastCreditTestFlag() {
        return lastCreditTestFlag;
    }

    /**
     *上次成功授信时随机对照组标签
     */
    public void setLastCreditTestFlag(String lastCreditTestFlag) {
        this.lastCreditTestFlag = lastCreditTestFlag == null ? null : lastCreditTestFlag.trim();
    }

    /**
     *上次成功授信时风险分组
     */
    public String getLastCreditRiskLevel() {
        return lastCreditRiskLevel;
    }

    /**
     *上次成功授信时风险分组
     */
    public void setLastCreditRiskLevel(String lastCreditRiskLevel) {
        this.lastCreditRiskLevel = lastCreditRiskLevel == null ? null : lastCreditRiskLevel.trim();
    }

    /**
     *银行预留手机号
     */
    public String getExtraMobile() {
        return extraMobile;
    }

    /**
     *银行预留手机号
     */
    public void setExtraMobile(String extraMobile) {
        this.extraMobile = extraMobile == null ? null : extraMobile.trim();
    }

    /**
     *身份证有效期
     */
    public Date getIdcardDeadline() {
        return idcardDeadline;
    }

    /**
     *身份证有效期
     */
    public void setIdcardDeadline(Date idcardDeadline) {
        this.idcardDeadline = idcardDeadline;
    }

    /**
     *签发机关
     */
    public String getSignOrg() {
        return signOrg;
    }

    /**
     *签发机关
     */
    public void setSignOrg(String signOrg) {
        this.signOrg = signOrg == null ? null : signOrg.trim();
    }

    /**
     *民族
     */
    public String getIdCardEthnicity() {
        return idCardEthnicity;
    }

    /**
     *民族
     */
    public void setIdCardEthnicity(String idCardEthnicity) {
        this.idCardEthnicity = idCardEthnicity == null ? null : idCardEthnicity.trim();
    }

    /**
     *户籍地址-省
     */
    public String getDomicileProvince() {
        return domicileProvince;
    }

    /**
     *户籍地址-省
     */
    public void setDomicileProvince(String domicileProvince) {
        this.domicileProvince = domicileProvince == null ? null : domicileProvince.trim();
    }

    /**
     *户籍地址-市
     */
    public String getDomicileCity() {
        return domicileCity;
    }

    /**
     *户籍地址-市
     */
    public void setDomicileCity(String domicileCity) {
        this.domicileCity = domicileCity == null ? null : domicileCity.trim();
    }

    /**
     *户籍地址-区
     */
    public String getDomicileArea() {
        return domicileArea;
    }

    /**
     *户籍地址-区
     */
    public void setDomicileArea(String domicileArea) {
        this.domicileArea = domicileArea == null ? null : domicileArea.trim();
    }

    /**
     *户籍地址（详细地址）
     */
    public String getDomicileaddress() {
        return domicileaddress;
    }

    /**
     *户籍地址（详细地址）
     */
    public void setDomicileaddress(String domicileaddress) {
        this.domicileaddress = domicileaddress == null ? null : domicileaddress.trim();
    }

    /**
     *授信时同盾分
     */
    public Integer getTdFinalScoreWhenCredit() {
        return tdFinalScoreWhenCredit;
    }

    /**
     *授信时同盾分
     */
    public void setTdFinalScoreWhenCredit(Integer tdFinalScoreWhenCredit) {
        this.tdFinalScoreWhenCredit = tdFinalScoreWhenCredit;
    }

    /**
     *授信时同盾近3个月多头个数
     */
    public Integer getTdThreemApptimWhenCredit() {
        return tdThreemApptimWhenCredit;
    }

    /**
     *授信时同盾近3个月多头个数
     */
    public void setTdThreemApptimWhenCredit(Integer tdThreemApptimWhenCredit) {
        this.tdThreemApptimWhenCredit = tdThreemApptimWhenCredit;
    }

    /**
     *授信时最终风险分组
     */
    public String getFinalRiskLevelWhenCredit() {
        return finalRiskLevelWhenCredit;
    }

    /**
     *授信时最终风险分组
     */
    public void setFinalRiskLevelWhenCredit(String finalRiskLevelWhenCredit) {
        this.finalRiskLevelWhenCredit = finalRiskLevelWhenCredit == null ? null : finalRiskLevelWhenCredit.trim();
    }

    /**
     *授信时是否命中KO对照组
     */
    public String getIfTestgroupWhenCredit() {
        return ifTestgroupWhenCredit;
    }

    /**
     *授信时是否命中KO对照组
     */
    public void setIfTestgroupWhenCredit(String ifTestgroupWhenCredit) {
        this.ifTestgroupWhenCredit = ifTestgroupWhenCredit == null ? null : ifTestgroupWhenCredit.trim();
    }

    /**
     *授信时聚信立评分--机器学习版
     */
    public Double getScoreXgbEtlWhenCredit() {
        return scoreXgbEtlWhenCredit;
    }

    /**
     *授信时聚信立评分--机器学习版
     */
    public void setScoreXgbEtlWhenCredit(Double scoreXgbEtlWhenCredit) {
        this.scoreXgbEtlWhenCredit = scoreXgbEtlWhenCredit;
    }

    /**
     *客户当前系统定价
     */
    public String getHistoryCustomerPriceSummary() {
        return historyCustomerPriceSummary;
    }

    /**
     *客户当前系统定价
     */
    public void setHistoryCustomerPriceSummary(String historyCustomerPriceSummary) {
        this.historyCustomerPriceSummary = historyCustomerPriceSummary == null ? null : historyCustomerPriceSummary.trim();
    }

    /**
     *客户取现来源
     */
    public String getCashSource() {
        return cashSource;
    }

    /**
     *客户取现来源
     */
    public void setCashSource(String cashSource) {
        this.cashSource = cashSource == null ? null : cashSource.trim();
    }

    /**
     *收货人姓名，只有MOP-融360渠道的客户会有
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     *收货人姓名，只有MOP-融360渠道的客户会有
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     *收货人手机号，只有MOP-融360渠道的客户会有
     */
    public String getConsigneemobile() {
        return consigneemobile;
    }

    /**
     *收货人手机号，只有MOP-融360渠道的客户会有
     */
    public void setConsigneemobile(String consigneemobile) {
        this.consigneemobile = consigneemobile == null ? null : consigneemobile.trim();
    }

    /**
     *收货地址，只有MOP-融360渠道的客户会有
     */
    public String getConsigneeaddress() {
        return consigneeaddress;
    }

    /**
     *收货地址，只有MOP-融360渠道的客户会有
     */
    public void setConsigneeaddress(String consigneeaddress) {
        this.consigneeaddress = consigneeaddress == null ? null : consigneeaddress.trim();
    }

    /**
     *车贷放款渠道
     */
    public String getDisbursmentSource() {
        return disbursmentSource;
    }

    /**
     *车贷放款渠道
     */
    public void setDisbursmentSource(String disbursmentSource) {
        this.disbursmentSource = disbursmentSource == null ? null : disbursmentSource.trim();
    }

    /**
     *浦发是否入催
     */
    public Integer getIfPufaCollection() {
        return ifPufaCollection;
    }

    /**
     *浦发是否入催
     */
    public void setIfPufaCollection(Integer ifPufaCollection) {
        this.ifPufaCollection = ifPufaCollection;
    }
}