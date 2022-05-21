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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeDatabasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabasesResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String errMsg;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<DatabasesItem> databases;

		public List<DatabasesItem> getDatabases() {
			return this.databases;
		}

		public void setDatabases(List<DatabasesItem> databases) {
			this.databases = databases;
		}

		public static class DatabasesItem {

			private String dBDescription;

			private String dBStatus;

			private String dBName;

			private String dBInstanceId;

			private String engine;

			private String characterSetName;

			private List<AccountsItem> accounts;

			public String getDBDescription() {
				return this.dBDescription;
			}

			public void setDBDescription(String dBDescription) {
				this.dBDescription = dBDescription;
			}

			public String getDBStatus() {
				return this.dBStatus;
			}

			public void setDBStatus(String dBStatus) {
				this.dBStatus = dBStatus;
			}

			public String getDBName() {
				return this.dBName;
			}

			public void setDBName(String dBName) {
				this.dBName = dBName;
			}

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getCharacterSetName() {
				return this.characterSetName;
			}

			public void setCharacterSetName(String characterSetName) {
				this.characterSetName = characterSetName;
			}

			public List<AccountsItem> getAccounts() {
				return this.accounts;
			}

			public void setAccounts(List<AccountsItem> accounts) {
				this.accounts = accounts;
			}

			public static class AccountsItem {

				private String account;

				private String accountPrivilegeDetail;

				private String accountPrivilege;

				public String getAccount() {
					return this.account;
				}

				public void setAccount(String account) {
					this.account = account;
				}

				public String getAccountPrivilegeDetail() {
					return this.accountPrivilegeDetail;
				}

				public void setAccountPrivilegeDetail(String accountPrivilegeDetail) {
					this.accountPrivilegeDetail = accountPrivilegeDetail;
				}

				public String getAccountPrivilege() {
					return this.accountPrivilege;
				}

				public void setAccountPrivilege(String accountPrivilege) {
					this.accountPrivilege = accountPrivilege;
				}
			}
		}
	}

	@Override
	public DescribeDatabasesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabasesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
