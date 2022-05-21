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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListLogicTableRouteConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLogicTableRouteConfigResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<LogicTableRouteConfig> logicTableRouteConfigList;

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

	public List<LogicTableRouteConfig> getLogicTableRouteConfigList() {
		return this.logicTableRouteConfigList;
	}

	public void setLogicTableRouteConfigList(List<LogicTableRouteConfig> logicTableRouteConfigList) {
		this.logicTableRouteConfigList = logicTableRouteConfigList;
	}

	public static class LogicTableRouteConfig {

		private String routeKey;

		private String routeExpr;

		private Long tableId;

		public String getRouteKey() {
			return this.routeKey;
		}

		public void setRouteKey(String routeKey) {
			this.routeKey = routeKey;
		}

		public String getRouteExpr() {
			return this.routeExpr;
		}

		public void setRouteExpr(String routeExpr) {
			this.routeExpr = routeExpr;
		}

		public Long getTableId() {
			return this.tableId;
		}

		public void setTableId(Long tableId) {
			this.tableId = tableId;
		}
	}

	@Override
	public ListLogicTableRouteConfigResponse getInstance(UnmarshallerContext context) {
		return	ListLogicTableRouteConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
