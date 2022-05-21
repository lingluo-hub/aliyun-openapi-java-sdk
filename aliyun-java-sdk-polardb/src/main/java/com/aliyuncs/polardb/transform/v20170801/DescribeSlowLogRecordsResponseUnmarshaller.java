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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeSlowLogRecordsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeSlowLogRecordsResponse.SQLSlowRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCount"));
		describeSlowLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageRecordCount"));
		describeSlowLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setDBClusterId(_ctx.stringValue("DescribeSlowLogRecordsResponse.DBClusterId"));
		describeSlowLogRecordsResponse.setEngine(_ctx.stringValue("DescribeSlowLogRecordsResponse.Engine"));

		List<SQLSlowRecord> items = new ArrayList<SQLSlowRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			SQLSlowRecord sQLSlowRecord = new SQLSlowRecord();
			sQLSlowRecord.setExecutionStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecutionStartTime"));
			sQLSlowRecord.setHostAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].HostAddress"));
			sQLSlowRecord.setQueryTimes(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimes"));
			sQLSlowRecord.setSQLText(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].SQLText"));
			sQLSlowRecord.setReturnRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			sQLSlowRecord.setParseRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ParseRowCounts"));
			sQLSlowRecord.setDBName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			sQLSlowRecord.setLockTimes(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].LockTimes"));
			sQLSlowRecord.setDBNodeId(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBNodeId"));
			sQLSlowRecord.setQueryTimeMS(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimeMS"));

			items.add(sQLSlowRecord);
		}
		describeSlowLogRecordsResponse.setItems(items);
	 
	 	return describeSlowLogRecordsResponse;
	}
}