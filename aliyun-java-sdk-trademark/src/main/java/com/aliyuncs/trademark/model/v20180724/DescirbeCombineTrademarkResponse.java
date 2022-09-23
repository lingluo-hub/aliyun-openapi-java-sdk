/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.DescirbeCombineTrademarkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescirbeCombineTrademarkResponse extends AcsResponse {

	private Boolean nextPage;

	private String requestId;

	private Integer totalPageNumber;

	private Boolean prePage;

	private Integer currentPageNumber;

	private Integer totalItemNumber;

	private Integer pageSize;

	private List<Trademark> data;

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalPageNumber() {
		return this.totalPageNumber;
	}

	public void setTotalPageNumber(Integer totalPageNumber) {
		this.totalPageNumber = totalPageNumber;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Integer getCurrentPageNumber() {
		return this.currentPageNumber;
	}

	public void setCurrentPageNumber(Integer currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public Integer getTotalItemNumber() {
		return this.totalItemNumber;
	}

	public void setTotalItemNumber(Integer totalItemNumber) {
		this.totalItemNumber = totalItemNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Trademark> getData() {
		return this.data;
	}

	public void setData(List<Trademark> data) {
		this.data = data;
	}

	public static class Trademark {

		private String status;

		private String ownerAddress;

		private String preAnnDate;

		private String preAnnNumber;

		private String intlRegDate;

		private String share;

		private String ownerEnName;

		private String subsequentDesignationDate;

		private String indexId;

		private String regAnnNumber;

		private String registrationNumber;

		private String secondAnnoType;

		private String agency;

		private String ownerEnAddress;

		private String classification;

		private String name;

		private String applyDate;

		private String priorityDate;

		private String productDescription;

		private String image;

		private String secondAnnoNumber;

		private String registrationType;

		private String firstAnnoNumber;

		private String ownerName;

		private String regAnnDate;

		private String similarGroup;

		private Integer onSale;

		private String exclusiveDateLimit;

		private String firstAnnoType;

		private String lastProcedureStatus;

		private String lawFinalStatus;

		private List<AnnouncementListItem> announcementList;

		private List<ProcedureList> procedures;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOwnerAddress() {
			return this.ownerAddress;
		}

		public void setOwnerAddress(String ownerAddress) {
			this.ownerAddress = ownerAddress;
		}

		public String getPreAnnDate() {
			return this.preAnnDate;
		}

		public void setPreAnnDate(String preAnnDate) {
			this.preAnnDate = preAnnDate;
		}

		public String getPreAnnNumber() {
			return this.preAnnNumber;
		}

		public void setPreAnnNumber(String preAnnNumber) {
			this.preAnnNumber = preAnnNumber;
		}

		public String getIntlRegDate() {
			return this.intlRegDate;
		}

		public void setIntlRegDate(String intlRegDate) {
			this.intlRegDate = intlRegDate;
		}

		public String getShare() {
			return this.share;
		}

		public void setShare(String share) {
			this.share = share;
		}

		public String getOwnerEnName() {
			return this.ownerEnName;
		}

		public void setOwnerEnName(String ownerEnName) {
			this.ownerEnName = ownerEnName;
		}

		public String getSubsequentDesignationDate() {
			return this.subsequentDesignationDate;
		}

		public void setSubsequentDesignationDate(String subsequentDesignationDate) {
			this.subsequentDesignationDate = subsequentDesignationDate;
		}

		public String getIndexId() {
			return this.indexId;
		}

		public void setIndexId(String indexId) {
			this.indexId = indexId;
		}

		public String getRegAnnNumber() {
			return this.regAnnNumber;
		}

		public void setRegAnnNumber(String regAnnNumber) {
			this.regAnnNumber = regAnnNumber;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public String getSecondAnnoType() {
			return this.secondAnnoType;
		}

		public void setSecondAnnoType(String secondAnnoType) {
			this.secondAnnoType = secondAnnoType;
		}

		public String getAgency() {
			return this.agency;
		}

		public void setAgency(String agency) {
			this.agency = agency;
		}

		public String getOwnerEnAddress() {
			return this.ownerEnAddress;
		}

		public void setOwnerEnAddress(String ownerEnAddress) {
			this.ownerEnAddress = ownerEnAddress;
		}

		public String getClassification() {
			return this.classification;
		}

		public void setClassification(String classification) {
			this.classification = classification;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getApplyDate() {
			return this.applyDate;
		}

		public void setApplyDate(String applyDate) {
			this.applyDate = applyDate;
		}

		public String getPriorityDate() {
			return this.priorityDate;
		}

		public void setPriorityDate(String priorityDate) {
			this.priorityDate = priorityDate;
		}

		public String getProductDescription() {
			return this.productDescription;
		}

		public void setProductDescription(String productDescription) {
			this.productDescription = productDescription;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getSecondAnnoNumber() {
			return this.secondAnnoNumber;
		}

		public void setSecondAnnoNumber(String secondAnnoNumber) {
			this.secondAnnoNumber = secondAnnoNumber;
		}

		public String getRegistrationType() {
			return this.registrationType;
		}

		public void setRegistrationType(String registrationType) {
			this.registrationType = registrationType;
		}

		public String getFirstAnnoNumber() {
			return this.firstAnnoNumber;
		}

		public void setFirstAnnoNumber(String firstAnnoNumber) {
			this.firstAnnoNumber = firstAnnoNumber;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getRegAnnDate() {
			return this.regAnnDate;
		}

		public void setRegAnnDate(String regAnnDate) {
			this.regAnnDate = regAnnDate;
		}

		public String getSimilarGroup() {
			return this.similarGroup;
		}

		public void setSimilarGroup(String similarGroup) {
			this.similarGroup = similarGroup;
		}

		public Integer getOnSale() {
			return this.onSale;
		}

		public void setOnSale(Integer onSale) {
			this.onSale = onSale;
		}

		public String getExclusiveDateLimit() {
			return this.exclusiveDateLimit;
		}

		public void setExclusiveDateLimit(String exclusiveDateLimit) {
			this.exclusiveDateLimit = exclusiveDateLimit;
		}

		public String getFirstAnnoType() {
			return this.firstAnnoType;
		}

		public void setFirstAnnoType(String firstAnnoType) {
			this.firstAnnoType = firstAnnoType;
		}

		public String getLastProcedureStatus() {
			return this.lastProcedureStatus;
		}

		public void setLastProcedureStatus(String lastProcedureStatus) {
			this.lastProcedureStatus = lastProcedureStatus;
		}

		public String getLawFinalStatus() {
			return this.lawFinalStatus;
		}

		public void setLawFinalStatus(String lawFinalStatus) {
			this.lawFinalStatus = lawFinalStatus;
		}

		public List<AnnouncementListItem> getAnnouncementList() {
			return this.announcementList;
		}

		public void setAnnouncementList(List<AnnouncementListItem> announcementList) {
			this.announcementList = announcementList;
		}

		public List<ProcedureList> getProcedures() {
			return this.procedures;
		}

		public void setProcedures(List<ProcedureList> procedures) {
			this.procedures = procedures;
		}

		public static class AnnouncementListItem {

			private String imageUrl;

			private String annDate;

			private String originalImageUrl;

			private String annTypeName;

			private String annNumber;

			private String annTypeCode;

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public String getAnnDate() {
				return this.annDate;
			}

			public void setAnnDate(String annDate) {
				this.annDate = annDate;
			}

			public String getOriginalImageUrl() {
				return this.originalImageUrl;
			}

			public void setOriginalImageUrl(String originalImageUrl) {
				this.originalImageUrl = originalImageUrl;
			}

			public String getAnnTypeName() {
				return this.annTypeName;
			}

			public void setAnnTypeName(String annTypeName) {
				this.annTypeName = annTypeName;
			}

			public String getAnnNumber() {
				return this.annNumber;
			}

			public void setAnnNumber(String annNumber) {
				this.annNumber = annNumber;
			}

			public String getAnnTypeCode() {
				return this.annTypeCode;
			}

			public void setAnnTypeCode(String annTypeCode) {
				this.annTypeCode = annTypeCode;
			}
		}

		public static class ProcedureList {

			private String procedureStep;

			private String procedureResult;

			private String procedureCode;

			private String procedureDate;

			private String procedureName;

			public String getProcedureStep() {
				return this.procedureStep;
			}

			public void setProcedureStep(String procedureStep) {
				this.procedureStep = procedureStep;
			}

			public String getProcedureResult() {
				return this.procedureResult;
			}

			public void setProcedureResult(String procedureResult) {
				this.procedureResult = procedureResult;
			}

			public String getProcedureCode() {
				return this.procedureCode;
			}

			public void setProcedureCode(String procedureCode) {
				this.procedureCode = procedureCode;
			}

			public String getProcedureDate() {
				return this.procedureDate;
			}

			public void setProcedureDate(String procedureDate) {
				this.procedureDate = procedureDate;
			}

			public String getProcedureName() {
				return this.procedureName;
			}

			public void setProcedureName(String procedureName) {
				this.procedureName = procedureName;
			}
		}
	}

	@Override
	public DescirbeCombineTrademarkResponse getInstance(UnmarshallerContext context) {
		return	DescirbeCombineTrademarkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
