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

package com.aliyuncs.objectdet.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.objectdet.transform.v20191230.GetVehicleRepairPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVehicleRepairPlanResponse extends AcsResponse {

	private Integer httpCode;

	private String requestId;

	private String errorMessage;

	private String code;

	private Boolean success;

	private Data data;

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String frameNo;

		private List<RepairItems> repairParts;

		public String getFrameNo() {
			return this.frameNo;
		}

		public void setFrameNo(String frameNo) {
			this.frameNo = frameNo;
		}

		public List<RepairItems> getRepairParts() {
			return this.repairParts;
		}

		public void setRepairParts(List<RepairItems> repairParts) {
			this.repairParts = repairParts;
		}

		public static class RepairItems {

			private String relationType;

			private String partsStdCode;

			private Boolean partNameMatch;

			private String repairFee;

			private String outStandardPartsName;

			private String partsStdName;

			private String repairTypeName;

			private String repairType;

			private Boolean oeMatch;

			private String outStandardPartsId;

			private String garageType;

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}

			public String getPartsStdCode() {
				return this.partsStdCode;
			}

			public void setPartsStdCode(String partsStdCode) {
				this.partsStdCode = partsStdCode;
			}

			public Boolean getPartNameMatch() {
				return this.partNameMatch;
			}

			public void setPartNameMatch(Boolean partNameMatch) {
				this.partNameMatch = partNameMatch;
			}

			public String getRepairFee() {
				return this.repairFee;
			}

			public void setRepairFee(String repairFee) {
				this.repairFee = repairFee;
			}

			public String getOutStandardPartsName() {
				return this.outStandardPartsName;
			}

			public void setOutStandardPartsName(String outStandardPartsName) {
				this.outStandardPartsName = outStandardPartsName;
			}

			public String getPartsStdName() {
				return this.partsStdName;
			}

			public void setPartsStdName(String partsStdName) {
				this.partsStdName = partsStdName;
			}

			public String getRepairTypeName() {
				return this.repairTypeName;
			}

			public void setRepairTypeName(String repairTypeName) {
				this.repairTypeName = repairTypeName;
			}

			public String getRepairType() {
				return this.repairType;
			}

			public void setRepairType(String repairType) {
				this.repairType = repairType;
			}

			public Boolean getOeMatch() {
				return this.oeMatch;
			}

			public void setOeMatch(Boolean oeMatch) {
				this.oeMatch = oeMatch;
			}

			public String getOutStandardPartsId() {
				return this.outStandardPartsId;
			}

			public void setOutStandardPartsId(String outStandardPartsId) {
				this.outStandardPartsId = outStandardPartsId;
			}

			public String getGarageType() {
				return this.garageType;
			}

			public void setGarageType(String garageType) {
				this.garageType = garageType;
			}
		}
	}

	@Override
	public GetVehicleRepairPlanResponse getInstance(UnmarshallerContext context) {
		return	GetVehicleRepairPlanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
