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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.UpdateKibanaWhiteIpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateKibanaWhiteIpsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<String> kibanaIPWhitelist;

		private List<String> kibanaPrivateIPWhitelist;

		public List<String> getKibanaIPWhitelist() {
			return this.kibanaIPWhitelist;
		}

		public void setKibanaIPWhitelist(List<String> kibanaIPWhitelist) {
			this.kibanaIPWhitelist = kibanaIPWhitelist;
		}

		public List<String> getKibanaPrivateIPWhitelist() {
			return this.kibanaPrivateIPWhitelist;
		}

		public void setKibanaPrivateIPWhitelist(List<String> kibanaPrivateIPWhitelist) {
			this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
		}
	}

	@Override
	public UpdateKibanaWhiteIpsResponse getInstance(UnmarshallerContext context) {
		return	UpdateKibanaWhiteIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
