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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetMetaTableDetailInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableDetailInfoResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private DetailInfo detailInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public DetailInfo getDetailInfo() {
		return this.detailInfo;
	}

	public void setDetailInfo(DetailInfo detailInfo) {
		this.detailInfo = detailInfo;
	}

	public static class DetailInfo {

		private List<Index> indexList;

		private List<Column> columnList;

		public List<Index> getIndexList() {
			return this.indexList;
		}

		public void setIndexList(List<Index> indexList) {
			this.indexList = indexList;
		}

		public List<Column> getColumnList() {
			return this.columnList;
		}

		public void setColumnList(List<Column> columnList) {
			this.columnList = columnList;
		}

		public static class Index {

			private String indexName;

			private Boolean unique;

			private String indexType;

			private String indexId;

			private List<String> indexColumns;

			public String getIndexName() {
				return this.indexName;
			}

			public void setIndexName(String indexName) {
				this.indexName = indexName;
			}

			public Boolean getUnique() {
				return this.unique;
			}

			public void setUnique(Boolean unique) {
				this.unique = unique;
			}

			public String getIndexType() {
				return this.indexType;
			}

			public void setIndexType(String indexType) {
				this.indexType = indexType;
			}

			public String getIndexId() {
				return this.indexId;
			}

			public void setIndexId(String indexId) {
				this.indexId = indexId;
			}

			public List<String> getIndexColumns() {
				return this.indexColumns;
			}

			public void setIndexColumns(List<String> indexColumns) {
				this.indexColumns = indexColumns;
			}
		}

		public static class Column {

			private String columnName;

			private String description;

			private Integer dataScale;

			private Integer dataPrecision;

			private String columnType;

			private Boolean autoIncrement;

			private String position;

			private Boolean nullable;

			private String columnId;

			private Long dataLength;

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getDataScale() {
				return this.dataScale;
			}

			public void setDataScale(Integer dataScale) {
				this.dataScale = dataScale;
			}

			public Integer getDataPrecision() {
				return this.dataPrecision;
			}

			public void setDataPrecision(Integer dataPrecision) {
				this.dataPrecision = dataPrecision;
			}

			public String getColumnType() {
				return this.columnType;
			}

			public void setColumnType(String columnType) {
				this.columnType = columnType;
			}

			public Boolean getAutoIncrement() {
				return this.autoIncrement;
			}

			public void setAutoIncrement(Boolean autoIncrement) {
				this.autoIncrement = autoIncrement;
			}

			public String getPosition() {
				return this.position;
			}

			public void setPosition(String position) {
				this.position = position;
			}

			public Boolean getNullable() {
				return this.nullable;
			}

			public void setNullable(Boolean nullable) {
				this.nullable = nullable;
			}

			public String getColumnId() {
				return this.columnId;
			}

			public void setColumnId(String columnId) {
				this.columnId = columnId;
			}

			public Long getDataLength() {
				return this.dataLength;
			}

			public void setDataLength(Long dataLength) {
				this.dataLength = dataLength;
			}
		}
	}

	@Override
	public GetMetaTableDetailInfoResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTableDetailInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
