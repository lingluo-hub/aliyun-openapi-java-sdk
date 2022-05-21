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
import com.aliyuncs.gpdb.transform.v20160503.DescribeUserEncryptionKeyListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserEncryptionKeyListResponse extends AcsResponse {

	private String requestId;

	private List<KmsKeysItem> kmsKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<KmsKeysItem> getKmsKeys() {
		return this.kmsKeys;
	}

	public void setKmsKeys(List<KmsKeysItem> kmsKeys) {
		this.kmsKeys = kmsKeys;
	}

	public static class KmsKeysItem {

		private String keyId;

		public String getKeyId() {
			return this.keyId;
		}

		public void setKeyId(String keyId) {
			this.keyId = keyId;
		}
	}

	@Override
	public DescribeUserEncryptionKeyListResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserEncryptionKeyListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
