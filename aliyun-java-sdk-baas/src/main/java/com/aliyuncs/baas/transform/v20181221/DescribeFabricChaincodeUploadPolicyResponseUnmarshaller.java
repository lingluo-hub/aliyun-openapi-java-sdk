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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.DescribeFabricChaincodeUploadPolicyResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricChaincodeUploadPolicyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricChaincodeUploadPolicyResponseUnmarshaller {

	public static DescribeFabricChaincodeUploadPolicyResponse unmarshall(DescribeFabricChaincodeUploadPolicyResponse describeFabricChaincodeUploadPolicyResponse, UnmarshallerContext _ctx) {
		
		describeFabricChaincodeUploadPolicyResponse.setRequestId(_ctx.stringValue("DescribeFabricChaincodeUploadPolicyResponse.RequestId"));
		describeFabricChaincodeUploadPolicyResponse.setSuccess(_ctx.booleanValue("DescribeFabricChaincodeUploadPolicyResponse.Success"));
		describeFabricChaincodeUploadPolicyResponse.setErrorCode(_ctx.integerValue("DescribeFabricChaincodeUploadPolicyResponse.ErrorCode"));

		Result result = new Result();
		result.setSignature(_ctx.stringValue("DescribeFabricChaincodeUploadPolicyResponse.Result.Signature"));
		result.setHost(_ctx.stringValue("DescribeFabricChaincodeUploadPolicyResponse.Result.Host"));
		result.setPolicy(_ctx.stringValue("DescribeFabricChaincodeUploadPolicyResponse.Result.Policy"));
		result.setDir(_ctx.stringValue("DescribeFabricChaincodeUploadPolicyResponse.Result.Dir"));
		result.setAccessId(_ctx.stringValue("DescribeFabricChaincodeUploadPolicyResponse.Result.AccessId"));
		result.setExpire(_ctx.integerValue("DescribeFabricChaincodeUploadPolicyResponse.Result.Expire"));
		describeFabricChaincodeUploadPolicyResponse.setResult(result);
	 
	 	return describeFabricChaincodeUploadPolicyResponse;
	}
}