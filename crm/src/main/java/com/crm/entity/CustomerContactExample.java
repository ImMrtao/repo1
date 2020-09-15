package com.crm.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerContactExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public CustomerContactExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table customer_contact
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

		public Criteria andCusconIdIsNull() {
			addCriterion("cusCon_id is null");
			return (Criteria) this;
		}

		public Criteria andCusconIdIsNotNull() {
			addCriterion("cusCon_id is not null");
			return (Criteria) this;
		}

		public Criteria andCusconIdEqualTo(Integer value) {
			addCriterion("cusCon_id =", value, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdNotEqualTo(Integer value) {
			addCriterion("cusCon_id <>", value, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdGreaterThan(Integer value) {
			addCriterion("cusCon_id >", value, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("cusCon_id >=", value, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdLessThan(Integer value) {
			addCriterion("cusCon_id <", value, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdLessThanOrEqualTo(Integer value) {
			addCriterion("cusCon_id <=", value, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdIn(List<Integer> values) {
			addCriterion("cusCon_id in", values, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdNotIn(List<Integer> values) {
			addCriterion("cusCon_id not in", values, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdBetween(Integer value1, Integer value2) {
			addCriterion("cusCon_id between", value1, value2, "cusconId");
			return (Criteria) this;
		}

		public Criteria andCusconIdNotBetween(Integer value1, Integer value2) {
			addCriterion("cusCon_id not between", value1, value2, "cusconId");
			return (Criteria) this;
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

		public Criteria andCusconNameIsNull() {
			addCriterion("cusCon_name is null");
			return (Criteria) this;
		}

		public Criteria andCusconNameIsNotNull() {
			addCriterion("cusCon_name is not null");
			return (Criteria) this;
		}

		public Criteria andCusconNameEqualTo(String value) {
			addCriterion("cusCon_name =", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameNotEqualTo(String value) {
			addCriterion("cusCon_name <>", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameGreaterThan(String value) {
			addCriterion("cusCon_name >", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameGreaterThanOrEqualTo(String value) {
			addCriterion("cusCon_name >=", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameLessThan(String value) {
			addCriterion("cusCon_name <", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameLessThanOrEqualTo(String value) {
			addCriterion("cusCon_name <=", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameLike(String value) {
			addCriterion("cusCon_name like", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameNotLike(String value) {
			addCriterion("cusCon_name not like", value, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameIn(List<String> values) {
			addCriterion("cusCon_name in", values, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameNotIn(List<String> values) {
			addCriterion("cusCon_name not in", values, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameBetween(String value1, String value2) {
			addCriterion("cusCon_name between", value1, value2, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconNameNotBetween(String value1, String value2) {
			addCriterion("cusCon_name not between", value1, value2, "cusconName");
			return (Criteria) this;
		}

		public Criteria andCusconSexIsNull() {
			addCriterion("cusCon_sex is null");
			return (Criteria) this;
		}

		public Criteria andCusconSexIsNotNull() {
			addCriterion("cusCon_sex is not null");
			return (Criteria) this;
		}

		public Criteria andCusconSexEqualTo(Integer value) {
			addCriterion("cusCon_sex =", value, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexNotEqualTo(Integer value) {
			addCriterion("cusCon_sex <>", value, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexGreaterThan(Integer value) {
			addCriterion("cusCon_sex >", value, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexGreaterThanOrEqualTo(Integer value) {
			addCriterion("cusCon_sex >=", value, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexLessThan(Integer value) {
			addCriterion("cusCon_sex <", value, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexLessThanOrEqualTo(Integer value) {
			addCriterion("cusCon_sex <=", value, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexIn(List<Integer> values) {
			addCriterion("cusCon_sex in", values, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexNotIn(List<Integer> values) {
			addCriterion("cusCon_sex not in", values, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexBetween(Integer value1, Integer value2) {
			addCriterion("cusCon_sex between", value1, value2, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconSexNotBetween(Integer value1, Integer value2) {
			addCriterion("cusCon_sex not between", value1, value2, "cusconSex");
			return (Criteria) this;
		}

		public Criteria andCusconPositionIsNull() {
			addCriterion("cusCon_position is null");
			return (Criteria) this;
		}

		public Criteria andCusconPositionIsNotNull() {
			addCriterion("cusCon_position is not null");
			return (Criteria) this;
		}

		public Criteria andCusconPositionEqualTo(String value) {
			addCriterion("cusCon_position =", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionNotEqualTo(String value) {
			addCriterion("cusCon_position <>", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionGreaterThan(String value) {
			addCriterion("cusCon_position >", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionGreaterThanOrEqualTo(String value) {
			addCriterion("cusCon_position >=", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionLessThan(String value) {
			addCriterion("cusCon_position <", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionLessThanOrEqualTo(String value) {
			addCriterion("cusCon_position <=", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionLike(String value) {
			addCriterion("cusCon_position like", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionNotLike(String value) {
			addCriterion("cusCon_position not like", value, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionIn(List<String> values) {
			addCriterion("cusCon_position in", values, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionNotIn(List<String> values) {
			addCriterion("cusCon_position not in", values, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionBetween(String value1, String value2) {
			addCriterion("cusCon_position between", value1, value2, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconPositionNotBetween(String value1, String value2) {
			addCriterion("cusCon_position not between", value1, value2, "cusconPosition");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneIsNull() {
			addCriterion("cusCon_officePhone is null");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneIsNotNull() {
			addCriterion("cusCon_officePhone is not null");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneEqualTo(String value) {
			addCriterion("cusCon_officePhone =", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneNotEqualTo(String value) {
			addCriterion("cusCon_officePhone <>", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneGreaterThan(String value) {
			addCriterion("cusCon_officePhone >", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneGreaterThanOrEqualTo(String value) {
			addCriterion("cusCon_officePhone >=", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneLessThan(String value) {
			addCriterion("cusCon_officePhone <", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneLessThanOrEqualTo(String value) {
			addCriterion("cusCon_officePhone <=", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneLike(String value) {
			addCriterion("cusCon_officePhone like", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneNotLike(String value) {
			addCriterion("cusCon_officePhone not like", value, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneIn(List<String> values) {
			addCriterion("cusCon_officePhone in", values, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneNotIn(List<String> values) {
			addCriterion("cusCon_officePhone not in", values, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneBetween(String value1, String value2) {
			addCriterion("cusCon_officePhone between", value1, value2, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconOfficephoneNotBetween(String value1, String value2) {
			addCriterion("cusCon_officePhone not between", value1, value2, "cusconOfficephone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneIsNull() {
			addCriterion("cusCon_phone is null");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneIsNotNull() {
			addCriterion("cusCon_phone is not null");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneEqualTo(String value) {
			addCriterion("cusCon_phone =", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneNotEqualTo(String value) {
			addCriterion("cusCon_phone <>", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneGreaterThan(String value) {
			addCriterion("cusCon_phone >", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("cusCon_phone >=", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneLessThan(String value) {
			addCriterion("cusCon_phone <", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneLessThanOrEqualTo(String value) {
			addCriterion("cusCon_phone <=", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneLike(String value) {
			addCriterion("cusCon_phone like", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneNotLike(String value) {
			addCriterion("cusCon_phone not like", value, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneIn(List<String> values) {
			addCriterion("cusCon_phone in", values, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneNotIn(List<String> values) {
			addCriterion("cusCon_phone not in", values, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneBetween(String value1, String value2) {
			addCriterion("cusCon_phone between", value1, value2, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconPhoneNotBetween(String value1, String value2) {
			addCriterion("cusCon_phone not between", value1, value2, "cusconPhone");
			return (Criteria) this;
		}

		public Criteria andCusconNotesIsNull() {
			addCriterion("cusCon_notes is null");
			return (Criteria) this;
		}

		public Criteria andCusconNotesIsNotNull() {
			addCriterion("cusCon_notes is not null");
			return (Criteria) this;
		}

		public Criteria andCusconNotesEqualTo(String value) {
			addCriterion("cusCon_notes =", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesNotEqualTo(String value) {
			addCriterion("cusCon_notes <>", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesGreaterThan(String value) {
			addCriterion("cusCon_notes >", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesGreaterThanOrEqualTo(String value) {
			addCriterion("cusCon_notes >=", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesLessThan(String value) {
			addCriterion("cusCon_notes <", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesLessThanOrEqualTo(String value) {
			addCriterion("cusCon_notes <=", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesLike(String value) {
			addCriterion("cusCon_notes like", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesNotLike(String value) {
			addCriterion("cusCon_notes not like", value, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesIn(List<String> values) {
			addCriterion("cusCon_notes in", values, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesNotIn(List<String> values) {
			addCriterion("cusCon_notes not in", values, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesBetween(String value1, String value2) {
			addCriterion("cusCon_notes between", value1, value2, "cusconNotes");
			return (Criteria) this;
		}

		public Criteria andCusconNotesNotBetween(String value1, String value2) {
			addCriterion("cusCon_notes not between", value1, value2, "cusconNotes");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table customer_contact
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
     * This class corresponds to the database table customer_contact
     *
     * @mbg.generated do_not_delete_during_merge Thu Apr 09 15:47:05 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}