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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetOpLogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetOpLogResponse.OpLogDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOpLogResponseUnmarshaller {

	public static GetOpLogResponse unmarshall(GetOpLogResponse getOpLogResponse, UnmarshallerContext _ctx) {
		
		getOpLogResponse.setRequestId(_ctx.stringValue("GetOpLogResponse.RequestId"));
		getOpLogResponse.setTotalCount(_ctx.longValue("GetOpLogResponse.TotalCount"));
		getOpLogResponse.setErrorCode(_ctx.stringValue("GetOpLogResponse.ErrorCode"));
		getOpLogResponse.setErrorMessage(_ctx.stringValue("GetOpLogResponse.ErrorMessage"));
		getOpLogResponse.setSuccess(_ctx.booleanValue("GetOpLogResponse.Success"));

		List<OpLogDetail> opLogDetails = new ArrayList<OpLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetOpLogResponse.OpLogDetails.Length"); i++) {
			OpLogDetail opLogDetail = new OpLogDetail();
			opLogDetail.setModule(_ctx.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].Module"));
			opLogDetail.setDatabase(_ctx.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].Database"));
			opLogDetail.setUserId(_ctx.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].UserId"));
			opLogDetail.setOpUserId(_ctx.longValue("GetOpLogResponse.OpLogDetails["+ i +"].OpUserId"));
			opLogDetail.setOpContent(_ctx.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].OpContent"));
			opLogDetail.setUserNick(_ctx.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].UserNick"));
			opLogDetail.setOrderId(_ctx.longValue("GetOpLogResponse.OpLogDetails["+ i +"].OrderId"));
			opLogDetail.setOpTime(_ctx.stringValue("GetOpLogResponse.OpLogDetails["+ i +"].OpTime"));

			opLogDetails.add(opLogDetail);
		}
		getOpLogResponse.setOpLogDetails(opLogDetails);
	 
	 	return getOpLogResponse;
	}
}