package com.crm.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public CustomerExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andCusIdIsNull() {
			addCriterion("cus_id is null");
			return (Criteria) this;
		}

		public Criteria andCusIdIsNotNull() {
			addCriterion("cus_id is not null");
			return (Criteria) this;
		}

		public Criteria andCusIdEqualTo(Integer value) {
			addCriterion("cus_id =", value, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdNotEqualTo(Integer value) {
			addCriterion("cus_id <>", value, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdGreaterThan(Integer value) {
			addCriterion("cus_id >", value, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("cus_id >=", value, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdLessThan(Integer value) {
			addCriterion("cus_id <", value, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdLessThanOrEqualTo(Integer value) {
			addCriterion("cus_id <=", value, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdIn(List<Integer> values) {
			addCriterion("cus_id in", values, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdNotIn(List<Integer> values) {
			addCriterion("cus_id not in", values, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdBetween(Integer value1, Integer value2) {
			addCriterion("cus_id between", value1, value2, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusIdNotBetween(Integer value1, Integer value2) {
			addCriterion("cus_id not between", value1, value2, "cusId");
			return (Criteria) this;
		}

		public Criteria andCusStatusIsNull() {
			addCriterion("cus_status is null");
			return (Criteria) this;
		}

		public Criteria andCusStatusIsNotNull() {
			addCriterion("cus_status is not null");
			return (Criteria) this;
		}

		public Criteria andCusStatusEqualTo(Integer value) {
			addCriterion("cus_status =", value, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusNotEqualTo(Integer value) {
			addCriterion("cus_status <>", value, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusGreaterThan(Integer value) {
			addCriterion("cus_status >", value, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("cus_status >=", value, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusLessThan(Integer value) {
			addCriterion("cus_status <", value, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusLessThanOrEqualTo(Integer value) {
			addCriterion("cus_status <=", value, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusIn(List<Integer> values) {
			addCriterion("cus_status in", values, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusNotIn(List<Integer> values) {
			addCriterion("cus_status not in", values, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusBetween(Integer value1, Integer value2) {
			addCriterion("cus_status between", value1, value2, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("cus_status not between", value1, value2, "cusStatus");
			return (Criteria) this;
		}

		public Criteria andCusGradeIsNull() {
			addCriterion("cus_grade is null");
			return (Criteria) this;
		}

		public Criteria andCusGradeIsNotNull() {
			addCriterion("cus_grade is not null");
			return (Criteria) this;
		}

		public Criteria andCusGradeEqualTo(Integer value) {
			addCriterion("cus_grade =", value, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeNotEqualTo(Integer value) {
			addCriterion("cus_grade <>", value, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeGreaterThan(Integer value) {
			addCriterion("cus_grade >", value, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeGreaterThanOrEqualTo(Integer value) {
			addCriterion("cus_grade >=", value, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeLessThan(Integer value) {
			addCriterion("cus_grade <", value, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeLessThanOrEqualTo(Integer value) {
			addCriterion("cus_grade <=", value, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeIn(List<Integer> values) {
			addCriterion("cus_grade in", values, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeNotIn(List<Integer> values) {
			addCriterion("cus_grade not in", values, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeBetween(Integer value1, Integer value2) {
			addCriterion("cus_grade between", value1, value2, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusGradeNotBetween(Integer value1, Integer value2) {
			addCriterion("cus_grade not between", value1, value2, "cusGrade");
			return (Criteria) this;
		}

		public Criteria andCusNameIsNull() {
			addCriterion("cus_name is null");
			return (Criteria) this;
		}

		public Criteria andCusNameIsNotNull() {
			addCriterion("cus_name is not null");
			return (Criteria) this;
		}

		public Criteria andCusNameEqualTo(String value) {
			addCriterion("cus_name =", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameNotEqualTo(String value) {
			addCriterion("cus_name <>", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameGreaterThan(String value) {
			addCriterion("cus_name >", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameGreaterThanOrEqualTo(String value) {
			addCriterion("cus_name >=", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameLessThan(String value) {
			addCriterion("cus_name <", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameLessThanOrEqualTo(String value) {
			addCriterion("cus_name <=", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameLike(String value) {
			addCriterion("cus_name like", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameNotLike(String value) {
			addCriterion("cus_name not like", value, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameIn(List<String> values) {
			addCriterion("cus_name in", values, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameNotIn(List<String> values) {
			addCriterion("cus_name not in", values, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameBetween(String value1, String value2) {
			addCriterion("cus_name between", value1, value2, "cusName");
			return (Criteria) this;
		}

		public Criteria andCusNameNotBetween(String value1, String value2) {
			addCriterion("cus_name not between", value1, value2, "cusName");
			return (Criteria) this;
		}

		public Criteria andUIdIsNull() {
			addCriterion("u_id is null");
			return (Criteria) this;
		}

		public Criteria andUIdIsNotNull() {
			addCriterion("u_id is not null");
			return (Criteria) this;
		}

		public Criteria andUIdEqualTo(Integer value) {
			addCriterion("u_id =", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotEqualTo(Integer value) {
			addCriterion("u_id <>", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThan(Integer value) {
			addCriterion("u_id >", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("u_id >=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThan(Integer value) {
			addCriterion("u_id <", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdLessThanOrEqualTo(Integer value) {
			addCriterion("u_id <=", value, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdIn(List<Integer> values) {
			addCriterion("u_id in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotIn(List<Integer> values) {
			addCriterion("u_id not in", values, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdBetween(Integer value1, Integer value2) {
			addCriterion("u_id between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andUIdNotBetween(Integer value1, Integer value2) {
			addCriterion("u_id not between", value1, value2, "uId");
			return (Criteria) this;
		}

		public Criteria andCusAreaIsNull() {
			addCriterion("cus_area is null");
			return (Criteria) this;
		}

		public Criteria andCusAreaIsNotNull() {
			addCriterion("cus_area is not null");
			return (Criteria) this;
		}

		public Criteria andCusAreaEqualTo(String value) {
			addCriterion("cus_area =", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaNotEqualTo(String value) {
			addCriterion("cus_area <>", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaGreaterThan(String value) {
			addCriterion("cus_area >", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaGreaterThanOrEqualTo(String value) {
			addCriterion("cus_area >=", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaLessThan(String value) {
			addCriterion("cus_area <", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaLessThanOrEqualTo(String value) {
			addCriterion("cus_area <=", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaLike(String value) {
			addCriterion("cus_area like", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaNotLike(String value) {
			addCriterion("cus_area not like", value, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaIn(List<String> values) {
			addCriterion("cus_area in", values, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaNotIn(List<String> values) {
			addCriterion("cus_area not in", values, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaBetween(String value1, String value2) {
			addCriterion("cus_area between", value1, value2, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusAreaNotBetween(String value1, String value2) {
			addCriterion("cus_area not between", value1, value2, "cusArea");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionIsNull() {
			addCriterion("cus_satisfaction is null");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionIsNotNull() {
			addCriterion("cus_satisfaction is not null");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionEqualTo(Integer value) {
			addCriterion("cus_satisfaction =", value, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionNotEqualTo(Integer value) {
			addCriterion("cus_satisfaction <>", value, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionGreaterThan(Integer value) {
			addCriterion("cus_satisfaction >", value, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionGreaterThanOrEqualTo(Integer value) {
			addCriterion("cus_satisfaction >=", value, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionLessThan(Integer value) {
			addCriterion("cus_satisfaction <", value, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionLessThanOrEqualTo(Integer value) {
			addCriterion("cus_satisfaction <=", value, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionIn(List<Integer> values) {
			addCriterion("cus_satisfaction in", values, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionNotIn(List<Integer> values) {
			addCriterion("cus_satisfaction not in", values, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionBetween(Integer value1, Integer value2) {
			addCriterion("cus_satisfaction between", value1, value2, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusSatisfactionNotBetween(Integer value1, Integer value2) {
			addCriterion("cus_satisfaction not between", value1, value2, "cusSatisfaction");
			return (Criteria) this;
		}

		public Criteria andCusCreditIsNull() {
			addCriterion("cus_credit is null");
			return (Criteria) this;
		}

		public Criteria andCusCreditIsNotNull() {
			addCriterion("cus_credit is not null");
			return (Criteria) this;
		}

		public Criteria andCusCreditEqualTo(Integer value) {
			addCriterion("cus_credit =", value, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditNotEqualTo(Integer value) {
			addCriterion("cus_credit <>", value, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditGreaterThan(Integer value) {
			addCriterion("cus_credit >", value, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditGreaterThanOrEqualTo(Integer value) {
			addCriterion("cus_credit >=", value, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditLessThan(Integer value) {
			addCriterion("cus_credit <", value, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditLessThanOrEqualTo(Integer value) {
			addCriterion("cus_credit <=", value, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditIn(List<Integer> values) {
			addCriterion("cus_credit in", values, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditNotIn(List<Integer> values) {
			addCriterion("cus_credit not in", values, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditBetween(Integer value1, Integer value2) {
			addCriterion("cus_credit between", value1, value2, "cusCredit");
			return (Criteria) this;
		}

		public Criteria andCusCreditNotBetween(Integer value1, Integer value2) {
			addCriterion("cus_credit not between", value1, value2, "cusCredit");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table customer
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbg.generated do_not_delete_during_merge Sun Apr 26 18:22:14 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}