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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetServerKeyPairInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerKeyPairInfoResponseUnmarshaller {

	public static GetServerKeyPairInfoResponse unmarshall(GetServerKeyPairInfoResponse getServerKeyPairInfoResponse, UnmarshallerContext _ctx) {
		
		getServerKeyPairInfoResponse.setRequestId(_ctx.stringValue("GetServerKeyPairInfoResponse.RequestId"));
		getServerKeyPairInfoResponse.setIsSuccess(_ctx.booleanValue("GetServerKeyPairInfoResponse.IsSuccess"));
		getServerKeyPairInfoResponse.setFingerprint(_ctx.stringValue("GetServerKeyPairInfoResponse.Fingerprint"));
		getServerKeyPairInfoResponse.setCode(_ctx.stringValue("GetServerKeyPairInfoResponse.Code"));
		getServerKeyPairInfoResponse.setName(_ctx.stringValue("GetServerKeyPairInfoResponse.Name"));
	 
	 	return getServerKeyPairInfoResponse;
	}
}