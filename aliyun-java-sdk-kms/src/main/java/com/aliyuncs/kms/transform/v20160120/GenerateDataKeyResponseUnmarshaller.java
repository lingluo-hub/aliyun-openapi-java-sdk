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

package com.aliyuncs.kms.transform.v20160120;

import com.aliyuncs.kms.model.v20160120.GenerateDataKeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateDataKeyResponseUnmarshaller {

	public static GenerateDataKeyResponse unmarshall(GenerateDataKeyResponse generateDataKeyResponse, UnmarshallerContext _ctx) {
		
		generateDataKeyResponse.setRequestId(_ctx.stringValue("GenerateDataKeyResponse.RequestId"));
		generateDataKeyResponse.setKeyVersionId(_ctx.stringValue("GenerateDataKeyResponse.KeyVersionId"));
		generateDataKeyResponse.setKeyId(_ctx.stringValue("GenerateDataKeyResponse.KeyId"));
		generateDataKeyResponse.setCiphertextBlob(_ctx.stringValue("GenerateDataKeyResponse.CiphertextBlob"));
		generateDataKeyResponse.setPlaintext(_ctx.stringValue("GenerateDataKeyResponse.Plaintext"));
	 
	 	return generateDataKeyResponse;
	}
}