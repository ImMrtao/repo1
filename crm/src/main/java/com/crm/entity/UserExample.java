package com.crm.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public UserExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
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

		public Criteria andUNameIsNull() {
			addCriterion("u_name is null");
			return (Criteria) this;
		}

		public Criteria andUNameIsNotNull() {
			addCriterion("u_name is not null");
			return (Criteria) this;
		}

		public Criteria andUNameEqualTo(String value) {
			addCriterion("u_name =", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameNotEqualTo(String value) {
			addCriterion("u_name <>", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameGreaterThan(String value) {
			addCriterion("u_name >", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameGreaterThanOrEqualTo(String value) {
			addCriterion("u_name >=", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameLessThan(String value) {
			addCriterion("u_name <", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameLessThanOrEqualTo(String value) {
			addCriterion("u_name <=", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameLike(String value) {
			addCriterion("u_name like", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameNotLike(String value) {
			addCriterion("u_name not like", value, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameIn(List<String> values) {
			addCriterion("u_name in", values, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameNotIn(List<String> values) {
			addCriterion("u_name not in", values, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameBetween(String value1, String value2) {
			addCriterion("u_name between", value1, value2, "uName");
			return (Criteria) this;
		}

		public Criteria andUNameNotBetween(String value1, String value2) {
			addCriterion("u_name not between", value1, value2, "uName");
			return (Criteria) this;
		}

		public Criteria andUPasswordIsNull() {
			addCriterion("u_password is null");
			return (Criteria) this;
		}

		public Criteria andUPasswordIsNotNull() {
			addCriterion("u_password is not null");
			return (Criteria) this;
		}

		public Criteria andUPasswordEqualTo(String value) {
			addCriterion("u_password =", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotEqualTo(String value) {
			addCriterion("u_password <>", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordGreaterThan(String value) {
			addCriterion("u_password >", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("u_password >=", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordLessThan(String value) {
			addCriterion("u_password <", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordLessThanOrEqualTo(String value) {
			addCriterion("u_password <=", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordLike(String value) {
			addCriterion("u_password like", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotLike(String value) {
			addCriterion("u_password not like", value, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordIn(List<String> values) {
			addCriterion("u_password in", values, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotIn(List<String> values) {
			addCriterion("u_password not in", values, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordBetween(String value1, String value2) {
			addCriterion("u_password between", value1, value2, "uPassword");
			return (Criteria) this;
		}

		public Criteria andUPasswordNotBetween(String value1, String value2) {
			addCriterion("u_password not between", value1, value2, "uPassword");
			return (Criteria) this;
		}

		public Criteria andRIdIsNull() {
			addCriterion("r_id is null");
			return (Criteria) this;
		}

		public Criteria andRIdIsNotNull() {
			addCriterion("r_id is not null");
			return (Criteria) this;
		}

		public Criteria andRIdEqualTo(Integer value) {
			addCriterion("r_id =", value, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdNotEqualTo(Integer value) {
			addCriterion("r_id <>", value, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdGreaterThan(Integer value) {
			addCriterion("r_id >", value, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("r_id >=", value, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdLessThan(Integer value) {
			addCriterion("r_id <", value, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdLessThanOrEqualTo(Integer value) {
			addCriterion("r_id <=", value, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdIn(List<Integer> values) {
			addCriterion("r_id in", values, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdNotIn(List<Integer> values) {
			addCriterion("r_id not in", values, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdBetween(Integer value1, Integer value2) {
			addCriterion("r_id between", value1, value2, "rId");
			return (Criteria) this;
		}

		public Criteria andRIdNotBetween(Integer value1, Integer value2) {
			addCriterion("r_id not between", value1, value2, "rId");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
	 * @mbg.generated  Tue Mar 31 14:04:49 CST 2020
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
     * This class corresponds to the database table user
     *
     * @mbg.generated do_not_delete_during_merge Tue Mar 31 14:04:49 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}