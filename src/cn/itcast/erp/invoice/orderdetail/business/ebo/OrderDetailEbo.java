package cn.itcast.erp.invoice.orderdetail.business.ebo;

import java.io.Serializable;
import java.util.List;

import cn.itcast.erp.invoice.orderdetail.business.ebi.OrderDetailEbi;
import cn.itcast.erp.invoice.orderdetail.dao.dao.OrderDetailDao;
import cn.itcast.erp.invoice.orderdetail.vo.OrderDetailModel;
import cn.itcast.erp.util.base.BaseQueryModel;

public class OrderDetailEbo implements OrderDetailEbi {

	private OrderDetailDao orderDetailDao;
	public void setOrderDetailDao(OrderDetailDao orderDetailDao) {
		this.orderDetailDao = orderDetailDao;
	}

	public void save(OrderDetailModel om) {
		orderDetailDao.save(om);
	}

	public void update(OrderDetailModel om) {
		orderDetailDao.update(om);
	}

	public void delete(OrderDetailModel om) {
		orderDetailDao.delete(om);
	}

	public List<OrderDetailModel> getAll() {
		return orderDetailDao.getAll();
	}

	public OrderDetailModel get(Serializable uuid) {
		return orderDetailDao.get(uuid);
	}

	public List<OrderDetailModel> getAll(BaseQueryModel oqm, Integer pageNum, Integer pageCount) {
		return orderDetailDao.getAll(oqm, pageNum, pageCount);
	}

	public Integer getCount(BaseQueryModel oqm) {
		return orderDetailDao.getCount(oqm);
	}
}