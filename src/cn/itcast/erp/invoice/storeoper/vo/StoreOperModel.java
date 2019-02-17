package cn.itcast.erp.invoice.storeoper.vo;

import java.util.HashMap;
import java.util.Map;

import cn.itcast.erp.auth.emp.vo.EmpModel;
import cn.itcast.erp.invoice.goods.vo.GoodsModel;
import cn.itcast.erp.invoice.store.vo.StoreModel;
import cn.itcast.erp.util.format.FormatUtil;

public class StoreOperModel {

	public static final Integer OPER_TYPE_OF_IN = 1;
	public static final Integer OPER_TYPE_OF_OUT = 2;

	public static final String OPER_TYPE_OF_IN_VIEW = "���";
	public static final String OPER_TYPE_OF_OUT_VIEW = "����";

	public static final Map<Integer, String> typeMap = new HashMap<Integer, String>();

	static {
		typeMap.put(OPER_TYPE_OF_IN, OPER_TYPE_OF_IN_VIEW);
		typeMap.put(OPER_TYPE_OF_OUT, OPER_TYPE_OF_OUT_VIEW);
	}

	private Long uuid;
	private Integer num;

	private Long operTime;
	private Integer type;

	private String operTimeView;
	private String typeView;

	private EmpModel em;
	private GoodsModel gm;
	private StoreModel sm;

	public String getOperTimeView() {
		return operTimeView;
	}

	public String getTypeView() {
		return typeView;
	}

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Long getOperTime() {
		return operTime;
	}

	public void setOperTime(Long operTime) {
		this.operTime = operTime;
		this.operTimeView = FormatUtil.formatDate(operTime);
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
		this.typeView = typeMap.get(type);
	}

	public EmpModel getEm() {
		return em;
	}

	public void setEm(EmpModel em) {
		this.em = em;
	}

	public GoodsModel getGm() {
		return gm;
	}

	public void setGm(GoodsModel gm) {
		this.gm = gm;
	}

	public StoreModel getSm() {
		return sm;
	}

	public void setSm(StoreModel sm) {
		this.sm = sm;
	}

}
