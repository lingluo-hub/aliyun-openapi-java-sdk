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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.ListUserProducesResponse;
import com.aliyuncs.copyright.model.v20190123.ListUserProducesResponse.Produces;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserProducesResponseUnmarshaller {

	public static ListUserProducesResponse unmarshall(ListUserProducesResponse listUserProducesResponse, UnmarshallerContext _ctx) {
		
		listUserProducesResponse.setRequestId(_ctx.stringValue("ListUserProducesResponse.RequestId"));
		listUserProducesResponse.setPageNum(_ctx.integerValue("ListUserProducesResponse.PageNum"));
		listUserProducesResponse.setSuccess(_ctx.booleanValue("ListUserProducesResponse.Success"));
		listUserProducesResponse.setTotalItemNum(_ctx.integerValue("ListUserProducesResponse.TotalItemNum"));
		listUserProducesResponse.setPageSize(_ctx.integerValue("ListUserProducesResponse.PageSize"));
		listUserProducesResponse.setTotalPageNum(_ctx.integerValue("ListUserProducesResponse.TotalPageNum"));

		List<Produces> data = new ArrayList<Produces>();
		for (int i = 0; i < _ctx.lengthValue("ListUserProducesResponse.Data.Length"); i++) {
			Produces produces = new Produces();
			produces.setStatus(_ctx.integerValue("ListUserProducesResponse.Data["+ i +"].Status"));
			produces.setOrderPrice(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].OrderPrice"));
			produces.setSolutionBizId(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].SolutionBizId"));
			produces.setUserId(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].UserId"));
			produces.setBizId(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].BizId"));
			produces.setOrderTime(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].OrderTime"));
			produces.setPartnerCode(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].PartnerCode"));
			produces.setExtInfo(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].ExtInfo"));
			produces.setBizType(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].BizType"));
			produces.setIntentionBizId(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].IntentionBizId"));
			produces.setEndTime(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].EndTime"));
			produces.setStartTime(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].StartTime"));
			produces.setOrderId(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].OrderId"));
			produces.setModifyTime(_ctx.stringValue("ListUserProducesResponse.Data["+ i +"].ModifyTime"));

			data.add(produces);
		}
		listUserProducesResponse.setData(data);
	 
	 	return listUserProducesResponse;
	}
}