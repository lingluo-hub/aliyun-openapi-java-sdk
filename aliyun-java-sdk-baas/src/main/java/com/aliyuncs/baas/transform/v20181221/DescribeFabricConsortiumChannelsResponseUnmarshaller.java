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

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumChannelsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumChannelsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumChannelsResponseUnmarshaller {

	public static DescribeFabricConsortiumChannelsResponse unmarshall(DescribeFabricConsortiumChannelsResponse describeFabricConsortiumChannelsResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumChannelsResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.RequestId"));
		describeFabricConsortiumChannelsResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumChannelsResponse.Success"));
		describeFabricConsortiumChannelsResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumChannelsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBatchTimeout(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].BatchTimeout"));
			resultItem.setUpdateTime(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].UpdateTime"));
			resultItem.setChaincodeCount(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].ChaincodeCount"));
			resultItem.setPreferredMaxBytes(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].PreferredMaxBytes"));
			resultItem.setMemberJoinedCount(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].MemberJoinedCount"));
			resultItem.setState(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].State"));
			resultItem.setCreateTime(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].CreateTime"));
			resultItem.setSupportChannelConfig(_ctx.booleanValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].SupportChannelConfig"));
			resultItem.setOwnerName(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].OwnerName"));
			resultItem.setOwnerUid(_ctx.longValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].OwnerUid"));
			resultItem.setOwnerBid(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].OwnerBid"));
			resultItem.setMaxMessageCount(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].MaxMessageCount"));
			resultItem.setMemberCount(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].MemberCount"));
			resultItem.setNeedJoined(_ctx.booleanValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].NeedJoined"));
			resultItem.setRequestId(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].RequestId"));
			resultItem.setConsortiumId(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].ConsortiumId"));
			resultItem.setChannelName(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].ChannelName"));
			resultItem.setDeleteTime(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].DeleteTime"));
			resultItem.setChannelId(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].ChannelId"));
			resultItem.setConsortiumChannelId(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].ConsortiumChannelId"));
			resultItem.setDeleted(_ctx.booleanValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].Deleted"));
			resultItem.setConsortiumName(_ctx.stringValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].ConsortiumName"));
			resultItem.setBlockCount(_ctx.integerValue("DescribeFabricConsortiumChannelsResponse.Result["+ i +"].BlockCount"));

			result.add(resultItem);
		}
		describeFabricConsortiumChannelsResponse.setResult(result);
	 
	 	return describeFabricConsortiumChannelsResponse;
	}
}