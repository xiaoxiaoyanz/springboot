package dao;

import entity.AdtfMinistryBill;

public interface AdtfMinistryBillDao {
    int deleteByPrimaryKey(Long id);

    int insert(AdtfMinistryBill record);

    int insertSelective(AdtfMinistryBill record);

    AdtfMinistryBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdtfMinistryBill record);

    int updateByPrimaryKey(AdtfMinistryBill record);
}