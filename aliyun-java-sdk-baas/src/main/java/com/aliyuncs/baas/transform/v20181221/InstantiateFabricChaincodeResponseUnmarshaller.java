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

import com.aliyuncs.baas.model.v20181221.InstantiateFabricChaincodeResponse;
import com.aliyuncs.baas.model.v20181221.InstantiateFabricChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstantiateFabricChaincodeResponseUnmarshaller {

	public static InstantiateFabricChaincodeResponse unmarshall(InstantiateFabricChaincodeResponse instantiateFabricChaincodeResponse, UnmarshallerContext _ctx) {
		
		instantiateFabricChaincodeResponse.setRequestId(_ctx.stringValue("InstantiateFabricChaincodeResponse.RequestId"));
		instantiateFabricChaincodeResponse.setSuccess(_ctx.booleanValue("InstantiateFabricChaincodeResponse.Success"));
		instantiateFabricChaincodeResponse.setErrorCode(_ctx.integerValue("InstantiateFabricChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setType(_ctx.integerValue("InstantiateFabricChaincodeResponse.Result.Type"));
		result.setEndorsePolicy(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.EndorsePolicy"));
		result.setState(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.State"));
		result.setCreateTime(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.CreateTime"));
		result.setChaincodeId(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.ChaincodeId"));
		result.setProviderName(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.ProviderName"));
		result.setMessage(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.Message"));
		result.setChaincodeName(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.ChaincodeName"));
		result.setInput(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.Input"));
		result.setInstall(_ctx.booleanValue("InstantiateFabricChaincodeResponse.Result.Install"));
		result.setProviderId(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.ProviderId"));
		result.setDeployTime(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.DeployTime"));
		result.setChaincodeVersion(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.ChaincodeVersion"));
		result.setConsortiumId(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.ConsortiumId"));
		result.setChannelName(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.ChannelName"));
		result.setPath(_ctx.stringValue("InstantiateFabricChaincodeResponse.Result.Path"));
		instantiateFabricChaincodeResponse.setResult(result);
	 
	 	return instantiateFabricChaincodeResponse;
	}
}