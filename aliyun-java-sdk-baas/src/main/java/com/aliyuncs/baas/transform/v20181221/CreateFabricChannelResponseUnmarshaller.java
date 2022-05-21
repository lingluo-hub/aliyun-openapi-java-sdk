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

import com.aliyuncs.baas.model.v20181221.CreateFabricChannelResponse;
import com.aliyuncs.baas.model.v20181221.CreateFabricChannelResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFabricChannelResponseUnmarshaller {

	public static CreateFabricChannelResponse unmarshall(CreateFabricChannelResponse createFabricChannelResponse, UnmarshallerContext _ctx) {
		
		createFabricChannelResponse.setRequestId(_ctx.stringValue("CreateFabricChannelResponse.RequestId"));
		createFabricChannelResponse.setSuccess(_ctx.booleanValue("CreateFabricChannelResponse.Success"));
		createFabricChannelResponse.setErrorCode(_ctx.integerValue("CreateFabricChannelResponse.ErrorCode"));

		Result result = new Result();
		result.setBatchTimeout(_ctx.integerValue("CreateFabricChannelResponse.Result.BatchTimeout"));
		result.setUpdateTime(_ctx.stringValue("CreateFabricChannelResponse.Result.UpdateTime"));
		result.setChaincodeCount(_ctx.integerValue("CreateFabricChannelResponse.Result.ChaincodeCount"));
		result.setPreferredMaxBytes(_ctx.integerValue("CreateFabricChannelResponse.Result.PreferredMaxBytes"));
		result.setState(_ctx.stringValue("CreateFabricChannelResponse.Result.State"));
		result.setCreateTime(_ctx.stringValue("CreateFabricChannelResponse.Result.CreateTime"));
		result.setOwnerName(_ctx.stringValue("CreateFabricChannelResponse.Result.OwnerName"));
		result.setOwnerUid(_ctx.longValue("CreateFabricChannelResponse.Result.OwnerUid"));
		result.setOwnerBid(_ctx.stringValue("CreateFabricChannelResponse.Result.OwnerBid"));
		result.setMaxMessageCount(_ctx.integerValue("CreateFabricChannelResponse.Result.MaxMessageCount"));
		result.setMemberCount(_ctx.integerValue("CreateFabricChannelResponse.Result.MemberCount"));
		result.setRequestId(_ctx.stringValue("CreateFabricChannelResponse.Result.RequestId"));
		result.setConsortiumId(_ctx.stringValue("CreateFabricChannelResponse.Result.ConsortiumId"));
		result.setChannelName(_ctx.stringValue("CreateFabricChannelResponse.Result.ChannelName"));
		result.setSupportConfig(_ctx.booleanValue("CreateFabricChannelResponse.Result.SupportConfig"));
		result.setChannelId(_ctx.stringValue("CreateFabricChannelResponse.Result.ChannelId"));
		result.setConsortiumName(_ctx.stringValue("CreateFabricChannelResponse.Result.ConsortiumName"));
		result.setBlockCount(_ctx.integerValue("CreateFabricChannelResponse.Result.BlockCount"));
		createFabricChannelResponse.setResult(result);
	 
	 	return createFabricChannelResponse;
	}
}