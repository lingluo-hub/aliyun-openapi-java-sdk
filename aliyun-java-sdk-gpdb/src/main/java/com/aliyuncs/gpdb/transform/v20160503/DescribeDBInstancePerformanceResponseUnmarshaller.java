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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancePerformanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancePerformanceResponseUnmarshaller {

	public static DescribeDBInstancePerformanceResponse unmarshall(DescribeDBInstancePerformanceResponse describeDBInstancePerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancePerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBInstancePerformanceResponse.RequestId"));
		describeDBInstancePerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBInstancePerformanceResponse.EndTime"));
		describeDBInstancePerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBInstancePerformanceResponse.StartTime"));
		describeDBInstancePerformanceResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstancePerformanceResponse.DBInstanceId"));
		describeDBInstancePerformanceResponse.setEngine(_ctx.stringValue("DescribeDBInstancePerformanceResponse.Engine"));

		List<String> performanceKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancePerformanceResponse.PerformanceKeys.Length"); i++) {
			performanceKeys.add(_ctx.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"]"));
		}
		describeDBInstancePerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBInstancePerformanceResponse;
	}
}