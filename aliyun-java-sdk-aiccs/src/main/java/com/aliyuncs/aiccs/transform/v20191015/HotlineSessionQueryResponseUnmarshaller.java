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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.HotlineSessionQueryResponse;
import com.aliyuncs.aiccs.model.v20191015.HotlineSessionQueryResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.HotlineSessionQueryResponse.Data.CallDetailRecordItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class HotlineSessionQueryResponseUnmarshaller {

	public static HotlineSessionQueryResponse unmarshall(HotlineSessionQueryResponse hotlineSessionQueryResponse, UnmarshallerContext _ctx) {
		
		hotlineSessionQueryResponse.setRequestId(_ctx.stringValue("HotlineSessionQueryResponse.RequestId"));
		hotlineSessionQueryResponse.setMessage(_ctx.stringValue("HotlineSessionQueryResponse.Message"));
		hotlineSessionQueryResponse.setCode(_ctx.stringValue("HotlineSessionQueryResponse.Code"));
		hotlineSessionQueryResponse.setSuccess(_ctx.booleanValue("HotlineSessionQueryResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("HotlineSessionQueryResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("HotlineSessionQueryResponse.Data.PageNumber"));
		data.setTotalCount(_ctx.integerValue("HotlineSessionQueryResponse.Data.TotalCount"));

		List<CallDetailRecordItem> callDetailRecord = new ArrayList<CallDetailRecordItem>();
		for (int i = 0; i < _ctx.lengthValue("HotlineSessionQueryResponse.Data.CallDetailRecord.Length"); i++) {
			CallDetailRecordItem callDetailRecordItem = new CallDetailRecordItem();
			callDetailRecordItem.setCallResult(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].CallResult"));
			callDetailRecordItem.setTrunkCall(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].TrunkCall"));
			callDetailRecordItem.setServicerName(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].ServicerName"));
			callDetailRecordItem.setOutQueueTime(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].OutQueueTime"));
			callDetailRecordItem.setCallContinueTime(_ctx.integerValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].CallContinueTime"));
			callDetailRecordItem.setCreateTime(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].CreateTime"));
			callDetailRecordItem.setPickUpTime(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].PickUpTime"));
			callDetailRecordItem.setRingContinueTime(_ctx.integerValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].RingContinueTime"));
			callDetailRecordItem.setCalledNumber(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].CalledNumber"));
			callDetailRecordItem.setServicerId(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].ServicerId"));
			callDetailRecordItem.setHangUpTime(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].HangUpTime"));
			callDetailRecordItem.setEvaluationLevel(_ctx.integerValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].EvaluationLevel"));
			callDetailRecordItem.setPassiveTransferId(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].PassiveTransferId"));
			callDetailRecordItem.setActiveTransferId(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].ActiveTransferId"));
			callDetailRecordItem.setHangUpRole(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].HangUpRole"));
			callDetailRecordItem.setPassiveTransferIdType(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].PassiveTransferIdType"));
			callDetailRecordItem.setMemberName(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].MemberName"));
			callDetailRecordItem.setEvaluationScore(_ctx.integerValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].EvaluationScore"));
			callDetailRecordItem.setAcid(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].Acid"));
			callDetailRecordItem.setRingStartTime(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].RingStartTime"));
			callDetailRecordItem.setCallType(_ctx.integerValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].CallType"));
			callDetailRecordItem.setGroupName(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].GroupName"));
			callDetailRecordItem.setGroupId(_ctx.longValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].GroupId"));
			callDetailRecordItem.setRingEndTime(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].RingEndTime"));
			callDetailRecordItem.setCallingNumber(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].CallingNumber"));
			callDetailRecordItem.setInQueueTime(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].InQueueTime"));
			callDetailRecordItem.setMemberId(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].MemberId"));
			callDetailRecordItem.setId(_ctx.stringValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].Id"));
			callDetailRecordItem.setQueueUpContinueTime(_ctx.integerValue("HotlineSessionQueryResponse.Data.CallDetailRecord["+ i +"].QueueUpContinueTime"));

			callDetailRecord.add(callDetailRecordItem);
		}
		data.setCallDetailRecord(callDetailRecord);
		hotlineSessionQueryResponse.setData(data);
	 
	 	return hotlineSessionQueryResponse;
	}
}