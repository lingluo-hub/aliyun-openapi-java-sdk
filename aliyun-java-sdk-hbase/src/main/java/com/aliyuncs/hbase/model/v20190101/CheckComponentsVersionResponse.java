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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.CheckComponentsVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckComponentsVersionResponse extends AcsResponse {

	private String requestId;

	private List<Component> components;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Component> getComponents() {
		return this.components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public static class Component {

		private String component;

		private String isLatestVersion;

		public String getComponent() {
			return this.component;
		}

		public void setComponent(String component) {
			this.component = component;
		}

		public String getIsLatestVersion() {
			return this.isLatestVersion;
		}

		public void setIsLatestVersion(String isLatestVersion) {
			this.isLatestVersion = isLatestVersion;
		}
	}

	@Override
	public CheckComponentsVersionResponse getInstance(UnmarshallerContext context) {
		return	CheckComponentsVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
