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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.DescribeProductAmortizedCostByAmortizationPeriodResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProductAmortizedCostByAmortizationPeriodResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private String accountID;

		private String accountName;

		private Integer maxResults;

		private Integer totalCount;

		private List<Item> items;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public String getAccountID() {
			return this.accountID;
		}

		public void setAccountID(String accountID) {
			this.accountID = accountID;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String consumePeriod;

			private String amortizationStatus;

			private String amortizationPeriod;

			private Long billAccountID;

			private String billAccountName;

			private Long billOwnerID;

			private String billOwnerName;

			private String productCode;

			private String productName;

			private String productDetailCode;

			private String productDetail;

			private String bizType;

			private String subscriptionType;

			private Double pretaxGrossAmount;

			private Double invoiceDiscount;

			private Double roundDownDiscount;

			private Double pretaxAmount;

			private Double deductedByCashCoupons;

			private Double deductedByCoupons;

			private Double deductedByPrepaidCard;

			private Double expenditureAmount;

			private Double previouslyAmortizedPretaxGrossAmount;

			private Double previouslyAmortizedInvoiceDiscount;

			private Double previouslyAmortizedRoundDownDiscount;

			private Double previouslyAmortizedPretaxAmount;

			private Double previouslyAmortizedDeductedByCashCoupons;

			private Double previouslyAmortizedDeductedByCoupons;

			private Double previouslyAmortizedDeductedByPrepaidCard;

			private Double previouslyAmortizedExpenditureAmount;

			private Double currentAmortizationPretaxGrossAmount;

			private Double currentAmortizationInvoiceDiscount;

			private Double currentAmortizationRoundDownDiscount;

			private Double currentAmortizationPretaxAmount;

			private Double currentAmortizationDeductedByCashCoupons;

			private Double currentAmortizationDeductedByCoupons;

			private Double currentAmortizationDeductedByPrepaidCard;

			private Double currentAmortizationExpenditureAmount;

			private Double remainingAmortizationPretaxGrossAmount;

			private Double remainingAmortizationInvoiceDiscount;

			private Double remainingAmortizationRoundDownDiscount;

			private Double remainingAmortizationPretaxAmount;

			private Double remainingAmortizationDeductedByCashCoupons;

			private Double remainingAmortizationDeductedByCoupons;

			private Double remainingAmortizationDeductedByPrepaidCard;

			private Double remainingAmortizationExpenditureAmount;

			public String getConsumePeriod() {
				return this.consumePeriod;
			}

			public void setConsumePeriod(String consumePeriod) {
				this.consumePeriod = consumePeriod;
			}

			public String getAmortizationStatus() {
				return this.amortizationStatus;
			}

			public void setAmortizationStatus(String amortizationStatus) {
				this.amortizationStatus = amortizationStatus;
			}

			public String getAmortizationPeriod() {
				return this.amortizationPeriod;
			}

			public void setAmortizationPeriod(String amortizationPeriod) {
				this.amortizationPeriod = amortizationPeriod;
			}

			public Long getBillAccountID() {
				return this.billAccountID;
			}

			public void setBillAccountID(Long billAccountID) {
				this.billAccountID = billAccountID;
			}

			public String getBillAccountName() {
				return this.billAccountName;
			}

			public void setBillAccountName(String billAccountName) {
				this.billAccountName = billAccountName;
			}

			public Long getBillOwnerID() {
				return this.billOwnerID;
			}

			public void setBillOwnerID(Long billOwnerID) {
				this.billOwnerID = billOwnerID;
			}

			public String getBillOwnerName() {
				return this.billOwnerName;
			}

			public void setBillOwnerName(String billOwnerName) {
				this.billOwnerName = billOwnerName;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getProductDetailCode() {
				return this.productDetailCode;
			}

			public void setProductDetailCode(String productDetailCode) {
				this.productDetailCode = productDetailCode;
			}

			public String getProductDetail() {
				return this.productDetail;
			}

			public void setProductDetail(String productDetail) {
				this.productDetail = productDetail;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public Double getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(Double pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public Double getInvoiceDiscount() {
				return this.invoiceDiscount;
			}

			public void setInvoiceDiscount(Double invoiceDiscount) {
				this.invoiceDiscount = invoiceDiscount;
			}

			public Double getRoundDownDiscount() {
				return this.roundDownDiscount;
			}

			public void setRoundDownDiscount(Double roundDownDiscount) {
				this.roundDownDiscount = roundDownDiscount;
			}

			public Double getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(Double pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public Double getDeductedByCashCoupons() {
				return this.deductedByCashCoupons;
			}

			public void setDeductedByCashCoupons(Double deductedByCashCoupons) {
				this.deductedByCashCoupons = deductedByCashCoupons;
			}

			public Double getDeductedByCoupons() {
				return this.deductedByCoupons;
			}

			public void setDeductedByCoupons(Double deductedByCoupons) {
				this.deductedByCoupons = deductedByCoupons;
			}

			public Double getDeductedByPrepaidCard() {
				return this.deductedByPrepaidCard;
			}

			public void setDeductedByPrepaidCard(Double deductedByPrepaidCard) {
				this.deductedByPrepaidCard = deductedByPrepaidCard;
			}

			public Double getExpenditureAmount() {
				return this.expenditureAmount;
			}

			public void setExpenditureAmount(Double expenditureAmount) {
				this.expenditureAmount = expenditureAmount;
			}

			public Double getPreviouslyAmortizedPretaxGrossAmount() {
				return this.previouslyAmortizedPretaxGrossAmount;
			}

			public void setPreviouslyAmortizedPretaxGrossAmount(Double previouslyAmortizedPretaxGrossAmount) {
				this.previouslyAmortizedPretaxGrossAmount = previouslyAmortizedPretaxGrossAmount;
			}

			public Double getPreviouslyAmortizedInvoiceDiscount() {
				return this.previouslyAmortizedInvoiceDiscount;
			}

			public void setPreviouslyAmortizedInvoiceDiscount(Double previouslyAmortizedInvoiceDiscount) {
				this.previouslyAmortizedInvoiceDiscount = previouslyAmortizedInvoiceDiscount;
			}

			public Double getPreviouslyAmortizedRoundDownDiscount() {
				return this.previouslyAmortizedRoundDownDiscount;
			}

			public void setPreviouslyAmortizedRoundDownDiscount(Double previouslyAmortizedRoundDownDiscount) {
				this.previouslyAmortizedRoundDownDiscount = previouslyAmortizedRoundDownDiscount;
			}

			public Double getPreviouslyAmortizedPretaxAmount() {
				return this.previouslyAmortizedPretaxAmount;
			}

			public void setPreviouslyAmortizedPretaxAmount(Double previouslyAmortizedPretaxAmount) {
				this.previouslyAmortizedPretaxAmount = previouslyAmortizedPretaxAmount;
			}

			public Double getPreviouslyAmortizedDeductedByCashCoupons() {
				return this.previouslyAmortizedDeductedByCashCoupons;
			}

			public void setPreviouslyAmortizedDeductedByCashCoupons(Double previouslyAmortizedDeductedByCashCoupons) {
				this.previouslyAmortizedDeductedByCashCoupons = previouslyAmortizedDeductedByCashCoupons;
			}

			public Double getPreviouslyAmortizedDeductedByCoupons() {
				return this.previouslyAmortizedDeductedByCoupons;
			}

			public void setPreviouslyAmortizedDeductedByCoupons(Double previouslyAmortizedDeductedByCoupons) {
				this.previouslyAmortizedDeductedByCoupons = previouslyAmortizedDeductedByCoupons;
			}

			public Double getPreviouslyAmortizedDeductedByPrepaidCard() {
				return this.previouslyAmortizedDeductedByPrepaidCard;
			}

			public void setPreviouslyAmortizedDeductedByPrepaidCard(Double previouslyAmortizedDeductedByPrepaidCard) {
				this.previouslyAmortizedDeductedByPrepaidCard = previouslyAmortizedDeductedByPrepaidCard;
			}

			public Double getPreviouslyAmortizedExpenditureAmount() {
				return this.previouslyAmortizedExpenditureAmount;
			}

			public void setPreviouslyAmortizedExpenditureAmount(Double previouslyAmortizedExpenditureAmount) {
				this.previouslyAmortizedExpenditureAmount = previouslyAmortizedExpenditureAmount;
			}

			public Double getCurrentAmortizationPretaxGrossAmount() {
				return this.currentAmortizationPretaxGrossAmount;
			}

			public void setCurrentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
				this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
			}

			public Double getCurrentAmortizationInvoiceDiscount() {
				return this.currentAmortizationInvoiceDiscount;
			}

			public void setCurrentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
				this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
			}

			public Double getCurrentAmortizationRoundDownDiscount() {
				return this.currentAmortizationRoundDownDiscount;
			}

			public void setCurrentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
				this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
			}

			public Double getCurrentAmortizationPretaxAmount() {
				return this.currentAmortizationPretaxAmount;
			}

			public void setCurrentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
				this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
			}

			public Double getCurrentAmortizationDeductedByCashCoupons() {
				return this.currentAmortizationDeductedByCashCoupons;
			}

			public void setCurrentAmortizationDeductedByCashCoupons(Double currentAmortizationDeductedByCashCoupons) {
				this.currentAmortizationDeductedByCashCoupons = currentAmortizationDeductedByCashCoupons;
			}

			public Double getCurrentAmortizationDeductedByCoupons() {
				return this.currentAmortizationDeductedByCoupons;
			}

			public void setCurrentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
				this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
			}

			public Double getCurrentAmortizationDeductedByPrepaidCard() {
				return this.currentAmortizationDeductedByPrepaidCard;
			}

			public void setCurrentAmortizationDeductedByPrepaidCard(Double currentAmortizationDeductedByPrepaidCard) {
				this.currentAmortizationDeductedByPrepaidCard = currentAmortizationDeductedByPrepaidCard;
			}

			public Double getCurrentAmortizationExpenditureAmount() {
				return this.currentAmortizationExpenditureAmount;
			}

			public void setCurrentAmortizationExpenditureAmount(Double currentAmortizationExpenditureAmount) {
				this.currentAmortizationExpenditureAmount = currentAmortizationExpenditureAmount;
			}

			public Double getRemainingAmortizationPretaxGrossAmount() {
				return this.remainingAmortizationPretaxGrossAmount;
			}

			public void setRemainingAmortizationPretaxGrossAmount(Double remainingAmortizationPretaxGrossAmount) {
				this.remainingAmortizationPretaxGrossAmount = remainingAmortizationPretaxGrossAmount;
			}

			public Double getRemainingAmortizationInvoiceDiscount() {
				return this.remainingAmortizationInvoiceDiscount;
			}

			public void setRemainingAmortizationInvoiceDiscount(Double remainingAmortizationInvoiceDiscount) {
				this.remainingAmortizationInvoiceDiscount = remainingAmortizationInvoiceDiscount;
			}

			public Double getRemainingAmortizationRoundDownDiscount() {
				return this.remainingAmortizationRoundDownDiscount;
			}

			public void setRemainingAmortizationRoundDownDiscount(Double remainingAmortizationRoundDownDiscount) {
				this.remainingAmortizationRoundDownDiscount = remainingAmortizationRoundDownDiscount;
			}

			public Double getRemainingAmortizationPretaxAmount() {
				return this.remainingAmortizationPretaxAmount;
			}

			public void setRemainingAmortizationPretaxAmount(Double remainingAmortizationPretaxAmount) {
				this.remainingAmortizationPretaxAmount = remainingAmortizationPretaxAmount;
			}

			public Double getRemainingAmortizationDeductedByCashCoupons() {
				return this.remainingAmortizationDeductedByCashCoupons;
			}

			public void setRemainingAmortizationDeductedByCashCoupons(Double remainingAmortizationDeductedByCashCoupons) {
				this.remainingAmortizationDeductedByCashCoupons = remainingAmortizationDeductedByCashCoupons;
			}

			public Double getRemainingAmortizationDeductedByCoupons() {
				return this.remainingAmortizationDeductedByCoupons;
			}

			public void setRemainingAmortizationDeductedByCoupons(Double remainingAmortizationDeductedByCoupons) {
				this.remainingAmortizationDeductedByCoupons = remainingAmortizationDeductedByCoupons;
			}

			public Double getRemainingAmortizationDeductedByPrepaidCard() {
				return this.remainingAmortizationDeductedByPrepaidCard;
			}

			public void setRemainingAmortizationDeductedByPrepaidCard(Double remainingAmortizationDeductedByPrepaidCard) {
				this.remainingAmortizationDeductedByPrepaidCard = remainingAmortizationDeductedByPrepaidCard;
			}

			public Double getRemainingAmortizationExpenditureAmount() {
				return this.remainingAmortizationExpenditureAmount;
			}

			public void setRemainingAmortizationExpenditureAmount(Double remainingAmortizationExpenditureAmount) {
				this.remainingAmortizationExpenditureAmount = remainingAmortizationExpenditureAmount;
			}
		}
	}

	@Override
	public DescribeProductAmortizedCostByAmortizationPeriodResponse getInstance(UnmarshallerContext context) {
		return	DescribeProductAmortizedCostByAmortizationPeriodResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
