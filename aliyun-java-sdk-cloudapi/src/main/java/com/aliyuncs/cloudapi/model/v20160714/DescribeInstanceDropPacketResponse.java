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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeInstanceDropPacketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceDropPacketResponse extends AcsResponse {

	private String requestId;

	private List<MonitorItem> instanceDropPacket;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorItem> getInstanceDropPacket() {
		return this.instanceDropPacket;
	}

	public void setInstanceDropPacket(List<MonitorItem> instanceDropPacket) {
		this.instanceDropPacket = instanceDropPacket;
	}

	public static class MonitorItem {

		private String itemValue;

		private String itemTime;

		private String item;

		public String getItemValue() {
			return this.itemValue;
		}

		public void setItemValue(String itemValue) {
			this.itemValue = itemValue;
		}

		public String getItemTime() {
			return this.itemTime;
		}

		public void setItemTime(String itemTime) {
			this.itemTime = itemTime;
		}

		public String getItem() {
			return this.item;
		}

		public void setItem(String item) {
			this.item = item;
		}
	}

	@Override
	public DescribeInstanceDropPacketResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceDropPacketResponseUnmarshaller.unmarshall(this, context);
	}
}
