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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumChaincodesResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumChaincodesResponse.ChaincodeVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumChaincodesResponseUnmarshaller {

	public static DescribeFabricConsortiumChaincodesResponse unmarshall(DescribeFabricConsortiumChaincodesResponse describeFabricConsortiumChaincodesResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumChaincodesResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.RequestId"));
		describeFabricConsortiumChaincodesResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumChaincodesResponse.Success"));
		describeFabricConsortiumChaincodesResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumChaincodesResponse.ErrorCode"));

		List<ChaincodeVO> result = new ArrayList<ChaincodeVO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumChaincodesResponse.Result.Length"); i++) {
			ChaincodeVO chaincodeVO = new ChaincodeVO();
			chaincodeVO.setType(_ctx.integerValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].Type"));
			chaincodeVO.setEndorsePolicy(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].EndorsePolicy"));
			chaincodeVO.setState(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].State"));
			chaincodeVO.setCreateTime(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].CreateTime"));
			chaincodeVO.setChaincodeId(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ChaincodeId"));
			chaincodeVO.setProviderName(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ProviderName"));
			chaincodeVO.setMessage(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].Message"));
			chaincodeVO.setChaincodeName(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ChaincodeName"));
			chaincodeVO.setInstall(_ctx.booleanValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].Install"));
			chaincodeVO.setInput(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].Input"));
			chaincodeVO.setProviderId(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ProviderId"));
			chaincodeVO.setDeployTime(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].DeployTime"));
			chaincodeVO.setChaincodeVersion(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ChaincodeVersion"));
			chaincodeVO.setConsortiumId(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ConsortiumId"));
			chaincodeVO.setChannelName(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ChannelName"));
			chaincodeVO.setChannelId(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].ChannelId"));
			chaincodeVO.setPath(_ctx.stringValue("DescribeFabricConsortiumChaincodesResponse.Result["+ i +"].Path"));

			result.add(chaincodeVO);
		}
		describeFabricConsortiumChaincodesResponse.setResult(result);
	 
	 	return describeFabricConsortiumChaincodesResponse;
	}
}