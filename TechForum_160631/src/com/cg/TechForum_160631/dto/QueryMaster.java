package com.cg.TechForum_160631.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="query_master")
public class QueryMaster {
		
		@Id
		@Column(name="query_id")		
		private Integer queryId;
		
		@Column(name="technology", length = 30)
		@NotEmpty(message="technology should not be empty")
		private String technology;
		
		@Column(name="query_raised_by")
		@NotEmpty(message="query should not be empty")
		private String queryRaisedBy;
		
		@Column(name="query")
		@NotNull(message="query should not be blank")
		private String query;
		
		@Column(name="solutions")
		private String solutions;
		
		@Column(name = "solution_given_by")
		private String solutionGivenBy;

		public Integer getQueryId() {
			return queryId;
		}

		public void setQueryId(Integer queryId) {
			this.queryId = queryId;
		}

		public String getTechnology() {
			return technology;
		}

		public void setTechnology(String technology) {
			this.technology = technology;
		}

		public String getQueryRaisedBy() {
			return queryRaisedBy;
		}

		public void setQueryRaisedBy(String queryRaisedBy) {
			this.queryRaisedBy = queryRaisedBy;
		}

		public String getQuery() {
			return query;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public String getSolutions() {
			return solutions;
		}

		public void setSolutions(String solutions) {
			this.solutions = solutions;
		}

		public String getSolutionGivenBy() {
			return solutionGivenBy;
		}

		public void setSolutionGivenBy(String solutionGivenBy) {
			this.solutionGivenBy = solutionGivenBy;
		}

		public QueryMaster() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
