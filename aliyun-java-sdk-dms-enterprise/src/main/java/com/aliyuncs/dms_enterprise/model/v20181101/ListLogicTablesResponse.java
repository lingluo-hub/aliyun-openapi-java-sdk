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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListLogicTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLogicTablesResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<LogicTable> logicTableList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<LogicTable> getLogicTableList() {
		return this.logicTableList;
	}

	public void setLogicTableList(List<LogicTable> logicTableList) {
		this.logicTableList = logicTableList;
	}

	public static class LogicTable {

		private String databaseId;

		private String tableName;

		private String tableCount;

		private String schemaName;

		private Boolean logic;

		private String tableExpr;

		private String tableGuid;

		private String tableId;

		private List<String> ownerIdList;

		private List<String> ownerNameList;

		public String getDatabaseId() {
			return this.databaseId;
		}

		public void setDatabaseId(String databaseId) {
			this.databaseId = databaseId;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableCount() {
			return this.tableCount;
		}

		public void setTableCount(String tableCount) {
			this.tableCount = tableCount;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public Boolean getLogic() {
			return this.logic;
		}

		public void setLogic(Boolean logic) {
			this.logic = logic;
		}

		public String getTableExpr() {
			return this.tableExpr;
		}

		public void setTableExpr(String tableExpr) {
			this.tableExpr = tableExpr;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public String getTableId() {
			return this.tableId;
		}

		public void setTableId(String tableId) {
			this.tableId = tableId;
		}

		public List<String> getOwnerIdList() {
			return this.ownerIdList;
		}

		public void setOwnerIdList(List<String> ownerIdList) {
			this.ownerIdList = ownerIdList;
		}

		public List<String> getOwnerNameList() {
			return this.ownerNameList;
		}

		public void setOwnerNameList(List<String> ownerNameList) {
			this.ownerNameList = ownerNameList;
		}
	}

	@Override
	public ListLogicTablesResponse getInstance(UnmarshallerContext context) {
		return	ListLogicTablesResponseUnmarshaller.unmarshall(this, context);
	}
}
