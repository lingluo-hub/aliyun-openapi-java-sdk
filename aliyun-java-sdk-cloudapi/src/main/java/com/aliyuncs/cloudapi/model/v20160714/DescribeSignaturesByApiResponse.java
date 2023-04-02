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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeSignaturesByApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSignaturesByApiResponse extends AcsResponse {

	private String requestId;

	private List<SignatureItem> signatures;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SignatureItem> getSignatures() {
		return this.signatures;
	}

	public void setSignatures(List<SignatureItem> signatures) {
		this.signatures = signatures;
	}

	public static class SignatureItem {

		private String boundTime;

		private String signatureId;

		private String signatureName;

		public String getBoundTime() {
			return this.boundTime;
		}

		public void setBoundTime(String boundTime) {
			this.boundTime = boundTime;
		}

		public String getSignatureId() {
			return this.signatureId;
		}

		public void setSignatureId(String signatureId) {
			this.signatureId = signatureId;
		}

		public String getSignatureName() {
			return this.signatureName;
		}

		public void setSignatureName(String signatureName) {
			this.signatureName = signatureName;
		}
	}

	@Override
	public DescribeSignaturesByApiResponse getInstance(UnmarshallerContext context) {
		return	DescribeSignaturesByApiResponseUnmarshaller.unmarshall(this, context);
	}
}
