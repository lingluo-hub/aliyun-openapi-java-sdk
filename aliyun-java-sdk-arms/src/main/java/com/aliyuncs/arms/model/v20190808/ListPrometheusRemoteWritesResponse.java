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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListPrometheusRemoteWritesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrometheusRemoteWritesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private Integer code;

	private List<RemoteWrite> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<RemoteWrite> getData() {
		return this.data;
	}

	public void setData(List<RemoteWrite> data) {
		this.data = data;
	}

	public static class RemoteWrite {

		private String clusterId;

		private String remoteWriteName;

		private String remoteWriteYaml;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRemoteWriteName() {
			return this.remoteWriteName;
		}

		public void setRemoteWriteName(String remoteWriteName) {
			this.remoteWriteName = remoteWriteName;
		}

		public String getRemoteWriteYaml() {
			return this.remoteWriteYaml;
		}

		public void setRemoteWriteYaml(String remoteWriteYaml) {
			this.remoteWriteYaml = remoteWriteYaml;
		}
	}

	@Override
	public ListPrometheusRemoteWritesResponse getInstance(UnmarshallerContext context) {
		return	ListPrometheusRemoteWritesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
