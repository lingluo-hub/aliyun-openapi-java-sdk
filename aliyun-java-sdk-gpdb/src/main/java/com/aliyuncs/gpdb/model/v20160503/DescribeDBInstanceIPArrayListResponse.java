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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceIPArrayListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceIPArrayListResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceIPArray> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceIPArray> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstanceIPArray> items) {
		this.items = items;
	}

	public static class DBInstanceIPArray {

		private String dBInstanceIPArrayName;

		private String securityIPList;

		private String dBInstanceIPArrayAttribute;

		public String getDBInstanceIPArrayName() {
			return this.dBInstanceIPArrayName;
		}

		public void setDBInstanceIPArrayName(String dBInstanceIPArrayName) {
			this.dBInstanceIPArrayName = dBInstanceIPArrayName;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getDBInstanceIPArrayAttribute() {
			return this.dBInstanceIPArrayAttribute;
		}

		public void setDBInstanceIPArrayAttribute(String dBInstanceIPArrayAttribute) {
			this.dBInstanceIPArrayAttribute = dBInstanceIPArrayAttribute;
		}
	}

	@Override
	public DescribeDBInstanceIPArrayListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceIPArrayListResponseUnmarshaller.unmarshall(this, context);
	}
}
