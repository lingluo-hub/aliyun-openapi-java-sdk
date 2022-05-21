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

package com.aliyuncs.cloudphone.model.v20201230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphone.transform.v20201230.ListKeyPairsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListKeyPairsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<KeyPair> keyPairs;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<KeyPair> getKeyPairs() {
		return this.keyPairs;
	}

	public void setKeyPairs(List<KeyPair> keyPairs) {
		this.keyPairs = keyPairs;
	}

	public static class KeyPair {

		private String creationTime;

		private String keyPairName;

		private String keyPairFingerPrint;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getKeyPairFingerPrint() {
			return this.keyPairFingerPrint;
		}

		public void setKeyPairFingerPrint(String keyPairFingerPrint) {
			this.keyPairFingerPrint = keyPairFingerPrint;
		}
	}

	@Override
	public ListKeyPairsResponse getInstance(UnmarshallerContext context) {
		return	ListKeyPairsResponseUnmarshaller.unmarshall(this, context);
	}
}
