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

package com.aliyuncs.servicemesh.model.v20200111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.servicemesh.transform.v20200111.DescribeGuestClusterAccessLogDashboardsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGuestClusterAccessLogDashboardsResponse extends AcsResponse {

	private String requestId;

	private String k8sClusterId;

	private List<DashboardsItem> dashboards;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getK8sClusterId() {
		return this.k8sClusterId;
	}

	public void setK8sClusterId(String k8sClusterId) {
		this.k8sClusterId = k8sClusterId;
	}

	public List<DashboardsItem> getDashboards() {
		return this.dashboards;
	}

	public void setDashboards(List<DashboardsItem> dashboards) {
		this.dashboards = dashboards;
	}

	public static class DashboardsItem {

		private String title;

		private String url;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public DescribeGuestClusterAccessLogDashboardsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGuestClusterAccessLogDashboardsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
